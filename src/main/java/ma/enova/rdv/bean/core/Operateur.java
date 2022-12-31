package ma.enova.rdv.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "operateur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_seq",sequenceName="operateur_seq",allocationSize=1, initialValue = 1)
public class Operateur   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String cin;
    private LocalDateTime dateNaissance ;
    @Column(length = 500)
    private String passport;

    @ManyToOne(fetch = FetchType.LAZY)
    private CelluleValidation celluleValidation ;

    //@OneToMany(mappedBy = "operateur")
    @Transient
    private List<OperateurAgenda> operateurAgendas ;
    //@OneToMany(mappedBy = "operateur")
    @Transient
    private List<OperateurHoraireTravailleValidation> operateurHoraireTravailleValidations ;
   // @OneToMany(mappedBy = "operateur")
   @Transient
    private List<OperateurUniteAdministrative> operateurUniteAdministratives ;

    public Operateur(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public String getPassport(){
        return this.passport;
    }
    public void setPassport(String passport){
        this.passport = passport;
    }
    public CelluleValidation getCelluleValidation(){
        return this.celluleValidation;
    }
    public void setCelluleValidation(CelluleValidation celluleValidation){
        this.celluleValidation = celluleValidation;
    }
    public List<OperateurAgenda> getOperateurAgendas(){
        return this.operateurAgendas;
    }
    public void setOperateurAgendas(List<OperateurAgenda> operateurAgendas){
        this.operateurAgendas = operateurAgendas;
    }
    public List<OperateurHoraireTravailleValidation> getOperateurHoraireTravailleValidations(){
        return this.operateurHoraireTravailleValidations;
    }
    public void setOperateurHoraireTravailleValidations(List<OperateurHoraireTravailleValidation> operateurHoraireTravailleValidations){
        this.operateurHoraireTravailleValidations = operateurHoraireTravailleValidations;
    }
    public List<OperateurUniteAdministrative> getOperateurUniteAdministratives(){
        return this.operateurUniteAdministratives;
    }
    public void setOperateurUniteAdministratives(List<OperateurUniteAdministrative> operateurUniteAdministratives){
        this.operateurUniteAdministratives = operateurUniteAdministratives;
    }

    @Transient
    public String getLabel() {
        label = cin;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operateur operateur = (Operateur) o;
        return id != null && id.equals(operateur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

