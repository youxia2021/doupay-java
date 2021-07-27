package me.doupay.sdk.net;

import java.util.Map;

import io.reactivex.Observable;
import me.doupay.sdk.bean.*;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ServerApi {
    ServerApi SERVICE_API = new RetrofitHelper().getINSTANCE(false).create(ServerApi.class);
    /*
     * 获取币种列表
     * */
    @FormUrlEncoded
    @POST()
    Call<BaseVo<CoinResponseData>> getCoinList(@Url String url, @FieldMap Map<String, Object> body);
    /*
     * 获取法币列表
     * */
    @FormUrlEncoded
    @POST()
    Call<BaseVo<CurrencyResponseData>> getCurrencyList(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
    /*
    * 获取订单信息
    * */
    Call<BaseVo<OrderInfoResponseData>> getOrderInfo(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
    /*
    * 获取支付信息
    * */
    Call<BaseVo<PaymentInfoResponseData>> getPaymentInfo(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
    /*
    * 付款
    * */
    Call<BaseVo<PayResponseData>> gotoPay(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
    /*
    * 退款
    * */
    Call<BaseVo<RefundResponseData>> gotoRefund(@Url String url, @FieldMap Map<String, Object> body);


    @FormUrlEncoded
    @POST()
        /*
         * 获取退款信息
         * */
    Call<BaseVo<RefundInfoResponseData>> getRefundInfo(@Url String url, @FieldMap Map<String, Object> body);
    @FormUrlEncoded
    @POST()
        /*
         * 获取账单
         * */
    Call<BaseVo<BillRecord>> getBillRecord(@Url String url, @FieldMap Map<String, Object> body);
    @FormUrlEncoded
    @POST()
        /*
         * 取消订单
         * */
    Call<BaseVo<PayResponseData>> cancleOrder(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
        /*
         * 用户提现
         * */
    Call<BaseVo<WithdrawResponse>> withdraw(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
        /*
         * 补单
         * */
    Call<BaseVo<MakeUpResponse>> makeup(@Url String url, @FieldMap Map<String, Object> body);
    @FormUrlEncoded
    @POST()
        /*
         * 查询回调
         * */
    Call<BaseVo<PaymentCallBackResponse>> getCallback(@Url String url, @FieldMap Map<String, Object> body);

    @FormUrlEncoded
    @POST()
        /*
         * 查询单价
         * */
    Call<BaseVo<CoinPriceResponse>> getPrice(@Url String url, @FieldMap Map<String, Object> body);
}
