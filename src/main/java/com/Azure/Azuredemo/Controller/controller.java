package com.Azure.Azuredemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller 
{
 
	//@RequestBody
	@GetMapping("/k")
   public String say()
   {
	   return "hello";
   }
}
