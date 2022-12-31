package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.OperateurUniteAdministrativeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurUniteAdministrativeHistoryDao extends AbstractHistoryRepository<OperateurUniteAdministrativeHistory,Long> {

}
