package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.StatusRdv;
import org.springframework.stereotype.Repository;


@Repository
public interface StatusRdvDao extends AbstractRepository<StatusRdv,Long> {
}
