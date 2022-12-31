package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.OperateurQuotaHistory;
import ma.enova.rdv.bean.core.OperateurQuota;
import ma.enova.rdv.ws.dto.OperateurQuotaDto;

@Component
public class OperateurQuotaConverter extends AbstractConverter<OperateurQuota, OperateurQuotaDto, OperateurQuotaHistory> {

    @Autowired
    private OperateurConverter operateurConverter ;
    @Autowired
    private PrestationConverter prestationConverter ;

    private boolean operateur;
    private boolean prestation;

    public  OperateurQuotaConverter(){
        super(OperateurQuota.class, OperateurQuotaDto.class, OperateurQuotaHistory.class);
    }

    @Override
    public OperateurQuota toItem(OperateurQuotaDto dto) {
        if (dto == null) {
            return null;
        } else {
        OperateurQuota item = new OperateurQuota();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNombreMaxRdv()))
                item.setNombreMaxRdv(dto.getNombreMaxRdv());
            if(this.operateur && dto.getOperateur()!=null)
                item.setOperateur(operateurConverter.toItem(dto.getOperateur())) ;
            if(this.prestation && dto.getPrestation()!=null)
                item.setPrestation(prestationConverter.toItem(dto.getPrestation())) ;


        return item;
        }
    }

    @Override
    public OperateurQuotaDto toDto(OperateurQuota item) {
        if (item == null) {
            return null;
        } else {
    OperateurQuotaDto dto = new OperateurQuotaDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getNombreMaxRdv()))
             dto.setNombreMaxRdv(item.getNombreMaxRdv());
        if(this.operateur && item.getOperateur()!=null) {
            dto.setOperateurDto(operateurConverter.toDto(item.getOperateur())) ;
        }
        if(this.prestation && item.getPrestation()!=null) {
            dto.setPrestationDto(prestationConverter.toDto(item.getPrestation())) ;
        }
        return dto;
        }
    }



    public OperateurConverter getOperateurConverter(){
        return this.operateurConverter;
    }
    public void setOperateurConverter(OperateurConverter operateurConverter ){
        this.operateurConverter = operateurConverter;
    }
    public PrestationConverter getPrestationConverter(){
        return this.prestationConverter;
    }
    public void setPrestationConverter(PrestationConverter prestationConverter ){
        this.prestationConverter = prestationConverter;
    }

    public boolean  isOperateur(){
        return this.operateur;
    }
    public void  setOperateur(boolean operateur){
        this.operateur = operateur;
    }
    public boolean  isPrestation(){
        return this.prestation;
    }
    public void  setPrestation(boolean prestation){
        this.prestation = prestation;
    }
}
