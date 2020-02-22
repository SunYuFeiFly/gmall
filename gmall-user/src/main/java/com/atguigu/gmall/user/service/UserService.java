package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    //查询所有用户
    List<UmsMember> getAllUser();

    //根据用户id查询用户收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
