package com.exemple;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String result = StringUtils.abbreviate("Hello World", -5); // 触发本地修改后的逻辑
        System.out.println("Result: " + result);
    }
}
