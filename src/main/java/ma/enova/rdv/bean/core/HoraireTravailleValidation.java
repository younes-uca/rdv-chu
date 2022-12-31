package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "horaire_travaille_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="horaire_travaille_validation_seq",sequenceName="horaire_travaille_validation_seq",allocationSize=1, initialValue = 1)
public class HoraireTravailleValidation   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String daysOfWeek;
    @Column(length = 500)
    private String month;
    @Column(length = 500)
    private String heureDebut;
    @Column(length = 500)
    private String heureFin;



    public HoraireTravailleValidation(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="horaire_travaille_validation_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getDaysOfWeek(){
        return this.daysOfWeek;
    }
    public void setDaysOfWeek(String daysOfWeek){
        this.daysOfWeek = daysOfWeek;
    }
    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
        this.month = month;
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

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraireTravailleValidation horaireTravailleValidation = (HoraireTravailleValidation) o;
        return id != null && id.equals(horaireTravailleValidation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

