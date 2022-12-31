package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.TypePrestation;
import ma.enova.rdv.bean.history.TypePrestationHistory;
import ma.enova.rdv.dao.criteria.core.TypePrestationCriteria;
import ma.enova.rdv.dao.criteria.history.TypePrestationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.TypePrestationDao;
import ma.enova.rdv.dao.facade.history.TypePrestationHistoryDao;
import ma.enova.rdv.dao.specification.history.TypePrestationHistorySpecification;
import ma.enova.rdv.service.facade.patient.TypePrestationPatientService;
import ma.enova.rdv.ws.converter.TypePrestationConverter;
import ma.enova.rdv.ws.dto.TypePrestationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class TypePrestationPatientServiceImpl extends AbstractServiceImpl<TypePrestation, TypePrestationDto,TypePrestationHistory, TypePrestationCriteria, TypePrestationHistoryCriteria, TypePrestationDao,
TypePrestationHistoryDao, TypePrestationConverter> implements TypePrestationPatientService {

    public TypePrestationPatientServiceImpl(TypePrestationDao dao, TypePrestationHistoryDao historyDao, TypePrestationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(TypePrestation.class, TypePrestationDto.class, TypePrestationHistory.class, TypePrestationHistoryCriteria.class, TypePrestationHistorySpecification.class);
    }



}