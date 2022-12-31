package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.CauseRejetDemandeRdvHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CauseRejetDemandeRdvHistoryDao extends AbstractHistoryRepository<CauseRejetDemandeRdvHistory,Long> {

}
