package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.JourFerieHistory;
import ma.enova.rdv.bean.core.JourFerie;
import ma.enova.rdv.ws.dto.JourFerieDto;

@Component
public class JourFerieConverter extends AbstractConverter<JourFerie, JourFerieDto, JourFerieHistory> {



    public  JourFerieConverter(){
        super(JourFerie.class, JourFerieDto.class, JourFerieHistory.class);
    }

    @Override
    public JourFerie toItem(JourFerieDto dto) {
        if (dto == null) {
            return null;
        } else {
        JourFerie item = new JourFerie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(StringUtil.isNotEmpty(dto.getNombreJoursTotal()))
                item.setNombreJoursTotal(dto.getNombreJoursTotal());


        return item;
        }
    }

    @Override
    public JourFerieDto toDto(JourFerie item) {
        if (item == null) {
            return null;
        } else {
    JourFerieDto dto = new JourFerieDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(item.getDateDebut()!=null)
             dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
        if(item.getDateFin()!=null)
             dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
        if(StringUtil.isNotEmpty(item.getNombreJoursTotal()))
             dto.setNombreJoursTotal(item.getNombreJoursTotal());
        return dto;
        }
    }




}
