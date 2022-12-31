package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.DemandeRdv;
import ma.enova.rdv.bean.history.DemandeRdvHistory;
import ma.enova.rdv.dao.criteria.core.DemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.DemandeRdvHistoryCriteria;
import ma.enova.rdv.dao.facade.core.DemandeRdvDao;
import ma.enova.rdv.dao.facade.history.DemandeRdvHistoryDao;
import ma.enova.rdv.dao.specification.history.DemandeRdvHistorySpecification;
import ma.enova.rdv.service.facade.patient.DemandeRdvPatientService;
import ma.enova.rdv.ws.converter.DemandeRdvConverter;
import ma.enova.rdv.ws.dto.DemandeRdvDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class DemandeRdvPatientServiceImpl extends AbstractServiceImpl<DemandeRdv, DemandeRdvDto,DemandeRdvHistory, DemandeRdvCriteria, DemandeRdvHistoryCriteria, DemandeRdvDao,
DemandeRdvHistoryDao, DemandeRdvConverter> implements DemandeRdvPatientService {

    public DemandeRdvPatientServiceImpl(DemandeRdvDao dao, DemandeRdvHistoryDao historyDao, DemandeRdvConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(DemandeRdv.class, DemandeRdvDto.class, DemandeRdvHistory.class, DemandeRdvHistoryCriteria.class, DemandeRdvHistorySpecification.class);
    }



}