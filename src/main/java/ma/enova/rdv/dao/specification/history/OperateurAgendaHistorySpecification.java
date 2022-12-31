package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.OperateurAgendaHistoryCriteria;
import ma.enova.rdv.bean.history.OperateurAgendaHistory;


public class OperateurAgendaHistorySpecification extends AbstractHistorySpecification<OperateurAgendaHistoryCriteria, OperateurAgendaHistory> {

    public OperateurAgendaHistorySpecification(OperateurAgendaHistoryCriteria criteria) {
        super(criteria);
    }

    public OperateurAgendaHistorySpecification(OperateurAgendaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
