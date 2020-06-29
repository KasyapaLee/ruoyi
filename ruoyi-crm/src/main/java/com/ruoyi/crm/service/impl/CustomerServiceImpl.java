package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.CustomerMapper;
import com.ruoyi.crm.domain.Customer;
import com.ruoyi.crm.service.ICustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息Service业务层处理
 *
 * @author ruoyi
 * @date 2020-06-28
 */
@Service
public class CustomerServiceImpl implements ICustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询客户信息
     *
     * @param id 客户信息ID
     * @return 客户信息
     */
    @Override
    public Customer selectCustomerById(Long id) {
        return customerMapper.selectCustomerById(id);
    }

    /**
     * 查询客户信息列表
     *
     * @param customer 客户信息
     * @return 客户信息
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer) {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增客户信息
     *
     * @param customer 客户信息
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer) {
        customer.setCreateTime(DateUtils.getNowDate());
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改客户信息
     *
     * @param customer 客户信息
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer) {
        customer.setUpdateTime(DateUtils.getNowDate());
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 删除客户信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerByIds(String ids) {
        return customerMapper.deleteCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息信息
     *
     * @param id 客户信息ID
     * @return 结果
     */
    @Override
    public int deleteCustomerById(Long id) {
        return customerMapper.deleteCustomerById(id);
    }
}
