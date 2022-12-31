package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurHoraireTravailleValidationHistoryDao extends AbstractHistoryRepository<OperateurHoraireTravailleValidationHistory,Long> {

}
