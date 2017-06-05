package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ApplicantMapper;
import model.Applicant;

@Service
public class ApplicantService {
   private ApplicantMapper applicantMapper;

public ApplicantMapper getApplicantMapper() {
	return applicantMapper;
}
@Autowired
public void setApplicantMapper(ApplicantMapper applicantMapper) {
	this.applicantMapper = applicantMapper;
}  
public Applicant getApplicantById(String id) {
	applicantMapper.selectByPrimaryKey(id);
	return applicantMapper.selectByPrimaryKey(id);
	
}
public List<Applicant> getApplicant(String field,String value) {
	return applicantMapper.selectbyfield(field, value);
}
}
