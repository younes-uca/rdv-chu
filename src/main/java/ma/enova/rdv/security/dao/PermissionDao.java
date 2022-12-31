package ma.enova.rdv.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enova.rdv.security.bean.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
