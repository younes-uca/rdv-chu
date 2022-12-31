package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.CelluleValidationHistoryCriteria;
import ma.enova.rdv.bean.history.CelluleValidationHistory;


public class CelluleValidationHistorySpecification extends AbstractHistorySpecification<CelluleValidationHistoryCriteria, CelluleValidationHistory> {

    public CelluleValidationHistorySpecification(CelluleValidationHistoryCriteria criteria) {
        super(criteria);
    }

    public CelluleValidationHistorySpecification(CelluleValidationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
