package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.HoraireTravailleValidationCriteria;
import ma.enova.rdv.bean.core.HoraireTravailleValidation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class HoraireTravailleValidationSpecification extends AbstractSpecification<HoraireTravailleValidationCriteria, HoraireTravailleValidation> {

    public HoraireTravailleValidationSpecification(HoraireTravailleValidationCriteria criteria) {
        super(criteria);
    }

    public HoraireTravailleValidationSpecification(HoraireTravailleValidationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<HoraireTravailleValidation> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("daysOfWeek", criteria.getDaysOfWeek(),criteria.getDaysOfWeekLike());
             addPredicate("month", criteria.getMonth(),criteria.getMonthLike());
             addPredicate("heureDebut", criteria.getHeureDebut(),criteria.getHeureDebutLike());
             addPredicate("heureFin", criteria.getHeureFin(),criteria.getHeureFinLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
