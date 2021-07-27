package com.sdk.example.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import me.doupay.sdk.bean.CoinNameEnum;
import me.doupay.sdk.bean.CurrencyCodeEnum;
import me.doupay.sdk.bean.OrderTypeCodeEnum;

@Data
public class OrderReq {
    @ApiModelProperty(value = "订单号【长度10到30】")
    private String orderNo;
    @ApiModelProperty(value = "商品标题【长度5~20】")
    private String subject;
    @ApiModelProperty(value = "商品描述信息【长度10到100】")
    private String body;
    @ApiModelProperty(value = "附加说明【长度10到50】")
    private String description;
    @ApiModelProperty(value = "订单类型", required = true)
    private OrderTypeCodeEnum orderType;
    @ApiModelProperty(value = "法币(法币购买时需要)【长度3到4】")
    private CurrencyCodeEnum currency;
    @ApiModelProperty(value = "金额(法币购买时需要)")
    private String money;
    @ApiModelProperty(value = "币种(数量购买时需要)【长度3到4】")
    private CoinNameEnum coinName;
    @ApiModelProperty(value = "数量(数量购买时需要)")
    private String amount;
    @ApiModelProperty(value = "商家用户【长度10到20之间】")
    private String merchantUser;
}
