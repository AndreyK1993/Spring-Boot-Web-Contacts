package app.SpringBootWebContacts.controller;

import app.SpringBootWebContacts.service.ContactService;
import app.SpringBootWebContacts.service.ResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    ContactService contactService;

    @Autowired
    ResortService resortService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("contacts", contactService.getContacts());
        model.addAttribute("resorts", resortService.getResorts());
        return "home";
    }
}
