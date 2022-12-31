package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.HoraireTravailleValidation;
import org.springframework.stereotype.Repository;


@Repository
public interface HoraireTravailleValidationDao extends AbstractRepository<HoraireTravailleValidation,Long> {
}
