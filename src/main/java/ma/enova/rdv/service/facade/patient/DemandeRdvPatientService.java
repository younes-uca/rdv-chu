package ma.enova.rdv.service.facade.patient;

import java.util.List;
import ma.enova.rdv.bean.core.DemandeRdv;
import ma.enova.rdv.ws.dto.DemandeRdvDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.DemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.DemandeRdvHistoryCriteria;



public interface DemandeRdvPatientService extends IService<DemandeRdv, DemandeRdvDto,DemandeRdvCriteria, DemandeRdvHistoryCriteria> {
    //DemandeRdv findOrSave(DemandeRdv demandeRdv);


}
