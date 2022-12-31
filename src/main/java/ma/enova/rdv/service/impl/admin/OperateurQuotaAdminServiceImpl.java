package ma.enova.rdv.service.impl.admin;

import ma.enova.rdv.bean.core.OperateurQuota;
import ma.enova.rdv.bean.history.OperateurQuotaHistory;
import ma.enova.rdv.dao.criteria.core.OperateurQuotaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurQuotaHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurQuotaDao;
import ma.enova.rdv.dao.facade.history.OperateurQuotaHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurQuotaHistorySpecification;
import ma.enova.rdv.service.facade.admin.OperateurQuotaAdminService;
import ma.enova.rdv.ws.converter.OperateurQuotaConverter;
import ma.enova.rdv.ws.dto.OperateurQuotaDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurQuotaAdminServiceImpl extends AbstractServiceImpl<OperateurQuota, OperateurQuotaDto,OperateurQuotaHistory, OperateurQuotaCriteria, OperateurQuotaHistoryCriteria, OperateurQuotaDao,
OperateurQuotaHistoryDao, OperateurQuotaConverter> implements OperateurQuotaAdminService {

    public OperateurQuotaAdminServiceImpl(OperateurQuotaDao dao, OperateurQuotaHistoryDao historyDao, OperateurQuotaConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(OperateurQuota.class, OperateurQuotaDto.class, OperateurQuotaHistory.class, OperateurQuotaHistoryCriteria.class, OperateurQuotaHistorySpecification.class);
    }



}