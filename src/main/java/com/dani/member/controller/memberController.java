package com.dani.member.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : DaEunKim
 * @version : 2020/11/30
 * @fileName : com.dani.member.controller
 * @description :
 */

@Slf4j
@RestController
@RequestMapping("/")

public class memberController {

	@GetMapping("/")
	public ModelAndView selectAll() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		Map<String, Object> map = new HashMap<>();
		map.put("name", "my name is dani");
		map.put("date", LocalDateTime.now());
		modelAndView.addObject("data", map);
		return modelAndView;
	}

}
