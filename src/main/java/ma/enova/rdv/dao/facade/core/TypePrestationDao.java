package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.TypePrestation;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.TypePrestation;


@Repository
public interface TypePrestationDao extends AbstractRepository<TypePrestation,Long> {
    TypePrestation findByCode(String code);
    int deleteByCode(String code);
}
