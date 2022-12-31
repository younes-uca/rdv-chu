package ma.enova.rdv.service.facade.superviseur;

import java.util.List;
import ma.enova.rdv.bean.core.OperateurUniteAdministrative;
import ma.enova.rdv.ws.dto.OperateurUniteAdministrativeDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.OperateurUniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurUniteAdministrativeHistoryCriteria;



public interface OperateurUniteAdministrativeSuperviseurService extends IService<OperateurUniteAdministrative, OperateurUniteAdministrativeDto,OperateurUniteAdministrativeCriteria, OperateurUniteAdministrativeHistoryCriteria> {
    //OperateurUniteAdministrative findOrSave(OperateurUniteAdministrative operateurUniteAdministrative);


}
