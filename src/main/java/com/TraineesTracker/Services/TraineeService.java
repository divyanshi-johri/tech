package com.TraineesTracker.Services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//Have mapping to add Project page and insert project to the database

@Service
public class TraineeService {

// This repository include managerDetails model

	/*
	 * @PostMapping(value = "/updateProject") public ModelAndView
	 * updateProject(HttpServletRequest request, HttpServletResponse response,
	 * 
	 * @ModelAttribute("project") Project pr) throws NoSuchAlgorithmException {
	 * 
	 * List<ManagerDetails> managerList = (List<ManagerDetails>) mRepo.findAll();
	 * 
	 * ModelAndView mav = new ModelAndView("addProject");
	 * 
	 * List<Project> prList = (List<Project>) pRepo.findAll();
	 * 
	 * mav.addObject("projectList", prList);
	 * 
	 * mav.addObject("managerList", managerList);
	 * 
	 * Project p = pRepo.findByProjectId(pr.getProjectId());
	 * 
	 * p.setProjectName(pr.getProjectName());
	 * p.setProjectStartDate(pr.getProjectStartDate());
	 * p.setProjectEndDate(pr.getProjectEndDate());
	 * p.setManagerID(pr.getManagerID());
	 * 
	 * pRepo.save(p);
	 * 
	 * String msg = "Details updated for " + pr.getProjectId() + "-" +
	 * pr.getProjectName();
	 * 
	 * mav.addObject("msg", msg);
	 * 
	 * return mav;
	 * 
	 * }
	 */
}