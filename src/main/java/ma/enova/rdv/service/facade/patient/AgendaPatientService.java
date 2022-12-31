package ma.enova.rdv.service.facade.patient;

import java.util.List;
import ma.enova.rdv.bean.core.Agenda;
import ma.enova.rdv.ws.dto.AgendaDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.AgendaCriteria;
import ma.enova.rdv.dao.criteria.history.AgendaHistoryCriteria;



public interface AgendaPatientService extends IService<Agenda, AgendaDto,AgendaCriteria, AgendaHistoryCriteria> {
    //Agenda findOrSave(Agenda agenda);


}
