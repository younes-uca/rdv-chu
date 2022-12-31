package ma.enova.rdv.bean.core;

import java.util.Objects;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.rdv.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="patient_seq",sequenceName="patient_seq",allocationSize=1, initialValue = 1)
public class Patient   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String ipp;
    @Lob
    @Column(columnDefinition="TEXT")
    private String adresse;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String codeRamed;



    public Patient(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="patient_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
        this.codeRamed = codeRamed;
    }

    @Transient
    public String getLabel() {
        label = ipp;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id != null && id.equals(patient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

