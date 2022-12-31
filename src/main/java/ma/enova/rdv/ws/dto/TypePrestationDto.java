package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypePrestationDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;



    public TypePrestationDto(){
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




}
