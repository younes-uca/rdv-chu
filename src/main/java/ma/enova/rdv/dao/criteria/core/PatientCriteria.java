package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class PatientCriteria extends BaseCriteria {

    private String ipp;
    private String ippLike;
    private String email;
    private String emailLike;
    private String cin;
    private String cinLike;
    private String codeRamed;
    private String codeRamedLike;



    public PatientCriteria(){}

    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getIppLike(){
        return this.ippLike;
    }
    public void setIppLike(String ippLike){
        this.ippLike = ippLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

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

    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
        this.codeRamed = codeRamed;
    }
    public String getCodeRamedLike(){
        return this.codeRamedLike;
    }
    public void setCodeRamedLike(String codeRamedLike){
        this.codeRamedLike = codeRamedLike;
    }




    }
