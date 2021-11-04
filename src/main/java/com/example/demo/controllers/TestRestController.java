package com.example.demo.controllers;

import com.example.demo.XMLParser.Parser;
import com.example.demo.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.xpath.XPathExpressionException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView init(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject(new Car());

        return mv;

    }

    @RequestMapping(value = "/manufacturer", method = RequestMethod.POST)
    public ModelAndView manufacturer(@ModelAttribute Car car) throws XPathExpressionException, FileNotFoundException {
        ModelAndView mv = new ModelAndView();
        List<Car> cars =Parser.parseByManufacturer(car.getManufacturer());
        mv.addObject("cars" , cars);
        mv.setViewName("hello");

        return mv;
    }
    @RequestMapping(value = "/productionYear", method = RequestMethod.POST)
    public ModelAndView productionYear(@ModelAttribute Car car) throws XPathExpressionException, FileNotFoundException {
        ModelAndView mv = new ModelAndView();
        List<Car> cars =  Parser.parsebyproductionYear(car.getProductionYear());
        mv.addObject("cars" , cars);
        mv.setViewName("hello");

        return mv;
    }

    @RequestMapping(value ="/consumptionType" ,  method = RequestMethod.POST)
    public ModelAndView consumptionType(@ModelAttribute Car car) throws FileNotFoundException, XPathExpressionException {

        ModelAndView mv = new ModelAndView();
        List<Car> cars = Parser.parseByConsumptionType(car.getConsumptionType() , car.getConsumption());
        mv.addObject("cars" ,cars);
        mv.setViewName("hello");

        return mv;
    }



}
