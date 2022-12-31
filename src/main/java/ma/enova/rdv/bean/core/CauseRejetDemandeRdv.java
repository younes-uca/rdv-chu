package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "cause_rejet_demande_rdv")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cause_rejet_demande_rdv_seq",sequenceName="cause_rejet_demande_rdv_seq",allocationSize=1, initialValue = 1)
public class CauseRejetDemandeRdv   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;



    public CauseRejetDemandeRdv(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cause_rejet_demande_rdv_seq")
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

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CauseRejetDemandeRdv causeRejetDemandeRdv = (CauseRejetDemandeRdv) o;
        return id != null && id.equals(causeRejetDemandeRdv.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

