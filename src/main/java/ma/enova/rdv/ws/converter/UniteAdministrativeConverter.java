package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.rdv.zynerator.util.ListUtil;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.UniteAdministrativeHistory;
import ma.enova.rdv.bean.core.UniteAdministrative;
import ma.enova.rdv.ws.dto.UniteAdministrativeDto;

@Component
public class UniteAdministrativeConverter extends AbstractConverter<UniteAdministrative, UniteAdministrativeDto, UniteAdministrativeHistory> {

    @Autowired
    private HopitalConverter hopitalConverter ;
    @Autowired
    private PrestationConverter prestationConverter ;

    private boolean hopital;
    private boolean prestations;

    public  UniteAdministrativeConverter(){
        super(UniteAdministrative.class, UniteAdministrativeDto.class, UniteAdministrativeHistory.class);
        init(true);
    }

    @Override
    public UniteAdministrative toItem(UniteAdministrativeDto dto) {
        if (dto == null) {
            return null;
        } else {
        UniteAdministrative item = new UniteAdministrative();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.hopital && dto.getHopital()!=null)
                item.setHopital(hopitalConverter.toItem(dto.getHopital())) ;

            if(this.prestations && ListUtil.isNotEmpty(dto.getPrestations()))
                item.setPrestations(prestationConverter.toItem(dto.getPrestations()));

        return item;
        }
    }

    @Override
    public UniteAdministrativeDto toDto(UniteAdministrative item) {
        if (item == null) {
            return null;
        } else {
    UniteAdministrativeDto dto = new UniteAdministrativeDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getDescription()))
             dto.setDescription(item.getDescription());
        if(this.hopital && item.getHopital()!=null) {
            dto.setHopitalDto(hopitalConverter.toDto(item.getHopital())) ;
        }
        if(this.prestations && ListUtil.isNotEmpty(item.getPrestations())){
            prestationConverter.setUniteAdministrative(false);
            dto.setPrestations(prestationConverter.toDto(item.getPrestations()));
            prestationConverter.setUniteAdministrative(true);
        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.prestations = value;
    }

    public void init(Boolean value) {
        initList(value);
    }

    public HopitalConverter getHopitalConverter(){
        return this.hopitalConverter;
    }
    public void setHopitalConverter(HopitalConverter hopitalConverter ){
        this.hopitalConverter = hopitalConverter;
    }
    public PrestationConverter getPrestationConverter(){
        return this.prestationConverter;
    }
    public void setPrestationConverter(PrestationConverter prestationConverter ){
        this.prestationConverter = prestationConverter;
    }

    public boolean  isHopital(){
        return this.hopital;
    }
    public void  setHopital(boolean hopital){
        this.hopital = hopital;
    }
    public boolean  isPrestations(){
        return this.prestations ;
    }
    public void  setPrestations(boolean prestations ){
        this.prestations  = prestations ;
    }
}
