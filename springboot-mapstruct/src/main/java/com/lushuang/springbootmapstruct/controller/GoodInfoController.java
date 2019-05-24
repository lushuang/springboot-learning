package com.lushuang.springbootmapstruct.controller;

import com.lushuang.springbootmapstruct.dao.GoodInfoJPA;
import com.lushuang.springbootmapstruct.dao.GoodTypeJPA;
import com.lushuang.springbootmapstruct.dto.GoodInfoDTO;
import com.lushuang.springbootmapstruct.entity.GoodInfoBean;
import com.lushuang.springbootmapstruct.entity.GoodTypeBean;
import com.lushuang.springbootmapstruct.mapper.GoodInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodInfoController {
    /**
     * 注入商品基本信息jpa
     */
    @Autowired
    private GoodInfoJPA goodInfoJPA;
    /**
     * 注入商品类型jpa
     */
    @Autowired
    private GoodTypeJPA goodTypeJPA;
    /**
     * 注入mapStruct转换Mapper
     */
    @Autowired
    private GoodInfoMapper goodInfoMapper;

    /**
     * 查询商品详情
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDTO detail(@PathVariable("id") Long id) {
        //查询商品基本信息
        GoodInfoBean goodInfoBean = goodInfoJPA.findOne(id);
        //查询商品类型基本信息
        GoodTypeBean typeBean = goodTypeJPA.findOne(goodInfoBean.getTypeId());
        //返回转换dto
        return goodInfoMapper.from(goodInfoBean, typeBean);
    }
}
