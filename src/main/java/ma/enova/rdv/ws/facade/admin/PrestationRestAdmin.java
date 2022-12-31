package  ma.enova.rdv.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.Prestation;
import ma.enova.rdv.bean.history.PrestationHistory;
import ma.enova.rdv.dao.criteria.core.PrestationCriteria;
import ma.enova.rdv.dao.criteria.history.PrestationHistoryCriteria;
import ma.enova.rdv.service.facade.admin.PrestationAdminService;
import ma.enova.rdv.ws.converter.PrestationConverter;
import ma.enova.rdv.ws.dto.PrestationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages prestation services")
@RestController
@RequestMapping("/api/admin/prestation")
public class PrestationRestAdmin  extends AbstractController<Prestation, PrestationDto, PrestationHistory, PrestationCriteria, PrestationHistoryCriteria, PrestationAdminService, PrestationConverter> {


    @ApiOperation("Updates the specified  prestation")
    @PutMapping("")
    public ResponseEntity<PrestationDto> update(@RequestBody PrestationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all prestations")
    @GetMapping("")
    public ResponseEntity<List<PrestationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a prestation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PrestationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a prestation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<PrestationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  prestation")
    @PostMapping("")
    public ResponseEntity<PrestationDto> save(@RequestBody PrestationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified prestation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<PrestationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<PrestationDto>> findByCriteria(@RequestBody PrestationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PrestationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody PrestationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PrestationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PrestationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PrestationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PrestationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PrestationRestAdmin (PrestationAdminService service, PrestationConverter converter) {
        super(service, converter);
    }

}