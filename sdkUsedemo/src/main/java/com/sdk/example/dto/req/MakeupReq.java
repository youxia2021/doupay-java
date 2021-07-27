package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MakeupReq {
    @ApiModelProperty(value = "订单编号【长度10到50】", required = true)
    private String orderCode;
}
