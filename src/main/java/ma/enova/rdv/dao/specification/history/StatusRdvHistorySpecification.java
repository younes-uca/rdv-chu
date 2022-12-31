package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.StatusRdvHistoryCriteria;
import ma.enova.rdv.bean.history.StatusRdvHistory;


public class StatusRdvHistorySpecification extends AbstractHistorySpecification<StatusRdvHistoryCriteria, StatusRdvHistory> {

    public StatusRdvHistorySpecification(StatusRdvHistoryCriteria criteria) {
        super(criteria);
    }

    public StatusRdvHistorySpecification(StatusRdvHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
