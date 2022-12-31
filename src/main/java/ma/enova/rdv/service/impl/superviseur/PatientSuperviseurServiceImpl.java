package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.Patient;
import ma.enova.rdv.bean.history.PatientHistory;
import ma.enova.rdv.dao.criteria.core.PatientCriteria;
import ma.enova.rdv.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.rdv.dao.facade.core.PatientDao;
import ma.enova.rdv.dao.facade.history.PatientHistoryDao;
import ma.enova.rdv.dao.specification.history.PatientHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.PatientSuperviseurService;
import ma.enova.rdv.ws.converter.PatientConverter;
import ma.enova.rdv.ws.dto.PatientDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class PatientSuperviseurServiceImpl extends AbstractServiceImpl<Patient, PatientDto,PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientDao,
PatientHistoryDao, PatientConverter> implements PatientSuperviseurService {

    public PatientSuperviseurServiceImpl(PatientDao dao, PatientHistoryDao historyDao, PatientConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(Patient.class, PatientDto.class, PatientHistory.class, PatientHistoryCriteria.class, PatientHistorySpecification.class);
    }



}