package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrestationDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private Integer dureeEnMiniute  = 0 ;

    private TypePrestationDto typePrestation ;
    private UniteAdministrativeDto uniteAdministrative ;


    public PrestationDto(){
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
    public Integer getDureeEnMiniute(){
        return this.dureeEnMiniute;
    }
    public void setDureeEnMiniute(Integer dureeEnMiniute){
         this.dureeEnMiniute = dureeEnMiniute;
    }


    public TypePrestationDto getTypePrestation(){
        return this.typePrestation;
    }

    public void setTypePrestationDto(TypePrestationDto typePrestation){
        this.typePrestation = typePrestation;
    }
    public UniteAdministrativeDto getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrativeDto(UniteAdministrativeDto uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }


}
