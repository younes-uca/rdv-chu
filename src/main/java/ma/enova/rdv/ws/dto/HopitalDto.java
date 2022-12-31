package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class HopitalDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private String description  ;


    private List<UniteAdministrativeDto> uniteAdministratives ;

    public HopitalDto(){
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
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
         this.code = code;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
         this.description = description;
    }



    public List<UniteAdministrativeDto> getUniteAdministratives(){
         return this.uniteAdministratives;
    }

    public void setUniteAdministratives(List<UniteAdministrativeDto> uniteAdministratives){
        this.uniteAdministratives = uniteAdministratives;
    }

}
