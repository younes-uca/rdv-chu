package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.Operateur;
import ma.enova.rdv.bean.history.OperateurHistory;
import ma.enova.rdv.dao.criteria.core.OperateurCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurDao;
import ma.enova.rdv.dao.facade.history.OperateurHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.OperateurAgendaSuperviseurService;
import ma.enova.rdv.service.facade.superviseur.OperateurHoraireTravailleValidationSuperviseurService;
import ma.enova.rdv.service.facade.superviseur.OperateurSuperviseurService;
import ma.enova.rdv.service.facade.superviseur.OperateurUniteAdministrativeSuperviseurService;
import ma.enova.rdv.ws.converter.OperateurConverter;
import ma.enova.rdv.ws.dto.OperateurDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurSuperviseurServiceImpl extends AbstractServiceImpl<Operateur, OperateurDto, OperateurHistory, OperateurCriteria, OperateurHistoryCriteria, OperateurDao,
        OperateurHistoryDao, OperateurConverter> implements OperateurSuperviseurService {

    private OperateurAgendaSuperviseurService operateurAgendaService;
    private OperateurHoraireTravailleValidationSuperviseurService operateurHoraireTravailleValidationService;
    private OperateurUniteAdministrativeSuperviseurService operateurUniteAdministrativeService;

    public OperateurSuperviseurServiceImpl(OperateurDao dao, OperateurHistoryDao historyDao, OperateurConverter converter, OperateurAgendaSuperviseurService operateurAgendasService, OperateurHoraireTravailleValidationSuperviseurService operateurHoraireTravailleValidationsService, OperateurUniteAdministrativeSuperviseurService operateurUniteAdministrativesService) {
        super(dao, historyDao, converter);
        this.operateurAgendaService = this.operateurAgendaService;
        this.operateurHoraireTravailleValidationService = this.operateurHoraireTravailleValidationService;
        this.operateurUniteAdministrativeService = this.operateurUniteAdministrativeService;
    }


    public void configure() {
        super.configure(Operateur.class, OperateurDto.class, OperateurHistory.class, OperateurHistoryCriteria.class, OperateurHistorySpecification.class);
    }


    private void findAssociatedLists(Operateur operateur) {
        if (operateur != null && operateur.getId() != null) {
            //List<OperateurAgenda> operateurAgendas = operateurAgendaService.findByOperateurId(operateur.getId());
            //operateur.setOperateurAgendas(operateurAgendas);
            //List<OperateurHoraireTravailleValidation> operateurHoraireTravailleValidations = operateurHoraireTravailleValidationService.findByOperateurId(operateur.getId());
            //operateur.setOperateurHoraireTravailleValidations(operateurHoraireTravailleValidations);
            //List<OperateurUniteAdministrative> operateurUniteAdministratives = operateurUniteAdministrativeService.findByOperateurId(operateur.getId());
            //operateur.setOperateurUniteAdministratives(operateurUniteAdministratives);
        }
    }

    private void deleteAssociatedLists(Long id) {
        if (id != null) {
            //operateurAgendaService.deleteByOperateurId(id);
            //operateurHoraireTravailleValidationService.deleteByOperateurId(id);
            //operateurUniteAdministrativeService.deleteByOperateurId(id);
        }
    }

    private void updateAssociatedLists(Operateur operateur) {
        if (operateur != null && operateur.getId() != null) {
            //List<List<OperateurAgenda>> resultOperateurAgendas= operateurAgendaService.getToBeSavedAndToBeDeleted(operateurAgendaService.findByOperateurId(operateur.getId()),operateur.getOperateurAgendas());
            //operateurAgendaService.delete(resultOperateurAgendas.get(1));
            //associateOperateurAgenda(operateur,resultOperateurAgendas.get(0));
            //operateurAgendaService.update(resultOperateurAgendas.get(0));
            //List<List<OperateurHoraireTravailleValidation>> resultOperateurHoraireTravailleValidations= operateurHoraireTravailleValidationService.getToBeSavedAndToBeDeleted(operateurHoraireTravailleValidationService.findByOperateurId(operateur.getId()),operateur.getOperateurHoraireTravailleValidations());
            //operateurHoraireTravailleValidationService.delete(resultOperateurHoraireTravailleValidations.get(1));
            //associateOperateurHoraireTravailleValidation(operateur,resultOperateurHoraireTravailleValidations.get(0));
            //operateurHoraireTravailleValidationService.update(resultOperateurHoraireTravailleValidations.get(0));
            //List<List<OperateurUniteAdministrative>> resultOperateurUniteAdministratives= operateurUniteAdministrativeService.getToBeSavedAndToBeDeleted(operateurUniteAdministrativeService.findByOperateurId(operateur.getId()),operateur.getOperateurUniteAdministratives());
            //operateurUniteAdministrativeService.delete(resultOperateurUniteAdministratives.get(1));
            //associateOperateurUniteAdministrative(operateur,resultOperateurUniteAdministratives.get(0));
            //operateurUniteAdministrativeService.update(resultOperateurUniteAdministratives.get(0));
        }
    }

}