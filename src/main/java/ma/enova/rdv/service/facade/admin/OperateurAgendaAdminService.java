package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.OperateurAgenda;
import ma.enova.rdv.ws.dto.OperateurAgendaDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.OperateurAgendaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurAgendaHistoryCriteria;



public interface OperateurAgendaAdminService extends IService<OperateurAgenda, OperateurAgendaDto,OperateurAgendaCriteria, OperateurAgendaHistoryCriteria> {
    //OperateurAgenda findOrSave(OperateurAgenda operateurAgenda);


}
