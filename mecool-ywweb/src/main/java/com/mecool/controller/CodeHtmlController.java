package com.mecool.controller;

import com.mecool.service.CodeService;
import com.mecool.utils.ApplicationDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeHtmlController {

    private static final Logger logger = LoggerFactory.getLogger(CodeHtmlController.class);
    @Autowired
    private CodeService codeService;

    @Autowired
    ApplicationDate applicationDate;

    @RequestMapping("/code/html")
    public String htmlCode(ModelMap map){
        map.put("temp","AJ");
        return "codeStr";
    }
}
