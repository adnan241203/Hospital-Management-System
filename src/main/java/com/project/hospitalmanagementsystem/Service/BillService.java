package com.project.hospitalmanagementsystem.Service;

import com.project.hospitalmanagementsystem.Models.Bill;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Repository.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepo billRepo;

    public List<Bill> getallBills() {
        try {
            return billRepo.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
    public Bill getbillbyid(int id) {
        try{
           return billRepo.findById(id).get();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Bill addBill(Bill bill) {
        try{
            return billRepo.save(bill);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Bill updatebill(Bill bill) {
        try{
            return billRepo.save(bill);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void deletebillbyid(int id) {
        try{
             billRepo.deleteById(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

