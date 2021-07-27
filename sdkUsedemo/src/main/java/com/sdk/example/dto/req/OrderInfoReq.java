package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OrderInfoReq {
    @ApiModelProperty(value = "订单号【长度20到50】", required = true)
    private String orderCode;
}
