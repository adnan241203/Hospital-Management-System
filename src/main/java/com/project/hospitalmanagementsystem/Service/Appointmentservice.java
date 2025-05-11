package com.project.hospitalmanagementsystem.Service;

import com.project.hospitalmanagementsystem.Models.Appointment;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class Appointmentservice {
    @Autowired
    private AppointmentRepo appointmentRepo;

    public List<Appointment> getallAppointments() {
        try {
             return appointmentRepo.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Appointment getAppointmentbyid(int id) {
        try{
            return appointmentRepo.findById(id).get();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Appointment addAppointment(Appointment appointment) {
        try{
            return appointmentRepo.save(appointment);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Appointment updatepAppointment(Appointment appointment) {
        try{
            return appointmentRepo.save(appointment);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void deleteAppointment(int id) {
        try{
           appointmentRepo.deleteById(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
