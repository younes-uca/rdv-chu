package ma.enova.rdv.service.impl.admin;

import ma.enova.rdv.bean.core.Prestation;
import ma.enova.rdv.bean.history.PrestationHistory;
import ma.enova.rdv.dao.criteria.core.PrestationCriteria;
import ma.enova.rdv.dao.criteria.history.PrestationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.PrestationDao;
import ma.enova.rdv.dao.facade.history.PrestationHistoryDao;
import ma.enova.rdv.dao.specification.history.PrestationHistorySpecification;
import ma.enova.rdv.service.facade.admin.PrestationAdminService;
import ma.enova.rdv.ws.converter.PrestationConverter;
import ma.enova.rdv.ws.dto.PrestationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class PrestationAdminServiceImpl extends AbstractServiceImpl<Prestation, PrestationDto,PrestationHistory, PrestationCriteria, PrestationHistoryCriteria, PrestationDao,
PrestationHistoryDao, PrestationConverter> implements PrestationAdminService {

    public PrestationAdminServiceImpl(PrestationDao dao, PrestationHistoryDao historyDao, PrestationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(Prestation.class, PrestationDto.class, PrestationHistory.class, PrestationHistoryCriteria.class, PrestationHistorySpecification.class);
    }



}