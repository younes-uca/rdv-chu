package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.OperateurAgendaHistory;
import ma.enova.rdv.bean.core.OperateurAgenda;
import ma.enova.rdv.ws.dto.OperateurAgendaDto;

@Component
public class OperateurAgendaConverter extends AbstractConverter<OperateurAgenda, OperateurAgendaDto, OperateurAgendaHistory> {

    @Autowired
    private HoraireTravailleValidationConverter horaireTravailleValidationConverter ;
    @Autowired
    private OperateurConverter operateurConverter ;

    private boolean horaireTravailleValidation;
    private boolean operateur;

    public  OperateurAgendaConverter(){
        super(OperateurAgenda.class, OperateurAgendaDto.class, OperateurAgendaHistory.class);
    }

    @Override
    public OperateurAgenda toItem(OperateurAgendaDto dto) {
        if (dto == null) {
            return null;
        } else {
        OperateurAgenda item = new OperateurAgenda();
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
    public OperateurAgendaDto toDto(OperateurAgenda item) {
        if (item == null) {
            return null;
        } else {
    OperateurAgendaDto dto = new OperateurAgendaDto();
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
