package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.CelluleValidationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CelluleValidationHistoryDao extends AbstractHistoryRepository<CelluleValidationHistory,Long> {

}
