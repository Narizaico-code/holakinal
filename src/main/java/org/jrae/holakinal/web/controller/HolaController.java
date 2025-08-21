package org.jrae.holakinal.web.controller;

import org.jrae.holakinal.dominio.service.HolaServiceAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @Autowired
    private final HolaServiceAI serviceAI;

    public HolaController(HolaServiceAI serviceAI) {
        this.serviceAI = serviceAI;
    }

    @GetMapping("/")
    public String holaKinal(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hable con chat: ");
//        String mensaje = scanner.next();
        return this.serviceAI.generarSaludo();
    }
}
