package com.vinay.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinay.services.IStudentService;

@Controller("/StudentCRUDApp")
public class HomeController {
	@Autowired
	IStudentService service;
	
	@RequestMapping({"/","/home"})
	public String showHome(Model model) {
		List<Student> list=service.getAllStudent();
		model.addAttribute("list", list);
		return "Home";
	}
	@RequestMapping("/toRegisterView")
	public String showRegisterView(Model model) {
		model.addAttribute("sbean", new Student());
		model.addAttribute("action", "toSuccessView");
		model.addAttribute("sub", "Register");
		return "Register";
	}
	@RequestMapping("/toSuccessView")
	public String showSuccessView(@ModelAttribute("sbean") @Valid Student sbean, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("action", "toSuccessView");
			model.addAttribute("sub", "Register");
			return "Register";
		}
		else {
			String msg=service.saveStudent(sbean);
			model.addAttribute("msg", msg);
			return "Success";
		}
	}
	@RequestMapping("/toUpdateSuccess")
	public String showUpdateSuccess(Long id,Model model) {
		Student student=service.getStudent(id);
		model.addAttribute("sbean", student);
		model.addAttribute("action", "toUpdateSuccessView");
		model.addAttribute("sub", "Update");
		return "Register";
	}
	@RequestMapping("/toUpdateSuccessView")
	public String showUpdateSuccessView(@ModelAttribute("sbean") @Valid Student sbean,Long id, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("action", "toUpdateSuccessView");
			model.addAttribute("sub", "Update");
			return "Register";
		}
		else {
			String msg=service.update(sbean, id);
			model.addAttribute("msg", msg);
			return "Success";
		}
	}
	@RequestMapping("/toDeleteSuccess")
	public String showDeleteSuccess(Long id,Model model) {
		String msg=service.delete(id);
		model.addAttribute("msg", msg);
		return "Success";
	}
	
}
