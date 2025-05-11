package com.project.hospitalmanagementsystem.Controllers;

import com.project.hospitalmanagementsystem.Models.Bill;
import com.project.hospitalmanagementsystem.Models.Patients;
import com.project.hospitalmanagementsystem.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api")
public class BillController {


    @Autowired
    BillService billService;

    @GetMapping("getallbills")
    public List<Bill> getAllBills() {
        return billService.getallBills();
    }

    @PostMapping("addbills")
    public Bill addbills(@RequestBody Bill bill) {
      return billService.addBill(bill);
    }

    @GetMapping("getbyBid/{id}")
    public Bill getbillById(@PathVariable int id) {
       return billService.getbillbyid(id);
    }

    @PutMapping("getbyBid")
    public Bill updatebill(@RequestBody Bill bill) {
       return billService.updatebill(bill);
    }

    @DeleteMapping("getbyBid/{id}")
    public void deletebill(@PathVariable int id) {
         billService.deletebillbyid(id);
    }
}