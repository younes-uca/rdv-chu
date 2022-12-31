package ma.enova.rdv.service.facade.superviseur;

import java.util.List;
import ma.enova.rdv.bean.core.UniteAdministrative;
import ma.enova.rdv.ws.dto.UniteAdministrativeDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.UniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.UniteAdministrativeHistoryCriteria;



public interface UniteAdministrativeSuperviseurService extends IService<UniteAdministrative, UniteAdministrativeDto,UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria> {
    //UniteAdministrative findOrSave(UniteAdministrative uniteAdministrative);


}
