package com.cg.capstore.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore.beans.FeedbackProductBean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

	
	@RequestMapping(value = "/addingFeedback", method = RequestMethod.POST)
	public List<FeedbackProductBean> addingFeedback(Model model,String productId, FeedbackProductBean feedbackProductBean)
			 {
		
		model.addAttribute("feedback", feedbackProductBean);
		//model.addAttribute("product", productId);
		System.out.println("feedback"+feedbackProductBean);
		System.out.println("productid"+productId);
		RestTemplate restTemplate = new RestTemplate();
		List<FeedbackProductBean>feedback = restTemplate.postForObject("http://localhost:9010/addingFeedback?productId="+productId,feedbackProductBean, List.class);
		System.out.println("feedback result"+feedback);
		
		return feedback;
	}
	
	
	
}
