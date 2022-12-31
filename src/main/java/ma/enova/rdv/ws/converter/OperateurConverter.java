package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.rdv.zynerator.util.ListUtil;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.OperateurHistory;
import ma.enova.rdv.bean.core.Operateur;
import ma.enova.rdv.ws.dto.OperateurDto;

@Component
public class OperateurConverter extends AbstractConverter<Operateur, OperateurDto, OperateurHistory> {

    @Autowired
    private OperateurAgendaConverter operateurAgendaConverter ;
    @Autowired
    private OperateurHoraireTravailleValidationConverter operateurHoraireTravailleValidationConverter ;
    @Autowired
    private OperateurUniteAdministrativeConverter operateurUniteAdministrativeConverter ;
    @Autowired
    private CelluleValidationConverter celluleValidationConverter ;

    private boolean celluleValidation;
    private boolean operateurAgendas;
    private boolean operateurHoraireTravailleValidations;
    private boolean operateurUniteAdministratives;

    public  OperateurConverter(){
        super(Operateur.class, OperateurDto.class, OperateurHistory.class);
        init(true);
    }

    @Override
    public Operateur toItem(OperateurDto dto) {
        if (dto == null) {
            return null;
        } else {
        Operateur item = new Operateur();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getDateNaissance()))
                item.setDateNaissance(DateUtil.stringEnToDate(dto.getDateNaissance()));
            if(StringUtil.isNotEmpty(dto.getPassport()))
                item.setPassport(dto.getPassport());
            if(this.celluleValidation && dto.getCelluleValidation()!=null)
                item.setCelluleValidation(celluleValidationConverter.toItem(dto.getCelluleValidation())) ;

            if(this.operateurAgendas && ListUtil.isNotEmpty(dto.getOperateurAgendas()))
                item.setOperateurAgendas(operateurAgendaConverter.toItem(dto.getOperateurAgendas()));
            if(this.operateurHoraireTravailleValidations && ListUtil.isNotEmpty(dto.getOperateurHoraireTravailleValidations()))
                item.setOperateurHoraireTravailleValidations(operateurHoraireTravailleValidationConverter.toItem(dto.getOperateurHoraireTravailleValidations()));
            if(this.operateurUniteAdministratives && ListUtil.isNotEmpty(dto.getOperateurUniteAdministratives()))
                item.setOperateurUniteAdministratives(operateurUniteAdministrativeConverter.toItem(dto.getOperateurUniteAdministratives()));

        return item;
        }
    }

    @Override
    public OperateurDto toDto(Operateur item) {
        if (item == null) {
            return null;
        } else {
    OperateurDto dto = new OperateurDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCin()))
             dto.setCin(item.getCin());
        if(item.getDateNaissance()!=null)
             dto.setDateNaissance(DateUtil.dateTimeToString(item.getDateNaissance()));
        if(StringUtil.isNotEmpty(item.getPassport()))
             dto.setPassport(item.getPassport());
        if(this.celluleValidation && item.getCelluleValidation()!=null) {
            dto.setCelluleValidationDto(celluleValidationConverter.toDto(item.getCelluleValidation())) ;
        }
        if(this.operateurAgendas && ListUtil.isNotEmpty(item.getOperateurAgendas())){
            operateurAgendaConverter.setOperateur(false);
            dto.setOperateurAgendas(operateurAgendaConverter.toDto(item.getOperateurAgendas()));
            operateurAgendaConverter.setOperateur(true);
        }
        if(this.operateurHoraireTravailleValidations && ListUtil.isNotEmpty(item.getOperateurHoraireTravailleValidations())){
            operateurHoraireTravailleValidationConverter.setOperateur(false);
            dto.setOperateurHoraireTravailleValidations(operateurHoraireTravailleValidationConverter.toDto(item.getOperateurHoraireTravailleValidations()));
            operateurHoraireTravailleValidationConverter.setOperateur(true);
        }
        if(this.operateurUniteAdministratives && ListUtil.isNotEmpty(item.getOperateurUniteAdministratives())){
            operateurUniteAdministrativeConverter.setOperateur(false);
            dto.setOperateurUniteAdministratives(operateurUniteAdministrativeConverter.toDto(item.getOperateurUniteAdministratives()));
            operateurUniteAdministrativeConverter.setOperateur(true);
        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.operateurAgendas = value;
        this.operateurHoraireTravailleValidations = value;
        this.operateurUniteAdministratives = value;
    }

    public void init(Boolean value) {
        initList(value);
    }

    public OperateurAgendaConverter getOperateurAgendaConverter(){
        return this.operateurAgendaConverter;
    }
    public void setOperateurAgendaConverter(OperateurAgendaConverter operateurAgendaConverter ){
        this.operateurAgendaConverter = operateurAgendaConverter;
    }
    public OperateurHoraireTravailleValidationConverter getOperateurHoraireTravailleValidationConverter(){
        return this.operateurHoraireTravailleValidationConverter;
    }
    public void setOperateurHoraireTravailleValidationConverter(OperateurHoraireTravailleValidationConverter operateurHoraireTravailleValidationConverter ){
        this.operateurHoraireTravailleValidationConverter = operateurHoraireTravailleValidationConverter;
    }
    public OperateurUniteAdministrativeConverter getOperateurUniteAdministrativeConverter(){
        return this.operateurUniteAdministrativeConverter;
    }
    public void setOperateurUniteAdministrativeConverter(OperateurUniteAdministrativeConverter operateurUniteAdministrativeConverter ){
        this.operateurUniteAdministrativeConverter = operateurUniteAdministrativeConverter;
    }
    public CelluleValidationConverter getCelluleValidationConverter(){
        return this.celluleValidationConverter;
    }
    public void setCelluleValidationConverter(CelluleValidationConverter celluleValidationConverter ){
        this.celluleValidationConverter = celluleValidationConverter;
    }

    public boolean  isCelluleValidation(){
        return this.celluleValidation;
    }
    public void  setCelluleValidation(boolean celluleValidation){
        this.celluleValidation = celluleValidation;
    }
    public boolean  isOperateurAgendas(){
        return this.operateurAgendas ;
    }
    public void  setOperateurAgendas(boolean operateurAgendas ){
        this.operateurAgendas  = operateurAgendas ;
    }
    public boolean  isOperateurHoraireTravailleValidations(){
        return this.operateurHoraireTravailleValidations ;
    }
    public void  setOperateurHoraireTravailleValidations(boolean operateurHoraireTravailleValidations ){
        this.operateurHoraireTravailleValidations  = operateurHoraireTravailleValidations ;
    }
    public boolean  isOperateurUniteAdministratives(){
        return this.operateurUniteAdministratives ;
    }
    public void  setOperateurUniteAdministratives(boolean operateurUniteAdministratives ){
        this.operateurUniteAdministratives  = operateurUniteAdministratives ;
    }
}
