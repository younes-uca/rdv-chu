package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.JourFerie;
import ma.enova.rdv.bean.history.JourFerieHistory;
import ma.enova.rdv.dao.criteria.core.JourFerieCriteria;
import ma.enova.rdv.dao.criteria.history.JourFerieHistoryCriteria;
import ma.enova.rdv.dao.facade.core.JourFerieDao;
import ma.enova.rdv.dao.facade.history.JourFerieHistoryDao;
import ma.enova.rdv.dao.specification.history.JourFerieHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.JourFerieSuperviseurService;
import ma.enova.rdv.ws.converter.JourFerieConverter;
import ma.enova.rdv.ws.dto.JourFerieDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class JourFerieSuperviseurServiceImpl extends AbstractServiceImpl<JourFerie, JourFerieDto,JourFerieHistory, JourFerieCriteria, JourFerieHistoryCriteria, JourFerieDao,
JourFerieHistoryDao, JourFerieConverter> implements JourFerieSuperviseurService {

    public JourFerieSuperviseurServiceImpl(JourFerieDao dao, JourFerieHistoryDao historyDao, JourFerieConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(JourFerie.class, JourFerieDto.class, JourFerieHistory.class, JourFerieHistoryCriteria.class, JourFerieHistorySpecification.class);
    }



}