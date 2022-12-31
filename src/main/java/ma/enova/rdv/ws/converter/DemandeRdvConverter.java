package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.DemandeRdvHistory;
import ma.enova.rdv.bean.core.DemandeRdv;
import ma.enova.rdv.ws.dto.DemandeRdvDto;

@Component
public class DemandeRdvConverter extends AbstractConverter<DemandeRdv, DemandeRdvDto, DemandeRdvHistory> {

    @Autowired
    private CauseRejetDemandeRdvConverter causeRejetDemandeRdvConverter ;
    @Autowired
    private TemplateEmailConfirmationConverter templateEmailConfirmationConverter ;
    @Autowired
    private PatientConverter patientConverter ;
    @Autowired
    private HopitalConverter hopitalConverter ;
    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;
    @Autowired
    private OperateurConverter operateurConverter ;
    @Autowired
    private StatusRdvConverter statusRdvConverter ;
    @Autowired
    private PrestationConverter prestationConverter ;

    private boolean patient;
    private boolean operateur;
    private boolean hopital;
    private boolean uniteAdministrative;
    private boolean prestation;
    private boolean statusRdv;
    private boolean causeRejetDemandeRdv;
    private boolean templateEmailConfirmation;

    public  DemandeRdvConverter(){
        super(DemandeRdv.class, DemandeRdvDto.class, DemandeRdvHistory.class);
    }

    @Override
    public DemandeRdv toItem(DemandeRdvDto dto) {
        if (dto == null) {
            return null;
        } else {
        DemandeRdv item = new DemandeRdv();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getIpp()))
                item.setIpp(dto.getIpp());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getCodeRamed()))
                item.setCodeRamed(dto.getCodeRamed());
            if(StringUtil.isNotEmpty(dto.getObservation()))
                item.setObservation(dto.getObservation());
            if(StringUtil.isNotEmpty(dto.getFicheReferencePath()))
                item.setFicheReferencePath(dto.getFicheReferencePath());
            if(StringUtil.isNotEmpty(dto.getDateDemandeRdv()))
                item.setDateDemandeRdv(DateUtil.stringEnToDate(dto.getDateDemandeRdv()));
            if(StringUtil.isNotEmpty(dto.getDatePrevu()))
                item.setDatePrevu(DateUtil.stringEnToDate(dto.getDatePrevu()));
            if(StringUtil.isNotEmpty(dto.getDateEffective()))
                item.setDateEffective(DateUtil.stringEnToDate(dto.getDateEffective()));
            if(StringUtil.isNotEmpty(dto.getDateValidation()))
                item.setDateValidation(DateUtil.stringEnToDate(dto.getDateValidation()));
            if(StringUtil.isNotEmpty(dto.getDateRejet()))
                item.setDateRejet(DateUtil.stringEnToDate(dto.getDateRejet()));
            if(StringUtil.isNotEmpty(dto.getNombreReccurenceTotal()))
                item.setNombreReccurenceTotal(dto.getNombreReccurenceTotal());
            if(StringUtil.isNotEmpty(dto.getNombreReccurenceValide()))
                item.setNombreReccurenceValide(dto.getNombreReccurenceValide());
            if(StringUtil.isNotEmpty(dto.getNombreReccurenceRejet()))
                item.setNombreReccurenceRejet(dto.getNombreReccurenceRejet());
            if(this.patient && dto.getPatient()!=null)
                item.setPatient(patientConverter.toItem(dto.getPatient())) ;
            if(this.operateur && dto.getOperateur()!=null)
                item.setOperateur(operateurConverter.toItem(dto.getOperateur())) ;
            if(this.hopital && dto.getHopital()!=null)
                item.setHopital(hopitalConverter.toItem(dto.getHopital())) ;
            if(this.uniteAdministrative && dto.getUniteAdministrative()!=null)
                item.setUniteAdministrative(uniteAdministrativeConverter.toItem(dto.getUniteAdministrative())) ;
            if(this.prestation && dto.getPrestation()!=null)
                item.setPrestation(prestationConverter.toItem(dto.getPrestation())) ;
            if(this.statusRdv && dto.getStatusRdv()!=null)
                item.setStatusRdv(statusRdvConverter.toItem(dto.getStatusRdv())) ;
            if(this.causeRejetDemandeRdv && dto.getCauseRejetDemandeRdv()!=null)
                item.setCauseRejetDemandeRdv(causeRejetDemandeRdvConverter.toItem(dto.getCauseRejetDemandeRdv())) ;
            if(this.templateEmailConfirmation && dto.getTemplateEmailConfirmation()!=null)
                item.setTemplateEmailConfirmation(templateEmailConfirmationConverter.toItem(dto.getTemplateEmailConfirmation())) ;


        return item;
        }
    }

    @Override
    public DemandeRdvDto toDto(DemandeRdv item) {
        if (item == null) {
            return null;
        } else {
    DemandeRdvDto dto = new DemandeRdvDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getReference()))
             dto.setReference(item.getReference());
        if(StringUtil.isNotEmpty(item.getIpp()))
             dto.setIpp(item.getIpp());
        if(StringUtil.isNotEmpty(item.getNom()))
             dto.setNom(item.getNom());
        if(StringUtil.isNotEmpty(item.getPrenom()))
             dto.setPrenom(item.getPrenom());
        if(StringUtil.isNotEmpty(item.getAdresse()))
             dto.setAdresse(item.getAdresse());
        if(StringUtil.isNotEmpty(item.getEmail()))
             dto.setEmail(item.getEmail());
        if(StringUtil.isNotEmpty(item.getCin()))
             dto.setCin(item.getCin());
        if(StringUtil.isNotEmpty(item.getCodeRamed()))
             dto.setCodeRamed(item.getCodeRamed());
        if(StringUtil.isNotEmpty(item.getObservation()))
             dto.setObservation(item.getObservation());
        if(StringUtil.isNotEmpty(item.getFicheReferencePath()))
             dto.setFicheReferencePath(item.getFicheReferencePath());
        if(item.getDateDemandeRdv()!=null)
             dto.setDateDemandeRdv(DateUtil.dateTimeToString(item.getDateDemandeRdv()));
        if(item.getDatePrevu()!=null)
             dto.setDatePrevu(DateUtil.dateTimeToString(item.getDatePrevu()));
        if(item.getDateEffective()!=null)
             dto.setDateEffective(DateUtil.dateTimeToString(item.getDateEffective()));
        if(item.getDateValidation()!=null)
             dto.setDateValidation(DateUtil.dateTimeToString(item.getDateValidation()));
        if(item.getDateRejet()!=null)
             dto.setDateRejet(DateUtil.dateTimeToString(item.getDateRejet()));
        if(StringUtil.isNotEmpty(item.getNombreReccurenceTotal()))
             dto.setNombreReccurenceTotal(item.getNombreReccurenceTotal());
        if(StringUtil.isNotEmpty(item.getNombreReccurenceValide()))
             dto.setNombreReccurenceValide(item.getNombreReccurenceValide());
        if(StringUtil.isNotEmpty(item.getNombreReccurenceRejet()))
             dto.setNombreReccurenceRejet(item.getNombreReccurenceRejet());
        if(this.patient && item.getPatient()!=null) {
            dto.setPatientDto(patientConverter.toDto(item.getPatient())) ;
        }
        if(this.operateur && item.getOperateur()!=null) {
            dto.setOperateurDto(operateurConverter.toDto(item.getOperateur())) ;
        }
        if(this.hopital && item.getHopital()!=null) {
            dto.setHopitalDto(hopitalConverter.toDto(item.getHopital())) ;
        }
        if(this.uniteAdministrative && item.getUniteAdministrative()!=null) {
            dto.setUniteAdministrativeDto(uniteAdministrativeConverter.toDto(item.getUniteAdministrative())) ;
        }
        if(this.prestation && item.getPrestation()!=null) {
            dto.setPrestationDto(prestationConverter.toDto(item.getPrestation())) ;
        }
        if(this.statusRdv && item.getStatusRdv()!=null) {
            dto.setStatusRdvDto(statusRdvConverter.toDto(item.getStatusRdv())) ;
        }
        if(this.causeRejetDemandeRdv && item.getCauseRejetDemandeRdv()!=null) {
            dto.setCauseRejetDemandeRdvDto(causeRejetDemandeRdvConverter.toDto(item.getCauseRejetDemandeRdv())) ;
        }
        if(this.templateEmailConfirmation && item.getTemplateEmailConfirmation()!=null) {
            dto.setTemplateEmailConfirmationDto(templateEmailConfirmationConverter.toDto(item.getTemplateEmailConfirmation())) ;
        }
        return dto;
        }
    }



    public CauseRejetDemandeRdvConverter getCauseRejetDemandeRdvConverter(){
        return this.causeRejetDemandeRdvConverter;
    }
    public void setCauseRejetDemandeRdvConverter(CauseRejetDemandeRdvConverter causeRejetDemandeRdvConverter ){
        this.causeRejetDemandeRdvConverter = causeRejetDemandeRdvConverter;
    }
    public TemplateEmailConfirmationConverter getTemplateEmailConfirmationConverter(){
        return this.templateEmailConfirmationConverter;
    }
    public void setTemplateEmailConfirmationConverter(TemplateEmailConfirmationConverter templateEmailConfirmationConverter ){
        this.templateEmailConfirmationConverter = templateEmailConfirmationConverter;
    }
    public PatientConverter getPatientConverter(){
        return this.patientConverter;
    }
    public void setPatientConverter(PatientConverter patientConverter ){
        this.patientConverter = patientConverter;
    }
    public HopitalConverter getHopitalConverter(){
        return this.hopitalConverter;
    }
    public void setHopitalConverter(HopitalConverter hopitalConverter ){
        this.hopitalConverter = hopitalConverter;
    }
    public UniteAdministrativeConverter getUniteAdministrativeConverter(){
        return this.uniteAdministrativeConverter;
    }
    public void setUniteAdministrativeConverter(UniteAdministrativeConverter uniteAdministrativeConverter ){
        this.uniteAdministrativeConverter = uniteAdministrativeConverter;
    }
    public OperateurConverter getOperateurConverter(){
        return this.operateurConverter;
    }
    public void setOperateurConverter(OperateurConverter operateurConverter ){
        this.operateurConverter = operateurConverter;
    }
    public StatusRdvConverter getStatusRdvConverter(){
        return this.statusRdvConverter;
    }
    public void setStatusRdvConverter(StatusRdvConverter statusRdvConverter ){
        this.statusRdvConverter = statusRdvConverter;
    }
    public PrestationConverter getPrestationConverter(){
        return this.prestationConverter;
    }
    public void setPrestationConverter(PrestationConverter prestationConverter ){
        this.prestationConverter = prestationConverter;
    }

    public boolean  isPatient(){
        return this.patient;
    }
    public void  setPatient(boolean patient){
        this.patient = patient;
    }
    public boolean  isOperateur(){
        return this.operateur;
    }
    public void  setOperateur(boolean operateur){
        this.operateur = operateur;
    }
    public boolean  isHopital(){
        return this.hopital;
    }
    public void  setHopital(boolean hopital){
        this.hopital = hopital;
    }
    public boolean  isUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void  setUniteAdministrative(boolean uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public boolean  isPrestation(){
        return this.prestation;
    }
    public void  setPrestation(boolean prestation){
        this.prestation = prestation;
    }
    public boolean  isStatusRdv(){
        return this.statusRdv;
    }
    public void  setStatusRdv(boolean statusRdv){
        this.statusRdv = statusRdv;
    }
    public boolean  isCauseRejetDemandeRdv(){
        return this.causeRejetDemandeRdv;
    }
    public void  setCauseRejetDemandeRdv(boolean causeRejetDemandeRdv){
        this.causeRejetDemandeRdv = causeRejetDemandeRdv;
    }
    public boolean  isTemplateEmailConfirmation(){
        return this.templateEmailConfirmation;
    }
    public void  setTemplateEmailConfirmation(boolean templateEmailConfirmation){
        this.templateEmailConfirmation = templateEmailConfirmation;
    }
}
