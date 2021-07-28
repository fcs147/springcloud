package com.fz.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:
 * @date: 2021/7/8 10:19
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

    private Long id ;
    private String serial;

}
