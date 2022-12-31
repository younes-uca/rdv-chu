package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.UniteAdministrativeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteAdministrativeHistoryDao extends AbstractHistoryRepository<UniteAdministrativeHistory,Long> {

}
