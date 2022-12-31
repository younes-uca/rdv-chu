package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.Hopital;
import ma.enova.rdv.bean.history.HopitalHistory;
import ma.enova.rdv.dao.criteria.core.HopitalCriteria;
import ma.enova.rdv.dao.criteria.history.HopitalHistoryCriteria;
import ma.enova.rdv.dao.facade.core.HopitalDao;
import ma.enova.rdv.dao.facade.history.HopitalHistoryDao;
import ma.enova.rdv.dao.specification.history.HopitalHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.HopitalSuperviseurService;
import ma.enova.rdv.service.facade.superviseur.UniteAdministrativeSuperviseurService;
import ma.enova.rdv.ws.converter.HopitalConverter;
import ma.enova.rdv.ws.dto.HopitalDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class HopitalSuperviseurServiceImpl extends AbstractServiceImpl<Hopital, HopitalDto, HopitalHistory, HopitalCriteria, HopitalHistoryCriteria, HopitalDao,
        HopitalHistoryDao, HopitalConverter> implements HopitalSuperviseurService {

    private UniteAdministrativeSuperviseurService uniteAdministrativeService;

    public HopitalSuperviseurServiceImpl(HopitalDao dao, HopitalHistoryDao historyDao, HopitalConverter converter, UniteAdministrativeSuperviseurService uniteAdministrativesService) {
        super(dao, historyDao, converter);
        this.uniteAdministrativeService = this.uniteAdministrativeService;
    }


    public void configure() {
        super.configure(Hopital.class, HopitalDto.class, HopitalHistory.class, HopitalHistoryCriteria.class, HopitalHistorySpecification.class);
    }


    private void findAssociatedLists(Hopital hopital) {
        if (hopital != null && hopital.getId() != null) {
            //List<UniteAdministrative> uniteAdministratives = uniteAdministrativeService.findByHopitalId(hopital.getId());
            //hopital.setUniteAdministratives(uniteAdministratives);
        }
    }

    private void deleteAssociatedLists(Long id) {
        if (id != null) {
            //uniteAdministrativeService.deleteByHopitalId(id);
        }
    }

    private void updateAssociatedLists(Hopital hopital) {
        if (hopital != null && hopital.getId() != null) {
            //List<List<UniteAdministrative>> resultUniteAdministratives= uniteAdministrativeService.getToBeSavedAndToBeDeleted(uniteAdministrativeService.findByHopitalId(hopital.getId()),hopital.getUniteAdministratives());
            //uniteAdministrativeService.delete(resultUniteAdministratives.get(1));
            //associateUniteAdministrative(hopital,resultUniteAdministratives.get(0));
            //uniteAdministrativeService.update(resultUniteAdministratives.get(0));
        }
    }

}