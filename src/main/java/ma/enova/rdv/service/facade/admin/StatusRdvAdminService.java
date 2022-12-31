package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.StatusRdv;
import ma.enova.rdv.ws.dto.StatusRdvDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.StatusRdvCriteria;
import ma.enova.rdv.dao.criteria.history.StatusRdvHistoryCriteria;



public interface StatusRdvAdminService extends IService<StatusRdv, StatusRdvDto,StatusRdvCriteria, StatusRdvHistoryCriteria> {
    //StatusRdv findOrSave(StatusRdv statusRdv);


}
