package com.crimson.reggie.dto;

import com.crimson.reggie.entity.Setmeal;
import com.crimson.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
