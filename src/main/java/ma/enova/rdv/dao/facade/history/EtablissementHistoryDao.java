package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.EtablissementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementHistoryDao extends AbstractHistoryRepository<EtablissementHistory,Long> {

}
