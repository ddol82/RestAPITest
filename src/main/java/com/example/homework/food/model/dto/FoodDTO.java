package com.example.homework.food.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FoodDTO {
    private int id;
    private String foodCd;
    private String groupName;
    private String foodName;
    private int researchYear;
    private String makerName;
    private String refName;
    private String servingSize;
    private String calorie;
    private String carbohydrate;
    private String protein;
    private String province;
    private String sugars;
    private String salt;
    private String Cholesterol;
    private String saturatedFattyAcids;
    private String transFat;
}
