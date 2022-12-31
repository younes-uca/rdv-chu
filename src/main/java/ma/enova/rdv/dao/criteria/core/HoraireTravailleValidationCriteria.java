package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class HoraireTravailleValidationCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String daysOfWeek;
    private String daysOfWeekLike;
    private String month;
    private String monthLike;
    private String heureDebut;
    private String heureDebutLike;
    private String heureFin;
    private String heureFinLike;



    public HoraireTravailleValidationCriteria(){}

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

    public String getDaysOfWeek(){
        return this.daysOfWeek;
    }
    public void setDaysOfWeek(String daysOfWeek){
        this.daysOfWeek = daysOfWeek;
    }
    public String getDaysOfWeekLike(){
        return this.daysOfWeekLike;
    }
    public void setDaysOfWeekLike(String daysOfWeekLike){
        this.daysOfWeekLike = daysOfWeekLike;
    }

    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String getMonthLike(){
        return this.monthLike;
    }
    public void setMonthLike(String monthLike){
        this.monthLike = monthLike;
    }

    public String getHeureDebut(){
        return this.heureDebut;
    }
    public void setHeureDebut(String heureDebut){
        this.heureDebut = heureDebut;
    }
    public String getHeureDebutLike(){
        return this.heureDebutLike;
    }
    public void setHeureDebutLike(String heureDebutLike){
        this.heureDebutLike = heureDebutLike;
    }

    public String getHeureFin(){
        return this.heureFin;
    }
    public void setHeureFin(String heureFin){
        this.heureFin = heureFin;
    }
    public String getHeureFinLike(){
        return this.heureFinLike;
    }
    public void setHeureFinLike(String heureFinLike){
        this.heureFinLike = heureFinLike;
    }




    }
