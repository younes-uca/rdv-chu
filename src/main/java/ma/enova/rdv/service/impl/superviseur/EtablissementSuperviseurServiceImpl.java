package ma.enova.rdv.service.impl.superviseur;

import ma.enova.rdv.bean.core.Etablissement;
import ma.enova.rdv.bean.history.EtablissementHistory;
import ma.enova.rdv.dao.criteria.core.EtablissementCriteria;
import ma.enova.rdv.dao.criteria.history.EtablissementHistoryCriteria;
import ma.enova.rdv.dao.facade.core.EtablissementDao;
import ma.enova.rdv.dao.facade.history.EtablissementHistoryDao;
import ma.enova.rdv.dao.specification.history.EtablissementHistorySpecification;
import ma.enova.rdv.service.facade.superviseur.EtablissementSuperviseurService;
import ma.enova.rdv.ws.converter.EtablissementConverter;
import ma.enova.rdv.ws.dto.EtablissementDto;
import ma.enova.rdv.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class EtablissementSuperviseurServiceImpl extends AbstractServiceImpl<Etablissement, EtablissementDto,EtablissementHistory, EtablissementCriteria, EtablissementHistoryCriteria, EtablissementDao,
EtablissementHistoryDao, EtablissementConverter> implements EtablissementSuperviseurService {

    public EtablissementSuperviseurServiceImpl(EtablissementDao dao, EtablissementHistoryDao historyDao, EtablissementConverter converter) {
        super(dao, historyDao, converter);
    }


    public void configure() {
        super.configure(Etablissement.class, EtablissementDto.class, EtablissementHistory.class, EtablissementHistoryCriteria.class, EtablissementHistorySpecification.class);
    }



}