package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.HopitalHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HopitalHistoryDao extends AbstractHistoryRepository<HopitalHistory,Long> {

}
