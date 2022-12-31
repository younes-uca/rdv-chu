package  ma.enova.rdv.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.TypePrestation;
import ma.enova.rdv.bean.history.TypePrestationHistory;
import ma.enova.rdv.dao.criteria.core.TypePrestationCriteria;
import ma.enova.rdv.dao.criteria.history.TypePrestationHistoryCriteria;
import ma.enova.rdv.service.facade.admin.TypePrestationAdminService;
import ma.enova.rdv.ws.converter.TypePrestationConverter;
import ma.enova.rdv.ws.dto.TypePrestationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages typePrestation services")
@RestController
@RequestMapping("/api/admin/typePrestation")
public class TypePrestationRestAdmin  extends AbstractController<TypePrestation, TypePrestationDto, TypePrestationHistory, TypePrestationCriteria, TypePrestationHistoryCriteria, TypePrestationAdminService, TypePrestationConverter> {


    @ApiOperation("Updates the specified  typePrestation")
    @PutMapping("")
    public ResponseEntity<TypePrestationDto> update(@RequestBody TypePrestationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all typePrestations")
    @GetMapping("")
    public ResponseEntity<List<TypePrestationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a typePrestation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypePrestationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a typePrestation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<TypePrestationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  typePrestation")
    @PostMapping("")
    public ResponseEntity<TypePrestationDto> save(@RequestBody TypePrestationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified typePrestation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<TypePrestationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<TypePrestationDto>> findByCriteria(@RequestBody TypePrestationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypePrestationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypePrestationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypePrestationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypePrestationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypePrestationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypePrestationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public TypePrestationRestAdmin (TypePrestationAdminService service, TypePrestationConverter converter) {
        super(service, converter);
    }

}