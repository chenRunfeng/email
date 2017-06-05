package model;

import java.math.BigDecimal;
import java.util.Date;

public class Applicant {
    private String applyId;

    private String pName;

    private String pSex;

    private BigDecimal pAge;

    private String pBlood;

    private BigDecimal pNum;

    private String pKeshi;

    private String pAllergy;

    private String pArea;

    private String pIllness;

    private String pAppendix;

    private String applicant;

    private String aKeshi;

    private Date aTime;

    private String aDoctor;

    private String aDetail;

    private String addUserid;

    private Date addDate;

    private String modifyUserid;

    private Date modifyDate;

    private BigDecimal aType;

    private String aType2;

    private String aStatus;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public BigDecimal getpAge() {
        return pAge;
    }

    public void setpAge(BigDecimal pAge) {
        this.pAge = pAge;
    }

    public String getpBlood() {
        return pBlood;
    }

    public void setpBlood(String pBlood) {
        this.pBlood = pBlood == null ? null : pBlood.trim();
    }

    public BigDecimal getpNum() {
        return pNum;
    }

    public void setpNum(BigDecimal pNum) {
        this.pNum = pNum;
    }

    public String getpKeshi() {
        return pKeshi;
    }

    public void setpKeshi(String pKeshi) {
        this.pKeshi = pKeshi == null ? null : pKeshi.trim();
    }

    public String getpAllergy() {
        return pAllergy;
    }

    public void setpAllergy(String pAllergy) {
        this.pAllergy = pAllergy == null ? null : pAllergy.trim();
    }

    public String getpArea() {
        return pArea;
    }

    public void setpArea(String pArea) {
        this.pArea = pArea == null ? null : pArea.trim();
    }

    public String getpIllness() {
        return pIllness;
    }

    public void setpIllness(String pIllness) {
        this.pIllness = pIllness == null ? null : pIllness.trim();
    }

    public String getpAppendix() {
        return pAppendix;
    }

    public void setpAppendix(String pAppendix) {
        this.pAppendix = pAppendix == null ? null : pAppendix.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getaKeshi() {
        return aKeshi;
    }

    public void setaKeshi(String aKeshi) {
        this.aKeshi = aKeshi == null ? null : aKeshi.trim();
    }

    public Date getaTime() {
        return aTime;
    }

    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    public String getaDoctor() {
        return aDoctor;
    }

    public void setaDoctor(String aDoctor) {
        this.aDoctor = aDoctor == null ? null : aDoctor.trim();
    }

    public String getaDetail() {
        return aDetail;
    }

    public void setaDetail(String aDetail) {
        this.aDetail = aDetail == null ? null : aDetail.trim();
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

    public BigDecimal getaType() {
        return aType;
    }

    public void setaType(BigDecimal aType) {
        this.aType = aType;
    }

    public String getaType2() {
        return aType2;
    }

    public void setaType2(String aType2) {
        this.aType2 = aType2 == null ? null : aType2.trim();
    }

    public String getaStatus() {
        return aStatus;
    }

    public void setaStatus(String aStatus) {
        this.aStatus = aStatus == null ? null : aStatus.trim();
    }
}