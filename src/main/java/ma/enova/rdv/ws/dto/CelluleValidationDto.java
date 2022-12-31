package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CelluleValidationDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private String description  ;
    private String email  ;
    private String phone  ;



    public CelluleValidationDto(){
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

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
         this.email = email;
    }

    @Log
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
         this.phone = phone;
    }




}
