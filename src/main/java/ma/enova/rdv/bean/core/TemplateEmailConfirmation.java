package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "template_email_confirmation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="template_email_confirmation_seq",sequenceName="template_email_confirmation_seq",allocationSize=1, initialValue = 1)
public class TemplateEmailConfirmation   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String objet;
    @Lob
    @Column(columnDefinition="TEXT")
    private String corps;
    @Column(columnDefinition = "boolean default false")
     private Boolean actif = false;



    public TemplateEmailConfirmation(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="template_email_confirmation_seq")
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
    public String getObjet(){
        return this.objet;
    }
    public void setObjet(String objet){
        this.objet = objet;
    }
    public String getCorps(){
        return this.corps;
    }
    public void setCorps(String corps){
        this.corps = corps;
    }
    public Boolean  getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
        this.actif = actif;
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
        TemplateEmailConfirmation templateEmailConfirmation = (TemplateEmailConfirmation) o;
        return id != null && id.equals(templateEmailConfirmation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

