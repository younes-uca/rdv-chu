package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class OperateurUniteAdministrativeCriteria extends BaseCriteria {


    private Long uniteAdministrativeId ;
    private Long operateurId ;


    public OperateurUniteAdministrativeCriteria(){}



    public Long getUniteAdministrativeId(){
        return this.id;
    }

    public void setUniteAdministrativeId(Long id){
        this.id = id;
    }



    public Long getOperateurId(){
        return this.id;
    }

    public void setOperateurId(Long id){
        this.id = id;
    }




    }
