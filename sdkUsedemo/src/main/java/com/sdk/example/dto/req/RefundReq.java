package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.enums.RefundType;

@Data
public class RefundReq {
    @ApiModelProperty(value = "订单编号【长度5到50】", required = true)
    private String orderCode;
    @ApiModelProperty(value = "退款类型", required = true)
    private RefundType refundType;
    @ApiModelProperty(value = "退款地址【长度5到50】", required = true)
    private String address;
    @ApiModelProperty(value = "退款数量【长度1到50】", required = true)
    private String amount;
    @ApiModelProperty(value = "备注【长度5到50】", required = true)
    private String remark;
}
