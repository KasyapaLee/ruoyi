package com.ruoyi.rest.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author liguoqing
 */
@Data
@ApiModel(value = "客户信息")
public class CustomerReq implements Serializable {

    @ApiModelProperty(value = "姓名", required = true)
    @NotBlank(message = "姓名不能为空")
    private String username;

    @ApiModelProperty(value = "手机号", required = true)
    @NotBlank(message = "手机号不能为空")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "公司名称")
    private String company;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "关注的问题")
    private String attention;

    @ApiModelProperty(value = "来源")
    private String source;

}
