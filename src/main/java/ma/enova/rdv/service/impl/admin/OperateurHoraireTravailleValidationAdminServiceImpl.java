package ma.enova.rdv.service.impl.admin;

import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;
import ma.enova.rdv.dao.criteria.core.OperateurHoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.OperateurHoraireTravailleValidationDao;
import ma.enova.rdv.dao.facade.history.OperateurHoraireTravailleValidationHistoryDao;
import ma.enova.rdv.dao.specification.history.OperateurHoraireTravailleValidationHistorySpecification;
import ma.enova.rdv.service.facade.admin.OperateurHoraireTravailleValidationAdminService;
import ma.enova.rdv.ws.converter.OperateurHoraireTravailleValidationConverter;
import ma.enova.rdv.ws.dto.OperateurHoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class OperateurHoraireTravailleValidationAdminServiceImpl extends AbstractServiceImpl<OperateurHoraireTravailleValidation, OperateurHoraireTravailleValidationDto,OperateurHoraireTravailleValidationHistory, OperateurHoraireTravailleValidationCriteria, OperateurHoraireTravailleValidationHistoryCriteria, OperateurHoraireTravailleValidationDao,
OperateurHoraireTravailleValidationHistoryDao, OperateurHoraireTravailleValidationConverter> implements OperateurHoraireTravailleValidationAdminService {

    public OperateurHoraireTravailleValidationAdminServiceImpl(OperateurHoraireTravailleValidationDao dao, OperateurHoraireTravailleValidationHistoryDao historyDao, OperateurHoraireTravailleValidationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(OperateurHoraireTravailleValidation.class, OperateurHoraireTravailleValidationDto.class, OperateurHoraireTravailleValidationHistory.class, OperateurHoraireTravailleValidationHistoryCriteria.class, OperateurHoraireTravailleValidationHistorySpecification.class);
    }



}