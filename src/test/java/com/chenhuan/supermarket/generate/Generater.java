package com.chenhuan.supermarket.generate;


import com.chenhuan.supermarket.core.generator.FastGenerate;
import com.chenhuan.supermarket.core.generator.GenParams;

/**
 * @Description: 代码生成器实现类
 * @Author: 陈欢
 * @Date: 2019/1/11 14:38
 */
public class Generater {


    public static void main(String[] args) {
        GenParams genParams = new GenParams();
        genParams.setModuleName("product");
        genParams.setRemoveTablePrefix(new String[]{"pro_"});
        genParams.setOutputDir("D:\\code in idea\\supermarket\\src\\main\\java");
        genParams.setIncludeTables(new String[]{"pro_provider","pro_product_provider", "pro_product","pro_category"});
        FastGenerate.doGennerate(genParams);

    }


}
