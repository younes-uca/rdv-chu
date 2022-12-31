package ma.enova.rdv.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "jour_ferie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="jour_ferie_seq",sequenceName="jour_ferie_seq",allocationSize=1, initialValue = 1)
public class JourFerie   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;
    private Long nombreJoursTotal ;



    public JourFerie(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="jour_ferie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public Long getNombreJoursTotal(){
        return this.nombreJoursTotal;
    }
    public void setNombreJoursTotal(Long nombreJoursTotal){
        this.nombreJoursTotal = nombreJoursTotal;
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
        JourFerie jourFerie = (JourFerie) o;
        return id != null && id.equals(jourFerie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

