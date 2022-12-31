package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.JourFerieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface JourFerieHistoryDao extends AbstractHistoryRepository<JourFerieHistory,Long> {

}
