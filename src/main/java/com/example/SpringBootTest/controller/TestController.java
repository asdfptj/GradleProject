package com.example.SpringBootTest.controller;

import com.example.SpringBootTest.dto.TestDTO;
import com.example.SpringBootTest.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    DbService dbService;

    @RequestMapping("/")
    public String main() {
        return "main";
    }



    @RequestMapping("/dbTest")
    public String dbTest(Model model) throws Exception {

        List<TestDTO> list = dbService.getList();

//        return new ModelAndView("dbTest", "list", list);
        model.addAttribute("list", list);
        return "dbTest";
    }
}