package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.StatusRdvHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRdvHistoryDao extends AbstractHistoryRepository<StatusRdvHistory,Long> {

}
