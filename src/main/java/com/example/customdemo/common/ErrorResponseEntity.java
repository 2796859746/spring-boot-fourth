package com.example.customdemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseEntity {
    private int code;
    private String message;
}