package com.ikyxxs.controller;

import com.ikyxxs.model.EncodeModel;
import com.ikyxxs.service.EncodeService;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.StringWriter;

@Controller
@RequestMapping("/encode/")
public class EncodeController {

    @Autowired
    private VelocityEngine engine;

    @Autowired
    private EncodeService encodeService;

    @RequestMapping(value = "base64", method = RequestMethod.GET)
    public String base64(Model model) {
        model.addAttribute("encode", new EncodeModel());
        return "base64";
    }

    @RequestMapping(value = "base64", method = RequestMethod.POST)
    public String loginResult(Model model, EncodeModel em) {
        model.addAttribute("encode", encodeService.handleStr(em));
        return "base64";
    }
}