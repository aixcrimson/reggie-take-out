package com.crimson.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crimson.reggie.dto.SetmealDto;
import com.crimson.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐以及套餐关联的菜品信息
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 根据id查询查询套餐信息和对应的菜品信息
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);

    /**
     * 修改套餐信息以及与菜品的关联信息
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);
}
