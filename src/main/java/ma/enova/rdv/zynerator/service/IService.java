package ma.enova.rdv.zynerator.service;

import ma.enova.rdv.zynerator.bean.BusinessObject;
import ma.enova.rdv.zynerator.criteria.BaseCriteria;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.dto.BaseDto;

import java.util.List;

public interface IService<T extends BusinessObject, DTO extends BaseDto, Criteria extends BaseCriteria, HistoryCriteria> {


    DTO create(DTO dto) throws Exception;

    DTO update(DTO dto) throws Exception;


    DTO findById(Long id) throws Exception;

    List<DTO> findMultipleByCriteria(Criteria critera) throws Exception;


    List<DTO> findPaginatedByCriteria(Criteria critera, int page, int pageSize, String order, String sortField) throws Exception;

    int getDataSize(Criteria criteria) throws Exception;


    void delete(List<DTO> dtos) throws Exception;


    // History

    AuditEntityDto findHistoryById(Long id) throws Exception;

    List<AuditEntityDto> findHistoryByCriteria(HistoryCriteria historyCriteria) throws Exception;

    List<AuditEntityDto> findHistoryPaginatedByCriteria(HistoryCriteria historyCriteria, int page, int pageSize, String order, String sortField) throws Exception;

    int getHistoryDataSize(HistoryCriteria historyCriteria) throws Exception;


}
