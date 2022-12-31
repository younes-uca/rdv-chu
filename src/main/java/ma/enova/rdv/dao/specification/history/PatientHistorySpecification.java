package  ma.enova.rdv.dao.specification.history;

import ma.enova.rdv.zynerator.specification.AbstractHistorySpecification;
import ma.enova.rdv.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.rdv.bean.history.PatientHistory;


public class PatientHistorySpecification extends AbstractHistorySpecification<PatientHistoryCriteria, PatientHistory> {

    public PatientHistorySpecification(PatientHistoryCriteria criteria) {
        super(criteria);
    }

    public PatientHistorySpecification(PatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
