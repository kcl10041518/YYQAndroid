package com.example.myapplication.Base;

public class KclU17BaseModel<T> {


    /**
     * code : 1
     * data : {"stateCode":1,"message":"成功","returnData":{}}
     */

    private int code;
    private DataBean<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean<T> getData() {
        return data;
    }

    public void setData(DataBean<T> data) {
        this.data = data;
    }

    public static class DataBean<T> {
        /**
         * stateCode : 1
         * message : 成功
         * returnData : {}
         */

        private int stateCode;
        private String message;
        private T returnData;

        public int getStateCode() {
            return stateCode;
        }

        public void setStateCode(int stateCode) {
            this.stateCode = stateCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getReturnData() {
            return returnData;
        }

        public void setReturnData(T returnData) {
            this.returnData = returnData;
        }


    }
}
