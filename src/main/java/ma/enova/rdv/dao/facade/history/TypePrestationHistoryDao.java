package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.TypePrestationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePrestationHistoryDao extends AbstractHistoryRepository<TypePrestationHistory,Long> {

}
