package com.ruoyi.rest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.crm.domain.Customer;
import com.ruoyi.crm.service.ICustomerService;
import com.ruoyi.rest.request.CustomerReq;
import com.ruoyi.rest.request.CustomerSearchReq;
import com.ruoyi.rest.response.CustomerResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author liguoqing
 */
@Api(tags = "客户管理")
@RestController
@RequestMapping("/api/customer")
public class CustomerApiController {

    @Resource
    private ICustomerService customerService;

    @ApiOperation("保存客户信息")
    @PostMapping("/save")
    public AjaxResult saveCustomer(@Validated @RequestBody CustomerReq customerReq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            Set<String> errors = objectErrors.stream().map(ObjectError::getDefaultMessage).collect(Collectors.toSet());
            return AjaxResult.error(errors.toString());
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerReq, customer);
        Date now = new Date();
        customer.setCreateTime(now);
        customer.setApplyTime(now);
        customer.setApplyStatus(1);
        customerService.insertCustomer(customer);
        return AjaxResult.success();
    }

    @ApiOperation("查询客户信息")
    @GetMapping("/listAll")
    public AjaxResult listCustomer() {
        List<CustomerResp> customerResps = Lists.newArrayList();
        List<Customer> customers = customerService.selectCustomerList(null);
        if (!CollectionUtils.isEmpty(customers)) {
            for (Customer customer : customers) {
                CustomerResp customerResp = new CustomerResp();
                BeanUtils.copyProperties(customer, customerResp);
                customerResps.add(customerResp);
            }
        }
        return AjaxResult.success(customerResps);
    }

    @ApiOperation("查询客户信息")
    @PostMapping("/list")
    public AjaxResult list(@RequestBody CustomerSearchReq req) {
        List<CustomerResp> customerResps = Lists.newArrayList();
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        Customer condition = new Customer();
        condition.setUsername(req.getUsername());
        List<Customer> customers = customerService.selectCustomerList(condition);
        if (!CollectionUtils.isEmpty(customers)) {
            for (Customer customer : customers) {
                CustomerResp customerResp = new CustomerResp();
                BeanUtils.copyProperties(customer, customerResp);
                customerResps.add(customerResp);
            }
        }
        PageInfo pageInfo = new PageInfo(customerResps);
        return AjaxResult.success(pageInfo);
    }



}
