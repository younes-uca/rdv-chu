package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateurUniteAdministrativeDto  extends AuditBaseDto {


    private UniteAdministrativeDto uniteAdministrative ;
    private OperateurDto operateur ;


    public OperateurUniteAdministrativeDto(){
        super();
    }




    public UniteAdministrativeDto getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrativeDto(UniteAdministrativeDto uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public OperateurDto getOperateur(){
        return this.operateur;
    }

    public void setOperateurDto(OperateurDto operateur){
        this.operateur = operateur;
    }


}
