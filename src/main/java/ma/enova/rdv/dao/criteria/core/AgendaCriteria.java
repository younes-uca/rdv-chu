package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class AgendaCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String daysOfMonth;
    private String daysOfMonthLike;
    private String month;
    private String annee;

    private Long uniteAdministrativeId ;


    public AgendaCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getDaysOfMonth(){
        return this.daysOfMonth;
    }
    public void setDaysOfMonth(String daysOfMonth){
        this.daysOfMonth = daysOfMonth;
    }
    public String getDaysOfMonthLike(){
        return this.daysOfMonthLike;
    }
    public void setDaysOfMonthLike(String daysOfMonthLike){
        this.daysOfMonthLike = daysOfMonthLike;
    }

    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String getAnnee(){
        return this.annee;
    }
    public void setAnnee(String annee){
        this.annee = annee;
    }


    public Long getUniteAdministrativeId(){
        return this.id;
    }

    public void setUniteAdministrativeId(Long id){
        this.id = id;
    }




    }
