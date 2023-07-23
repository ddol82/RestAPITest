package com.example.homework.food.controller;

import com.example.homework.common.model.dto.ResponseDTO;
import com.example.homework.food.model.dto.FoodDTO;
import com.example.homework.food.model.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/food")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/lists")
    public ResponseEntity<ResponseDTO> getFoodList(
            @RequestParam(value = "name", required = false) String foodName,
            @RequestParam(value = "year", required = false) String year,
            @RequestParam(value = "maker", required = false) String maker,
            @RequestParam(value = "code", required = false) String foodCode
    ) {
        log.info("[FoodController] getFoodList() 호출");
        log.info("[FoodController] getFoodList() - foodName : " + foodName);
        log.info("[FoodController] getFoodList() - year : " + year);
        log.info("[FoodController] getFoodList() - maker : " + maker);
        log.info("[FoodController] getFoodList() - foodCode : " + foodCode);
        Map<String, String> param = new HashMap<>();
        param.put("foodName", foodName);
        param.put("year", year);
        param.put("maker", maker);
        param.put("foodCode", foodCode);

        List<FoodDTO> foodList = foodService.getFoodList(param);
        String outputMessage = "foodList 목록 " + foodList.size() + "개 조회 완료";

        log.info("[FoodController] getFoodList() 종료");
        if(foodList.size() == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(
                new ResponseDTO(HttpStatus.OK, outputMessage, foodList)
        );
    }
}
