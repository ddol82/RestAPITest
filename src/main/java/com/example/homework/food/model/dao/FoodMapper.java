package com.example.homework.food.model.dao;

import com.example.homework.food.model.dto.FoodDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FoodMapper {
    List<FoodDTO> getFoodList(Map<String, String> param);
}
