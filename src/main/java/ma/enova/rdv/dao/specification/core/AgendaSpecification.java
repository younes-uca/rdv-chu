package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.AgendaCriteria;
import ma.enova.rdv.bean.core.Agenda;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AgendaSpecification extends AbstractSpecification<AgendaCriteria, Agenda> {

    public AgendaSpecification(AgendaCriteria criteria) {
        super(criteria);
    }

    public AgendaSpecification(AgendaCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<Agenda> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("daysOfMonth", criteria.getDaysOfMonth(),criteria.getDaysOfMonthLike());
             addPredicateInt("month", criteria.getMonth());
             addPredicateInt("annee", criteria.getAnnee());
            addOrderAndFilter();
          }
        return getResult();
    }

}
