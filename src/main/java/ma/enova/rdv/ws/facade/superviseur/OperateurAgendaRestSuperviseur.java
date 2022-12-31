package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.OperateurAgenda;
import ma.enova.rdv.bean.history.OperateurAgendaHistory;
import ma.enova.rdv.dao.criteria.core.OperateurAgendaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurAgendaHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.OperateurAgendaSuperviseurService;
import ma.enova.rdv.ws.converter.OperateurAgendaConverter;
import ma.enova.rdv.ws.dto.OperateurAgendaDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages operateurAgenda services")
@RestController
@RequestMapping("/api/superviseur/operateurAgenda")
public class OperateurAgendaRestSuperviseur  extends AbstractController<OperateurAgenda, OperateurAgendaDto, OperateurAgendaHistory, OperateurAgendaCriteria, OperateurAgendaHistoryCriteria, OperateurAgendaSuperviseurService, OperateurAgendaConverter> {


    @ApiOperation("Updates the specified  operateurAgenda")
    @PutMapping("")
    public ResponseEntity<OperateurAgendaDto> update(@RequestBody OperateurAgendaDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all operateurAgendas")
    @GetMapping("")
    public ResponseEntity<List<OperateurAgendaDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a operateurAgenda by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OperateurAgendaDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a operateurAgenda and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<OperateurAgendaDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  operateurAgenda")
    @PostMapping("")
    public ResponseEntity<OperateurAgendaDto> save(@RequestBody OperateurAgendaDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified operateurAgenda")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<OperateurAgendaDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<OperateurAgendaDto>> findByCriteria(@RequestBody OperateurAgendaCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OperateurAgendaCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody OperateurAgendaCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OperateurAgendaCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OperateurAgendaHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OperateurAgendaHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OperateurAgendaHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public OperateurAgendaRestSuperviseur (OperateurAgendaSuperviseurService service, OperateurAgendaConverter converter) {
        super(service, converter);
    }

}