package me.doupay.sdk;

import me.doupay.sdk.bean.*;
import me.doupay.sdk.enums.RefundType;
import me.doupay.sdk.interfaceCallback.CallBackListener;
import me.doupay.sdk.net.BaseVo;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Random;


public class SDKtest {


    public  static  void  initAllParameters() {
         final String appId = "doupay_n62mewaVa9";
         final String secret = "cff7d04980ff1a720c8e8f61c73d4073";
         String privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDdyXeaN2T2ARgp\n" +
                 "DTI5T2NanAUM5uhJQkoKtMs0+cmeFLeErYwscwMxN0JOIERNKnFHJd4TFTdxs/Wt\n" +
                 "LCayC+C85Kpt1UGYNyDN9I1T8sGI9VCZgk5zw3L1U6jMebrl58FaSCYc6g3S+Y0F\n" +
                 "3To2Pa9RWWeliyyzL/+o43MI96ueusiTsh/cxrIQlyWXG8XV6r1r36KWGmLI0Fdn\n" +
                 "ajKhLsM00F6KaVXGBxXERu8dkApgl/1SQd8ga10hZShBDFcfwhKknhOiyJlM81ez\n" +
                 "3iawKBu7XOJ6wlMVZS/UHreqkeJyLTO6cc8em8cB8989gihnWwOm4vOcU4qMZxPD\n" +
                 "B31df7PLAgMBAAECggEAWy65PW4I1BsfE8GZJHa/IkGC0gsc9QGL71rlMKKBgbyC\n" +
                 "tsmjF6MxbMqLOBOMAS2x5M5svuu6H8Uc/FVqk0jO3NomN4G1th70HbitYhYr+2Lg\n" +
                 "ADzShEWWvcXnYCmr7Vma5MNE6B5SEKsIj6CkjihOK+PV+Pl/JyxUr9rTMJyisl7U\n" +
                 "dKyB+Bagpr/nh/mghf7diH7iScq0YxbKP6bVBX+5QWPnjdLHm/hmjMixKI7TBeYO\n" +
                 "pxSydXmD7Z7Pf0gPl2WisPM7uiB4XoJ1a6CdWNlIVUmiv6vSApVdY00KeuXKS/oz\n" +
                 "u/CU5VczfsukZJVjM5L8WBX+3n0QZsCYHnY4Fx66AQKBgQD5g4fzPfyqd07yq2CB\n" +
                 "KpUf6ClJELewpKwSw80TLMhFD/aecjCeeKSmUIPCILOZFhUrTYK0ekwyCYD89z6X\n" +
                 "AqnMjwtFu2JUTXd4wv/7nQs44haYQRLM4/0NChbHmdEzqQbhHZbh1zjXiUVj2OUC\n" +
                 "roC0WF1nuVnDxOcpvWB0IGDT1wKBgQDjjWtTzClDNxKNcwR17VEFbPGI3lhgOVFx\n" +
                 "bGusG2yV2SwPR7SPVUoWn7P+TlfsiJm7ZRhPpRiKzCjouNuYSjHefyudb1cyKEYr\n" +
                 "uoorIwMIG2JWTGXHbJ/GbmqeggEW5ucV5hZbvYrVHXp2EfmAPYGu+Td+nk0+1opD\n" +
                 "HTsxPrphLQKBgG+U/qsswV2KVWf4dAPPgzjtnejq7Pq16a3Kml9E25rm9KcO8ecs\n" +
                 "lJU71HBwJ2ECmxzuYNFND94gmeqGtxrZOg4cujHJBsQkkJUUv11KccZSdUBJeZrf\n" +
                 "Kj82j9FbXE75+/WYQe1lTio1XS61xFRarXv5OGw2W4pM+AOWiRflkuepAoGAEomj\n" +
                 "07jPJ72l0kYrd9v0fMeqSacrdfNVcjMN9oBpcS+3CiuiRwcAuSUbib0iJo/eTkjn\n" +
                 "GR3vCOem8YaVxStOMr0TdYjrhpeHV+qjdO4uQgvREAy7QerUfVrjbrRSmGYJL1yG\n" +
                 "N8USOVhkcJf4Rn08Ql/lKHiG/HaH3v3To6hjkKUCgYBabbXPWqHnCtRkkLna3Vpj\n" +
                 "zJNYCPGr1UJbi6DUh8N9CHFL05PWLHfKlElnzqUkeiP6wDbsRKnaCjsrVJNSIHcU\n" +
                 "nzjE1qXwsZ5HwRG8nu+pTdWHKlfSSlBzO7lqOouGwBMo5J7b4CAFYGMd356pkcQ1\n" +
                 "lwaIeAij0N7c0e2anh65ug==";
        String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAguBq3eqSCb27eZAmdaeWbXOfev+xpLVEILxr4B5Q1IoAyKSwahhSbUa3ogLfwV37W0HbEMIzYQPBhLikGXGKjsPJyWPwanF7sjlQCYnUFzaXk/YO2zt61Nxv1ejpKNO5nDFuEA8Sonk8pPiu3RigSUmZMDs/nE7jFIZ/PNlYzf1AaIf3sBUrMuNott5eJ6jGmkevRA8xm+i1XLznfZ74UCJbjtNl9G9lsIWo8s0Nn13OWHwsQUs+d2fbjTFdJt7YOWkM2zKQ8YZY+axktSdim0vq7bzZWVlxA3X8AbLgNSiCgpucP2wSsrinT2W+7ogixFRZ8uILz9W0RlIiyX4GvwIDAQAB";
        Constants.openSysLog = true;
        Constants.getInstance().init(secret,privateKey,publicKey,appId,"86400");
        Constants.setBasrUrl("http://apay.allye.com:9000/");
//                Constants.setBasrUrl("http://192.168.10.126:9000/");
    }

    @Test
    public void getCoinList () {
        initAllParameters();

        BaseVo<CoinResponseData> baseVo = PaymentInfo.getCoinList();
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }


    }
    @Test
    public void getCurrencyList() {
        initAllParameters();

        BaseVo<CurrencyResponseData> baseVo = PaymentInfo.getCurrencyList();
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPay() {
        initAllParameters();
        String orderNo = "SJDD" + String.valueOf(System.currentTimeMillis());

        BaseVo<PayResponseData> baseVo = PaymentInfo.pay("","100", CoinNameEnum.USDT, CurrencyCodeEnum.CNY, "17701278888", orderNo,
                "我很好啊啊", "", "", OrderTypeCodeEnum.BY_AMOUNT);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void cancle() {
        initAllParameters();

        BaseVo<PayResponseData> baseVo =  PaymentInfo.cancleOrder("ZF202107261159264168428799");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getOrderInfo() {
        initAllParameters();
        BaseVo<OrderInfoResponseData> baseVo = PaymentInfo.getOrderInfo("ZF202107270735102531358110");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPaymentInfo() {
        initAllParameters();

        BaseVo<PaymentInfoResponseData> baseVo =  PaymentInfo.getPaymentInfo(CoinNameEnum.USDT,"0004" ,"ZF202107270223484993585691");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getRefund() {
        initAllParameters();
        BaseVo<RefundResponseData> baseVo = PaymentInfo.refund(RefundType.NEW_ADDRESS,"TEQrvHyU54YibVHMGb7475n8y3mXBofaaR", "5.8", "ZF202107270223484993585691", "退1个,啦啦啦");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getRefundInfo() {
        initAllParameters();

        BaseVo<RefundInfoResponseData> baseVo = PaymentInfo.getRefunds("ZF202107270223484993585691");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void withdraw() {
        initAllParameters();
        String orderNo = "SHYH" + String.valueOf(System.currentTimeMillis());
        System.out.println("heheh");
        System.out.println("heheh");
        BaseVo<WithdrawResponse> baseVo = PaymentInfo.withdraw("TEQrvHyU54YibVHMGb7475n8y3mXBofaaR", "5", CoinNameEnum.USDT, orderNo, orderNo,"5000",OrderTypeCodeEnum.BY_MONEY,CurrencyCodeEnum.USD);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void makeup() {
        initAllParameters();
        BaseVo<MakeUpResponse> baseVo = PaymentInfo.maleUp("需要补单","ZF202107260156555394182597");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getCallBack() {
        initAllParameters();
        BaseVo<PaymentCallBackResponse> baseVo = PaymentInfo.getCallback("ZF202107221114581046391184");
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void getPrice() {
        initAllParameters();
        BaseVo<CoinPriceResponse> baseVo = PaymentInfo.getCoinPrice("100","100",OrderTypeCodeEnum.BY_AMOUNT,CoinNameEnum.USDT,CurrencyCodeEnum.CNY);
        if (baseVo.getCode() == 200) {
            System.out.println("-------------------------" + baseVo.getData().toString());
        }else {
            System.out.println(baseVo.getCode() + "-------------------------" + baseVo.getMsg());
        }
    }

    @Test
    public void verifySignAndGetResult () {
        initAllParameters();

        String bodystring = "{\"address\":\"TQ1EgPhuDXLvDfycCBQadbfbLkBPhEDoZX\",\"amountPaid\":\"15.26717557\",\"coinName\":\"USDT\",\"orderCode\":\"ZF202106221133335640422688\",\"paymentStatus\":1,\"protocolName\":\"TRC20\",\"result\":true}";
        String headstring = "uCJasnGz3H+2Xi86zeRkoDVEaXpM0LsCInOW1Kk28pn/3bXMn/2vUac7aQrWUzcf8YjTiXJt03IzS6k0y04TsvL1rdOj7TZgrk2aav8wM79ECviDW1+OQWd2XRhCRJGL4ca5lnXiE+1eHV5Tdq68Nu50tOkTKGI6cD3LT6imEWq5bTB0I+xuabnhSDfhWdmogmzEwKju3xSPcjxtzHGJ/c8Zc1NYH7ID92qWi77Wm6/UskHiATgULXYCbLHL/hBFDn4kGH8E+FQ0oSoPOTLOvpKnI27v6xD7CyHhMUOYRaVm5u/X4YNta65hF//JVPLnMw8I9NJA9WklDPFZ1DvIQQ==";
        PaymentInfo.verifySignAndGetResult(headstring, bodystring, new CallBackListener<PaymentCallBackResponse>() {
            @Override
            public void onFinish(PaymentCallBackResponse data) {
                System.out.println("PaymentResultResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);

            }
        }, new CallBackListener<UserWithdrawCallBackResponse>() {
            @Override
            public void onFinish(UserWithdrawCallBackResponse data) {
                System.out.println("UserWithdrawCallBackResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);
            }
        }, new CallBackListener<MakeUpCallBackResponse>() {
            @Override
            public void onFinish(MakeUpCallBackResponse data) {
                System.out.println("UserWithdrawCallBackResponse = " + data.toString());
            }

            @Override
            public void onError(int errorCode, String msg) {
                System.out.println("errorCode=" + errorCode + "msg =" + msg);
            }
        });
    }

    @Test
    public void  getBillRecord () {
        initAllParameters();
        LocalDateTime start =  LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now();
//        PaymentInfo.getBillRecords( null, null, 10, 1, new CallBackListener<BillRecord>() {
//            @Override
//            public void onFinish(BillRecord data) {
//
//            }
//
//            @Override
//            public void onError(int errorCode, String msg) {
//
//            }
//        });
    }


}
