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
@ApiModel(value = "客户查询请求对象")
public class CustomerSearchReq implements Serializable {

    @ApiModelProperty(value = "姓名")
    private String username;

    private Integer pageNum = 1;
    private Integer pageSize = 10;



}
