package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    //获取去一级目录
    List<PmsBaseCatalog1> getCatalog1();

    //根据一级目录id获取去二级目录
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    //根据二级目录id获取去三级目录
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
