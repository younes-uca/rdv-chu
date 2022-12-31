package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.OperateurHoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;


public class OperateurHoraireTravailleValidationHistorySpecification extends AbstractHistorySpecification<OperateurHoraireTravailleValidationHistoryCriteria, OperateurHoraireTravailleValidationHistory> {

    public OperateurHoraireTravailleValidationHistorySpecification(OperateurHoraireTravailleValidationHistoryCriteria criteria) {
        super(criteria);
    }

    public OperateurHoraireTravailleValidationHistorySpecification(OperateurHoraireTravailleValidationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
