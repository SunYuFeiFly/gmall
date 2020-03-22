package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.PmsSkuInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsSkuInfoMapper extends Mapper<PmsSkuInfo> {

    //根据productId查询兄弟skuinfo集合
    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(@Param("productId") String productId);

}
