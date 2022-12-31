package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.PrestationHistory;
import ma.enova.rdv.bean.core.Prestation;
import ma.enova.rdv.ws.dto.PrestationDto;

@Component
public class PrestationConverter extends AbstractConverter<Prestation, PrestationDto, PrestationHistory> {

    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;
    @Autowired
    private TypePrestationConverter typePrestationConverter ;

    private boolean typePrestation;
    private boolean uniteAdministrative;

    public  PrestationConverter(){
        super(Prestation.class, PrestationDto.class, PrestationHistory.class);
    }

    @Override
    public Prestation toItem(PrestationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Prestation item = new Prestation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDureeEnMiniute()))
                item.setDureeEnMiniute(dto.getDureeEnMiniute());
            if(this.typePrestation && dto.getTypePrestation()!=null)
                item.setTypePrestation(typePrestationConverter.toItem(dto.getTypePrestation())) ;
            if(this.uniteAdministrative && dto.getUniteAdministrative()!=null)
                item.setUniteAdministrative(uniteAdministrativeConverter.toItem(dto.getUniteAdministrative())) ;


        return item;
        }
    }

    @Override
    public PrestationDto toDto(Prestation item) {
        if (item == null) {
            return null;
        } else {
    PrestationDto dto = new PrestationDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getDureeEnMiniute()))
             dto.setDureeEnMiniute(item.getDureeEnMiniute());
        if(this.typePrestation && item.getTypePrestation()!=null) {
            dto.setTypePrestationDto(typePrestationConverter.toDto(item.getTypePrestation())) ;
        }
        if(this.uniteAdministrative && item.getUniteAdministrative()!=null) {
            dto.setUniteAdministrativeDto(uniteAdministrativeConverter.toDto(item.getUniteAdministrative())) ;
        }
        return dto;
        }
    }



    public UniteAdministrativeConverter getUniteAdministrativeConverter(){
        return this.uniteAdministrativeConverter;
    }
    public void setUniteAdministrativeConverter(UniteAdministrativeConverter uniteAdministrativeConverter ){
        this.uniteAdministrativeConverter = uniteAdministrativeConverter;
    }
    public TypePrestationConverter getTypePrestationConverter(){
        return this.typePrestationConverter;
    }
    public void setTypePrestationConverter(TypePrestationConverter typePrestationConverter ){
        this.typePrestationConverter = typePrestationConverter;
    }

    public boolean  isTypePrestation(){
        return this.typePrestation;
    }
    public void  setTypePrestation(boolean typePrestation){
        this.typePrestation = typePrestation;
    }
    public boolean  isUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void  setUniteAdministrative(boolean uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
}
