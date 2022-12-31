package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "agenda")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="agenda_seq",sequenceName="agenda_seq",allocationSize=1, initialValue = 1)
public class AgendaHistory extends HistBusinessObject  {


    public AgendaHistory() {
    super();
    }

    public AgendaHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="agenda_seq")
    public Long getId() {
    return id;
    }
}

