package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateEmailConfirmationDto  extends AuditBaseDto {

    private String libelle  ;
    private String objet  ;
    private String corps  ;
    private Boolean actif  ;



    public TemplateEmailConfirmationDto(){
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
    public String getObjet(){
        return this.objet;
    }
    public void setObjet(String objet){
         this.objet = objet;
    }

    @Log
    public String getCorps(){
        return this.corps;
    }
    public void setCorps(String corps){
         this.corps = corps;
    }

    @Log
    public Boolean getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
         this.actif = actif;
    }




}
