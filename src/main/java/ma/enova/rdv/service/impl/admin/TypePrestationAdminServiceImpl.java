package ma.enova.rdv.service.impl.admin;

import ma.enova.rdv.bean.core.TypePrestation;
import ma.enova.rdv.bean.history.TypePrestationHistory;
import ma.enova.rdv.dao.criteria.core.TypePrestationCriteria;
import ma.enova.rdv.dao.criteria.history.TypePrestationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.TypePrestationDao;
import ma.enova.rdv.dao.facade.history.TypePrestationHistoryDao;
import ma.enova.rdv.dao.specification.history.TypePrestationHistorySpecification;
import ma.enova.rdv.service.facade.admin.TypePrestationAdminService;
import ma.enova.rdv.ws.converter.TypePrestationConverter;
import ma.enova.rdv.ws.dto.TypePrestationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class TypePrestationAdminServiceImpl extends AbstractServiceImpl<TypePrestation, TypePrestationDto,TypePrestationHistory, TypePrestationCriteria, TypePrestationHistoryCriteria, TypePrestationDao,
TypePrestationHistoryDao, TypePrestationConverter> implements TypePrestationAdminService {

    public TypePrestationAdminServiceImpl(TypePrestationDao dao, TypePrestationHistoryDao historyDao, TypePrestationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(TypePrestation.class, TypePrestationDto.class, TypePrestationHistory.class, TypePrestationHistoryCriteria.class, TypePrestationHistorySpecification.class);
    }



}