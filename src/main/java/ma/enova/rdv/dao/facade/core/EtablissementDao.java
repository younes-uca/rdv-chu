package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Etablissement;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.Etablissement;


@Repository
public interface EtablissementDao extends AbstractRepository<Etablissement,Long> {
    Etablissement findByCode(String code);
    int deleteByCode(String code);
}
