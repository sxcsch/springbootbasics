package com.mecool.entity;
/**
 * 访问提醒字段
 *
 */

public class ResMes {


        public static ResMes create() {
            return new ResMes();
        }

        /**
         * 错误编码 0表示没有错误
         */
        private String code = "0";

        /**
         * 访问状态 200表示正常
         */
        private int status = 200;

        /**
         * 通信信息，默认表示成功
         */
        private String message = "操作成功";

        public ResMes() {}

        public ResMes(String message) {
            this.message = message;
        }

        public ResMes(String code, int status, String message) {
            this.code = code;
            this.status = status;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public ResMes setCode(String code) {
            this.code = code;
            return this;
        }

        public int getStatus() {
            return status;
        }

        public ResMes setStatus(int status) {
            this.status = status;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public ResMes setMessage(String message) {
            this.message = message;
            return this;
        }

}
