package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "operateur_agenda")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_agenda_seq",sequenceName="operateur_agenda_seq",allocationSize=1, initialValue = 1)
public class OperateurAgendaHistory extends HistBusinessObject  {


    public OperateurAgendaHistory() {
    super();
    }

    public OperateurAgendaHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_agenda_seq")
    public Long getId() {
    return id;
    }
}

