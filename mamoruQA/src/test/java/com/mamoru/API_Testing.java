package com.mamoru;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API_Testing {

    @Test
    public void test2() {

        JSONObject requestRegister = new JSONObject();
        requestRegister.put("password", "Anh@yopmail.com1");
        requestRegister.put("referralCode", "");
        requestRegister.put("locale", "en");
        requestRegister.put("captcha", "UDBfZXlKMGVYQWlPaUpLVjFRaUxDSmhiR2NpT2lKSVV6STFOaUo5LmV5SndZWE56YTJWNUlqb2lWV2xRYjFSUk0yTm5RWHB6WlhwSFVXUXdhV2xVV2taTVlYZHZlWGgyYkUxRlpWSk5hM1JuWVVKdFJYZDJSVWhPTUZGTUswSklSRXRGU1RkcE1XSkVXV2MzVTNrMFZWWnZNM2RwTVVrdldDdHdWMUZEWkZOVGJHdEdZbGxPTkZJMlRuaEpUbTVzU0ZjMVNWRnpRa3hGVVhweVpHaDBkMFV2TTFwT1NHeEtVbkZDSzBOUmRFSlBNa1JFYkVGd0wxZzJWVEZTY3pOallVNHhRVTFDYVZKRWVEVjBTbEZoUkhjeVp6WlFWV3N4Vld0RWJXUktNVVJQZDBaRVpWbEtiVEkyVDNGVFZqZHRTalpuYmxGRE9YaElSV3BTY2xKak9TOXJXRUpJVEVWRE1uTXZkMFE1WnpOSGNrUnNka2N4YzFvM2FWQTJOVkJzU3pGVlJDOWplRlJFUlZsUWJtNVRlRTVLZFU1SE5tTklSV1JvTjFGQloxTTNkVzFqWjBka05HRXlSblZvTUUxWGEzcEdTRkUwYXprMVpWQXpja3hRYTFvNVJDdDVkbGRQVjI5WlNXZDBUME5tZUZCRE5tcHNZVmxrV0hwSk55czNUVU5zYWpOd1JYUnpkRzB3VFdSMFNVWTNZVkptYzJOaFFqaENlbEJKY1dOcU1WRTFWelpoWTNacmMyNW5aa1pLTjJkVGVIWTNVVFpXZVVoREswaGxia2x4YVVaYVVtTTNVRTh2Vm1KVlFraG1Oemg1ZVVGeVZ6VjZORnBwUXpaU1ZrSXlRVU5HZFdGMlUzWldSVEpJY0ZWc1EybG1UMFpSTDBWQlQzTndaV3d3TjBwWWFISTVaRFpGV2xwMmVrczJaVUZXSzB0Nk5HVXZUMEk0SzBOMGFUUTFaMnhqU1RsTWNXSlNiWEJ3ZUhFM2VIUXJObFJNVWpScU5sTTRVbHBFSzJOUldFaFhZM1JHZW1WdlNXSnJNRlpMUkc5alpVZExiMmxaZW5vM0wwUXdiV3MyVm10U1MzUXZTMEYyUlZFdmIwbFhTR1ZDWVdsMmJ6Z3ljM1pQYVZOMk4ybFZXR3hIV0VJNFprSmFPU3RqVnpCelRsRndNVE5NYlhaMVNsbE5TU3RMVUdoalYwRkxVbmRWV0djMVpuUjZkM2wzYjA1aVdISjFRMWhzTVVzeE1qbDVPWFZoSzIxbFFqRlFVbTVFWlV4WU9YaENhblIzWTJOQ1VsZEJUVVpEVTJsc1ZrRXlNRU5FYmpRMlozVnVNVWxLV2paNlZIWkpURmRaTmtsS04waHZORGtyYldrd2QyRm5PVTg0VGtaSVRFTjZVRzk0YjNSNVJ6WllOSE5TUTJJclIybDVTR3B6UlM5SWJIUlFWeXR4YkhwcE1qaFpPSGtyYUVjdlRrWlRaRTlqYkdkTVdUbDBOM0UzTUVFNFJrNHdPVFZXYVZsR2VtRmpVVWRXZW01TmJYaHllVGt6TkZCUVNtdHdVelpFZEVVd05ESnJSMUZ6ZVhsRVZXSXhSR1pPYzBaRlZIa3ZkblUwT1hnck1HRkdabWc1YWl0clluTlVabGxsZDFVM2VHVXZlbTVHTmtGVlJuSm5jMWhGVDFWaFoyTk1iM3AwU2pGNVlUY3ZUR1l6WjNaYVRFTTBOV2wyU0dGWk9GZElVR2xFVWxKalIyUTVORmxYV1RCbE15OUpVQzh5U2poMWFESnFlV3QyUlV4MmIzQjNWVGxDYlVNMWJEQXpUR2gzYTNCb1dYUldkekZtYjJoRFN6TXJNelJUVkVGTk1Hb3dkbWQ0WXpCNk0zTjBkbmd2ZGpRclVFVjNLMHRvU21kM2NqSnFOR2d2YTNsWlFqRk5NVEZhY2tJM1VIRXlLMlJNTkRodFNIWmpNMFJaZGpsUUt6bEZMMVpWT0VkVE4ydHlWVnBZVWtKQ0x6WnBMM1ZLYlhCcWVYaEJSSEZ2YUZSa2FXeGFaa3BvTDFkWWExUkNSWFEyYnpWUFRWVmhaVTAwWjFaelNFeEJRMUowUlhodmN6TmlTMDlDYm1wNGRHcDBRbFI2YmpKbmMxbHJPWGMxUTBaQ1RHTTNkWEk1SzIxaVl6RkRjblZCTXpOVk1EQTViRXRaTnpKU01teGxRVGQ1TjBOb01GQkhjV1JKYUdGMVpEVmxORWhVWWtzek9HOXlTbXRUTW5WVU1VMUROVzFhTDNOVlZqZEtRbWN2VEdwb1MwNTRWemRaY0hweU9FeEVLMjB4VWpaNVoxQTJhR2d2TWtSWFVGWk9UREl2UVdsUVFqUk5hbXBLVWxKTE5IRkhWSFJxTlVsWU4zQnNUV1pLVkVaSllYQkZSRlJ2V1U5QldtcFZUWFZEUTBKNFpEWXZZbFJMTkV0eU5YVlhjMlYxVTJoRVlVVnBORk5aTjNsRVQyWjRRVGhRUkhRcmNsWnFUbVkzYkVWeFdqUkNWbEZCUkZrelFXVjNTVTlzZEZwamEzZDJVamRZU0dKWEsxSk1aVWxyZUVGelpGWlVOSEZVSzJaaWFHbDZPWEpwWmpWdE16RlNVR1puVFVoUFkycFFSM1JwUjNZdk9WQXZTRVIwU1Rrdk5FMDVRbHB4UjBoR1YyNW1Oa2h6YlVOV1EzUnNkemhUTldsaU1XUllOVkI0WWk5S1NYUkxiell3UzNveVZscEVURVF2TTNabU5sRXJiM04yTlZCcWIxRjRlR3RoUVRObmFsVTBSMnAyYmtFMFVEZHFRekJYWTNkcVVFUldNVTgxTTBFeVYxaExlbGQ0UkhGYVJtRnVSbFUzVW5abmQxSklSa1I1Y1RGUGVuVkZjRTVXVlhjemRtODNURkZTSWl3aVpYaHdJam94Tmpjd05ETXlNRFEyTENKemFHRnlaRjlwWkNJNk16WXlOREEyT1RrMkxDSndaQ0k2TUgwLjFNOE5YdEZPVG9HYUF2S1EtZ0U2b3FMMTBwd2lOSlhoWEk0SEtQMnYxZnM=");
        requestRegister.put("siteKey", "b9eb07ca-5b6a-495e-83dd-d3d5f0cb1a58");
        requestRegister.put("marketingOptIn", true);
        requestRegister.put("registerChannel", "email");
        requestRegister.put("email", "anh@yopmail.com");




        System.out.println(requestRegister);
        System.out.println(requestRegister.toString());

        given().
                body(requestRegister.toJSONString()).
                when().
                post("https://www.mamoru.com/api/v2/public/user/register").
                then().statusCode(415 );

        JSONObject requestVerify = new JSONObject();
        requestVerify.put("user", "");
        requestVerify.put("code", "696193");
        requestVerify.put("type", "email");
        requestVerify.put("email", "anh@yopmail.com");

        given().
                body(requestVerify.toJSONString()).
                when().
                post("https://www.mamoru.com/api/v2/public/user/verify").
                then().statusCode(415 );

    }

}
