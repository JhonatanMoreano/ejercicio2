package com.taller4.ejercicio2.controller;

import com.taller4.ejercicio2.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpleadoController {

   @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario_empleado";
    }

    @PostMapping("/resultado")
    public String mostrarResultado(
            @RequestParam("sueldoBase") double sueldoBase,
            @RequestParam("horasExtra") int horasExtra,
            Model model) {

        Empleado empleado = new Empleado();
        empleado.setSueldoBase(sueldoBase);
        empleado.setHorasExtra(horasExtra);

        model.addAttribute("sueldoBase", sueldoBase);
        model.addAttribute("horasExtra", horasExtra);
        model.addAttribute("tarifaPorHora", empleado.calcularTarifaPorHora());
        model.addAttribute("sueldoTotal", empleado.calcularSueldoTotal());

        return "resultado_empleado";
    }
}
