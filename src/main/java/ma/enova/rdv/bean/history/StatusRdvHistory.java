package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "status_rdv")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="status_rdv_seq",sequenceName="status_rdv_seq",allocationSize=1, initialValue = 1)
public class StatusRdvHistory extends HistBusinessObject  {


    public StatusRdvHistory() {
    super();
    }

    public StatusRdvHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="status_rdv_seq")
    public Long getId() {
    return id;
    }
}

