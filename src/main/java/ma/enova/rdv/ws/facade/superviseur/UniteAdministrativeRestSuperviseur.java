package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.UniteAdministrative;
import ma.enova.rdv.bean.history.UniteAdministrativeHistory;
import ma.enova.rdv.dao.criteria.core.UniteAdministrativeCriteria;
import ma.enova.rdv.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.UniteAdministrativeSuperviseurService;
import ma.enova.rdv.ws.converter.UniteAdministrativeConverter;
import ma.enova.rdv.ws.dto.UniteAdministrativeDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages uniteAdministrative services")
@RestController
@RequestMapping("/api/superviseur/uniteAdministrative")
public class UniteAdministrativeRestSuperviseur  extends AbstractController<UniteAdministrative, UniteAdministrativeDto, UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeSuperviseurService, UniteAdministrativeConverter> {


    @ApiOperation("Updates the specified  uniteAdministrative")
    @PutMapping("")
    public ResponseEntity<UniteAdministrativeDto> update(@RequestBody UniteAdministrativeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all uniteAdministratives")
    @GetMapping("")
    public ResponseEntity<List<UniteAdministrativeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a uniteAdministrative by id")
    @GetMapping("id/{id}")
    public ResponseEntity<UniteAdministrativeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a uniteAdministrative and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<UniteAdministrativeDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  uniteAdministrative")
    @PostMapping("")
    public ResponseEntity<UniteAdministrativeDto> save(@RequestBody UniteAdministrativeDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified uniteAdministrative")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<UniteAdministrativeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<UniteAdministrativeDto>> findByCriteria(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody UniteAdministrativeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody UniteAdministrativeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public UniteAdministrativeRestSuperviseur (UniteAdministrativeSuperviseurService service, UniteAdministrativeConverter converter) {
        super(service, converter);
    }

}