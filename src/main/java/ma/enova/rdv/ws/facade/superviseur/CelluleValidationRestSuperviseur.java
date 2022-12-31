package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.CelluleValidation;
import ma.enova.rdv.bean.history.CelluleValidationHistory;
import ma.enova.rdv.dao.criteria.core.CelluleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.CelluleValidationHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.CelluleValidationSuperviseurService;
import ma.enova.rdv.ws.converter.CelluleValidationConverter;
import ma.enova.rdv.ws.dto.CelluleValidationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages celluleValidation services")
@RestController
@RequestMapping("/api/superviseur/celluleValidation")
public class CelluleValidationRestSuperviseur  extends AbstractController<CelluleValidation, CelluleValidationDto, CelluleValidationHistory, CelluleValidationCriteria, CelluleValidationHistoryCriteria, CelluleValidationSuperviseurService, CelluleValidationConverter> {


    @ApiOperation("Updates the specified  celluleValidation")
    @PutMapping("")
    public ResponseEntity<CelluleValidationDto> update(@RequestBody CelluleValidationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all celluleValidations")
    @GetMapping("")
    public ResponseEntity<List<CelluleValidationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a celluleValidation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CelluleValidationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a celluleValidation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<CelluleValidationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  celluleValidation")
    @PostMapping("")
    public ResponseEntity<CelluleValidationDto> save(@RequestBody CelluleValidationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified celluleValidation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<CelluleValidationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<CelluleValidationDto>> findByCriteria(@RequestBody CelluleValidationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CelluleValidationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody CelluleValidationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CelluleValidationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CelluleValidationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CelluleValidationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CelluleValidationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public CelluleValidationRestSuperviseur (CelluleValidationSuperviseurService service, CelluleValidationConverter converter) {
        super(service, converter);
    }

}