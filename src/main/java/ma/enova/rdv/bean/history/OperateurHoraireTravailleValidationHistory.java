package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "operateur_horaire_travaille_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="operateur_horaire_travaille_validation_seq",sequenceName="operateur_horaire_travaille_validation_seq",allocationSize=1, initialValue = 1)
public class OperateurHoraireTravailleValidationHistory extends HistBusinessObject  {


    public OperateurHoraireTravailleValidationHistory() {
    super();
    }

    public OperateurHoraireTravailleValidationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="operateur_horaire_travaille_validation_seq")
    public Long getId() {
    return id;
    }
}

