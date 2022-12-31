package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgendaDto  extends AuditBaseDto {

    private String libelle  ;
    private String daysOfMonth  ;
    private Integer month  = 0 ;
    private Integer annee  = 0 ;

    private UniteAdministrativeDto uniteAdministrative ;


    public AgendaDto(){
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
    public String getDaysOfMonth(){
        return this.daysOfMonth;
    }
    public void setDaysOfMonth(String daysOfMonth){
         this.daysOfMonth = daysOfMonth;
    }

    @Log
    public Integer getMonth(){
        return this.month;
    }
    public void setMonth(Integer month){
         this.month = month;
    }

    @Log
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
         this.annee = annee;
    }


    public UniteAdministrativeDto getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrativeDto(UniteAdministrativeDto uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }


}
