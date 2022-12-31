package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.HoraireTravailleValidationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraireTravailleValidationHistoryDao extends AbstractHistoryRepository<HoraireTravailleValidationHistory,Long> {

}
