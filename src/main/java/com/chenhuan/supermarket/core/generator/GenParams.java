package com.chenhuan.supermarket.core.generator;

import lombok.Data;

/**
 * @Description: 代码生成器参数类
 * @Author: 陈欢
 * @Date: 2019/1/14 15:36
 */
@Data
public class GenParams {
    private String anthor = "chenhuan";
    private String outputDir = "D:\\xxx\\supermarket\\src\\main\\java";
    private String dataUrl = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private String dataDriver = "com.mysql.cj.jdbc.Driver";
    private String dataUserName = "root";
    private String dataPassword = "root";
    private String moduleName = "";
    private String[] removeTablePrefix = {"xx_"};
    private String[] includeTables;
    private String parentPackage = "com.chenhuan.supermarket.modular";

}
