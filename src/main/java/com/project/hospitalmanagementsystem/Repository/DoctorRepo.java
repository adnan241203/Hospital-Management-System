package com.project.hospitalmanagementsystem.Repository;

import com.project.hospitalmanagementsystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    Doctor findByName(String name);
}
