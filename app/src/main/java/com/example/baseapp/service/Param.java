package com.example.baseapp.service;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Param {

    public static JSONObject getParams(JSONObject param) {
        JSONObject map = new JSONObject();
        try {
            map.put(WSConfig.KeyParam.SERVICE_ENDPOINT_NAME, WSConfig.ENDPOINT_NAME);
            map.putOpt(WSConfig.KeyParam.DATA, param);
            map.put(WSConfig.KeyParam.CHECK_SUM, md5(param.toString().replace("\\", "") + WSConfig.ENDPOINT_KEY));
            map.put(WSConfig.KeyParam.REQUEST_ID, WSConfig.REQUEST_ID);
            map.put(WSConfig.KeyParam.LANG_CODE, "vi");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }


    public static JSONObject login(String mobile, String pass) {
        JSONObject map = new JSONObject();
        try {
            map.put(WSConfig.KeyParam.MOBLIE, mobile);
            map.put(WSConfig.KeyParam.PASSWORD, pass);


        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static final String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                StringBuilder h = new StringBuilder(Integer.toHexString(0xFF & aMessageDigest));
                while (h.length() < 2)
                    h.insert(0, "0");
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
