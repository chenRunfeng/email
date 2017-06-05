package dao;

import model.Expertdetail;

public interface ExpertdetailMapper {
    int deleteByPrimaryKey(String expertdetailId);

    int insert(Expertdetail record);

    int insertSelective(Expertdetail record);

    Expertdetail selectByPrimaryKey(String expertdetailId);

    int updateByPrimaryKeySelective(Expertdetail record);

    int updateByPrimaryKey(Expertdetail record);
}