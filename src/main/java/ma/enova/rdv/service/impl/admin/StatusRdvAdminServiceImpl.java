package ma.enova.rdv.service.impl.admin;

import ma.enova.rdv.bean.core.StatusRdv;
import ma.enova.rdv.bean.history.StatusRdvHistory;
import ma.enova.rdv.dao.criteria.core.StatusRdvCriteria;
import ma.enova.rdv.dao.criteria.history.StatusRdvHistoryCriteria;
import ma.enova.rdv.dao.facade.core.StatusRdvDao;
import ma.enova.rdv.dao.facade.history.StatusRdvHistoryDao;
import ma.enova.rdv.dao.specification.history.StatusRdvHistorySpecification;
import ma.enova.rdv.service.facade.admin.StatusRdvAdminService;
import ma.enova.rdv.ws.converter.StatusRdvConverter;
import ma.enova.rdv.ws.dto.StatusRdvDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class StatusRdvAdminServiceImpl extends AbstractServiceImpl<StatusRdv, StatusRdvDto,StatusRdvHistory, StatusRdvCriteria, StatusRdvHistoryCriteria, StatusRdvDao,
StatusRdvHistoryDao, StatusRdvConverter> implements StatusRdvAdminService {

    public StatusRdvAdminServiceImpl(StatusRdvDao dao, StatusRdvHistoryDao historyDao, StatusRdvConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(StatusRdv.class, StatusRdvDto.class, StatusRdvHistory.class, StatusRdvHistoryCriteria.class, StatusRdvHistorySpecification.class);
    }



}