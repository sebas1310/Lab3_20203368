package com.example.l3_20203368.Repository;

import com.example.l3_20203368.entity.Doctor;
import com.example.l3_20203368.entity.Hospital;
import com.example.l3_20203368.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

    @Query(nativeQuery = true,value = "select * from doctor where hospital_id=?1")
    List<Doctor> doctorPorHospital(Integer id);

    @Query(nativeQuery = true,value = "select * from paciente where hospital_id=?1")
    List<Paciente> pacPorHospital(Integer id);

}
