package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.OperateurHistoryCriteria;
import ma.enova.rdv.bean.history.OperateurHistory;


public class OperateurHistorySpecification extends AbstractHistorySpecification<OperateurHistoryCriteria, OperateurHistory> {

    public OperateurHistorySpecification(OperateurHistoryCriteria criteria) {
        super(criteria);
    }

    public OperateurHistorySpecification(OperateurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
