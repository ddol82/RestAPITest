package com.example.homework.food.model.service;

import com.example.homework.food.model.dao.FoodMapper;
import com.example.homework.food.model.dto.FoodDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodMapper foodMapper;
    public List<FoodDTO> getFoodList(Map<String, String> param) {
        log.info("[FoodService] getFoodList() 호출");

        List<FoodDTO> foodList = foodMapper.getFoodList(param);
        log.debug("[FoodService] getFoodList() - 조회 결과 : " + foodList.size() + "건");

        log.info("[FoodService] getFoodList() 종료");
        return foodList;
    }
}
