package ma.enova.rdv.ws.converter;

import ma.enova.rdv.bean.core.TemplateEmailConfirmation;
import ma.enova.rdv.bean.history.TemplateEmailConfirmationHistory;
import ma.enova.rdv.ws.dto.TemplateEmailConfirmationDto;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TemplateEmailConfirmationConverter extends AbstractConverter<TemplateEmailConfirmation, TemplateEmailConfirmationDto, TemplateEmailConfirmationHistory> {


    public TemplateEmailConfirmationConverter() {
        super(TemplateEmailConfirmation.class, TemplateEmailConfirmationDto.class, TemplateEmailConfirmationHistory.class);
    }

    @Override
    public TemplateEmailConfirmation toItem(TemplateEmailConfirmationDto dto) {
        if (dto == null) {
            return null;
        } else {
            TemplateEmailConfirmation item = new TemplateEmailConfirmation();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (StringUtil.isNotEmpty(dto.getObjet()))
                item.setObjet(dto.getObjet());
            if (StringUtil.isNotEmpty(dto.getCorps()))
                item.setCorps(dto.getCorps());
            item.setActif(dto.getActif());


            return item;
        }
    }

    @Override
    public TemplateEmailConfirmationDto toDto(TemplateEmailConfirmation item) {
        if (item == null) {
            return null;
        } else {
            TemplateEmailConfirmationDto dto = new TemplateEmailConfirmationDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (StringUtil.isNotEmpty(item.getObjet()))
                dto.setObjet(item.getObjet());
            if (StringUtil.isNotEmpty(item.getCorps()))
                dto.setCorps(item.getCorps());
            dto.setActif(item.getActif());
            return dto;
        }
    }


}
