package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.CauseRejetDemandeRdv;
import org.springframework.stereotype.Repository;


@Repository
public interface CauseRejetDemandeRdvDao extends AbstractRepository<CauseRejetDemandeRdv,Long> {
}
