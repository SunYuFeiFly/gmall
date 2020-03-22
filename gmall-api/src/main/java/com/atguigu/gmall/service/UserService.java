package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    //查询所有用户
    List<UmsMember> getAllUser();

    //根据用户id查询用户收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
