package ma.enova.rdv.dao.facade.history;

import ma.enova.rdv.zynerator.repository.AbstractHistoryRepository;
import ma.enova.rdv.bean.history.PatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryDao extends AbstractHistoryRepository<PatientHistory,Long> {

}
