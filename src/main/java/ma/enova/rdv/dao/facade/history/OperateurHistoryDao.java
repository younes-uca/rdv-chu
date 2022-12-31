package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.OperateurHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurHistoryDao extends AbstractHistoryRepository<OperateurHistory,Long> {

}
