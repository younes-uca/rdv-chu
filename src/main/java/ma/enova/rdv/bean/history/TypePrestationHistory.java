package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_prestation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_prestation_seq",sequenceName="type_prestation_seq",allocationSize=1, initialValue = 1)
public class TypePrestationHistory extends HistBusinessObject  {


    public TypePrestationHistory() {
    super();
    }

    public TypePrestationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_prestation_seq")
    public Long getId() {
    return id;
    }
}

