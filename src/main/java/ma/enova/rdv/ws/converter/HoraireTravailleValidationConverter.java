package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.HoraireTravailleValidationHistory;
import ma.enova.rdv.bean.core.HoraireTravailleValidation;
import ma.enova.rdv.ws.dto.HoraireTravailleValidationDto;

@Component
public class HoraireTravailleValidationConverter extends AbstractConverter<HoraireTravailleValidation, HoraireTravailleValidationDto, HoraireTravailleValidationHistory> {



    public  HoraireTravailleValidationConverter(){
        super(HoraireTravailleValidation.class, HoraireTravailleValidationDto.class, HoraireTravailleValidationHistory.class);
    }

    @Override
    public HoraireTravailleValidation toItem(HoraireTravailleValidationDto dto) {
        if (dto == null) {
            return null;
        } else {
        HoraireTravailleValidation item = new HoraireTravailleValidation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDaysOfWeek()))
                item.setDaysOfWeek(dto.getDaysOfWeek());
            if(StringUtil.isNotEmpty(dto.getMonth()))
                item.setMonth(dto.getMonth());
            if(StringUtil.isNotEmpty(dto.getHeureDebut()))
                item.setHeureDebut(dto.getHeureDebut());
            if(StringUtil.isNotEmpty(dto.getHeureFin()))
                item.setHeureFin(dto.getHeureFin());


        return item;
        }
    }

    @Override
    public HoraireTravailleValidationDto toDto(HoraireTravailleValidation item) {
        if (item == null) {
            return null;
        } else {
    HoraireTravailleValidationDto dto = new HoraireTravailleValidationDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(StringUtil.isNotEmpty(item.getDaysOfWeek()))
             dto.setDaysOfWeek(item.getDaysOfWeek());
        if(StringUtil.isNotEmpty(item.getMonth()))
             dto.setMonth(item.getMonth());
        if(StringUtil.isNotEmpty(item.getHeureDebut()))
             dto.setHeureDebut(item.getHeureDebut());
        if(StringUtil.isNotEmpty(item.getHeureFin()))
             dto.setHeureFin(item.getHeureFin());
        return dto;
        }
    }




}
