package com.project.hospitalmanagementsystem.Repository;

import com.project.hospitalmanagementsystem.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
