package com.ikyxxs.controller;

import com.ikyxxs.model.CodecModel;
import com.ikyxxs.service.CodecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/codec/")
public class CodecController {

    @Autowired
    private CodecService codecService;

    @RequestMapping(value = "base64", method = RequestMethod.GET)
    public String base64(Model model) {
        model.addAttribute("codec", new CodecModel());
        return "base64";
    }

    @RequestMapping(value = "base64", method = RequestMethod.POST)
    public String base64Codec(Model model, CodecModel cm) {
        model.addAttribute("codec", codecService.handleByBase64(cm));
        return "base64";
    }
}