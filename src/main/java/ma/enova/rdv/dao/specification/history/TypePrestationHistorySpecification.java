package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.TypePrestationHistoryCriteria;
import ma.enova.rdv.bean.history.TypePrestationHistory;


public class TypePrestationHistorySpecification extends AbstractHistorySpecification<TypePrestationHistoryCriteria, TypePrestationHistory> {

    public TypePrestationHistorySpecification(TypePrestationHistoryCriteria criteria) {
        super(criteria);
    }

    public TypePrestationHistorySpecification(TypePrestationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
