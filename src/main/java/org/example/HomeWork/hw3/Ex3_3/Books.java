package org.example.HomeWork.hw3.Ex3_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Books {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;
}
