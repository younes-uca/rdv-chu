package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.OperateurQuota;
import ma.enova.rdv.bean.history.OperateurQuotaHistory;
import ma.enova.rdv.dao.criteria.core.OperateurQuotaCriteria;
import ma.enova.rdv.dao.criteria.history.OperateurQuotaHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.OperateurQuotaSuperviseurService;
import ma.enova.rdv.ws.converter.OperateurQuotaConverter;
import ma.enova.rdv.ws.dto.OperateurQuotaDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages operateurQuota services")
@RestController
@RequestMapping("/api/superviseur/operateurQuota")
public class OperateurQuotaRestSuperviseur  extends AbstractController<OperateurQuota, OperateurQuotaDto, OperateurQuotaHistory, OperateurQuotaCriteria, OperateurQuotaHistoryCriteria, OperateurQuotaSuperviseurService, OperateurQuotaConverter> {


    @ApiOperation("Updates the specified  operateurQuota")
    @PutMapping("")
    public ResponseEntity<OperateurQuotaDto> update(@RequestBody OperateurQuotaDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all operateurQuotas")
    @GetMapping("")
    public ResponseEntity<List<OperateurQuotaDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a operateurQuota by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OperateurQuotaDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a operateurQuota and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<OperateurQuotaDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  operateurQuota")
    @PostMapping("")
    public ResponseEntity<OperateurQuotaDto> save(@RequestBody OperateurQuotaDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified operateurQuota")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<OperateurQuotaDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<OperateurQuotaDto>> findByCriteria(@RequestBody OperateurQuotaCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OperateurQuotaCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody OperateurQuotaCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OperateurQuotaCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OperateurQuotaHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OperateurQuotaHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OperateurQuotaHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public OperateurQuotaRestSuperviseur (OperateurQuotaSuperviseurService service, OperateurQuotaConverter converter) {
        super(service, converter);
    }

}