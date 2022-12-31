package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.PrestationHistoryCriteria;
import ma.enova.rdv.bean.history.PrestationHistory;


public class PrestationHistorySpecification extends AbstractHistorySpecification<PrestationHistoryCriteria, PrestationHistory> {

    public PrestationHistorySpecification(PrestationHistoryCriteria criteria) {
        super(criteria);
    }

    public PrestationHistorySpecification(PrestationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
