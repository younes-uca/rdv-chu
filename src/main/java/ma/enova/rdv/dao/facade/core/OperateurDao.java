package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Operateur;
import org.springframework.stereotype.Repository;


@Repository
public interface OperateurDao extends AbstractRepository<Operateur,Long> {
}
