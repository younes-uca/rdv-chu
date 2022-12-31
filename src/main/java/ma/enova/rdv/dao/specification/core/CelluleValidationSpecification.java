package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.CelluleValidationCriteria;
import ma.enova.rdv.bean.core.CelluleValidation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CelluleValidationSpecification extends AbstractSpecification<CelluleValidationCriteria, CelluleValidation> {

    public CelluleValidationSpecification(CelluleValidationCriteria criteria) {
        super(criteria);
    }

    public CelluleValidationSpecification(CelluleValidationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<CelluleValidation> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
             addPredicate("phone", criteria.getPhone(),criteria.getPhoneLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
