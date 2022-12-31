package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.JourFerie;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.JourFerie;


@Repository
public interface JourFerieDao extends AbstractRepository<JourFerie,Long> {
    JourFerie findByCode(String code);
    int deleteByCode(String code);
}
