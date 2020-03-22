package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {

    /**
     * 获取销售属性值
     */
    List<PmsBaseSaleAttr> baseSaleAttrList();

    /**
     * 根据三级分类id获取详细商品信息
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);


    /**
     * 添加/修改三级分类下属性及属性值（多）
     * @param pmsBaseAttrInfo
     * @return
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 获取平台属性值
     */
    List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
