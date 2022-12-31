package ma.enova.rdv.service.facade.patient;

import java.util.List;
import ma.enova.rdv.bean.core.JourFerie;
import ma.enova.rdv.ws.dto.JourFerieDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.JourFerieCriteria;
import ma.enova.rdv.dao.criteria.history.JourFerieHistoryCriteria;



public interface JourFeriePatientService extends IService<JourFerie, JourFerieDto,JourFerieCriteria, JourFerieHistoryCriteria> {
    //JourFerie findOrSave(JourFerie jourFerie);


}
