package  ma.enova.rdv.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.rdv.zynerator.util.StringUtil;
import ma.enova.rdv.zynerator.converter.AbstractConverter;
import ma.enova.rdv.zynerator.util.DateUtil;
import ma.enova.rdv.bean.history.PatientHistory;
import ma.enova.rdv.bean.core.Patient;
import ma.enova.rdv.ws.dto.PatientDto;

@Component
public class PatientConverter extends AbstractConverter<Patient, PatientDto, PatientHistory> {



    public  PatientConverter(){
        super(Patient.class, PatientDto.class, PatientHistory.class);
    }

    @Override
    public Patient toItem(PatientDto dto) {
        if (dto == null) {
            return null;
        } else {
        Patient item = new Patient();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIpp()))
                item.setIpp(dto.getIpp());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getCodeRamed()))
                item.setCodeRamed(dto.getCodeRamed());


        return item;
        }
    }

    @Override
    public PatientDto toDto(Patient item) {
        if (item == null) {
            return null;
        } else {
    PatientDto dto = new PatientDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getIpp()))
             dto.setIpp(item.getIpp());
        if(StringUtil.isNotEmpty(item.getAdresse()))
             dto.setAdresse(item.getAdresse());
        if(StringUtil.isNotEmpty(item.getEmail()))
             dto.setEmail(item.getEmail());
        if(StringUtil.isNotEmpty(item.getCin()))
             dto.setCin(item.getCin());
        if(StringUtil.isNotEmpty(item.getCodeRamed()))
             dto.setCodeRamed(item.getCodeRamed());
        return dto;
        }
    }




}
