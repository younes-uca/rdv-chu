package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "jour_ferie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="jour_ferie_seq",sequenceName="jour_ferie_seq",allocationSize=1, initialValue = 1)
public class JourFerieHistory extends HistBusinessObject  {


    public JourFerieHistory() {
    super();
    }

    public JourFerieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="jour_ferie_seq")
    public Long getId() {
    return id;
    }
}

