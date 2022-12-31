package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.Etablissement;
import ma.enova.rdv.bean.history.EtablissementHistory;
import ma.enova.rdv.dao.criteria.core.EtablissementCriteria;
import ma.enova.rdv.dao.criteria.history.EtablissementHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.EtablissementSuperviseurService;
import ma.enova.rdv.ws.converter.EtablissementConverter;
import ma.enova.rdv.ws.dto.EtablissementDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages etablissement services")
@RestController
@RequestMapping("/api/superviseur/etablissement")
public class EtablissementRestSuperviseur  extends AbstractController<Etablissement, EtablissementDto, EtablissementHistory, EtablissementCriteria, EtablissementHistoryCriteria, EtablissementSuperviseurService, EtablissementConverter> {


    @ApiOperation("Updates the specified  etablissement")
    @PutMapping("")
    public ResponseEntity<EtablissementDto> update(@RequestBody EtablissementDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all etablissements")
    @GetMapping("")
    public ResponseEntity<List<EtablissementDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a etablissement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtablissementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a etablissement and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<EtablissementDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  etablissement")
    @PostMapping("")
    public ResponseEntity<EtablissementDto> save(@RequestBody EtablissementDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified etablissement")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<EtablissementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<EtablissementDto>> findByCriteria(@RequestBody EtablissementCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtablissementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtablissementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtablissementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtablissementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtablissementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtablissementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public EtablissementRestSuperviseur (EtablissementSuperviseurService service, EtablissementConverter converter) {
        super(service, converter);
    }

}