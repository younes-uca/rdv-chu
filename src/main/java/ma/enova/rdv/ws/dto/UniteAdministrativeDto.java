package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniteAdministrativeDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private String description  ;

    private HopitalDto hopital ;

    private List<PrestationDto> prestations ;

    public UniteAdministrativeDto(){
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


    public HopitalDto getHopital(){
        return this.hopital;
    }

    public void setHopitalDto(HopitalDto hopital){
        this.hopital = hopital;
    }

    public List<PrestationDto> getPrestations(){
         return this.prestations;
    }

    public void setPrestations(List<PrestationDto> prestations){
        this.prestations = prestations;
    }

}
