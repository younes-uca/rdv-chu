package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.TemplateEmailConfirmationHistoryCriteria;
import ma.enova.rdv.bean.history.TemplateEmailConfirmationHistory;


public class TemplateEmailConfirmationHistorySpecification extends AbstractHistorySpecification<TemplateEmailConfirmationHistoryCriteria, TemplateEmailConfirmationHistory> {

    public TemplateEmailConfirmationHistorySpecification(TemplateEmailConfirmationHistoryCriteria criteria) {
        super(criteria);
    }

    public TemplateEmailConfirmationHistorySpecification(TemplateEmailConfirmationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
