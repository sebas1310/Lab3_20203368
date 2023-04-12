package com.example.l3_20203368.Repository;

import com.example.l3_20203368.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Doctor,Integer> {

}
