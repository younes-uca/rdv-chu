package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.OperateurQuotaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurQuotaHistoryDao extends AbstractHistoryRepository<OperateurQuotaHistory,Long> {

}
