package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateurHoraireTravailleValidationDto  extends AuditBaseDto {

    private String heureDebut  ;
    private String heureFin  ;

    private HoraireTravailleValidationDto horaireTravailleValidation ;
    private OperateurDto operateur ;


    public OperateurHoraireTravailleValidationDto(){
        super();
    }



    @Log
    public String getHeureDebut(){
        return this.heureDebut;
    }
    public void setHeureDebut(String heureDebut){
         this.heureDebut = heureDebut;
    }

    @Log
    public String getHeureFin(){
        return this.heureFin;
    }
    public void setHeureFin(String heureFin){
         this.heureFin = heureFin;
    }


    public HoraireTravailleValidationDto getHoraireTravailleValidation(){
        return this.horaireTravailleValidation;
    }

    public void setHoraireTravailleValidationDto(HoraireTravailleValidationDto horaireTravailleValidation){
        this.horaireTravailleValidation = horaireTravailleValidation;
    }
    public OperateurDto getOperateur(){
        return this.operateur;
    }

    public void setOperateurDto(OperateurDto operateur){
        this.operateur = operateur;
    }


}
