package ma.enova.rdv.service.facade.patient;

import java.util.List;
import ma.enova.rdv.bean.core.Prestation;
import ma.enova.rdv.ws.dto.PrestationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.PrestationCriteria;
import ma.enova.rdv.dao.criteria.history.PrestationHistoryCriteria;



public interface PrestationPatientService extends IService<Prestation, PrestationDto,PrestationCriteria, PrestationHistoryCriteria> {
    //Prestation findOrSave(Prestation prestation);


}
