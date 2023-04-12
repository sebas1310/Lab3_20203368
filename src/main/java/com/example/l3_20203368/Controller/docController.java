package com.example.l3_20203368.Controller;

import com.example.l3_20203368.Repository.DocRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/doctores")
public class docController {

    final DocRepository docRepository;

    public docController(DocRepository docRepository) {
        this.docRepository = docRepository;
    }


    @GetMapping(value = "")
    public String listDoc(Model model){
        model.addAttribute("list",docRepository.findAll());

        return "doctores/lista";
    }



}
