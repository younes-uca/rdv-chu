package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.JourFerieCriteria;
import ma.enova.rdv.bean.core.JourFerie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class JourFerieSpecification extends AbstractSpecification<JourFerieCriteria, JourFerie> {

    public JourFerieSpecification(JourFerieCriteria criteria) {
        super(criteria);
    }

    public JourFerieSpecification(JourFerieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<JourFerie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
             addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
             addPredicateLong("nombreJoursTotal", criteria.getNombreJoursTotal());
            addOrderAndFilter();
          }
        return getResult();
    }

}
