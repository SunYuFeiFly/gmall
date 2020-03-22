package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductSaleAttr;
import com.atguigu.gmall.bean.PmsSkuInfo;

import java.util.List;

public interface SkuService {

    //保存Sku信息
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    //查询详情页信息及页面图片集合
    PmsSkuInfo getSkuById(String skuId);

    //根据productId查询兄弟skuinfo集合
    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId);
}
