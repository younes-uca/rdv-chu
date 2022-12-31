package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Agenda;
import org.springframework.stereotype.Repository;


@Repository
public interface AgendaDao extends AbstractRepository<Agenda,Long> {
}
