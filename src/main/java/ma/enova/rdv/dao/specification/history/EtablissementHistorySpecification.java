package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.EtablissementHistoryCriteria;
import ma.enova.rdv.bean.history.EtablissementHistory;


public class EtablissementHistorySpecification extends AbstractHistorySpecification<EtablissementHistoryCriteria, EtablissementHistory> {

    public EtablissementHistorySpecification(EtablissementHistoryCriteria criteria) {
        super(criteria);
    }

    public EtablissementHistorySpecification(EtablissementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
