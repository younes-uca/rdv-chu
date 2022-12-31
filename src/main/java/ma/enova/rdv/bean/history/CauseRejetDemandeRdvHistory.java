package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "cause_rejet_demande_rdv")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cause_rejet_demande_rdv_seq",sequenceName="cause_rejet_demande_rdv_seq",allocationSize=1, initialValue = 1)
public class CauseRejetDemandeRdvHistory extends HistBusinessObject  {


    public CauseRejetDemandeRdvHistory() {
    super();
    }

    public CauseRejetDemandeRdvHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cause_rejet_demande_rdv_seq")
    public Long getId() {
    return id;
    }
}

