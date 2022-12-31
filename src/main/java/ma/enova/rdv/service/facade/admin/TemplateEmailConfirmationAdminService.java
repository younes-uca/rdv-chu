package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.TemplateEmailConfirmation;
import ma.enova.rdv.ws.dto.TemplateEmailConfirmationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.TemplateEmailConfirmationCriteria;
import ma.enova.rdv.dao.criteria.history.TemplateEmailConfirmationHistoryCriteria;



public interface TemplateEmailConfirmationAdminService extends IService<TemplateEmailConfirmation, TemplateEmailConfirmationDto,TemplateEmailConfirmationCriteria, TemplateEmailConfirmationHistoryCriteria> {
    //TemplateEmailConfirmation findOrSave(TemplateEmailConfirmation templateEmailConfirmation);


}
