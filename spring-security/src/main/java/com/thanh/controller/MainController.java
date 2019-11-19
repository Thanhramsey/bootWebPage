package com.thanh.controller;


import com.thanh.domain.User;
import com.thanh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = { "/addPerson"},method={RequestMethod.GET,RequestMethod.POST})
	public String index(
			@RequestParam(value = "firstname", required = false) String firstname,
			@RequestParam(value = "lastname", required = false) String lastname,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "address", required = false) String address,
			@RequestParam(value = "phone", required = false) String phone,
			@RequestParam(value = "dateOfBirth", required = false) String dateOfBirth,
			Model model) {

		if(firstname==null&& lastname==null && email==null&&password==null&&address==null&&phone==null&&dateOfBirth==null){
			return "index";
		}

		if(!(email == ""||email == null)){
			List<User> listUsers = (List<User>) userRepository.findAll();
			for (User user: listUsers) {
				if(user.getEmail().equals(email)){
					String messeage = "This email is already exist!";
					model.addAttribute("messeage", messeage);
					return "index";
				}
			}
		}
		User user = new User();
		if(!(firstname == ""||firstname == null)){
			user.setFirstName(firstname);
		}
		if(!(lastname == ""||lastname == null)){
			user.setLastName(lastname);
		}
		if(!(password == ""||password == null)){
			user.setPassword(password);
		}
		if(!(email == ""||email == null)){
			user.setEmail(email);
			user.setRegisterName(email);
		}
		user.setAddress(address);
		user.setPhone(phone);

		if(!(dateOfBirth == ""||dateOfBirth == null)){
			Date date = Date.valueOf(dateOfBirth);
			user.setDateOfBirth(date);
		}
		try{
			userRepository.save(user);
		}
		catch(Exception e){
			return "403";
		}
		String messeage = "Creat account successful!";
		model.addAttribute("messeage", messeage);
		return "login";
	}
}
