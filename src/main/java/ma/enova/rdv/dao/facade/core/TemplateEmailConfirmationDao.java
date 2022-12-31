package ma.enova.rdv.dao.facade.core;



import ma.enova.rdv.zynerator.repository.AbstractRepository;
import ma.enova.rdv.bean.core.TemplateEmailConfirmation;
import org.springframework.stereotype.Repository;


@Repository
public interface TemplateEmailConfirmationDao extends AbstractRepository<TemplateEmailConfirmation,Long> {
}
