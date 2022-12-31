package ma.enova.rdv.service.facade.superviseur;

import java.util.List;
import ma.enova.rdv.bean.core.CauseRejetDemandeRdv;
import ma.enova.rdv.ws.dto.CauseRejetDemandeRdvDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.CauseRejetDemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.CauseRejetDemandeRdvHistoryCriteria;



public interface CauseRejetDemandeRdvSuperviseurService extends IService<CauseRejetDemandeRdv, CauseRejetDemandeRdvDto,CauseRejetDemandeRdvCriteria, CauseRejetDemandeRdvHistoryCriteria> {
    //CauseRejetDemandeRdv findOrSave(CauseRejetDemandeRdv causeRejetDemandeRdv);


}
