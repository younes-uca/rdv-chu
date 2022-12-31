package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "horaire_travaille_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="horaire_travaille_validation_seq",sequenceName="horaire_travaille_validation_seq",allocationSize=1, initialValue = 1)
public class HoraireTravailleValidationHistory extends HistBusinessObject  {


    public HoraireTravailleValidationHistory() {
    super();
    }

    public HoraireTravailleValidationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="horaire_travaille_validation_seq")
    public Long getId() {
    return id;
    }
}

