package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.EtablissementHistory;
import ma.enova.rdv.bean.core.Etablissement;
import ma.enova.rdv.ws.dto.EtablissementDto;

@Component
public class EtablissementConverter extends AbstractConverter<Etablissement, EtablissementDto, EtablissementHistory> {



    public  EtablissementConverter(){
        super(Etablissement.class, EtablissementDto.class, EtablissementHistory.class);
    }

    @Override
    public Etablissement toItem(EtablissementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Etablissement item = new Etablissement();
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
    public EtablissementDto toDto(Etablissement item) {
        if (item == null) {
            return null;
        } else {
    EtablissementDto dto = new EtablissementDto();
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
