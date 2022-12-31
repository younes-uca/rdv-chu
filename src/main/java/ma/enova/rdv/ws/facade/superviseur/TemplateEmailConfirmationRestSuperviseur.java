package  ma.enova.rdv.ws.facade.superviseur;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.rdv.bean.core.TemplateEmailConfirmation;
import ma.enova.rdv.bean.history.TemplateEmailConfirmationHistory;
import ma.enova.rdv.dao.criteria.core.TemplateEmailConfirmationCriteria;
import ma.enova.rdv.dao.criteria.history.TemplateEmailConfirmationHistoryCriteria;
import ma.enova.rdv.service.facade.superviseur.TemplateEmailConfirmationSuperviseurService;
import ma.enova.rdv.ws.converter.TemplateEmailConfirmationConverter;
import ma.enova.rdv.ws.dto.TemplateEmailConfirmationDto;
import ma.enova.rdv.zynerator.controller.AbstractController;
import ma.enova.rdv.zynerator.dto.AuditEntityDto;
import ma.enova.rdv.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api("Manages templateEmailConfirmation services")
@RestController
@RequestMapping("/api/superviseur/templateEmailConfirmation")
public class TemplateEmailConfirmationRestSuperviseur  extends AbstractController<TemplateEmailConfirmation, TemplateEmailConfirmationDto, TemplateEmailConfirmationHistory, TemplateEmailConfirmationCriteria, TemplateEmailConfirmationHistoryCriteria, TemplateEmailConfirmationSuperviseurService, TemplateEmailConfirmationConverter> {


    @ApiOperation("Updates the specified  templateEmailConfirmation")
    @PutMapping("")
    public ResponseEntity<TemplateEmailConfirmationDto> update(@RequestBody TemplateEmailConfirmationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a list of all templateEmailConfirmations")
    @GetMapping("")
    public ResponseEntity<List<TemplateEmailConfirmationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a templateEmailConfirmation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TemplateEmailConfirmationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

//    @ApiOperation("Finds a templateEmailConfirmation and associated list by id")
//    @GetMapping("/detail/id/{id}")
//    public ResponseEntity<TemplateEmailConfirmationDto> findByIdWithAssociatedList(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
//        return super.findByIdWithAssociatedList(id,includes,excludes);
//    }



    @ApiOperation("Saves the specified  templateEmailConfirmation")
    @PostMapping("")
    public ResponseEntity<TemplateEmailConfirmationDto> save(@RequestBody TemplateEmailConfirmationDto dto) throws Exception {
        return super.save(dto);
    }


    @ApiOperation("Delete the specified templateEmailConfirmation")
    @DeleteMapping("/multiple")
    public ResponseEntity<Void> delete(@RequestBody List<TemplateEmailConfirmationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("find-by-criteria/")
    public ResponseEntity<List<TemplateEmailConfirmationDto>> findByCriteria(@RequestBody TemplateEmailConfirmationCriteria criteria) throws Exception {
        return super.findMultipleByCriteria(criteria);
    }


    @PostMapping("find-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TemplateEmailConfirmationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @PostMapping("export/")
    public ResponseEntity<InputStreamResource> export(@RequestBody TemplateEmailConfirmationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TemplateEmailConfirmationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @PostMapping("history-paginated-by-criteria/")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TemplateEmailConfirmationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @PostMapping("export-history/")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TemplateEmailConfirmationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TemplateEmailConfirmationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public TemplateEmailConfirmationRestSuperviseur (TemplateEmailConfirmationSuperviseurService service, TemplateEmailConfirmationConverter converter) {
        super(service, converter);
    }

}