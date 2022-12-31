package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.OperateurAgenda;
import org.springframework.stereotype.Repository;


@Repository
public interface OperateurAgendaDao extends AbstractRepository<OperateurAgenda,Long> {
}
