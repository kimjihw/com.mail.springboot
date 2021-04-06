package com.mail.springboot.controller;

import com.mail.springboot.dto.MailDto;
import com.mail.springboot.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/mail")
    public String dispmail(){
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto){
        mailService.mailSend(mailDto);
    }
}
