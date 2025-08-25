package com.example.coffehub.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto <myType>  {
    private String message;
    private Integer status;
    private myType data;
}
