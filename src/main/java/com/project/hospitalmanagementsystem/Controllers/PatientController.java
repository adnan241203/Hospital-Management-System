package com.project.hospitalmanagementsystem.Controllers;

import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Service.PatientsService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("api")
public class PatientController {

    @Autowired
     private PatientsService patientsService;

    @GetMapping("getallpatient")
    public List<Patients> getAllPatients() {
        return patientsService.getallpatients();
    }

    @PostMapping("addpatient")
    public Patients addPatient(@RequestBody Patients patient) {
        return patientsService.addpatient(patient);
    }
    @GetMapping("getbyid/{id}")
    public Patients getPatientById(@PathVariable int id) {
       return patientsService.getpatientbyid(id);
    }
    @PutMapping("getbyid")
    public Patients updatePatient(@RequestBody Patients patient) {
       return patientsService.updatepatient(patient);
    }
    @DeleteMapping("getbyid/{id}")
    public void deletePatient(@PathVariable int id) {
       patientsService.deletepatientbyid(id);

    }

}
