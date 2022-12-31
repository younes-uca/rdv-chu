package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.HoraireTravailleValidation;
import ma.enova.rdv.bean.history.HoraireTravailleValidationHistory;
import ma.enova.rdv.dao.criteria.core.HoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.HoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.HoraireTravailleValidationSuperviseurService;
import ma.enova.rdv.ws.converter.HoraireTravailleValidationConverter;
import ma.enova.rdv.ws.dto.HoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages horaireTravailleValidation services")
@RestController
@RequestMapping("/api/superviseur/horaireTravailleValidation")
public class HoraireTravailleValidationRestSuperviseur  extends AbstractController<HoraireTravailleValidation, HoraireTravailleValidationDto, HoraireTravailleValidationHistory, HoraireTravailleValidationCriteria, HoraireTravailleValidationHistoryCriteria, HoraireTravailleValidationSuperviseurService, HoraireTravailleValidationConverter> {


    @ApiOperation("Updates the specified  horaireTravailleValidation")
    @PutMapping("")
    public ResponseEntity<HoraireTravailleValidationDto> update(@RequestBody HoraireTravailleValidationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all horaireTravailleValidations")
    @GetMapping("")
    public ResponseEntity<List<HoraireTravailleValidationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a horaireTravailleValidation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<HoraireTravailleValidationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a horaireTravailleValidation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<HoraireTravailleValidationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  horaireTravailleValidation")
    @PostMapping("")
    public ResponseEntity<HoraireTravailleValidationDto> save(@RequestBody HoraireTravailleValidationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified horaireTravailleValidation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<HoraireTravailleValidationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<HoraireTravailleValidationDto>> findByCriteria(@RequestBody HoraireTravailleValidationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HoraireTravailleValidationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody HoraireTravailleValidationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody HoraireTravailleValidationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public HoraireTravailleValidationRestSuperviseur (HoraireTravailleValidationSuperviseurService service, HoraireTravailleValidationConverter converter) {
        super(service, converter);
    }

}