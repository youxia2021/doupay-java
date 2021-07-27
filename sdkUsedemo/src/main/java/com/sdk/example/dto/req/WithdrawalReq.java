package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.bean.CoinNameEnum;
import me.doupay.sdk.bean.CurrencyCodeEnum;
import me.doupay.sdk.bean.OrderTypeCodeEnum;

@Data
public class WithdrawalReq {
    @ApiModelProperty(value = "订单号【长度10到30】", required = true)
    private String orderNo;
    @ApiModelProperty(value = "币种", required = true)
    private CoinNameEnum coinName;
    @ApiModelProperty(value = "地址", required = true)
    private String address;
    @ApiModelProperty(value = "数量【最小0.000001】", required = true)
    private String amount;
    @ApiModelProperty(value = "商家用户【长度10到20之间】", required = true)
    private String merchantUser;
    @ApiModelProperty(value = "订单类型", required = true)
    private OrderTypeCodeEnum orderType;
    @ApiModelProperty(value = "法币(法币购买时需要)【长度3到4】")
    private CurrencyCodeEnum currency;
    @ApiModelProperty(value = "金额(法币购买时需要)")
    private String money;
}
