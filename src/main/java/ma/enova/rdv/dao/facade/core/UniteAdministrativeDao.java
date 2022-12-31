package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.UniteAdministrative;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.UniteAdministrative;


@Repository
public interface UniteAdministrativeDao extends AbstractRepository<UniteAdministrative,Long> {
    UniteAdministrative findByCode(String code);
    int deleteByCode(String code);
}
