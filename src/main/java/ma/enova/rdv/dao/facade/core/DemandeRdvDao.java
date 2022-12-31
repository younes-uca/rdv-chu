package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.DemandeRdv;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.DemandeRdv;


@Repository
public interface DemandeRdvDao extends AbstractRepository<DemandeRdv,Long> {
    DemandeRdv findByReference(String reference);
    int deleteByReference(String reference);
}
