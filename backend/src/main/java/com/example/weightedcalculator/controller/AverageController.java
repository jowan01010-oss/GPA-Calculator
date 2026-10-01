/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.weightedcalculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.weightedcalculator.model.AverageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class AverageController {
    
    @PostMapping("/api/calculate")
    public double calculate(@RequestBody AverageRequest request) {

    int[] grades = request.getTotalGrade();
    int[] hours = request.getHours();

    double total = 0;
    int totalHours = 0;

    for (int i = 0; i < grades.length; i++) {
        total += grades[i] * hours[i];
        totalHours += hours[i];
    }

    return total / totalHours;
    }
    
}
