package com.project.hospitalmanagementsystem.Service;

import com.project.hospitalmanagementsystem.Models.Doctor;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    public List<Doctor> getallDoctors() {
        try {
            return doctorRepo.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }

    public Doctor getDoctorbyid(int id) {
        try {
            return doctorRepo.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Doctor adddoctor(Doctor doctor) {
        try {
            return doctorRepo.save(doctor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Doctor updatepatient(Doctor doctor) {
        try {
            return doctorRepo.save(doctor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void deletepatientbyid(int id) {
        try {
            doctorRepo.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


