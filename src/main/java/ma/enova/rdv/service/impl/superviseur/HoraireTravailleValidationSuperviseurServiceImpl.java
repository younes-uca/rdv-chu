package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.HoraireTravailleValidation;
import ma.enova.rdv.bean.history.HoraireTravailleValidationHistory;
import ma.enova.rdv.dao.criteria.core.HoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.HoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.HoraireTravailleValidationDao;
import ma.enova.rdv.dao.facade.history.HoraireTravailleValidationHistoryDao;
import ma.enova.rdv.dao.specification.history.HoraireTravailleValidationHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.HoraireTravailleValidationSuperviseurService;
import ma.enova.rdv.ws.converter.HoraireTravailleValidationConverter;
import ma.enova.rdv.ws.dto.HoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class HoraireTravailleValidationSuperviseurServiceImpl extends AbstractServiceImpl<HoraireTravailleValidation, HoraireTravailleValidationDto,HoraireTravailleValidationHistory, HoraireTravailleValidationCriteria, HoraireTravailleValidationHistoryCriteria, HoraireTravailleValidationDao,
HoraireTravailleValidationHistoryDao, HoraireTravailleValidationConverter> implements HoraireTravailleValidationSuperviseurService {

    public HoraireTravailleValidationSuperviseurServiceImpl(HoraireTravailleValidationDao dao, HoraireTravailleValidationHistoryDao historyDao, HoraireTravailleValidationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(HoraireTravailleValidation.class, HoraireTravailleValidationDto.class, HoraireTravailleValidationHistory.class, HoraireTravailleValidationHistoryCriteria.class, HoraireTravailleValidationHistorySpecification.class);
    }



}