package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.OperateurQuotaCriteria;
import ma.enova.rdv.bean.core.OperateurQuota;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OperateurQuotaSpecification extends AbstractSpecification<OperateurQuotaCriteria, OperateurQuota> {

    public OperateurQuotaSpecification(OperateurQuotaCriteria criteria) {
        super(criteria);
    }

    public OperateurQuotaSpecification(OperateurQuotaCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<OperateurQuota> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicateInt("nombreMaxRdv", criteria.getNombreMaxRdv());
            addOrderAndFilter();
          }
        return getResult();
    }

}
