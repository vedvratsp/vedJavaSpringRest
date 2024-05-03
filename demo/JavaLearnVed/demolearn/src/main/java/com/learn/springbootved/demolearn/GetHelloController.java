package com.learn.springbootved.demolearn;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetHelloController {
    @Autowired
    private Name name;
    @GetMapping("/")
    public String newGetRest(@RequestParam(required = false, defaultValue = "World") String param) {
        return "Hello" +param;
        
    }
    @PostMapping("/")
		public String postRestName(@RequestBody String entity) {
			name.setData(entity);
			return "Hello"+" "+name.getData();
		}

    @PostMapping("/noofchar")
    public Name returnStringOperation(@RequestBody String inputString) {
            return new Name(null, inputString.length(), inputString.toUpperCase());
        } 

    @PostMapping("/nooflist")
    public Object returnNoOfItem(@RequestBody List<Object> items) {
    return items.size() ;
        }

}

