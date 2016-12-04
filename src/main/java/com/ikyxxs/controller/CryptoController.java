package com.ikyxxs.controller;

import com.ikyxxs.model.CryptoModel;
import com.ikyxxs.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/crypto/")
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @RequestMapping(value = "md5", method = RequestMethod.GET)
    public String md5(Model model) {
        model.addAttribute("crypto", new CryptoModel());
        return "md5";
    }

    @RequestMapping(value = "md5", method = RequestMethod.POST)
    public String md5Encrypt(Model model, CryptoModel cm) {
        model.addAttribute("crypto", cryptoService.handleByMD5(cm));
        return "md5";
    }
}