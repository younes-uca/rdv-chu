package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class JourFerieDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String dateDebut ;
    private String dateFin ;
    private Long nombreJoursTotal  ;



    public JourFerieDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
         this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
         this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }

    @Log
    public Long getNombreJoursTotal(){
        return this.nombreJoursTotal;
    }
    public void setNombreJoursTotal(Long nombreJoursTotal){
         this.nombreJoursTotal = nombreJoursTotal;
    }




}
