package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.TypePrestationHistory;
import ma.enova.rdv.bean.core.TypePrestation;
import ma.enova.rdv.ws.dto.TypePrestationDto;

@Component
public class TypePrestationConverter extends AbstractConverter<TypePrestation, TypePrestationDto, TypePrestationHistory> {



    public  TypePrestationConverter(){
        super(TypePrestation.class, TypePrestationDto.class, TypePrestationHistory.class);
    }

    @Override
    public TypePrestation toItem(TypePrestationDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypePrestation item = new TypePrestation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public TypePrestationDto toDto(TypePrestation item) {
        if (item == null) {
            return null;
        } else {
    TypePrestationDto dto = new TypePrestationDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        return dto;
        }
    }




}
