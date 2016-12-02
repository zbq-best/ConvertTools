package com.ikyxxs.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum OperEnum {

    ENCODE(1, "编码"),
    DECODE(2, "解码"),
    ;

    private Integer code;
    private String desc;

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
