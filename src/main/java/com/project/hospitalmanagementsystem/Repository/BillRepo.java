package com.project.hospitalmanagementsystem.Repository;

import com.project.hospitalmanagementsystem.Models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer> {

}
