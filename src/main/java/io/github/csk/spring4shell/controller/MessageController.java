package io.github.csk.spring4shell.controller;

import io.github.csk.spring4shell.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring4shell")
public class MessageController {

    @GetMapping("/message")
    public String messageView(Model model) {
        model.addAttribute("msg", "I love spring framework");
        return "message";
    }

    @PostMapping("/message")
    public String sendMessage(@ModelAttribute Message message, Model model) {
        return "message";
    }
}
