package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class OperateurQuotaCriteria extends BaseCriteria {

    private String nombreMaxRdv;

    private Long operateurId ;
    private Long prestationId ;


    public OperateurQuotaCriteria(){}

    public String getNombreMaxRdv(){
        return this.nombreMaxRdv;
    }
    public void setNombreMaxRdv(String nombreMaxRdv){
        this.nombreMaxRdv = nombreMaxRdv;
    }


    public Long getOperateurId(){
        return this.id;
    }

    public void setOperateurId(Long id){
        this.id = id;
    }



    public Long getPrestationId(){
        return this.id;
    }

    public void setPrestationId(Long id){
        this.id = id;
    }




    }
