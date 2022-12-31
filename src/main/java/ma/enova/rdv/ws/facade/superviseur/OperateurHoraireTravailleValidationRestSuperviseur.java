package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.OperateurHoraireTravailleValidation;
import ma.enova.rdv.bean.history.OperateurHoraireTravailleValidationHistory;
import ma.enova.rdv.dao.criteria.core.OperateurHoraireTravailleValidationCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurHoraireTravailleValidationHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.OperateurHoraireTravailleValidationSuperviseurService;
import ma.enova.rdv.ws.converter.OperateurHoraireTravailleValidationConverter;
import ma.enova.rdv.ws.dto.OperateurHoraireTravailleValidationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages operateurHoraireTravailleValidation services")
@RestController
@RequestMapping("/api/superviseur/operateurHoraireTravailleValidation")
public class OperateurHoraireTravailleValidationRestSuperviseur  extends AbstractController<OperateurHoraireTravailleValidation, OperateurHoraireTravailleValidationDto, OperateurHoraireTravailleValidationHistory, OperateurHoraireTravailleValidationCriteria, OperateurHoraireTravailleValidationHistoryCriteria, OperateurHoraireTravailleValidationSuperviseurService, OperateurHoraireTravailleValidationConverter> {


    @ApiOperation("Updates the specified  operateurHoraireTravailleValidation")
    @PutMapping("")
    public ResponseEntity<OperateurHoraireTravailleValidationDto> update(@RequestBody OperateurHoraireTravailleValidationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all operateurHoraireTravailleValidations")
    @GetMapping("")
    public ResponseEntity<List<OperateurHoraireTravailleValidationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a operateurHoraireTravailleValidation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OperateurHoraireTravailleValidationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a operateurHoraireTravailleValidation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<OperateurHoraireTravailleValidationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  operateurHoraireTravailleValidation")
    @PostMapping("")
    public ResponseEntity<OperateurHoraireTravailleValidationDto> save(@RequestBody OperateurHoraireTravailleValidationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified operateurHoraireTravailleValidation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<OperateurHoraireTravailleValidationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<OperateurHoraireTravailleValidationDto>> findByCriteria(@RequestBody OperateurHoraireTravailleValidationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OperateurHoraireTravailleValidationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody OperateurHoraireTravailleValidationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OperateurHoraireTravailleValidationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OperateurHoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OperateurHoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OperateurHoraireTravailleValidationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public OperateurHoraireTravailleValidationRestSuperviseur (OperateurHoraireTravailleValidationSuperviseurService service, OperateurHoraireTravailleValidationConverter converter) {
        super(service, converter);
    }

}