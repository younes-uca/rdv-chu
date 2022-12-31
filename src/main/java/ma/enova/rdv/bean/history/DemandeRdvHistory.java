package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "demande_rdv")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_rdv_seq",sequenceName="demande_rdv_seq",allocationSize=1, initialValue = 1)
public class DemandeRdvHistory extends HistBusinessObject  {


    public DemandeRdvHistory() {
    super();
    }

    public DemandeRdvHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="demande_rdv_seq")
    public Long getId() {
    return id;
    }
}

