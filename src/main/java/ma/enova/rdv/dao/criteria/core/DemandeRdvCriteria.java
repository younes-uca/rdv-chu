package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.rdv.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;

public class DemandeRdvCriteria extends BaseCriteria {

    private String reference;
    private String referenceLike;
    private String ipp;
    private String ippLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String email;
    private String emailLike;
    private String cin;
    private String cinLike;
    private String codeRamed;
    private String codeRamedLike;
    private String ficheReferencePath;
    private String ficheReferencePathLike;
    private LocalDateTime dateDemandeRdv;
    private LocalDateTime dateDemandeRdvFrom;
    private LocalDateTime dateDemandeRdvTo;
    private LocalDateTime datePrevu;
    private LocalDateTime datePrevuFrom;
    private LocalDateTime datePrevuTo;
    private LocalDateTime dateEffective;
    private LocalDateTime dateEffectiveFrom;
    private LocalDateTime dateEffectiveTo;
    private LocalDateTime dateValidation;
    private LocalDateTime dateValidationFrom;
    private LocalDateTime dateValidationTo;
    private LocalDateTime dateRejet;
    private LocalDateTime dateRejetFrom;
    private LocalDateTime dateRejetTo;
    private String nombreReccurenceTotal;
    private String nombreReccurenceValide;
    private String nombreReccurenceRejet;

    private Long patientId ;
    private Long operateurId ;
    private Long hopitalId ;
    private Long uniteAdministrativeId ;
    private Long prestationId ;
    private Long statusRdvId ;
    private Long causeRejetDemandeRdvId ;
    private Long templateEmailConfirmationId ;


    public DemandeRdvCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }

    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getIppLike(){
        return this.ippLike;
    }
    public void setIppLike(String ippLike){
        this.ippLike = ippLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
        this.codeRamed = codeRamed;
    }
    public String getCodeRamedLike(){
        return this.codeRamedLike;
    }
    public void setCodeRamedLike(String codeRamedLike){
        this.codeRamedLike = codeRamedLike;
    }

    public String getFicheReferencePath(){
        return this.ficheReferencePath;
    }
    public void setFicheReferencePath(String ficheReferencePath){
        this.ficheReferencePath = ficheReferencePath;
    }
    public String getFicheReferencePathLike(){
        return this.ficheReferencePathLike;
    }
    public void setFicheReferencePathLike(String ficheReferencePathLike){
        this.ficheReferencePathLike = ficheReferencePathLike;
    }

    public LocalDateTime getDateDemandeRdv(){
        return this.dateDemandeRdv;
    }
    public void setDateDemandeRdv(LocalDateTime dateDemandeRdv){
        this.dateDemandeRdv = dateDemandeRdv;
    }
    public LocalDateTime getDateDemandeRdvFrom(){
        return this.dateDemandeRdvFrom;
    }
    public void setDateDemandeRdvFrom(LocalDateTime dateDemandeRdvFrom){
        this.dateDemandeRdvFrom = dateDemandeRdvFrom;
    }
    public LocalDateTime getDateDemandeRdvTo(){
        return this.dateDemandeRdvFrom;
    }
    public void setDateDemandeRdvTo(LocalDateTime dateDemandeRdvTo){
        this.dateDemandeRdvTo = dateDemandeRdvTo;
    }
    public LocalDateTime getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(LocalDateTime datePrevu){
        this.datePrevu = datePrevu;
    }
    public LocalDateTime getDatePrevuFrom(){
        return this.datePrevuFrom;
    }
    public void setDatePrevuFrom(LocalDateTime datePrevuFrom){
        this.datePrevuFrom = datePrevuFrom;
    }
    public LocalDateTime getDatePrevuTo(){
        return this.datePrevuFrom;
    }
    public void setDatePrevuTo(LocalDateTime datePrevuTo){
        this.datePrevuTo = datePrevuTo;
    }
    public LocalDateTime getDateEffective(){
        return this.dateEffective;
    }
    public void setDateEffective(LocalDateTime dateEffective){
        this.dateEffective = dateEffective;
    }
    public LocalDateTime getDateEffectiveFrom(){
        return this.dateEffectiveFrom;
    }
    public void setDateEffectiveFrom(LocalDateTime dateEffectiveFrom){
        this.dateEffectiveFrom = dateEffectiveFrom;
    }
    public LocalDateTime getDateEffectiveTo(){
        return this.dateEffectiveFrom;
    }
    public void setDateEffectiveTo(LocalDateTime dateEffectiveTo){
        this.dateEffectiveTo = dateEffectiveTo;
    }
    public LocalDateTime getDateValidation(){
        return this.dateValidation;
    }
    public void setDateValidation(LocalDateTime dateValidation){
        this.dateValidation = dateValidation;
    }
    public LocalDateTime getDateValidationFrom(){
        return this.dateValidationFrom;
    }
    public void setDateValidationFrom(LocalDateTime dateValidationFrom){
        this.dateValidationFrom = dateValidationFrom;
    }
    public LocalDateTime getDateValidationTo(){
        return this.dateValidationFrom;
    }
    public void setDateValidationTo(LocalDateTime dateValidationTo){
        this.dateValidationTo = dateValidationTo;
    }
    public LocalDateTime getDateRejet(){
        return this.dateRejet;
    }
    public void setDateRejet(LocalDateTime dateRejet){
        this.dateRejet = dateRejet;
    }
    public LocalDateTime getDateRejetFrom(){
        return this.dateRejetFrom;
    }
    public void setDateRejetFrom(LocalDateTime dateRejetFrom){
        this.dateRejetFrom = dateRejetFrom;
    }
    public LocalDateTime getDateRejetTo(){
        return this.dateRejetFrom;
    }
    public void setDateRejetTo(LocalDateTime dateRejetTo){
        this.dateRejetTo = dateRejetTo;
    }
    public String getNombreReccurenceTotal(){
        return this.nombreReccurenceTotal;
    }
    public void setNombreReccurenceTotal(String nombreReccurenceTotal){
        this.nombreReccurenceTotal = nombreReccurenceTotal;
    }
    public String getNombreReccurenceValide(){
        return this.nombreReccurenceValide;
    }
    public void setNombreReccurenceValide(String nombreReccurenceValide){
        this.nombreReccurenceValide = nombreReccurenceValide;
    }
    public String getNombreReccurenceRejet(){
        return this.nombreReccurenceRejet;
    }
    public void setNombreReccurenceRejet(String nombreReccurenceRejet){
        this.nombreReccurenceRejet = nombreReccurenceRejet;
    }


    public Long getPatientId(){
        return this.id;
    }

    public void setPatientId(Long id){
        this.id = id;
    }



    public Long getOperateurId(){
        return this.id;
    }

    public void setOperateurId(Long id){
        this.id = id;
    }



    public Long getHopitalId(){
        return this.id;
    }

    public void setHopitalId(Long id){
        this.id = id;
    }



    public Long getUniteAdministrativeId(){
        return this.id;
    }

    public void setUniteAdministrativeId(Long id){
        this.id = id;
    }



    public Long getPrestationId(){
        return this.id;
    }

    public void setPrestationId(Long id){
        this.id = id;
    }



    public Long getStatusRdvId(){
        return this.id;
    }

    public void setStatusRdvId(Long id){
        this.id = id;
    }



    public Long getCauseRejetDemandeRdvId(){
        return this.id;
    }

    public void setCauseRejetDemandeRdvId(Long id){
        this.id = id;
    }



    public Long getTemplateEmailConfirmationId(){
        return this.id;
    }

    public void setTemplateEmailConfirmationId(Long id){
        this.id = id;
    }




    }
