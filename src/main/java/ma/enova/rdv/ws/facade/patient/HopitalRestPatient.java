package  ma.enova.rdv.ws.facade.patient;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.Hopital;
import ma.enova.rdv.bean.history.HopitalHistory;
import ma.enova.rdv.dao.criteria.core.HopitalCriteria;
import ma.enova.rdv.dao.criteria.history.HopitalHistoryCriteria;
import ma.enova.rdv.service.facade.patient.HopitalPatientService;
import ma.enova.rdv.ws.converter.HopitalConverter;
import ma.enova.rdv.ws.dto.HopitalDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages hopital services")
@RestController
@RequestMapping("/api/patient/hopital")
public class HopitalRestPatient  extends AbstractController<Hopital, HopitalDto, HopitalHistory, HopitalCriteria, HopitalHistoryCriteria, HopitalPatientService, HopitalConverter> {


    @ApiOperation("Updates the specified  hopital")
    @PutMapping("")
    public ResponseEntity<HopitalDto> update(@RequestBody HopitalDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all hopitals")
    @GetMapping("")
    public ResponseEntity<List<HopitalDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a hopital by id")
    @GetMapping("id/{id}")
    public ResponseEntity<HopitalDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a hopital and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<HopitalDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  hopital")
    @PostMapping("")
    public ResponseEntity<HopitalDto> save(@RequestBody HopitalDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified hopital")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<HopitalDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<HopitalDto>> findByCriteria(@RequestBody HopitalCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HopitalCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody HopitalCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody HopitalCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HopitalHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HopitalHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HopitalHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public HopitalRestPatient (HopitalPatientService service, HopitalConverter converter) {
        super(service, converter);
    }

}