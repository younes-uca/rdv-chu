package ma.enova.rdv.bean.core;

import java.util.Objects;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "hopital")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="hopital_seq",sequenceName="hopital_seq",allocationSize=1, initialValue = 1)
public class Hopital   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;


    @OneToMany(mappedBy = "hopital")
    private List<UniteAdministrative> uniteAdministratives ;

    public Hopital(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="hopital_seq")
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
    public List<UniteAdministrative> getUniteAdministratives(){
        return this.uniteAdministratives;
    }
    public void setUniteAdministratives(List<UniteAdministrative> uniteAdministratives){
        this.uniteAdministratives = uniteAdministratives;
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
        Hopital hopital = (Hopital) o;
        return id != null && id.equals(hopital.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

