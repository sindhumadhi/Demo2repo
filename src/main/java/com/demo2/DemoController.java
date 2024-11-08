package com.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
@GetMapping("/getdemo2")
public String getDemo()
{
	return "Demo2 available";
}
}
