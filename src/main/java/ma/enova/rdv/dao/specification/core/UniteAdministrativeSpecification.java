package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.UniteAdministrativeCriteria;
import ma.enova.rdv.bean.core.UniteAdministrative;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class UniteAdministrativeSpecification extends AbstractSpecification<UniteAdministrativeCriteria, UniteAdministrative> {

    public UniteAdministrativeSpecification(UniteAdministrativeCriteria criteria) {
        super(criteria);
    }

    public UniteAdministrativeSpecification(UniteAdministrativeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<UniteAdministrative> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
