package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.DemandeRdvHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeRdvHistoryDao extends AbstractHistoryRepository<DemandeRdvHistory,Long> {

}
