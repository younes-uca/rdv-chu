package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.JourFerieHistoryCriteria;
import ma.enova.rdv.bean.history.JourFerieHistory;


public class JourFerieHistorySpecification extends AbstractHistorySpecification<JourFerieHistoryCriteria, JourFerieHistory> {

    public JourFerieHistorySpecification(JourFerieHistoryCriteria criteria) {
        super(criteria);
    }

    public JourFerieHistorySpecification(JourFerieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
