package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.OperateurQuota;
import ma.enova.rdv.ws.dto.OperateurQuotaDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.OperateurQuotaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurQuotaHistoryCriteria;



public interface OperateurQuotaAdminService extends IService<OperateurQuota, OperateurQuotaDto,OperateurQuotaCriteria, OperateurQuotaHistoryCriteria> {
    //OperateurQuota findOrSave(OperateurQuota operateurQuota);


}
