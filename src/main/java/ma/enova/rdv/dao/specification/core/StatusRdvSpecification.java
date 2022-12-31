package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.StatusRdvCriteria;
import ma.enova.rdv.bean.core.StatusRdv;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StatusRdvSpecification extends AbstractSpecification<StatusRdvCriteria, StatusRdv> {

    public StatusRdvSpecification(StatusRdvCriteria criteria) {
        super(criteria);
    }

    public StatusRdvSpecification(StatusRdvCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<StatusRdv> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
