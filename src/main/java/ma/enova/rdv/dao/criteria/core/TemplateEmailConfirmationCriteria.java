package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class TemplateEmailConfirmationCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String objet;
    private String objetLike;
    private Boolean actif;



    public TemplateEmailConfirmationCriteria(){}

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

    public String getObjet(){
        return this.objet;
    }
    public void setObjet(String objet){
        this.objet = objet;
    }
    public String getObjetLike(){
        return this.objetLike;
    }
    public void setObjetLike(String objetLike){
        this.objetLike = objetLike;
    }

    public Boolean getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
        this.actif = actif;
    }



    }
