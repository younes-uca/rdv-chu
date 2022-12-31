package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etablissement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etablissement_seq",sequenceName="etablissement_seq",allocationSize=1, initialValue = 1)
public class EtablissementHistory extends HistBusinessObject  {


    public EtablissementHistory() {
    super();
    }

    public EtablissementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_seq")
    public Long getId() {
    return id;
    }
}

