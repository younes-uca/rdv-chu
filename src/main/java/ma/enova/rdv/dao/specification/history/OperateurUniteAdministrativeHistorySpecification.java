package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.OperateurUniteAdministrativeHistoryCriteria;
import ma.enova.rdv.bean.history.OperateurUniteAdministrativeHistory;


public class OperateurUniteAdministrativeHistorySpecification extends AbstractHistorySpecification<OperateurUniteAdministrativeHistoryCriteria, OperateurUniteAdministrativeHistory> {

    public OperateurUniteAdministrativeHistorySpecification(OperateurUniteAdministrativeHistoryCriteria criteria) {
        super(criteria);
    }

    public OperateurUniteAdministrativeHistorySpecification(OperateurUniteAdministrativeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
