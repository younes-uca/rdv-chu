package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateurDto  extends AuditBaseDto {

    private String cin  ;
    private String dateNaissance ;
    private String passport  ;

    private CelluleValidationDto celluleValidation ;

    private List<OperateurAgendaDto> operateurAgendas ;
    private List<OperateurHoraireTravailleValidationDto> operateurHoraireTravailleValidations ;
    private List<OperateurUniteAdministrativeDto> operateurUniteAdministratives ;

    public OperateurDto(){
        super();
    }



    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
         this.cin = cin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    @Log
    public String getPassport(){
        return this.passport;
    }
    public void setPassport(String passport){
         this.passport = passport;
    }


    public CelluleValidationDto getCelluleValidation(){
        return this.celluleValidation;
    }

    public void setCelluleValidationDto(CelluleValidationDto celluleValidation){
        this.celluleValidation = celluleValidation;
    }

    public List<OperateurAgendaDto> getOperateurAgendas(){
         return this.operateurAgendas;
    }

    public void setOperateurAgendas(List<OperateurAgendaDto> operateurAgendas){
        this.operateurAgendas = operateurAgendas;
    }
    public List<OperateurHoraireTravailleValidationDto> getOperateurHoraireTravailleValidations(){
         return this.operateurHoraireTravailleValidations;
    }

    public void setOperateurHoraireTravailleValidations(List<OperateurHoraireTravailleValidationDto> operateurHoraireTravailleValidations){
        this.operateurHoraireTravailleValidations = operateurHoraireTravailleValidations;
    }
    public List<OperateurUniteAdministrativeDto> getOperateurUniteAdministratives(){
         return this.operateurUniteAdministratives;
    }

    public void setOperateurUniteAdministratives(List<OperateurUniteAdministrativeDto> operateurUniteAdministratives){
        this.operateurUniteAdministratives = operateurUniteAdministratives;
    }

}
