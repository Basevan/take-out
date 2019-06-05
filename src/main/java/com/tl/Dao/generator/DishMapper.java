package com.tl.dao.generator;

import com.tl.model.Dish;
import com.tl.model.DishCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishMapper {
    long countByExample(DishCriteria example);

    int deleteByExample(DishCriteria example);

    int deleteByPrimaryKey(Integer dishId);

    int insert(Dish record);

    int insertSelective(Dish record);

    List<Dish> selectByExample(DishCriteria example);

    Dish selectByPrimaryKey(Integer dishId);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishCriteria example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishCriteria example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
}