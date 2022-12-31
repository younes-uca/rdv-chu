package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "agenda")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="agenda_seq",sequenceName="agenda_seq",allocationSize=1, initialValue = 1)
public class Agenda   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String daysOfMonth;
    private Integer month;
    private Integer annee;

    @ManyToOne(fetch = FetchType.LAZY)
    private UniteAdministrative uniteAdministrative ;


    public Agenda(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="agenda_seq")
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
    public String getDaysOfMonth(){
        return this.daysOfMonth;
    }
    public void setDaysOfMonth(String daysOfMonth){
        this.daysOfMonth = daysOfMonth;
    }
    public Integer getMonth(){
        return this.month;
    }
    public void setMonth(Integer month){
        this.month = month;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    public UniteAdministrative getUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void setUniteAdministrative(UniteAdministrative uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
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
        Agenda agenda = (Agenda) o;
        return id != null && id.equals(agenda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

