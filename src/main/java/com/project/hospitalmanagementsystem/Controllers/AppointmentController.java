package com.project.hospitalmanagementsystem.Controllers;

import com.project.hospitalmanagementsystem.Models.Appointment;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Service.Appointmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AppointmentController {

    @Autowired
    Appointmentservice appointmentservice;

    @GetMapping("getallappointment")
    public List<Appointment> getAllAppointment() {
      return appointmentservice.getallAppointments();
    }

    @PostMapping("addappointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
       return appointmentservice.addAppointment(appointment);
    }

    @GetMapping("getbyAid/{id}")
    public Appointment getAppointmenttById(@PathVariable int id) {
        return appointmentservice.getAppointmentbyid(id);
    }

    @PutMapping("getbyAid")
    public Appointment updateAppointment(@RequestBody Appointment appointment) {
      return appointmentservice.updatepAppointment(appointment);
    }

    @DeleteMapping("getbyAid/{id}")
    public void deletePatient(@PathVariable int id) {
       appointmentservice.deleteAppointment(id);
    }
}
