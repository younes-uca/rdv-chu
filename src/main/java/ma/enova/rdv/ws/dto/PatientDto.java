package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDto  extends AuditBaseDto {

    private String ipp  ;
    private String adresse  ;
    private String email  ;
    private String cin  ;
    private String codeRamed  ;



    public PatientDto(){
        super();
    }



    @Log
    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
         this.ipp = ipp;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
         this.adresse = adresse;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
         this.email = email;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
         this.cin = cin;
    }

    @Log
    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
         this.codeRamed = codeRamed;
    }




}
