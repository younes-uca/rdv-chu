package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.rdv.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;

public class OperateurCriteria extends BaseCriteria {

    private String cin;
    private String cinLike;
    private LocalDateTime dateNaissance;
    private LocalDateTime dateNaissanceFrom;
    private LocalDateTime dateNaissanceTo;
    private String passport;
    private String passportLike;

    private Long celluleValidationId ;


    public OperateurCriteria(){}

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public LocalDateTime getDateNaissanceFrom(){
        return this.dateNaissanceFrom;
    }
    public void setDateNaissanceFrom(LocalDateTime dateNaissanceFrom){
        this.dateNaissanceFrom = dateNaissanceFrom;
    }
    public LocalDateTime getDateNaissanceTo(){
        return this.dateNaissanceFrom;
    }
    public void setDateNaissanceTo(LocalDateTime dateNaissanceTo){
        this.dateNaissanceTo = dateNaissanceTo;
    }
    public String getPassport(){
        return this.passport;
    }
    public void setPassport(String passport){
        this.passport = passport;
    }
    public String getPassportLike(){
        return this.passportLike;
    }
    public void setPassportLike(String passportLike){
        this.passportLike = passportLike;
    }



    public Long getCelluleValidationId(){
        return this.id;
    }

    public void setCelluleValidationId(Long id){
        this.id = id;
    }




    }
