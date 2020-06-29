package com.ruoyi.rest.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liguoqing
 */
@Data
public class CustomerResp implements Serializable {

    @ApiModelProperty(value = "手机")
    private String phone;
    @ApiModelProperty(value = "公司")
    private String company;
    @ApiModelProperty(value = "岗位")
    private String position;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "申请时间")
    private Date applyTime;
    @ApiModelProperty(value = "申请状态:1-待沟通，2-试用中，3-试用结束，4-已签单")
    private Integer applyStatus;
    @ApiModelProperty(value = "关心的问题")
    private String attention;
    @ApiModelProperty(value = "来源")
    private String source;

}
