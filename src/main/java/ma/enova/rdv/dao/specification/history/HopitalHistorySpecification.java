package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.HopitalHistoryCriteria;
import ma.enova.rdv.bean.history.HopitalHistory;


public class HopitalHistorySpecification extends AbstractHistorySpecification<HopitalHistoryCriteria, HopitalHistory> {

    public HopitalHistorySpecification(HopitalHistoryCriteria criteria) {
        super(criteria);
    }

    public HopitalHistorySpecification(HopitalHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
