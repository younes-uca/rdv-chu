package  ma.enova.rdv.ws.facade.patient;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.StatusRdv;
import ma.enova.rdv.bean.history.StatusRdvHistory;
import ma.enova.rdv.dao.criteria.core.StatusRdvCriteria;
import ma.enova.rdv.dao.criteria.history.StatusRdvHistoryCriteria;
import ma.enova.rdv.service.facade.patient.StatusRdvPatientService;
import ma.enova.rdv.ws.converter.StatusRdvConverter;
import ma.enova.rdv.ws.dto.StatusRdvDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages statusRdv services")
@RestController
@RequestMapping("/api/patient/statusRdv")
public class StatusRdvRestPatient  extends AbstractController<StatusRdv, StatusRdvDto, StatusRdvHistory, StatusRdvCriteria, StatusRdvHistoryCriteria, StatusRdvPatientService, StatusRdvConverter> {


    @ApiOperation("Updates the specified  statusRdv")
    @PutMapping("")
    public ResponseEntity<StatusRdvDto> update(@RequestBody StatusRdvDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all statusRdvs")
    @GetMapping("")
    public ResponseEntity<List<StatusRdvDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a statusRdv by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StatusRdvDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a statusRdv and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<StatusRdvDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  statusRdv")
    @PostMapping("")
    public ResponseEntity<StatusRdvDto> save(@RequestBody StatusRdvDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified statusRdv")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<StatusRdvDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<StatusRdvDto>> findByCriteria(@RequestBody StatusRdvCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatusRdvCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody StatusRdvCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StatusRdvCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatusRdvHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatusRdvHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatusRdvHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public StatusRdvRestPatient (StatusRdvPatientService service, StatusRdvConverter converter) {
        super(service, converter);
    }

}