package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.Hopital;
import ma.enova.rdv.ws.dto.HopitalDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.HopitalCriteria;
import ma.enova.rdv.dao.criteria.history.HopitalHistoryCriteria;



public interface HopitalAdminService extends IService<Hopital, HopitalDto,HopitalCriteria, HopitalHistoryCriteria> {
    //Hopital findOrSave(Hopital hopital);


}
