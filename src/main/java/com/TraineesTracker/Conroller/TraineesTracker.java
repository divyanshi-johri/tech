package com.TraineesTracker.Conroller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.TraineesTracker.Entities.TraineesDetails;
import com.TraineesTracker.Repository.TraineesDetailsRepository;

@Controller
public class TraineesTracker {

	@Autowired
	TraineesDetailsRepository tRepo;

	@GetMapping("/")
	public String getHomePage() {
		return "traineesTracker";
	}

	@GetMapping("/createTrainee")
	public String getAddTraineeForm() {
		return "addTrainee";
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "login";
	}

	@PostMapping(value = "/addTrainee")
	public ModelAndView addTraineeDetails(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("traineeDetails") TraineesDetails tr) throws NoSuchAlgorithmException {

		ModelAndView mav = new ModelAndView();
		String msg = "";

		/*
		 * System.out.println(tr.getId()); if (tRepo.existsById(tr.getId())) { msg =
		 * "Project alredy exist!"; mav.setViewName("addProject"); } else {
		 */

		tr.setEmail(tr.getTraineeId() + "@cognizant.com");
		tr.setPassword("welcome01");
		if (tRepo.save(tr) != null) {
			msg = "Trainee details added successfully!";
			mav.setViewName("addTrainee");
		} else {
			mav.addObject("error", "Failed to add the trainee details!!");
			mav.setViewName("addTrainee");
		}

		mav.addObject("msg", msg);
		return mav;

	}
}
