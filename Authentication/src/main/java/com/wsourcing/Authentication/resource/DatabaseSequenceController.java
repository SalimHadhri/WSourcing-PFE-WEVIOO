package com.wsourcing.Authentication.resource;


import com.wsourcing.Authentication.repository.DatabaseSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
@RequestMapping("/sequence")
public class DatabaseSequenceController {


    @Autowired
    private DatabaseSequenceRepository databaseSequenceRepository ;

    public DatabaseSequenceController(DatabaseSequenceRepository databaseSequenceRepository) {
        this.databaseSequenceRepository = databaseSequenceRepository;
    }

    @DeleteMapping(value="/deleteAllSequences")
    public String deleteAllSequences(){
        databaseSequenceRepository.deleteAll();
        return "All sequences deleted" ;
    }


}
