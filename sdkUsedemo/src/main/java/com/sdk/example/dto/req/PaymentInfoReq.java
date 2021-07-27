package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.bean.CoinNameEnum;

@Data
public class PaymentInfoReq {
    @ApiModelProperty(value = "订单号【长度10到30】", required = true)
    private String orderCode;
    @ApiModelProperty(value = "币种名称", required = true)
    private CoinNameEnum coinName;
    @ApiModelProperty(value = "链币种代码【长度4】")
    private String chainCoinCode;
}
