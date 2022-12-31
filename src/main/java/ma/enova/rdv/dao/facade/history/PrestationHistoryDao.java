package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.PrestationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestationHistoryDao extends AbstractHistoryRepository<PrestationHistory,Long> {

}
