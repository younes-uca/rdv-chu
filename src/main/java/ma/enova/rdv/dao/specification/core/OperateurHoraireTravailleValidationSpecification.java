package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.OperateurHoraireTravailleValidationCriteria;
import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OperateurHoraireTravailleValidationSpecification extends AbstractSpecification<OperateurHoraireTravailleValidationCriteria, OperateurHoraireTravailleValidation> {

    public OperateurHoraireTravailleValidationSpecification(OperateurHoraireTravailleValidationCriteria criteria) {
        super(criteria);
    }

    public OperateurHoraireTravailleValidationSpecification(OperateurHoraireTravailleValidationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<OperateurHoraireTravailleValidation> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("heureDebut", criteria.getHeureDebut(),criteria.getHeureDebutLike());
             addPredicate("heureFin", criteria.getHeureFin(),criteria.getHeureFinLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
