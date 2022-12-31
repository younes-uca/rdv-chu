package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.rdv.zynerator.util.ListUtil;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.HopitalHistory;
import ma.enova.rdv.bean.core.Hopital;
import ma.enova.rdv.ws.dto.HopitalDto;

@Component
public class HopitalConverter extends AbstractConverter<Hopital, HopitalDto, HopitalHistory> {

    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;

    private boolean uniteAdministratives;

    public  HopitalConverter(){
        super(Hopital.class, HopitalDto.class, HopitalHistory.class);
        init(true);
    }

    @Override
    public Hopital toItem(HopitalDto dto) {
        if (dto == null) {
            return null;
        } else {
        Hopital item = new Hopital();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());

            if(this.uniteAdministratives && ListUtil.isNotEmpty(dto.getUniteAdministratives()))
                item.setUniteAdministratives(uniteAdministrativeConverter.toItem(dto.getUniteAdministratives()));

        return item;
        }
    }

    @Override
    public HopitalDto toDto(Hopital item) {
        if (item == null) {
            return null;
        } else {
    HopitalDto dto = new HopitalDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getDescription()))
             dto.setDescription(item.getDescription());
        if(this.uniteAdministratives && ListUtil.isNotEmpty(item.getUniteAdministratives())){
            uniteAdministrativeConverter.init(true);
            uniteAdministrativeConverter.setHopital(false);
            dto.setUniteAdministratives(uniteAdministrativeConverter.toDto(item.getUniteAdministratives()));
            uniteAdministrativeConverter.setHopital(true);
        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.uniteAdministratives = value;
    }

    public void init(Boolean value) {
        initList(value);
    }

    public UniteAdministrativeConverter getUniteAdministrativeConverter(){
        return this.uniteAdministrativeConverter;
    }
    public void setUniteAdministrativeConverter(UniteAdministrativeConverter uniteAdministrativeConverter ){
        this.uniteAdministrativeConverter = uniteAdministrativeConverter;
    }

    public boolean  isUniteAdministratives(){
        return this.uniteAdministratives ;
    }
    public void  setUniteAdministratives(boolean uniteAdministratives ){
        this.uniteAdministratives  = uniteAdministratives ;
    }
}
