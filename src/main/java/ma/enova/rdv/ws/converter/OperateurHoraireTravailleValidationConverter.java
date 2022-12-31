package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;
import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;
import ma.enova.rdv.ws.dto.OperateurHoraireTravailleValidationDto;

@Component
public class OperateurHoraireTravailleValidationConverter extends AbstractConverter<OperateurHoraireTravailleValidation, OperateurHoraireTravailleValidationDto, OperateurHoraireTravailleValidationHistory> {

    @Autowired
    private HoraireTravailleValidationConverter horaireTravailleValidationConverter ;
    @Autowired
    private OperateurConverter operateurConverter ;

    private boolean horaireTravailleValidation;
    private boolean operateur;

    public  OperateurHoraireTravailleValidationConverter(){
        super(OperateurHoraireTravailleValidation.class, OperateurHoraireTravailleValidationDto.class, OperateurHoraireTravailleValidationHistory.class);
    }

    @Override
    public OperateurHoraireTravailleValidation toItem(OperateurHoraireTravailleValidationDto dto) {
        if (dto == null) {
            return null;
        } else {
        OperateurHoraireTravailleValidation item = new OperateurHoraireTravailleValidation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getHeureDebut()))
                item.setHeureDebut(dto.getHeureDebut());
            if(StringUtil.isNotEmpty(dto.getHeureFin()))
                item.setHeureFin(dto.getHeureFin());
            if(this.horaireTravailleValidation && dto.getHoraireTravailleValidation()!=null)
                item.setHoraireTravailleValidation(horaireTravailleValidationConverter.toItem(dto.getHoraireTravailleValidation())) ;
            if(this.operateur && dto.getOperateur()!=null)
                item.setOperateur(operateurConverter.toItem(dto.getOperateur())) ;


        return item;
        }
    }

    @Override
    public OperateurHoraireTravailleValidationDto toDto(OperateurHoraireTravailleValidation item) {
        if (item == null) {
            return null;
        } else {
    OperateurHoraireTravailleValidationDto dto = new OperateurHoraireTravailleValidationDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getHeureDebut()))
             dto.setHeureDebut(item.getHeureDebut());
        if(StringUtil.isNotEmpty(item.getHeureFin()))
             dto.setHeureFin(item.getHeureFin());
        if(this.horaireTravailleValidation && item.getHoraireTravailleValidation()!=null) {
            dto.setHoraireTravailleValidationDto(horaireTravailleValidationConverter.toDto(item.getHoraireTravailleValidation())) ;
        }
        if(this.operateur && item.getOperateur()!=null) {
            dto.setOperateurDto(operateurConverter.toDto(item.getOperateur())) ;
        }
        return dto;
        }
    }



    public HoraireTravailleValidationConverter getHoraireTravailleValidationConverter(){
        return this.horaireTravailleValidationConverter;
    }
    public void setHoraireTravailleValidationConverter(HoraireTravailleValidationConverter horaireTravailleValidationConverter ){
        this.horaireTravailleValidationConverter = horaireTravailleValidationConverter;
    }
    public OperateurConverter getOperateurConverter(){
        return this.operateurConverter;
    }
    public void setOperateurConverter(OperateurConverter operateurConverter ){
        this.operateurConverter = operateurConverter;
    }

    public boolean  isHoraireTravailleValidation(){
        return this.horaireTravailleValidation;
    }
    public void  setHoraireTravailleValidation(boolean horaireTravailleValidation){
        this.horaireTravailleValidation = horaireTravailleValidation;
    }
    public boolean  isOperateur(){
        return this.operateur;
    }
    public void  setOperateur(boolean operateur){
        this.operateur = operateur;
    }
}
