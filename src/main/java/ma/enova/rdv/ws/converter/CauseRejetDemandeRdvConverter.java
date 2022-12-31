package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.CauseRejetDemandeRdvHistory;
import ma.enova.rdv.bean.core.CauseRejetDemandeRdv;
import ma.enova.rdv.ws.dto.CauseRejetDemandeRdvDto;

@Component
public class CauseRejetDemandeRdvConverter extends AbstractConverter<CauseRejetDemandeRdv, CauseRejetDemandeRdvDto, CauseRejetDemandeRdvHistory> {



    public  CauseRejetDemandeRdvConverter(){
        super(CauseRejetDemandeRdv.class, CauseRejetDemandeRdvDto.class, CauseRejetDemandeRdvHistory.class);
    }

    @Override
    public CauseRejetDemandeRdv toItem(CauseRejetDemandeRdvDto dto) {
        if (dto == null) {
            return null;
        } else {
        CauseRejetDemandeRdv item = new CauseRejetDemandeRdv();
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
    public CauseRejetDemandeRdvDto toDto(CauseRejetDemandeRdv item) {
        if (item == null) {
            return null;
        } else {
    CauseRejetDemandeRdvDto dto = new CauseRejetDemandeRdvDto();
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
