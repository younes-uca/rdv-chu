package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.OperateurAgendaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurAgendaHistoryDao extends AbstractHistoryRepository<OperateurAgendaHistory,Long> {

}
