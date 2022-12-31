package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "cellule_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cellule_validation_seq",sequenceName="cellule_validation_seq",allocationSize=1, initialValue = 1)
public class CelluleValidationHistory extends HistBusinessObject  {


    public CelluleValidationHistory() {
    super();
    }

    public CelluleValidationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cellule_validation_seq")
    public Long getId() {
    return id;
    }
}

