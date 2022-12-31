package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.AgendaHistoryCriteria;
import ma.enova.rdv.bean.history.AgendaHistory;


public class AgendaHistorySpecification extends AbstractHistorySpecification<AgendaHistoryCriteria, AgendaHistory> {

    public AgendaHistorySpecification(AgendaHistoryCriteria criteria) {
        super(criteria);
    }

    public AgendaHistorySpecification(AgendaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
