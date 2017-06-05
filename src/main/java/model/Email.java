package model;

import java.util.Date;

public class Email {
    private String templateId;

    private String templateTag;

    private String templateName;

    private String funId;

    private String isDefault;

    private String isAttach;

    private String funName;

    private String addUserid;

    private Date addDate;

    private String modifyUserid;

    private Date modifyDate;

    private String templateCont;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public String getTemplateTag() {
        return templateTag;
    }

    public void setTemplateTag(String templateTag) {
        this.templateTag = templateTag == null ? null : templateTag.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId == null ? null : funId.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getIsAttach() {
        return isAttach;
    }

    public void setIsAttach(String isAttach) {
        this.isAttach = isAttach == null ? null : isAttach.trim();
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName == null ? null : funName.trim();
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

    public String getTemplateCont() {
        return templateCont;
    }

    public void setTemplateCont(String templateCont) {
        this.templateCont = templateCont == null ? null : templateCont.trim();
    }
}