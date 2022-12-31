package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "hopital")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="hopital_seq",sequenceName="hopital_seq",allocationSize=1, initialValue = 1)
public class HopitalHistory extends HistBusinessObject  {


    public HopitalHistory() {
    super();
    }

    public HopitalHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="hopital_seq")
    public Long getId() {
    return id;
    }
}

