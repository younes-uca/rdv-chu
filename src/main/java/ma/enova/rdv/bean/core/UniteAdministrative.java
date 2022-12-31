package ma.enova.rdv.bean.core;

import java.util.Objects;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "unite_administrative")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="unite_administrative_seq",sequenceName="unite_administrative_seq",allocationSize=1, initialValue = 1)
public class UniteAdministrative   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hopital hopital ;

    @OneToMany(mappedBy = "uniteAdministrative")
    private List<Prestation> prestations ;

    public UniteAdministrative(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="unite_administrative_seq")
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
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public List<Prestation> getPrestations(){
        return this.prestations;
    }
    public void setPrestations(List<Prestation> prestations){
        this.prestations = prestations;
    }
    public Hopital getHopital(){
        return this.hopital;
    }
    public void setHopital(Hopital hopital){
        this.hopital = hopital;
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
        UniteAdministrative uniteAdministrative = (UniteAdministrative) o;
        return id != null && id.equals(uniteAdministrative.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

