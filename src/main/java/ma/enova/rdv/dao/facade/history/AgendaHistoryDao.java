package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.AgendaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaHistoryDao extends AbstractHistoryRepository<AgendaHistory,Long> {

}
