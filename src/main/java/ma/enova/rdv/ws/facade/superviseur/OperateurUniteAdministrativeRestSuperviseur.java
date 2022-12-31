package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.OperateurUniteAdministrative;
import ma.enova.rdv.bean.history.OperateurUniteAdministrativeHistory;
import ma.enova.rdv.dao.criteria.core.OperateurUniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurUniteAdministrativeHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.OperateurUniteAdministrativeSuperviseurService;
import ma.enova.rdv.ws.converter.OperateurUniteAdministrativeConverter;
import ma.enova.rdv.ws.dto.OperateurUniteAdministrativeDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages operateurUniteAdministrative services")
@RestController
@RequestMapping("/api/superviseur/operateurUniteAdministrative")
public class OperateurUniteAdministrativeRestSuperviseur  extends AbstractController<OperateurUniteAdministrative, OperateurUniteAdministrativeDto, OperateurUniteAdministrativeHistory, OperateurUniteAdministrativeCriteria, OperateurUniteAdministrativeHistoryCriteria, OperateurUniteAdministrativeSuperviseurService, OperateurUniteAdministrativeConverter> {


    @ApiOperation("Updates the specified  operateurUniteAdministrative")
    @PutMapping("")
    public ResponseEntity<OperateurUniteAdministrativeDto> update(@RequestBody OperateurUniteAdministrativeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all operateurUniteAdministratives")
    @GetMapping("")
    public ResponseEntity<List<OperateurUniteAdministrativeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a operateurUniteAdministrative by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OperateurUniteAdministrativeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a operateurUniteAdministrative and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<OperateurUniteAdministrativeDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  operateurUniteAdministrative")
    @PostMapping("")
    public ResponseEntity<OperateurUniteAdministrativeDto> save(@RequestBody OperateurUniteAdministrativeDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified operateurUniteAdministrative")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<OperateurUniteAdministrativeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<OperateurUniteAdministrativeDto>> findByCriteria(@RequestBody OperateurUniteAdministrativeCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OperateurUniteAdministrativeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody OperateurUniteAdministrativeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OperateurUniteAdministrativeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OperateurUniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OperateurUniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OperateurUniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public OperateurUniteAdministrativeRestSuperviseur (OperateurUniteAdministrativeSuperviseurService service, OperateurUniteAdministrativeConverter converter) {
        super(service, converter);
    }

}