package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.PatientCriteria;
import ma.enova.rdv.bean.core.Patient;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PatientSpecification extends AbstractSpecification<PatientCriteria, Patient> {

    public PatientSpecification(PatientCriteria criteria) {
        super(criteria);
    }

    public PatientSpecification(PatientCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<Patient> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("ipp", criteria.getIpp(),criteria.getIppLike());
             addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
             addPredicate("cin", criteria.getCin(),criteria.getCinLike());
             addPredicate("codeRamed", criteria.getCodeRamed(),criteria.getCodeRamedLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
