package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.Operateur;
import ma.enova.rdv.ws.dto.OperateurDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.OperateurCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHistoryCriteria;



public interface OperateurAdminService extends IService<Operateur, OperateurDto,OperateurCriteria, OperateurHistoryCriteria> {
    //Operateur findOrSave(Operateur operateur);


}
