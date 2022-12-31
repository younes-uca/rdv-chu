package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.Agenda;
import ma.enova.rdv.bean.history.AgendaHistory;
import ma.enova.rdv.dao.criteria.core.AgendaCriteria;
import ma.enova.rdv.dao.criteria.history.AgendaHistoryCriteria;
import ma.enova.rdv.dao.facade.core.AgendaDao;
import ma.enova.rdv.dao.facade.history.AgendaHistoryDao;
import ma.enova.rdv.dao.specification.history.AgendaHistorySpecification;
import ma.enova.rdv.service.facade.patient.AgendaPatientService;
import ma.enova.rdv.ws.converter.AgendaConverter;
import ma.enova.rdv.ws.dto.AgendaDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class AgendaPatientServiceImpl extends AbstractServiceImpl<Agenda, AgendaDto,AgendaHistory, AgendaCriteria, AgendaHistoryCriteria, AgendaDao,
AgendaHistoryDao, AgendaConverter> implements AgendaPatientService {

    public AgendaPatientServiceImpl(AgendaDao dao, AgendaHistoryDao historyDao, AgendaConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(Agenda.class, AgendaDto.class, AgendaHistory.class, AgendaHistoryCriteria.class, AgendaHistorySpecification.class);
    }



}