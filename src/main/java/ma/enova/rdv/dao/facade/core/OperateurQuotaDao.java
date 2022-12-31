package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.OperateurQuota;
import org.springframework.stereotype.Repository;


@Repository
public interface OperateurQuotaDao extends AbstractRepository<OperateurQuota,Long> {
}
