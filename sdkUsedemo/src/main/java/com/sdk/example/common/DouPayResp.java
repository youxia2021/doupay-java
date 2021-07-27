/*
 *
 *      Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: lengleng (wangiegie@gmail.com)
 *
 */

package com.sdk.example.common;

import com.alibaba.fastjson.JSONObject;
//import com.doupay.common.constant.CommonConstant;
//import com.doupay.common.constant.CommonConstants;
//import com.doupay.utils.i18n.I18nUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
//import lombok.*;
//import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 *
 * @param <T>
 */
//@Builder
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Accessors(chain = true)
@ApiModel(value = "响应信息主体")

public class DouPayResp<T> implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "返回标记：成功标记=200，失败标记=500")
    private int code;


    @ApiModelProperty(value = "返回信息")
    private String msg;


    @ApiModelProperty(value = "数据")
    private T data = (T) new JSONObject();

//	@Getter
//	@Setter
//	@ApiModelProperty(value = "状态")
//	private Boolean status=true;


    public DouPayResp(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public DouPayResp() {

    }

    public DouPayResp(Throwable e) {

        this.msg = e.getMessage();
        this.code = CommonConstant.FAIL;

    }

    public static <T> DouPayResp<T> ok() {
        return restResult((T) new JSONObject(), CommonConstants.SUCCESS, I18nUtil.getMessage("Request success"));
    }

    public static <T> DouPayResp<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, I18nUtil.getMessage("Request success"));
    }

    public static <T> DouPayResp<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, I18nUtil.getMessage(msg));
    }

    public static <T> DouPayResp<T> ok(String msg) {
        return restResult(null, CommonConstants.SUCCESS, I18nUtil.getMessage(msg));
    }

    public static <T> DouPayResp<T> failed() {
        return restResult(null, CommonConstants.FAIL, I18nUtil.getMessage("Request fail"));
    }

    public static <T> DouPayResp<T> faileds(Integer status,String msgOrCode) {
        return restResult(null, status, I18nUtil.getMessage("msgOrCode"));
    }






    public static <T> DouPayResp<T> failed(String msgOrCode) {
        return restResult((T) new JSONObject(), Integer.parseInt(msgOrCode), I18nUtil.getMessage(msgOrCode));
    }

    public static <T> DouPayResp<T> failed(Exception exception) {
        return restResult((T) new JSONObject(), 9999,exception.getMessage());
    }



    public static <T> DouPayResp<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, I18nUtil.getMessage("Request fail"));
    }

    public static <T> DouPayResp<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, I18nUtil.getMessage(msg));
    }

    public static <T> DouPayResp<T> restResult(T data, int code, String msg) {
        DouPayResp<T> apiResult = new DouPayResp();
        if (code == 0) {
            apiResult.setCode(200);
        } else {
            apiResult.setCode(code);
        }
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
