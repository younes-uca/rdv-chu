package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "cellule_validation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cellule_validation_seq",sequenceName="cellule_validation_seq",allocationSize=1, initialValue = 1)
public class CelluleValidation   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String phone;



    public CelluleValidation(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cellule_validation_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CelluleValidation celluleValidation = (CelluleValidation) o;
        return id != null && id.equals(celluleValidation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

