package com.project.hospitalmanagementsystem.Repository;

import com.project.hospitalmanagementsystem.Models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patients , Integer> {

}



