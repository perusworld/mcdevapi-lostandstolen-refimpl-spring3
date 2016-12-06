package com.yosanai.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yosanai.web.model.Hello;

@Controller
public class HelloController {

	@RequestMapping(value = "/")
	public ModelAndView home(Locale locale, Model model) {
		return new ModelAndView("index.html");
	}

	@RequestMapping(value = "/orders", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Hello orders(@RequestBody Hello msg) {
		Hello ret = new Hello();
		return ret;
	}

	@RequestMapping(value = "/confirm", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Hello confirm(@RequestBody Hello msg) {
		Hello ret = new Hello();
		return ret;
	}
}
