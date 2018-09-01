package com.cg.capstore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore.beans.FeedbackProductBean;


@Controller
public class JSPController {
	
	
	@RequestMapping(value = "/addfeebackPage")
	public String feedback() {
		/*RestTemplate restTemplate = new RestTemplate();
	List<FeedbackProductBean> feedback = restTemplate.getForObject("http://localhost:9010/addingfeedack", List.class);
	model.put("feedback", feedback);*/
	return "addfeedback";
	}

}
