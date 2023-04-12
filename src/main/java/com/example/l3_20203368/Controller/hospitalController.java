package com.example.l3_20203368.Controller;

import com.example.l3_20203368.Repository.HospitalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/hospital")
public class hospitalController {
    final HospitalRepository hospitalRepository;

    public hospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping(value = "")
    public String listHospital(Model model){
        model.addAttribute("list",hospitalRepository.findAll());
        return "hospital/lista";
    }

    @GetMapping(value = "/doctores")
    public String docHospital(@RequestParam("id") Integer id, Model model){
        model.addAttribute("list",hospitalRepository.doctorPorHospital(id));
        return"hospital/doctores";
    }

    @GetMapping(value = "/pacientes")
    public String pacHospital(@RequestParam("id") Integer id, Model model){
        model.addAttribute("list",hospitalRepository.pacPorHospital(id));
        return"hospital/pacientes";
    }



}
