package  ma.enova.rdv.ws.facade.patient;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.CauseRejetDemandeRdv;
import ma.enova.rdv.bean.history.CauseRejetDemandeRdvHistory;
import ma.enova.rdv.dao.criteria.core.CauseRejetDemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.CauseRejetDemandeRdvHistoryCriteria;
import ma.enova.rdv.service.facade.patient.CauseRejetDemandeRdvPatientService;
import ma.enova.rdv.ws.converter.CauseRejetDemandeRdvConverter;
import ma.enova.rdv.ws.dto.CauseRejetDemandeRdvDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages causeRejetDemandeRdv services")
@RestController
@RequestMapping("/api/patient/causeRejetDemandeRdv")
public class CauseRejetDemandeRdvRestPatient  extends AbstractController<CauseRejetDemandeRdv, CauseRejetDemandeRdvDto, CauseRejetDemandeRdvHistory, CauseRejetDemandeRdvCriteria, CauseRejetDemandeRdvHistoryCriteria, CauseRejetDemandeRdvPatientService, CauseRejetDemandeRdvConverter> {


    @ApiOperation("Updates the specified  causeRejetDemandeRdv")
    @PutMapping("")
    public ResponseEntity<CauseRejetDemandeRdvDto> update(@RequestBody CauseRejetDemandeRdvDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all causeRejetDemandeRdvs")
    @GetMapping("")
    public ResponseEntity<List<CauseRejetDemandeRdvDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a causeRejetDemandeRdv by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CauseRejetDemandeRdvDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a causeRejetDemandeRdv and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<CauseRejetDemandeRdvDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  causeRejetDemandeRdv")
    @PostMapping("")
    public ResponseEntity<CauseRejetDemandeRdvDto> save(@RequestBody CauseRejetDemandeRdvDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified causeRejetDemandeRdv")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<CauseRejetDemandeRdvDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<CauseRejetDemandeRdvDto>> findByCriteria(@RequestBody CauseRejetDemandeRdvCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CauseRejetDemandeRdvCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody CauseRejetDemandeRdvCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CauseRejetDemandeRdvCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CauseRejetDemandeRdvHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CauseRejetDemandeRdvHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CauseRejetDemandeRdvHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public CauseRejetDemandeRdvRestPatient (CauseRejetDemandeRdvPatientService service, CauseRejetDemandeRdvConverter converter) {
        super(service, converter);
    }

}