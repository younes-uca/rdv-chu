package ma.enova.rdv.service.facade.patient;

import java.util.List;
import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;
import ma.enova.rdv.ws.dto.OperateurHoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.OperateurHoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHoraireTravailleValidationHistoryCriteria;



public interface OperateurHoraireTravailleValidationPatientService extends IService<OperateurHoraireTravailleValidation, OperateurHoraireTravailleValidationDto,OperateurHoraireTravailleValidationCriteria, OperateurHoraireTravailleValidationHistoryCriteria> {
    //OperateurHoraireTravailleValidation findOrSave(OperateurHoraireTravailleValidation operateurHoraireTravailleValidation);


}
