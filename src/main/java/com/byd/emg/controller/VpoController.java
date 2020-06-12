package com.byd.emg.controller;

import com.byd.emg.service.JavaToTableService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ganchaoyang
 * @date 2019/1/22 19:15
 * @description
 */
@Controller
//@RestController
//@RequestMapping("/abi")
//@RequestMapping("/abipt")
public class VpoController {

    @Autowired
    private JavaToTableService javaToTableService;

//    扫码转发
    @RequestMapping("/abipt")
    public String   updateData(@RequestParam("vpo") String vpono) {
       javaToTableService.insertVpoNO(vpono);

        return "redirect:https://esmsprod.ab-inbev.cn/abipt";
//        return javaToTableService.insertVpoNO(vpono);
    }

    //    记录登陆次数
    @RequestMapping("/loginTimes")
    public void   loginTimes(@RequestParam("user") String username,@RequestParam("psw") String password) {
         javaToTableService.loginTimesAdd(username,password);
//        return "OK";

//        return javaToTableService.insertVpoNO(vpono);
//        return 1;
    }

}
