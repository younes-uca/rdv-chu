package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "operateur_quota")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_quota_seq",sequenceName="operateur_quota_seq",allocationSize=1, initialValue = 1)
public class OperateurQuotaHistory extends HistBusinessObject  {


    public OperateurQuotaHistory() {
    super();
    }

    public OperateurQuotaHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_quota_seq")
    public Long getId() {
    return id;
    }
}

