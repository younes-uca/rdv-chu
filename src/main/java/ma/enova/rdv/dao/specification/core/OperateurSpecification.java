package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.OperateurCriteria;
import ma.enova.rdv.bean.core.Operateur;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OperateurSpecification extends AbstractSpecification<OperateurCriteria, Operateur> {

    public OperateurSpecification(OperateurCriteria criteria) {
        super(criteria);
    }

    public OperateurSpecification(OperateurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<Operateur> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("cin", criteria.getCin(),criteria.getCinLike());
             addPredicate("dateNaissance", criteria.getDateNaissance(), criteria.getDateNaissanceFrom(), criteria.getDateNaissanceTo());
             addPredicate("passport", criteria.getPassport(),criteria.getPassportLike());
            addOrderAndFilter();
          }
        return getResult();
    }

}
