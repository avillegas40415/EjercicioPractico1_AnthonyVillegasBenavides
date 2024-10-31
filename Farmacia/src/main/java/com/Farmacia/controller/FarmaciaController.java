package com.Farmacia.controller;

import com.Farmacia.service.FarmaciaService;
import com.Farmacia.Domain.Farmacia;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/categoria")
public class FarmaciaController {
    @Autowired
    private FarmaciaService farmaciaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        //var categorias = arbolService.getCategorias(false);
        var categorias = farmaciaService.getCategorias();
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado"; //Cambiado para hacer pruebas
    }
}
