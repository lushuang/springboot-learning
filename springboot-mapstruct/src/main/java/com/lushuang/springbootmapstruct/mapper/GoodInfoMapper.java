package com.lushuang.springbootmapstruct.mapper;

import com.lushuang.springbootmapstruct.dto.GoodInfoDTO;
import com.lushuang.springbootmapstruct.entity.GoodInfoBean;
import com.lushuang.springbootmapstruct.entity.GoodTypeBean;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
//@Mapper
public interface GoodInfoMapper {
    //public static GoodInfoMapper MAPPER = Mappers.getMapper(GoodInfoMapper.class);

    @Mappings({
            @Mapping(source = "type.name", target = "typeName"),
            @Mapping(source = "good.id", target = "goodId"),
            @Mapping(source = "good.title", target = "goodName"),
            @Mapping(source = "good.price", target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);
}