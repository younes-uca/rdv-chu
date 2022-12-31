package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "operateur_quota")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_quota_seq",sequenceName="operateur_quota_seq",allocationSize=1, initialValue = 1)
public class OperateurQuota   extends AuditBusinessObject  {

    private Long id;

    private Integer nombreMaxRdv;

    @ManyToOne(fetch = FetchType.LAZY)
    private Operateur operateur ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Prestation prestation ;


    public OperateurQuota(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_quota_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Operateur getOperateur(){
        return this.operateur;
    }
    public void setOperateur(Operateur operateur){
        this.operateur = operateur;
    }
    public Prestation getPrestation(){
        return this.prestation;
    }
    public void setPrestation(Prestation prestation){
        this.prestation = prestation;
    }
    public Integer getNombreMaxRdv(){
        return this.nombreMaxRdv;
    }
    public void setNombreMaxRdv(Integer nombreMaxRdv){
        this.nombreMaxRdv = nombreMaxRdv;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperateurQuota operateurQuota = (OperateurQuota) o;
        return id != null && id.equals(operateurQuota.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

