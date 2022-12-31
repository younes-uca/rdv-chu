package  ma.enova.rdv.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.Patient;
import ma.enova.rdv.bean.history.PatientHistory;
import ma.enova.rdv.dao.criteria.core.PatientCriteria;
import ma.enova.rdv.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.rdv.service.facade.admin.PatientAdminService;
import ma.enova.rdv.ws.converter.PatientConverter;
import ma.enova.rdv.ws.dto.PatientDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages patient services")
@RestController
@RequestMapping("/api/admin/patient")
public class PatientRestAdmin  extends AbstractController<Patient, PatientDto, PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientAdminService, PatientConverter> {


    @ApiOperation("Updates the specified  patient")
    @PutMapping("")
    public ResponseEntity<PatientDto> update(@RequestBody PatientDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all patients")
    @GetMapping("")
    public ResponseEntity<List<PatientDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a patient by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PatientDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a patient and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<PatientDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  patient")
    @PostMapping("")
    public ResponseEntity<PatientDto> save(@RequestBody PatientDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified patient")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<PatientDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<PatientDto>> findByCriteria(@RequestBody PatientCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PatientCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody PatientCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PatientCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PatientRestAdmin (PatientAdminService service, PatientConverter converter) {
        super(service, converter);
    }

}