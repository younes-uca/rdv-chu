package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "prestation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prestation_seq",sequenceName="prestation_seq",allocationSize=1, initialValue = 1)
public class Prestation   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    private Integer dureeEnMiniute;

    @ManyToOne(fetch = FetchType.LAZY)
    private TypePrestation typePrestation ;
    @ManyToOne(fetch = FetchType.LAZY)
    private UniteAdministrative uniteAdministrative ;


    public Prestation(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prestation_seq")
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
    public TypePrestation getTypePrestation(){
        return this.typePrestation;
    }
    public void setTypePrestation(TypePrestation typePrestation){
        this.typePrestation = typePrestation;
    }
    public Integer getDureeEnMiniute(){
        return this.dureeEnMiniute;
    }
    public void setDureeEnMiniute(Integer dureeEnMiniute){
        this.dureeEnMiniute = dureeEnMiniute;
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
        Prestation prestation = (Prestation) o;
        return id != null && id.equals(prestation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

