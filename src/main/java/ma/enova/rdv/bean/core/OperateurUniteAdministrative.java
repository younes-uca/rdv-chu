package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "operateur_unite_administrative")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_unite_administrative_seq",sequenceName="operateur_unite_administrative_seq",allocationSize=1, initialValue = 1)
public class OperateurUniteAdministrative   extends AuditBusinessObject  {

    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    private UniteAdministrative uniteAdministrative ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Operateur operateur ;


    public OperateurUniteAdministrative(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_unite_administrative_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public UniteAdministrative getUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void setUniteAdministrative(UniteAdministrative uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public Operateur getOperateur(){
        return this.operateur;
    }
    public void setOperateur(Operateur operateur){
        this.operateur = operateur;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperateurUniteAdministrative operateurUniteAdministrative = (OperateurUniteAdministrative) o;
        return id != null && id.equals(operateurUniteAdministrative.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

