package com.project.hospitalmanagementsystem.Controllers;

import com.project.hospitalmanagementsystem.Models.Doctor;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("getalldoctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getallDoctors();
    }

    @PostMapping("adddoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
       return doctorService.adddoctor(doctor);
    }

    @GetMapping("getbyDid/{id}")
    public Doctor getdoctorById(@PathVariable int id ) {
      return doctorService.getDoctorbyid(id);
    }

    @PutMapping("getbyDid")
    public Doctor updatedoctor(@RequestBody Doctor doctor) {
       return doctorService.updatepatient(doctor);
    }

    @DeleteMapping("getbyDid/{id}")
    public void deletedoctor(@PathVariable int id) {
       doctorService.deletepatientbyid(id);
    }
}
