package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.enova.rdv.bean.history.UniteAdministrativeHistory;


public class UniteAdministrativeHistorySpecification extends AbstractHistorySpecification<UniteAdministrativeHistoryCriteria, UniteAdministrativeHistory> {

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria) {
        super(criteria);
    }

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
