package com.sdk.example.controller;

import me.doupay.sdk.Constants;

public class InitTools {


    public static void init() {
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
    }

}
