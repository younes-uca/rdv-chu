package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.OperateurAgenda;
import ma.enova.rdv.bean.history.OperateurAgendaHistory;
import ma.enova.rdv.dao.criteria.core.OperateurAgendaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurAgendaHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurAgendaDao;
import ma.enova.rdv.dao.facade.history.OperateurAgendaHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurAgendaHistorySpecification;
import ma.enova.rdv.service.facade.patient.OperateurAgendaPatientService;
import ma.enova.rdv.ws.converter.OperateurAgendaConverter;
import ma.enova.rdv.ws.dto.OperateurAgendaDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurAgendaPatientServiceImpl extends AbstractServiceImpl<OperateurAgenda, OperateurAgendaDto,OperateurAgendaHistory, OperateurAgendaCriteria, OperateurAgendaHistoryCriteria, OperateurAgendaDao,
OperateurAgendaHistoryDao, OperateurAgendaConverter> implements OperateurAgendaPatientService {

    public OperateurAgendaPatientServiceImpl(OperateurAgendaDao dao, OperateurAgendaHistoryDao historyDao, OperateurAgendaConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(OperateurAgenda.class, OperateurAgendaDto.class, OperateurAgendaHistory.class, OperateurAgendaHistoryCriteria.class, OperateurAgendaHistorySpecification.class);
    }



}