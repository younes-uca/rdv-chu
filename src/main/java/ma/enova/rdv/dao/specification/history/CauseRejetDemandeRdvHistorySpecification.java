package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.CauseRejetDemandeRdvHistoryCriteria;
import ma.enova.rdv.bean.history.CauseRejetDemandeRdvHistory;


public class CauseRejetDemandeRdvHistorySpecification extends AbstractHistorySpecification<CauseRejetDemandeRdvHistoryCriteria, CauseRejetDemandeRdvHistory> {

    public CauseRejetDemandeRdvHistorySpecification(CauseRejetDemandeRdvHistoryCriteria criteria) {
        super(criteria);
    }

    public CauseRejetDemandeRdvHistorySpecification(CauseRejetDemandeRdvHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
