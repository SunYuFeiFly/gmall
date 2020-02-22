package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    /**
     * 查询所有用户
     */
    @Override
    public List<UmsMember> getAllUser() {
        //老式方法
//        List<UmsMember> umsMemberList = userMapper.selectAllUser();

        //通用mapper方法
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;

    }


    /**
     * 根据用户id查询用户收货地址
     * @param memberId
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //方法一
//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId", memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        //方法二
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses01 = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses01;
    }
}
