package com.project.hospitalmanagementsystem.Service;

import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Repository.PatientRepo;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class PatientsService {
    @Autowired
    private PatientRepo patientRepo;

    public List<Patients> getallpatients() {
        try {
             return patientRepo.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }

    public Patients getpatientbyid(int id) {
        try{
            return patientRepo.findById(id).get();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Patients addpatient(Patients patient) {
        try{
          return patientRepo.save(patient);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Patients updatepatient(Patients patient) {
        try {
            return patientRepo.save(patient);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void deletepatientbyid(int id) {
        try {
            patientRepo.deleteById(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
