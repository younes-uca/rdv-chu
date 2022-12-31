package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.DemandeRdvHistoryCriteria;
import ma.enova.rdv.bean.history.DemandeRdvHistory;


public class DemandeRdvHistorySpecification extends AbstractHistorySpecification<DemandeRdvHistoryCriteria, DemandeRdvHistory> {

    public DemandeRdvHistorySpecification(DemandeRdvHistoryCriteria criteria) {
        super(criteria);
    }

    public DemandeRdvHistorySpecification(DemandeRdvHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
