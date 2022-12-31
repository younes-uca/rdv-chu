package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.Patient;
import org.springframework.stereotype.Repository;
    import ma.enova.rdv.bean.core.Patient;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long> {
    Patient findByIpp(String ipp);
    int deleteByIpp(String ipp);
}
