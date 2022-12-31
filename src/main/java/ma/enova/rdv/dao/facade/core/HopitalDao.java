package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Hopital;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.Hopital;


@Repository
public interface HopitalDao extends AbstractRepository<Hopital,Long> {
    Hopital findByCode(String code);
    int deleteByCode(String code);
}
