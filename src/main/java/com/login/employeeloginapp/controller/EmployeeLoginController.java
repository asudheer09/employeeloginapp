package com.login.employeeloginapp.controller;

import com.login.employeeloginapp.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employee")
@Controller
public class EmployeeLoginController {

    @RequestMapping("login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "loginAction")
    public String submit(@ModelAttribute("employee")Employee employee){
        System.out.println("from controller");
        if(employee.getUserName().equals("sudheer") && employee.getPassword().equals("56789")){
            return "success";
        }
        return "error";
    }

}
