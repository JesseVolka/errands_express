package com.jessevolka.mapper;

import com.jessevolka.model.Express;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ExpressMapper {
    public Express getExpressByPickUpCode(String pickUpCode);
}
