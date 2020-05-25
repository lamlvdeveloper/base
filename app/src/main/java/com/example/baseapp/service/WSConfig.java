package com.example.baseapp.service;

public class WSConfig {
    public static final String HOST = "https://api.travel.onex.vn/";
    public static final String HOST_ACC = "https://core.travel.onex.vn/api/v1/";


    public static final String ENDPOINT_NAME = "SMPPGATEWAY";
    public static final String ENDPOINT_KEY = "NamVietVtvTr@vel2018";
    public static final String REQUEST_ID = "b5ba7da69cff242ba55bab729a098768";

    public static class Api {
        public static final String LOGIN = "user/login";
        public static final String SETTING = "setting";
    }

    public static class KeyParam {
        public static final String LANG_CODE = "lang_code";
        public static final String DATA = "data";
        public static final String MOBLIE = "mobile";
        public static final String PASSWORD = "password";

        public static final String HEADER_TOKEN = "NVTRAVEL-TOKEN";
        public static final String SERVICE_ENDPOINT_NAME = "serviceEndpointName";
        public static final String REQUEST_ID = "requestId";
        public static final String CHECK_SUM = "checksum";
        public static final String KEY_WORRD = "keyword";
    }
}
