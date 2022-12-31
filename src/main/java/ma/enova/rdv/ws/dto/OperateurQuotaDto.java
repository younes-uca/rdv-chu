package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateurQuotaDto  extends AuditBaseDto {

    private Integer nombreMaxRdv  = 0 ;

    private OperateurDto operateur ;
    private PrestationDto prestation ;


    public OperateurQuotaDto(){
        super();
    }



    @Log
    public Integer getNombreMaxRdv(){
        return this.nombreMaxRdv;
    }
    public void setNombreMaxRdv(Integer nombreMaxRdv){
         this.nombreMaxRdv = nombreMaxRdv;
    }


    public OperateurDto getOperateur(){
        return this.operateur;
    }

    public void setOperateurDto(OperateurDto operateur){
        this.operateur = operateur;
    }
    public PrestationDto getPrestation(){
        return this.prestation;
    }

    public void setPrestationDto(PrestationDto prestation){
        this.prestation = prestation;
    }


}
