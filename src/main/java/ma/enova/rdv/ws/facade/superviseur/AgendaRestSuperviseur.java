package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.Agenda;
import ma.enova.rdv.bean.history.AgendaHistory;
import ma.enova.rdv.dao.criteria.core.AgendaCriteria;
import ma.enova.rdv.dao.criteria.history.AgendaHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.AgendaSuperviseurService;
import ma.enova.rdv.ws.converter.AgendaConverter;
import ma.enova.rdv.ws.dto.AgendaDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages agenda services")
@RestController
@RequestMapping("/api/superviseur/agenda")
public class AgendaRestSuperviseur  extends AbstractController<Agenda, AgendaDto, AgendaHistory, AgendaCriteria, AgendaHistoryCriteria, AgendaSuperviseurService, AgendaConverter> {


    @ApiOperation("Updates the specified  agenda")
    @PutMapping("")
    public ResponseEntity<AgendaDto> update(@RequestBody AgendaDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all agendas")
    @GetMapping("")
    public ResponseEntity<List<AgendaDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a agenda by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AgendaDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a agenda and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<AgendaDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  agenda")
    @PostMapping("")
    public ResponseEntity<AgendaDto> save(@RequestBody AgendaDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified agenda")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<AgendaDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<AgendaDto>> findByCriteria(@RequestBody AgendaCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AgendaCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody AgendaCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AgendaCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AgendaHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AgendaHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AgendaHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public AgendaRestSuperviseur (AgendaSuperviseurService service, AgendaConverter converter) {
        super(service, converter);
    }

}