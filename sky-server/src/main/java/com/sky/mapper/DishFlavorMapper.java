package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param dishFlavors
     */
    void inserBatch(List<DishFlavor> dishFlavors);

    /**
     * 根据菜品id删除对应的口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);

    /**
     * 根据菜品id查询口味数据
     * @param id
     * @return
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long id);
}
