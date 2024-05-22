package com.example.gestionelection.presentation;

import com.example.gestionelection.services.GestionUtilisateur;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
@Data
public class AuthController {
    private final GestionUtilisateur gu;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/log")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        if (gu.listerUtilisateur().stream()
                .anyMatch(u -> u.getUsername().equals(username) && u.getMdp().equals(password))) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

}
