package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class PrestationCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String dureeEnMiniute;

    private Long typePrestationId ;
    private Long uniteAdministrativeId ;


    public PrestationCriteria(){}

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

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getDureeEnMiniute(){
        return this.dureeEnMiniute;
    }
    public void setDureeEnMiniute(String dureeEnMiniute){
        this.dureeEnMiniute = dureeEnMiniute;
    }


    public Long getTypePrestationId(){
        return this.id;
    }

    public void setTypePrestationId(Long id){
        this.id = id;
    }



    public Long getUniteAdministrativeId(){
        return this.id;
    }

    public void setUniteAdministrativeId(Long id){
        this.id = id;
    }




    }
