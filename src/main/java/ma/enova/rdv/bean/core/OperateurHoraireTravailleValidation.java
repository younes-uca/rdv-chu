package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "operateur_horaire_travaille_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_horaire_travaille_validation_seq",sequenceName="operateur_horaire_travaille_validation_seq",allocationSize=1, initialValue = 1)
public class OperateurHoraireTravailleValidation   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String heureDebut;
    @Column(length = 500)
    private String heureFin;

    @ManyToOne(fetch = FetchType.LAZY)
    private HoraireTravailleValidation horaireTravailleValidation ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Operateur operateur ;


    public OperateurHoraireTravailleValidation(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_horaire_travaille_validation_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public HoraireTravailleValidation getHoraireTravailleValidation(){
        return this.horaireTravailleValidation;
    }
    public void setHoraireTravailleValidation(HoraireTravailleValidation horaireTravailleValidation){
        this.horaireTravailleValidation = horaireTravailleValidation;
    }
    public Operateur getOperateur(){
        return this.operateur;
    }
    public void setOperateur(Operateur operateur){
        this.operateur = operateur;
    }
    public String getHeureDebut(){
        return this.heureDebut;
    }
    public void setHeureDebut(String heureDebut){
        this.heureDebut = heureDebut;
    }
    public String getHeureFin(){
        return this.heureFin;
    }
    public void setHeureFin(String heureFin){
        this.heureFin = heureFin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperateurHoraireTravailleValidation operateurHoraireTravailleValidation = (OperateurHoraireTravailleValidation) o;
        return id != null && id.equals(operateurHoraireTravailleValidation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

