package com.DikitchiRoutes.Dikitchi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DikitchiController {
	 @RequestMapping("/dichichi")
	 public String Dikitchi(){
	   return "Hello Warrior";
	 }
	 @RequestMapping("/dichichi/travel/{city}")
	 public String Travel(@PathVariable(name = "city") String name){
	   
	return "welcome to the city " + name ;
	 }
	 
	 @RequestMapping("/dichichi/number/{number}") // don't method overload routes 
	 public  String Test(@PathVariable("number") int number){
	   if(number % 2 == 0) {
		   return " test " + number;
		   
	   }
	   else {
		   return "number:" + number;
	   }

		   
	   
	
	 }
	 
	 @RequestMapping("/today/")
	 public String  Today(){
	   return "Today you will find luck in all your endeavors!";
	 }
	 @RequestMapping("/tomorrow")
	 public String  Tomorrow(){
	   return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	 }
	

}
