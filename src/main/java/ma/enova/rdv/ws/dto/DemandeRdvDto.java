package  ma.enova.rdv.ws.dto;

import ma.enova.rdv.zynerator.audit.Log;
import ma.enova.rdv.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemandeRdvDto  extends AuditBaseDto {

    private String reference  ;
    private String ipp  ;
    private String nom  ;
    private String prenom  ;
    private String adresse  ;
    private String email  ;
    private String cin  ;
    private String codeRamed  ;
    private String observation  ;
    private String ficheReferencePath  ;
    private String dateDemandeRdv ;
    private String datePrevu ;
    private String dateEffective ;
    private String dateValidation ;
    private String dateRejet ;
    private Integer nombreReccurenceTotal  = 0 ;
    private Integer nombreReccurenceValide  = 0 ;
    private Integer nombreReccurenceRejet  = 0 ;

    private PatientDto patient ;
    private OperateurDto operateur ;
    private HopitalDto hopital ;
    private UniteAdministrativeDto uniteAdministrative ;
    private PrestationDto prestation ;
    private StatusRdvDto statusRdv ;
    private CauseRejetDemandeRdvDto causeRejetDemandeRdv ;
    private TemplateEmailConfirmationDto templateEmailConfirmation ;


    public DemandeRdvDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
         this.reference = reference;
    }

    @Log
    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
         this.ipp = ipp;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
         this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
         this.prenom = prenom;
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

    @Log
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
         this.observation = observation;
    }

    @Log
    public String getFicheReferencePath(){
        return this.ficheReferencePath;
    }
    public void setFicheReferencePath(String ficheReferencePath){
         this.ficheReferencePath = ficheReferencePath;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDemandeRdv(){
        return this.dateDemandeRdv;
    }
    public void setDateDemandeRdv(String dateDemandeRdv){
        this.dateDemandeRdv = dateDemandeRdv;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(String datePrevu){
        this.datePrevu = datePrevu;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEffective(){
        return this.dateEffective;
    }
    public void setDateEffective(String dateEffective){
        this.dateEffective = dateEffective;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateValidation(){
        return this.dateValidation;
    }
    public void setDateValidation(String dateValidation){
        this.dateValidation = dateValidation;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateRejet(){
        return this.dateRejet;
    }
    public void setDateRejet(String dateRejet){
        this.dateRejet = dateRejet;
    }

    @Log
    public Integer getNombreReccurenceTotal(){
        return this.nombreReccurenceTotal;
    }
    public void setNombreReccurenceTotal(Integer nombreReccurenceTotal){
         this.nombreReccurenceTotal = nombreReccurenceTotal;
    }

    @Log
    public Integer getNombreReccurenceValide(){
        return this.nombreReccurenceValide;
    }
    public void setNombreReccurenceValide(Integer nombreReccurenceValide){
         this.nombreReccurenceValide = nombreReccurenceValide;
    }

    @Log
    public Integer getNombreReccurenceRejet(){
        return this.nombreReccurenceRejet;
    }
    public void setNombreReccurenceRejet(Integer nombreReccurenceRejet){
         this.nombreReccurenceRejet = nombreReccurenceRejet;
    }


    public PatientDto getPatient(){
        return this.patient;
    }

    public void setPatientDto(PatientDto patient){
        this.patient = patient;
    }
    public OperateurDto getOperateur(){
        return this.operateur;
    }

    public void setOperateurDto(OperateurDto operateur){
        this.operateur = operateur;
    }
    public HopitalDto getHopital(){
        return this.hopital;
    }

    public void setHopitalDto(HopitalDto hopital){
        this.hopital = hopital;
    }
    public UniteAdministrativeDto getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrativeDto(UniteAdministrativeDto uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public PrestationDto getPrestation(){
        return this.prestation;
    }

    public void setPrestationDto(PrestationDto prestation){
        this.prestation = prestation;
    }
    public StatusRdvDto getStatusRdv(){
        return this.statusRdv;
    }

    public void setStatusRdvDto(StatusRdvDto statusRdv){
        this.statusRdv = statusRdv;
    }
    public CauseRejetDemandeRdvDto getCauseRejetDemandeRdv(){
        return this.causeRejetDemandeRdv;
    }

    public void setCauseRejetDemandeRdvDto(CauseRejetDemandeRdvDto causeRejetDemandeRdv){
        this.causeRejetDemandeRdv = causeRejetDemandeRdv;
    }
    public TemplateEmailConfirmationDto getTemplateEmailConfirmation(){
        return this.templateEmailConfirmation;
    }

    public void setTemplateEmailConfirmationDto(TemplateEmailConfirmationDto templateEmailConfirmation){
        this.templateEmailConfirmation = templateEmailConfirmation;
    }


}
