package com.sdk.example.controller;


import com.sdk.example.common.DouPayResp;
import com.sdk.example.dto.req.*;
import com.sdk.example.utils.OrderCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.doupay.sdk.PaymentInfo;
import me.doupay.sdk.bean.*;
import me.doupay.sdk.interfaceCallback.CallBackListener;
import me.doupay.sdk.net.BaseVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "用户模块", tags = "用户模块")
@RequestMapping("/user")
public class TestController {

    @ApiOperation(value = "回调", notes = "回调")
    @RequestMapping(value = "/payCallBack", method = RequestMethod.POST)
    public Map<String, Object> payCallBack(HttpServletRequest request) {

        InitTools.init();

        String headString = request.getHeader("X-Merchant-sign");
        String bodyString = HttpContextUtils.getBodyString(request);
        System.out.println("headString=" + headString);
        System.out.println("bodyString=" + bodyString);

        PaymentInfo.verifySignAndGetResult(headString, bodyString, new CallBackListener<PaymentCallBackResponse>() {
            @Override
            public void onFinish(PaymentCallBackResponse paymentCallBackResponse) {
                System.out.println("充值回调:" + paymentCallBackResponse.toString());
            }

            @Override
            public void onError(int i, String s) {
                System.out.println("充值回调报错:" + "i = " + i + ",s = " + s);

            }
        }, new CallBackListener<UserWithdrawCallBackResponse>() {
            @Override
            public void onFinish(UserWithdrawCallBackResponse userWithdrawCallBackResponse) {
                System.out.println("提币回调:" + userWithdrawCallBackResponse.toString());
            }

            @Override
            public void onError(int i, String s) {
                System.out.println("提币回调报错:" + "i = " + i + ",s = " + s);
            }
        }, new CallBackListener<MakeUpCallBackResponse>() {
            @Override
            public void onFinish(MakeUpCallBackResponse makeUpCallBackResponse) {
                System.out.println("补单回调:" + makeUpCallBackResponse.toString());
            }

            @Override
            public void onError(int i, String s) {
                System.out.println("补单回调报错:" + "i = " + i + ",s = " + s);
            }
        });

        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", "success");
        return map;
    }

    @ApiOperation(value = "获取币种列表", notes = "获取币种列表")
    @RequestMapping(value = "/getCoinList", method = RequestMethod.POST)
    public DouPayResp<CoinResponseData> getCoinList(HttpServletRequest request) {
        InitTools.init();
        BaseVo<CoinResponseData> baseVo = PaymentInfo.getCoinList();
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }

    }

    @ApiOperation(value = "获取法币列表", notes = "获取法币列表")
    @RequestMapping(value = "/getCurrencyList", method = RequestMethod.POST)
    public DouPayResp<CurrencyResponseData> getCurrencyList(HttpServletRequest request) {
        InitTools.init();
        BaseVo<CurrencyResponseData> baseVo = PaymentInfo.getCurrencyList();
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }

    }

    @ApiOperation(value = "下单", notes = "下单")
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public DouPayResp<PayResponseData> pay(@RequestBody @Valid OrderReq orderReq) {
        InitTools.init();
        String orderNo = OrderCodeUtil.getOrderCode("NO");
        String subject = "demo测试";
        String body = orderNo;
        String description = orderNo;
        BaseVo<PayResponseData> baseVo = PaymentInfo.pay(orderReq.getMoney(), orderReq.getAmount(),
                orderReq.getCoinName(), orderReq.getCurrency(), orderReq.getMerchantUser(),
                orderNo, subject, body, description,
                orderReq.getOrderType());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }

    }

    @ApiOperation(value = "取消下单", notes = "取消下单")
    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    public DouPayResp<PayResponseData> cancelOrder(@RequestBody OrderCancelReq orderCancelReq) {
        InitTools.init();
        BaseVo<PayResponseData> baseVo = PaymentInfo.cancleOrder(orderCancelReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @ApiOperation(value = "获取订单信息", notes = "获取订单信息")
    @RequestMapping(value = "/getOrderInfo", method = RequestMethod.POST)
    public DouPayResp<OrderInfoResponseData> getOrderInfo(@RequestBody OrderInfoReq orderInfoReq) {
        InitTools.init();
        BaseVo<OrderInfoResponseData> baseVo = PaymentInfo.getOrderInfo(orderInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/refund", method = RequestMethod.POST)
    @ApiOperation(value = "退款", notes = "退款")
    public DouPayResp<RefundResponseData> refund(@RequestBody RefundReq refundReq) {
        InitTools.init();
        BaseVo<RefundResponseData> baseVo = PaymentInfo.refund(refundReq.getRefundType(), refundReq.getAddress(), refundReq.getAmount(), refundReq.getOrderCode(), refundReq.getRemark());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/getRefunds", method = RequestMethod.POST)
    @ApiOperation(value = "获取退款信息", notes = "获取退款信息")
    public DouPayResp<RefundInfoResponseData> getRefunds(@RequestBody RefundsReq refundsReq) {
        InitTools.init();
        BaseVo<RefundInfoResponseData> baseVo = PaymentInfo.getRefunds(refundsReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/withdrawal", method = RequestMethod.POST)
    @ApiOperation(value = "提现", notes = "提现")
    public DouPayResp<WithdrawResponse> withdrawal(@RequestBody WithdrawalReq withdrawalReq) {
        InitTools.init();
        BaseVo<WithdrawResponse> baseVo = PaymentInfo.withdraw(withdrawalReq.getAddress(), withdrawalReq.getAmount(), withdrawalReq.getCoinName(), withdrawalReq.getMerchantUser(), withdrawalReq.getOrderNo(),withdrawalReq.getMoney(),withdrawalReq.getOrderType(),withdrawalReq.getCurrency());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/getPaymentInfo", method = RequestMethod.POST)
    @ApiOperation(value = "获取支付信息", notes = "获取支付信息")
    public DouPayResp<PaymentInfoResponseData> getPaymentInfo(@RequestBody PaymentInfoReq paymentInfoReq) {
        InitTools.init();
        BaseVo<PaymentInfoResponseData> baseVo = PaymentInfo.getPaymentInfo(paymentInfoReq.getCoinName(), paymentInfoReq.getChainCoinCode(), paymentInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/makeup", method = RequestMethod.POST)
    @ApiOperation(value = "补单", notes = "补单")
    public DouPayResp<MakeUpResponse> makeup(@RequestBody MakeupReq makeupReq) {
        InitTools.init();
        BaseVo<MakeUpResponse> baseVo = PaymentInfo.maleUp("补单吧赶紧", makeupReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/getCallback", method = RequestMethod.POST)
    @ApiOperation(value = "查询回调", notes = "查询回调")
    public DouPayResp<PaymentCallBackResponse> getCallback(@RequestBody @Valid OrderInfoReq orderInfoReq) {
        InitTools.init();
        BaseVo<PaymentCallBackResponse> baseVo = PaymentInfo.getCallback(orderInfoReq.getOrderCode());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }

    @RequestMapping(value = "/getCoinPrice", method = RequestMethod.POST)
    @ApiOperation(value = "获取币种价格", notes = "获取币种价格")
    public DouPayResp<CoinPriceResponse> getCoinPrice(@RequestBody @Valid CoinPriceReq coinPriceReq) {
        InitTools.init();
        BaseVo<CoinPriceResponse> baseVo = PaymentInfo.getCoinPrice(coinPriceReq.getAmount(), coinPriceReq.getMoney(),
                coinPriceReq.getOrderType(), coinPriceReq.getCoinName(), coinPriceReq.getCurrency());
        if (baseVo.getCode() == 200) {
            return DouPayResp.ok(baseVo.getData());
        } else {
            return new DouPayResp<>(baseVo.getCode(), baseVo.getMsg());
        }
    }


}

