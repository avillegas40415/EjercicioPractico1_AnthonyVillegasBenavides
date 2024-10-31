package com.Farmacia.controller;

import com.Farmacia.service.ProductosService;
import com.Farmacia.Domain.Productos;

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
@RequestMapping("/producto")
public class ProductosController {
    @Autowired
    private ProductosService productoService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        //var categorias = arbolService.getCategorias(false);
        var categorias = productoService.getProductos();
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/producto/listado"; //Cambiado para hacer pruebas
        }
}
