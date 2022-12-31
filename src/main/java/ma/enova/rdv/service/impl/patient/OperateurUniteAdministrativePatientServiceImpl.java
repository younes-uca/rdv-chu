package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.OperateurUniteAdministrative;
import ma.enova.rdv.bean.history.OperateurUniteAdministrativeHistory;
import ma.enova.rdv.dao.criteria.core.OperateurUniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurUniteAdministrativeHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurUniteAdministrativeDao;
import ma.enova.rdv.dao.facade.history.OperateurUniteAdministrativeHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurUniteAdministrativeHistorySpecification;
import ma.enova.rdv.service.facade.patient.OperateurUniteAdministrativePatientService;
import ma.enova.rdv.ws.converter.OperateurUniteAdministrativeConverter;
import ma.enova.rdv.ws.dto.OperateurUniteAdministrativeDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurUniteAdministrativePatientServiceImpl extends AbstractServiceImpl<OperateurUniteAdministrative, OperateurUniteAdministrativeDto,OperateurUniteAdministrativeHistory, OperateurUniteAdministrativeCriteria, OperateurUniteAdministrativeHistoryCriteria, OperateurUniteAdministrativeDao,
OperateurUniteAdministrativeHistoryDao, OperateurUniteAdministrativeConverter> implements OperateurUniteAdministrativePatientService {

    public OperateurUniteAdministrativePatientServiceImpl(OperateurUniteAdministrativeDao dao, OperateurUniteAdministrativeHistoryDao historyDao, OperateurUniteAdministrativeConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(OperateurUniteAdministrative.class, OperateurUniteAdministrativeDto.class, OperateurUniteAdministrativeHistory.class, OperateurUniteAdministrativeHistoryCriteria.class, OperateurUniteAdministrativeHistorySpecification.class);
    }



}