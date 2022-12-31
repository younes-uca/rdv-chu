package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.OperateurUniteAdministrativeHistory;
import ma.enova.rdv.bean.core.OperateurUniteAdministrative;
import ma.enova.rdv.ws.dto.OperateurUniteAdministrativeDto;

@Component
public class OperateurUniteAdministrativeConverter extends AbstractConverter<OperateurUniteAdministrative, OperateurUniteAdministrativeDto, OperateurUniteAdministrativeHistory> {

    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;
    @Autowired
    private OperateurConverter operateurConverter ;

    private boolean uniteAdministrative;
    private boolean operateur;

    public  OperateurUniteAdministrativeConverter(){
        super(OperateurUniteAdministrative.class, OperateurUniteAdministrativeDto.class, OperateurUniteAdministrativeHistory.class);
    }

    @Override
    public OperateurUniteAdministrative toItem(OperateurUniteAdministrativeDto dto) {
        if (dto == null) {
            return null;
        } else {
        OperateurUniteAdministrative item = new OperateurUniteAdministrative();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(this.uniteAdministrative && dto.getUniteAdministrative()!=null)
                item.setUniteAdministrative(uniteAdministrativeConverter.toItem(dto.getUniteAdministrative())) ;
            if(this.operateur && dto.getOperateur()!=null)
                item.setOperateur(operateurConverter.toItem(dto.getOperateur())) ;


        return item;
        }
    }

    @Override
    public OperateurUniteAdministrativeDto toDto(OperateurUniteAdministrative item) {
        if (item == null) {
            return null;
        } else {
    OperateurUniteAdministrativeDto dto = new OperateurUniteAdministrativeDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(this.uniteAdministrative && item.getUniteAdministrative()!=null) {
            dto.setUniteAdministrativeDto(uniteAdministrativeConverter.toDto(item.getUniteAdministrative())) ;
        }
        if(this.operateur && item.getOperateur()!=null) {
            dto.setOperateurDto(operateurConverter.toDto(item.getOperateur())) ;
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
    public OperateurConverter getOperateurConverter(){
        return this.operateurConverter;
    }
    public void setOperateurConverter(OperateurConverter operateurConverter ){
        this.operateurConverter = operateurConverter;
    }

    public boolean  isUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void  setUniteAdministrative(boolean uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public boolean  isOperateur(){
        return this.operateur;
    }
    public void  setOperateur(boolean operateur){
        this.operateur = operateur;
    }
}
