package ma.enova.rdv.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "template_email_confirmation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="template_email_confirmation_seq",sequenceName="template_email_confirmation_seq",allocationSize=1, initialValue = 1)
public class TemplateEmailConfirmationHistory extends HistBusinessObject  {


    public TemplateEmailConfirmationHistory() {
    super();
    }

    public TemplateEmailConfirmationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="template_email_confirmation_seq")
    public Long getId() {
    return id;
    }
}

