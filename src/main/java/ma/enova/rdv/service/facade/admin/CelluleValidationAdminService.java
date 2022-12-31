package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.CelluleValidation;
import ma.enova.rdv.ws.dto.CelluleValidationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.CelluleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.CelluleValidationHistoryCriteria;



public interface CelluleValidationAdminService extends IService<CelluleValidation, CelluleValidationDto,CelluleValidationCriteria, CelluleValidationHistoryCriteria> {
    //CelluleValidation findOrSave(CelluleValidation celluleValidation);


}
