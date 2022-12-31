package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "prestation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prestation_seq",sequenceName="prestation_seq",allocationSize=1, initialValue = 1)
public class PrestationHistory extends HistBusinessObject  {


    public PrestationHistory() {
    super();
    }

    public PrestationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prestation_seq")
    public Long getId() {
    return id;
    }
}

