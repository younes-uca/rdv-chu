package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoraireTravailleValidationDto  extends AuditBaseDto {

    private String libelle  ;
    private String daysOfWeek  ;
    private String month  ;
    private String heureDebut  ;
    private String heureFin  ;



    public HoraireTravailleValidationDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
         this.libelle = libelle;
    }

    @Log
    public String getDaysOfWeek(){
        return this.daysOfWeek;
    }
    public void setDaysOfWeek(String daysOfWeek){
         this.daysOfWeek = daysOfWeek;
    }

    @Log
    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
         this.month = month;
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




}
