package com.ruoyi.crm.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户信息对象 crm_customer
 *
 * @author ruoyi
 * @date 2020-06-28
 */
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String username;

    /**
     * 手机
     */
    @Excel(name = "手机")
    private String phone;

    /**
     * 公司
     */
    @Excel(name = "公司")
    private String company;

    /**
     * 岗位
     */
    @Excel(name = "岗位")
    private String position;

    /**
     * 邮箱
     */
    @Excel(name = "邮箱")
    private String email;

    /**
     * 申请时间
     */
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyTime;

    /**
     * 申请状态:1-待沟通，2-试用中，3-试用结束，4-已签单
     */
    @Excel(name = "申请状态:1-待沟通，2-试用中，3-试用结束，4-已签单")
    private Integer applyStatus;

    /**
     * 关心的问题
     */
    @Excel(name = "关心的问题")
    private String attention;

    /**
     * 来源
     */
    @Excel(name = "来源")
    private String source;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getAttention() {
        return attention;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("username", getUsername())
                .append("phone", getPhone())
                .append("company", getCompany())
                .append("position", getPosition())
                .append("email", getEmail())
                .append("applyTime", getApplyTime())
                .append("applyStatus", getApplyStatus())
                .append("attention", getAttention())
                .append("source", getSource())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
