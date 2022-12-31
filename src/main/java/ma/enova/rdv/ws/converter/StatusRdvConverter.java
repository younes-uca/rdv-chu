package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.StatusRdvHistory;
import ma.enova.rdv.bean.core.StatusRdv;
import ma.enova.rdv.ws.dto.StatusRdvDto;

@Component
public class StatusRdvConverter extends AbstractConverter<StatusRdv, StatusRdvDto, StatusRdvHistory> {



    public  StatusRdvConverter(){
        super(StatusRdv.class, StatusRdvDto.class, StatusRdvHistory.class);
    }

    @Override
    public StatusRdv toItem(StatusRdvDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatusRdv item = new StatusRdv();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getStyle()))
                item.setStyle(dto.getStyle());


        return item;
        }
    }

    @Override
    public StatusRdvDto toDto(StatusRdv item) {
        if (item == null) {
            return null;
        } else {
    StatusRdvDto dto = new StatusRdvDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getStyle()))
             dto.setStyle(item.getStyle());
        return dto;
        }
    }




}
