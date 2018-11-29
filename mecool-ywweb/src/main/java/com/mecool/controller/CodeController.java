package com.mecool.controller;

import com.mecool.entity.ResMes;
import com.mecool.service.CodeService;
import com.mecool.utils.ApplicationDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {

    private static final Logger logger = LoggerFactory.getLogger(CodeController.class);
    @Autowired
    private CodeService codeService;

    @Autowired
    ApplicationDate applicationDate;

    @RequestMapping("/code/application")
    public ResMes appRep(){

        return new ResMes(applicationDate.getBaidu());
    }

}
