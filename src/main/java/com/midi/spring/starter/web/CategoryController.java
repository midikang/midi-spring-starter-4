package com.midi.spring.starter.web;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.midi.spring.starter.model.Category;
import com.midi.spring.starter.service.StarterService;

/**
 * NOTE: Session attributes as indicated using this annotation correspond to 
 * a specific handler's model attributes, getting transparently stored in 
 * a conversational session. Those attributes will be removed once 
 * the handler indicates completion of its conversational session. 
 * 
 * BindingResult extends Errors
 * */
@Controller
@SessionAttributes(types=Category.class)
public class CategoryController {

	private final StarterService starterService;
	
	@Autowired
	public CategoryController(StarterService starterService) {
		this.starterService = starterService;
	}
	
	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}

	@RequestMapping(value="categories/new", method=RequestMethod.GET)
	public String initCreateForm(Map<String, Object> model) {
		Category category = new Category();
		model.put("category", category);
		return "categories/createOrUpdateCategoryForm";
	}
	
	@RequestMapping(value="categories/new", method=RequestMethod.POST)
	public String processCreateForm(@Valid Category category, BindingResult result, SessionStatus status) {
		if (result.hasErrors()) {
			return "categories/createOrUpdateCategoryForm";
		} else {
			starterService.saveCategory(category);
			status.setComplete();
			return "redirect:/categories/" + category.getId();
		}
	}
	
	@RequestMapping("/categories/{categoryId}")
	public ModelAndView displayCategory(@PathVariable("categoryId") int categoryId) {
		ModelAndView mav = new ModelAndView("categories/categoryDetails");
		mav.addObject(this.starterService.findCategoryById(categoryId));
		return mav;
	}
}
