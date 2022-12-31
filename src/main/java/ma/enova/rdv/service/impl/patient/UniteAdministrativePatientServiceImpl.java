package ma.enova.rdv.service.impl.patient;

import ma.enova.rdv.bean.core.UniteAdministrative;
import ma.enova.rdv.bean.history.UniteAdministrativeHistory;
import ma.enova.rdv.dao.criteria.core.UniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.enova.rdv.dao.facade.core.UniteAdministrativeDao;
import ma.enova.rdv.dao.facade.history.UniteAdministrativeHistoryDao;
import ma.enova.rdv.dao.specification.history.UniteAdministrativeHistorySpecification;
import ma.enova.rdv.service.facade.patient.PrestationPatientService;
import ma.enova.rdv.service.facade.patient.UniteAdministrativePatientService;
import ma.enova.rdv.ws.converter.UniteAdministrativeConverter;
import ma.enova.rdv.ws.dto.UniteAdministrativeDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UniteAdministrativePatientServiceImpl extends AbstractServiceImpl<UniteAdministrative, UniteAdministrativeDto, UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeDao,
        UniteAdministrativeHistoryDao, UniteAdministrativeConverter> implements UniteAdministrativePatientService {

    private PrestationPatientService prestationService;

    public UniteAdministrativePatientServiceImpl(UniteAdministrativeDao dao, UniteAdministrativeHistoryDao historyDao, UniteAdministrativeConverter converter, PrestationPatientService prestationsService) {
        super(dao, historyDao, converter);
        this.prestationService = this.prestationService;
    }


    public void configure() {
        super.configure(UniteAdministrative.class, UniteAdministrativeDto.class, UniteAdministrativeHistory.class, UniteAdministrativeHistoryCriteria.class, UniteAdministrativeHistorySpecification.class);
    }


    private void findAssociatedLists(UniteAdministrative uniteAdministrative) {
        if (uniteAdministrative != null && uniteAdministrative.getId() != null) {
            //List<Prestation> prestations = prestationService.findByUniteAdministrativeId(uniteAdministrative.getId());
            //uniteAdministrative.setPrestations(prestations);
        }
    }

    private void deleteAssociatedLists(Long id) {
        if (id != null) {
            //prestationService.deleteByUniteAdministrativeId(id);
        }
    }

    private void updateAssociatedLists(UniteAdministrative uniteAdministrative) {
        if (uniteAdministrative != null && uniteAdministrative.getId() != null) {
            //List<List<Prestation>> resultPrestations= prestationService.getToBeSavedAndToBeDeleted(prestationService.findByUniteAdministrativeId(uniteAdministrative.getId()),uniteAdministrative.getPrestations());
            //prestationService.delete(resultPrestations.get(1));
            //associatePrestation(uniteAdministrative,resultPrestations.get(0));
            //prestationService.update(resultPrestations.get(0));
        }
    }

}