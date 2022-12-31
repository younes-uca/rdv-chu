package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.JourFerie;
import ma.enova.rdv.bean.history.JourFerieHistory;
import ma.enova.rdv.dao.criteria.core.JourFerieCriteria;
import ma.enova.rdv.dao.criteria.history.JourFerieHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.JourFerieSuperviseurService;
import ma.enova.rdv.ws.converter.JourFerieConverter;
import ma.enova.rdv.ws.dto.JourFerieDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages jourFerie services")
@RestController
@RequestMapping("/api/superviseur/jourFerie")
public class JourFerieRestSuperviseur  extends AbstractController<JourFerie, JourFerieDto, JourFerieHistory, JourFerieCriteria, JourFerieHistoryCriteria, JourFerieSuperviseurService, JourFerieConverter> {


    @ApiOperation("Updates the specified  jourFerie")
    @PutMapping("")
    public ResponseEntity<JourFerieDto> update(@RequestBody JourFerieDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all jourFeries")
    @GetMapping("")
    public ResponseEntity<List<JourFerieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a jourFerie by id")
    @GetMapping("id/{id}")
    public ResponseEntity<JourFerieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a jourFerie and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<JourFerieDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  jourFerie")
    @PostMapping("")
    public ResponseEntity<JourFerieDto> save(@RequestBody JourFerieDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified jourFerie")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<JourFerieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<JourFerieDto>> findByCriteria(@RequestBody JourFerieCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody JourFerieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody JourFerieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody JourFerieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody JourFerieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody JourFerieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody JourFerieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public JourFerieRestSuperviseur (JourFerieSuperviseurService service, JourFerieConverter converter) {
        super(service, converter);
    }

}