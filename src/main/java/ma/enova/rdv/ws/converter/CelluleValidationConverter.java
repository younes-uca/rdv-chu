package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.CelluleValidationHistory;
import ma.enova.rdv.bean.core.CelluleValidation;
import ma.enova.rdv.ws.dto.CelluleValidationDto;

@Component
public class CelluleValidationConverter extends AbstractConverter<CelluleValidation, CelluleValidationDto, CelluleValidationHistory> {



    public  CelluleValidationConverter(){
        super(CelluleValidation.class, CelluleValidationDto.class, CelluleValidationHistory.class);
    }

    @Override
    public CelluleValidation toItem(CelluleValidationDto dto) {
        if (dto == null) {
            return null;
        } else {
        CelluleValidation item = new CelluleValidation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getPhone()))
                item.setPhone(dto.getPhone());


        return item;
        }
    }

    @Override
    public CelluleValidationDto toDto(CelluleValidation item) {
        if (item == null) {
            return null;
        } else {
    CelluleValidationDto dto = new CelluleValidationDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getDescription()))
             dto.setDescription(item.getDescription());
        if(StringUtil.isNotEmpty(item.getEmail()))
             dto.setEmail(item.getEmail());
        if(StringUtil.isNotEmpty(item.getPhone()))
             dto.setPhone(item.getPhone());
        return dto;
        }
    }




}
