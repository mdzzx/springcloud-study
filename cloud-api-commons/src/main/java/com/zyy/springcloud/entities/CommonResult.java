package com.zyy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  通用返回类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    // 返回码
    private Integer code;

    // 返回消息
    private String message;

    // 返回数据
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

}
