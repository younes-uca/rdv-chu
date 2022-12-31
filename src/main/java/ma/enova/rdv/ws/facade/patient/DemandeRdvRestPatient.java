package  ma.enova.rdv.ws.facade.patient;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.DemandeRdv;
import ma.enova.rdv.bean.history.DemandeRdvHistory;
import ma.enova.rdv.dao.criteria.core.DemandeRdvCriteria;
import ma.enova.rdv.dao.criteria.history.DemandeRdvHistoryCriteria;
import ma.enova.rdv.service.facade.patient.DemandeRdvPatientService;
import ma.enova.rdv.ws.converter.DemandeRdvConverter;
import ma.enova.rdv.ws.dto.DemandeRdvDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages demandeRdv services")
@RestController
@RequestMapping("/api/patient/demandeRdv")
public class DemandeRdvRestPatient  extends AbstractController<DemandeRdv, DemandeRdvDto, DemandeRdvHistory, DemandeRdvCriteria, DemandeRdvHistoryCriteria, DemandeRdvPatientService, DemandeRdvConverter> {


    @ApiOperation("Updates the specified  demandeRdv")
    @PutMapping("")
    public ResponseEntity<DemandeRdvDto> update(@RequestBody DemandeRdvDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all demandeRdvs")
    @GetMapping("")
    public ResponseEntity<List<DemandeRdvDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a demandeRdv by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DemandeRdvDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a demandeRdv and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<DemandeRdvDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  demandeRdv")
    @PostMapping("")
    public ResponseEntity<DemandeRdvDto> save(@RequestBody DemandeRdvDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified demandeRdv")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<DemandeRdvDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }











    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<DemandeRdvDto>> findByCriteria(@RequestBody DemandeRdvCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DemandeRdvCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody DemandeRdvCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DemandeRdvCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DemandeRdvHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DemandeRdvHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DemandeRdvHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public DemandeRdvRestPatient (DemandeRdvPatientService service, DemandeRdvConverter converter) {
        super(service, converter);
    }

}