package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.TypePrestation;
import ma.enova.rdv.ws.dto.TypePrestationDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.TypePrestationCriteria;
import ma.enova.rdv.dao.criteria.history.TypePrestationHistoryCriteria;



public interface TypePrestationAdminService extends IService<TypePrestation, TypePrestationDto,TypePrestationCriteria, TypePrestationHistoryCriteria> {
    //TypePrestation findOrSave(TypePrestation typePrestation);


}
