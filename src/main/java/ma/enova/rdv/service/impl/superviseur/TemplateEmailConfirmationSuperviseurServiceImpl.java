package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.TemplateEmailConfirmation;
import ma.enova.rdv.bean.history.TemplateEmailConfirmationHistory;
import ma.enova.rdv.dao.criteria.core.TemplateEmailConfirmationCriteria;
import ma.enova.rdv.dao.criteria.history.TemplateEmailConfirmationHistoryCriteria;
import ma.enova.rdv.dao.facade.core.TemplateEmailConfirmationDao;
import ma.enova.rdv.dao.facade.history.TemplateEmailConfirmationHistoryDao;
import ma.enova.rdv.dao.specification.history.TemplateEmailConfirmationHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.TemplateEmailConfirmationSuperviseurService;
import ma.enova.rdv.ws.converter.TemplateEmailConfirmationConverter;
import ma.enova.rdv.ws.dto.TemplateEmailConfirmationDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class TemplateEmailConfirmationSuperviseurServiceImpl extends AbstractServiceImpl<TemplateEmailConfirmation, TemplateEmailConfirmationDto,TemplateEmailConfirmationHistory, TemplateEmailConfirmationCriteria, TemplateEmailConfirmationHistoryCriteria, TemplateEmailConfirmationDao,
TemplateEmailConfirmationHistoryDao, TemplateEmailConfirmationConverter> implements TemplateEmailConfirmationSuperviseurService {

    public TemplateEmailConfirmationSuperviseurServiceImpl(TemplateEmailConfirmationDao dao, TemplateEmailConfirmationHistoryDao historyDao, TemplateEmailConfirmationConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(TemplateEmailConfirmation.class, TemplateEmailConfirmationDto.class, TemplateEmailConfirmationHistory.class, TemplateEmailConfirmationHistoryCriteria.class, TemplateEmailConfirmationHistorySpecification.class);
    }



}