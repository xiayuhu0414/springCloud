package com.xyh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xyh
 * @date 2021/11/16 18:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    private Long id;
    private String serial;
}
