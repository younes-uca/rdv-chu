package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.CelluleValidation;
import ma.enova.rdv.bean.history.CelluleValidationHistory;
import ma.enova.rdv.dao.criteria.core.CelluleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.CelluleValidationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.CelluleValidationDao;
import ma.enova.rdv.dao.facade.history.CelluleValidationHistoryDao;
import ma.enova.rdv.dao.specification.history.CelluleValidationHistorySpecification;
import ma.enova.rdv.service.facade.patient.CelluleValidationPatientService;
import ma.enova.rdv.ws.converter.CelluleValidationConverter;
import ma.enova.rdv.ws.dto.CelluleValidationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class CelluleValidationPatientServiceImpl extends AbstractServiceImpl<CelluleValidation, CelluleValidationDto,CelluleValidationHistory, CelluleValidationCriteria, CelluleValidationHistoryCriteria, CelluleValidationDao,
CelluleValidationHistoryDao, CelluleValidationConverter> implements CelluleValidationPatientService {

    public CelluleValidationPatientServiceImpl(CelluleValidationDao dao, CelluleValidationHistoryDao historyDao, CelluleValidationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(CelluleValidation.class, CelluleValidationDto.class, CelluleValidationHistory.class, CelluleValidationHistoryCriteria.class, CelluleValidationHistorySpecification.class);
    }



}