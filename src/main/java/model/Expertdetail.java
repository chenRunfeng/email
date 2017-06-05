package model;

import java.util.Date;

public class Expertdetail {
    private String expertdetailId;

    private String ename;

    private String jobnumber;

    private String eemail;

    private String addUserid;

    private Date addDate;

    private String modifyUserid;

    private Date modifyDate;

    private String expertinfoId;

    public String getExpertdetailId() {
        return expertdetailId;
    }

    public void setExpertdetailId(String expertdetailId) {
        this.expertdetailId = expertdetailId == null ? null : expertdetailId.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber == null ? null : jobnumber.trim();
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail == null ? null : eemail.trim();
    }

    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid == null ? null : addUserid.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getModifyUserid() {
        return modifyUserid;
    }

    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid == null ? null : modifyUserid.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getExpertinfoId() {
        return expertinfoId;
    }

    public void setExpertinfoId(String expertinfoId) {
        this.expertinfoId = expertinfoId == null ? null : expertinfoId.trim();
    }
}