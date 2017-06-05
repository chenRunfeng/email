package dao;

import model.Email;

public interface EmailMapper {
    int deleteByPrimaryKey(String templateId);

    int insert(Email record);

    int insertSelective(Email record);

    Email selectByPrimaryKey(String templateId);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKeyWithBLOBs(Email record);

    int updateByPrimaryKey(Email record);
}