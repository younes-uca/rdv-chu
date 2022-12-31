package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.OperateurQuotaHistoryCriteria;
import ma.enova.rdv.bean.history.OperateurQuotaHistory;


public class OperateurQuotaHistorySpecification extends AbstractHistorySpecification<OperateurQuotaHistoryCriteria, OperateurQuotaHistory> {

    public OperateurQuotaHistorySpecification(OperateurQuotaHistoryCriteria criteria) {
        super(criteria);
    }

    public OperateurQuotaHistorySpecification(OperateurQuotaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
