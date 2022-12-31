package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.TemplateEmailConfirmationCriteria;
import ma.enova.rdv.bean.core.TemplateEmailConfirmation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TemplateEmailConfirmationSpecification extends AbstractSpecification<TemplateEmailConfirmationCriteria, TemplateEmailConfirmation> {

    public TemplateEmailConfirmationSpecification(TemplateEmailConfirmationCriteria criteria) {
        super(criteria);
    }

    public TemplateEmailConfirmationSpecification(TemplateEmailConfirmationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<TemplateEmailConfirmation> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("objet", criteria.getObjet(),criteria.getObjetLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
