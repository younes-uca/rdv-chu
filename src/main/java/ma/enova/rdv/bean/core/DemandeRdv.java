package ma.enova.rdv.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "demande_rdv")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_rdv_seq",sequenceName="demande_rdv_seq",allocationSize=1, initialValue = 1)
public class DemandeRdv   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String reference;
    @Column(length = 500)
    private String ipp;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Lob
    @Column(columnDefinition="TEXT")
    private String adresse;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String codeRamed;
    @Lob
    @Column(columnDefinition="TEXT")
    private String observation;
    @Column(length = 500)
    private String ficheReferencePath;
    private LocalDateTime dateDemandeRdv ;
    private LocalDateTime datePrevu ;
    private LocalDateTime dateEffective ;
    private LocalDateTime dateValidation ;
    private LocalDateTime dateRejet ;
    private Integer nombreReccurenceTotal;
    private Integer nombreReccurenceValide;
    private Integer nombreReccurenceRejet;

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Operateur operateur ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Hopital hopital ;
    @ManyToOne(fetch = FetchType.LAZY)
    private UniteAdministrative uniteAdministrative ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Prestation prestation ;
    @ManyToOne(fetch = FetchType.LAZY)
    private StatusRdv statusRdv ;
    @ManyToOne(fetch = FetchType.LAZY)
    private CauseRejetDemandeRdv causeRejetDemandeRdv ;
    @ManyToOne(fetch = FetchType.LAZY)
    private TemplateEmailConfirmation templateEmailConfirmation ;


    public DemandeRdv(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="demande_rdv_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public Patient getPatient(){
        return this.patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }
    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
        this.codeRamed = codeRamed;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }
    public Operateur getOperateur(){
        return this.operateur;
    }
    public void setOperateur(Operateur operateur){
        this.operateur = operateur;
    }
    public Hopital getHopital(){
        return this.hopital;
    }
    public void setHopital(Hopital hopital){
        this.hopital = hopital;
    }
    public UniteAdministrative getUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void setUniteAdministrative(UniteAdministrative uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public Prestation getPrestation(){
        return this.prestation;
    }
    public void setPrestation(Prestation prestation){
        this.prestation = prestation;
    }
    public StatusRdv getStatusRdv(){
        return this.statusRdv;
    }
    public void setStatusRdv(StatusRdv statusRdv){
        this.statusRdv = statusRdv;
    }
    public String getFicheReferencePath(){
        return this.ficheReferencePath;
    }
    public void setFicheReferencePath(String ficheReferencePath){
        this.ficheReferencePath = ficheReferencePath;
    }
    public CauseRejetDemandeRdv getCauseRejetDemandeRdv(){
        return this.causeRejetDemandeRdv;
    }
    public void setCauseRejetDemandeRdv(CauseRejetDemandeRdv causeRejetDemandeRdv){
        this.causeRejetDemandeRdv = causeRejetDemandeRdv;
    }
    public LocalDateTime getDateDemandeRdv(){
        return this.dateDemandeRdv;
    }
    public void setDateDemandeRdv(LocalDateTime dateDemandeRdv){
        this.dateDemandeRdv = dateDemandeRdv;
    }
    public LocalDateTime getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(LocalDateTime datePrevu){
        this.datePrevu = datePrevu;
    }
    public LocalDateTime getDateEffective(){
        return this.dateEffective;
    }
    public void setDateEffective(LocalDateTime dateEffective){
        this.dateEffective = dateEffective;
    }
    public LocalDateTime getDateValidation(){
        return this.dateValidation;
    }
    public void setDateValidation(LocalDateTime dateValidation){
        this.dateValidation = dateValidation;
    }
    public LocalDateTime getDateRejet(){
        return this.dateRejet;
    }
    public void setDateRejet(LocalDateTime dateRejet){
        this.dateRejet = dateRejet;
    }
    public Integer getNombreReccurenceTotal(){
        return this.nombreReccurenceTotal;
    }
    public void setNombreReccurenceTotal(Integer nombreReccurenceTotal){
        this.nombreReccurenceTotal = nombreReccurenceTotal;
    }
    public Integer getNombreReccurenceValide(){
        return this.nombreReccurenceValide;
    }
    public void setNombreReccurenceValide(Integer nombreReccurenceValide){
        this.nombreReccurenceValide = nombreReccurenceValide;
    }
    public Integer getNombreReccurenceRejet(){
        return this.nombreReccurenceRejet;
    }
    public void setNombreReccurenceRejet(Integer nombreReccurenceRejet){
        this.nombreReccurenceRejet = nombreReccurenceRejet;
    }
    public TemplateEmailConfirmation getTemplateEmailConfirmation(){
        return this.templateEmailConfirmation;
    }
    public void setTemplateEmailConfirmation(TemplateEmailConfirmation templateEmailConfirmation){
        this.templateEmailConfirmation = templateEmailConfirmation;
    }

    @Transient
    public String getLabel() {
        label = reference;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeRdv demandeRdv = (DemandeRdv) o;
        return id != null && id.equals(demandeRdv.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

