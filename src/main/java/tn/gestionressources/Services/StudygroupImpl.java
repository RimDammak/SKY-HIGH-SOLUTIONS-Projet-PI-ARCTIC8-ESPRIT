package tn.gestionressources.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.gestionressources.Entities.Studygroup;
import tn.gestionressources.Repository.StudygroupRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StudygroupImpl implements IStudygroupService {
    StudygroupRepository studygroupRepository;


    @Override
    public Studygroup addStudyGroup(Studygroup studygroup) {
        return studygroupRepository.save(studygroup);
    }

    @Override
    public List<Studygroup> getAllStudyGroup() {
        return (List<Studygroup>) studygroupRepository.findAll() ;
    }

    @Override
    public Studygroup getStudygroupById(long idStudyGroup) {
        return studygroupRepository.findById(idStudyGroup).get();
    }

    @Override
    public void deleteStudyGroup(long idStudyGroup) {
        studygroupRepository.deleteById(idStudyGroup);

    }

    @Override
    public Studygroup updateStudygroup(Studygroup studygroup) {
        return studygroupRepository.save(studygroup);
    }
}
