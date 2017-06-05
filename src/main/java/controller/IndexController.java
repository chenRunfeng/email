package controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Applicant;
import service.ApplicantService;
import sun.util.logging.resources.logging;

@Controller
public class IndexController {
//  @RequestMapping("/")
//  public String index(Model model ){
//	  ApplicantService applicantService=new ApplicantService();
//	  List<Applicant> aList=applicantService.getApplicant("a_status", "3");
//	  model.addAttribute("alist",aList);
//	  return "index";
//  }
  @RequestMapping("/")
  public String index(Model model ){
	  ApplicantService applicantService=new ApplicantService();
	  try {
		  Applicant aList=applicantService.getApplicantById("zh104151");
		  model.addAttribute("alist",aList);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  return "index";
  }
}
