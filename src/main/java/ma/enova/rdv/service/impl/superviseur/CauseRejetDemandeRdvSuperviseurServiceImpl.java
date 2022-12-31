package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.CauseRejetDemandeRdv;
import ma.enova.rdv.bean.history.CauseRejetDemandeRdvHistory;
import ma.enova.rdv.dao.criteria.core.CauseRejetDemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.CauseRejetDemandeRdvHistoryCriteria;
import ma.enova.rdv.dao.facade.core.CauseRejetDemandeRdvDao;
import ma.enova.rdv.dao.facade.history.CauseRejetDemandeRdvHistoryDao;
import ma.enova.rdv.dao.specification.history.CauseRejetDemandeRdvHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.CauseRejetDemandeRdvSuperviseurService;
import ma.enova.rdv.ws.converter.CauseRejetDemandeRdvConverter;
import ma.enova.rdv.ws.dto.CauseRejetDemandeRdvDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class CauseRejetDemandeRdvSuperviseurServiceImpl extends AbstractServiceImpl<CauseRejetDemandeRdv, CauseRejetDemandeRdvDto,CauseRejetDemandeRdvHistory, CauseRejetDemandeRdvCriteria, CauseRejetDemandeRdvHistoryCriteria, CauseRejetDemandeRdvDao,
CauseRejetDemandeRdvHistoryDao, CauseRejetDemandeRdvConverter> implements CauseRejetDemandeRdvSuperviseurService {

    public CauseRejetDemandeRdvSuperviseurServiceImpl(CauseRejetDemandeRdvDao dao, CauseRejetDemandeRdvHistoryDao historyDao, CauseRejetDemandeRdvConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(CauseRejetDemandeRdv.class, CauseRejetDemandeRdvDto.class, CauseRejetDemandeRdvHistory.class, CauseRejetDemandeRdvHistoryCriteria.class, CauseRejetDemandeRdvHistorySpecification.class);
    }



}