package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.AgendaHistory;
import ma.enova.rdv.bean.core.Agenda;
import ma.enova.rdv.ws.dto.AgendaDto;

@Component
public class AgendaConverter extends AbstractConverter<Agenda, AgendaDto, AgendaHistory> {

    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;

    private boolean uniteAdministrative;

    public  AgendaConverter(){
        super(Agenda.class, AgendaDto.class, AgendaHistory.class);
    }

    @Override
    public Agenda toItem(AgendaDto dto) {
        if (dto == null) {
            return null;
        } else {
        Agenda item = new Agenda();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDaysOfMonth()))
                item.setDaysOfMonth(dto.getDaysOfMonth());
            if(StringUtil.isNotEmpty(dto.getMonth()))
                item.setMonth(dto.getMonth());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(this.uniteAdministrative && dto.getUniteAdministrative()!=null)
                item.setUniteAdministrative(uniteAdministrativeConverter.toItem(dto.getUniteAdministrative())) ;


        return item;
        }
    }

    @Override
    public AgendaDto toDto(Agenda item) {
        if (item == null) {
            return null;
        } else {
    AgendaDto dto = new AgendaDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getDaysOfMonth()))
             dto.setDaysOfMonth(item.getDaysOfMonth());
        if(StringUtil.isNotEmpty(item.getMonth()))
             dto.setMonth(item.getMonth());
        if(StringUtil.isNotEmpty(item.getAnnee()))
             dto.setAnnee(item.getAnnee());
        if(this.uniteAdministrative && item.getUniteAdministrative()!=null) {
            dto.setUniteAdministrativeDto(uniteAdministrativeConverter.toDto(item.getUniteAdministrative())) ;
        }
        return dto;
        }
    }



    public UniteAdministrativeConverter getUniteAdministrativeConverter(){
        return this.uniteAdministrativeConverter;
    }
    public void setUniteAdministrativeConverter(UniteAdministrativeConverter uniteAdministrativeConverter ){
        this.uniteAdministrativeConverter = uniteAdministrativeConverter;
    }

    public boolean  isUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void  setUniteAdministrative(boolean uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
}
