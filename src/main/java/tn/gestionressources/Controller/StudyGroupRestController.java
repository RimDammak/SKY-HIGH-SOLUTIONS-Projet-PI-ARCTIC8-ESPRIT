package tn.gestionressources.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.gestionressources.Entities.Ressource;
import tn.gestionressources.Entities.Studygroup;
import tn.gestionressources.Services.IStudygroupService;

import java.util.List;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/Studygroup")
public class StudyGroupRestController {
    IStudygroupService studygroupService;
    @GetMapping("/retrieve-all-StudyGroup")
    public List<Studygroup> getStudyGroup() {
        List<Studygroup> studygroupList = studygroupService.getAllStudyGroup();
        return studygroupList;
    }
    @GetMapping("/retrieve-studygroup/{studygroup-id}")
        public Studygroup getStudygroupById(@PathVariable("studygroup-id") Long studgroupid) {
        Studygroup studygroup = studygroupService.getStudygroupById(studgroupid);
        return studygroup;
    }
    @PostMapping("/addStudyGroup")
    public Studygroup addStudygroup(@RequestBody  Studygroup studygroup){
        Studygroup  studyGroup = studygroupService.addStudyGroup(studygroup);
        return studyGroup;
    }
    @DeleteMapping("/remove-studygroup/{studygroup-id}")
    public void removeStudygroup(@PathVariable("studygroup-id") Long s){
        studygroupService.deleteStudyGroup(s);
    }
    @PutMapping("/modify-studygroup")
    public Studygroup modifyStudygroup(@RequestBody Studygroup s)
    {
        Studygroup studygroup = studygroupService.updateStudygroup(s);
        return s;
    }

}
