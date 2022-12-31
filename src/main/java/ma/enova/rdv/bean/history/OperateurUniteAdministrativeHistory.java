package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "operateur_unite_administrative")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_unite_administrative_seq",sequenceName="operateur_unite_administrative_seq",allocationSize=1, initialValue = 1)
public class OperateurUniteAdministrativeHistory extends HistBusinessObject  {


    public OperateurUniteAdministrativeHistory() {
    super();
    }

    public OperateurUniteAdministrativeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_unite_administrative_seq")
    public Long getId() {
    return id;
    }
}

