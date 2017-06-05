package dao;

import java.util.List;

import model.Applicant;

public interface ApplicantMapper {
    int deleteByPrimaryKey(String applyId);

    int insert(Applicant record);

    int insertSelective(Applicant record);

    Applicant selectByPrimaryKey(String applyId);
    List<Applicant> selectbyfield(String field,String value);

    int updateByPrimaryKeySelective(Applicant record);

    int updateByPrimaryKey(Applicant record);
}