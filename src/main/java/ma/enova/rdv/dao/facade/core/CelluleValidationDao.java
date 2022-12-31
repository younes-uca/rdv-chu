package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.CelluleValidation;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.CelluleValidation;


@Repository
public interface CelluleValidationDao extends AbstractRepository<CelluleValidation,Long> {
    CelluleValidation findByCode(String code);
    int deleteByCode(String code);
}
