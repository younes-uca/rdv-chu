package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.DemandeRdvCriteria;
import ma.enova.rdv.bean.core.DemandeRdv;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DemandeRdvSpecification extends AbstractSpecification<DemandeRdvCriteria, DemandeRdv> {

    public DemandeRdvSpecification(DemandeRdvCriteria criteria) {
        super(criteria);
    }

    public DemandeRdvSpecification(DemandeRdvCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<DemandeRdv> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
             addPredicate("ipp", criteria.getIpp(),criteria.getIppLike());
             addPredicate("nom", criteria.getNom(),criteria.getNomLike());
             addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
             addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
             addPredicate("cin", criteria.getCin(),criteria.getCinLike());
             addPredicate("codeRamed", criteria.getCodeRamed(),criteria.getCodeRamedLike());
             addPredicate("ficheReferencePath", criteria.getFicheReferencePath(),criteria.getFicheReferencePathLike());
             addPredicate("dateDemandeRdv", criteria.getDateDemandeRdv(), criteria.getDateDemandeRdvFrom(), criteria.getDateDemandeRdvTo());
             addPredicate("datePrevu", criteria.getDatePrevu(), criteria.getDatePrevuFrom(), criteria.getDatePrevuTo());
             addPredicate("dateEffective", criteria.getDateEffective(), criteria.getDateEffectiveFrom(), criteria.getDateEffectiveTo());
             addPredicate("dateValidation", criteria.getDateValidation(), criteria.getDateValidationFrom(), criteria.getDateValidationTo());
             addPredicate("dateRejet", criteria.getDateRejet(), criteria.getDateRejetFrom(), criteria.getDateRejetTo());
             addPredicateInt("nombreReccurenceTotal", criteria.getNombreReccurenceTotal());
             addPredicateInt("nombreReccurenceValide", criteria.getNombreReccurenceValide());
             addPredicateInt("nombreReccurenceRejet", criteria.getNombreReccurenceRejet());
            addOrderAndFilter();
          }
        return getResult();
    }

}
