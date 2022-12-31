package  ma.enova.rdv.dao.criteria.core;


import ma.enova.rdv.zynerator.criteria.BaseCriteria;

public class OperateurHoraireTravailleValidationCriteria extends BaseCriteria {

    private String heureDebut;
    private String heureDebutLike;
    private String heureFin;
    private String heureFinLike;

    private Long horaireTravailleValidationId ;
    private Long operateurId ;


    public OperateurHoraireTravailleValidationCriteria(){}

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



    public Long getHoraireTravailleValidationId(){
        return this.id;
    }

    public void setHoraireTravailleValidationId(Long id){
        this.id = id;
    }



    public Long getOperateurId(){
        return this.id;
    }

    public void setOperateurId(Long id){
        this.id = id;
    }




    }
