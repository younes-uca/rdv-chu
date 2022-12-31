package ma.enova.rdv.service.facade.superviseur;

import java.util.List;
import ma.enova.rdv.bean.core.HoraireTravailleValidation;
import ma.enova.rdv.ws.dto.HoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.HoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.HoraireTravailleValidationHistoryCriteria;



public interface HoraireTravailleValidationSuperviseurService extends IService<HoraireTravailleValidation, HoraireTravailleValidationDto,HoraireTravailleValidationCriteria, HoraireTravailleValidationHistoryCriteria> {
    //HoraireTravailleValidation findOrSave(HoraireTravailleValidation horaireTravailleValidation);


}
