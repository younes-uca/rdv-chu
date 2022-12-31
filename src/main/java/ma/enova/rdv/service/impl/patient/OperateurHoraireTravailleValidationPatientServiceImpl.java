package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;
import ma.enova.rdv.dao.criteria.core.OperateurHoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurHoraireTravailleValidationDao;
import ma.enova.rdv.dao.facade.history.OperateurHoraireTravailleValidationHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurHoraireTravailleValidationHistorySpecification;
import ma.enova.rdv.service.facade.patient.OperateurHoraireTravailleValidationPatientService;
import ma.enova.rdv.ws.converter.OperateurHoraireTravailleValidationConverter;
import ma.enova.rdv.ws.dto.OperateurHoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurHoraireTravailleValidationPatientServiceImpl extends AbstractServiceImpl<OperateurHoraireTravailleValidation, OperateurHoraireTravailleValidationDto,OperateurHoraireTravailleValidationHistory, OperateurHoraireTravailleValidationCriteria, OperateurHoraireTravailleValidationHistoryCriteria, OperateurHoraireTravailleValidationDao,
OperateurHoraireTravailleValidationHistoryDao, OperateurHoraireTravailleValidationConverter> implements OperateurHoraireTravailleValidationPatientService {

    public OperateurHoraireTravailleValidationPatientServiceImpl(OperateurHoraireTravailleValidationDao dao, OperateurHoraireTravailleValidationHistoryDao historyDao, OperateurHoraireTravailleValidationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(OperateurHoraireTravailleValidation.class, OperateurHoraireTravailleValidationDto.class, OperateurHoraireTravailleValidationHistory.class, OperateurHoraireTravailleValidationHistoryCriteria.class, OperateurHoraireTravailleValidationHistorySpecification.class);
    }



}