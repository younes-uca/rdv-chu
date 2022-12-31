package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Prestation;
import org.springframework.stereotype.Repository;


@Repository
public interface PrestationDao extends AbstractRepository<Prestation,Long> {
}
