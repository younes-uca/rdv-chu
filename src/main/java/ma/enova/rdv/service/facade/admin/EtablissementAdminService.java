package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.Etablissement;
import ma.enova.rdv.ws.dto.EtablissementDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.EtablissementCriteria;
import ma.enova.rdv.dao.criteria.history.EtablissementHistoryCriteria;



public interface EtablissementAdminService extends IService<Etablissement, EtablissementDto,EtablissementCriteria, EtablissementHistoryCriteria> {
    //Etablissement findOrSave(Etablissement etablissement);


}
