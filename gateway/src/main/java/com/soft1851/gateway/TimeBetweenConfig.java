package com.soft1851.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@Data
public class TimeBetweenConfig {
    private LocalTime start;
    private LocalTime end;
}