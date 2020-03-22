package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductImage;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.bean.PmsProductSaleAttr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpuService {

    //根据三级属性id获取sku集合
    List<PmsProductInfo> spuList(String catalog3Id);

    //保存spu
    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    //根据spuId（商品id）查询销售属性及属性集合
    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    //根据spuId（商品id）查询相关spu图片合集（以便选取作为专属sku图片）
    List<PmsProductImage> spuImageList(String spuId);

    //获取sku销售属性集合
//    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId);
    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId,String skuId);

}
