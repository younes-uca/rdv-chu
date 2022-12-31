package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.OperateurUniteAdministrativeCriteria;
import ma.enova.rdv.bean.core.OperateurUniteAdministrative;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OperateurUniteAdministrativeSpecification extends AbstractSpecification<OperateurUniteAdministrativeCriteria, OperateurUniteAdministrative> {

    public OperateurUniteAdministrativeSpecification(OperateurUniteAdministrativeCriteria criteria) {
        super(criteria);
    }

    public OperateurUniteAdministrativeSpecification(OperateurUniteAdministrativeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<OperateurUniteAdministrative> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
            addOrderAndFilter();
          }
        return getResult();
    }

}
