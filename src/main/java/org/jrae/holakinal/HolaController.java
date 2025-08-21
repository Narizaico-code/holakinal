package org.jrae.holakinal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class HolaController {
    @GetMapping("/")
    public String holaKinal(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();
        return "Hola Kinal, estoy en SB " + numero;
    }
}
