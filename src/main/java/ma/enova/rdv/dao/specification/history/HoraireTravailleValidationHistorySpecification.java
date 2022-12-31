package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.HoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.bean.history.HoraireTravailleValidationHistory;


public class HoraireTravailleValidationHistorySpecification extends AbstractHistorySpecification<HoraireTravailleValidationHistoryCriteria, HoraireTravailleValidationHistory> {

    public HoraireTravailleValidationHistorySpecification(HoraireTravailleValidationHistoryCriteria criteria) {
        super(criteria);
    }

    public HoraireTravailleValidationHistorySpecification(HoraireTravailleValidationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
