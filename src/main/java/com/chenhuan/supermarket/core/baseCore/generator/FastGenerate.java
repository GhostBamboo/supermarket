package com.chenhuan.supermarket.core.baseCore.generator;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @Description: 代码生成器核心类
 * @Author: 陈欢
 * @Date: 2019/1/11 14:38
 */
public class FastGenerate {


    public static void doGennerate(GenParams genParams) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(genParams.getOutputDir());
        gc.setAuthor(genParams.getAnthor());
        gc.setOpen(false);
        gc.setFileOverride(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(genParams.getDataUrl());
        // dsc.setSchemaName("public");
        dsc.setDriverName(genParams.getDataDriver());
        dsc.setUsername(genParams.getDataUserName());
        dsc.setPassword(genParams.getDataPassword());
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(genParams.getModuleName());
        pc.setParent(genParams.getParentPackage());
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        //List<FileOutConfig> focList = new ArrayList<>();
        //// 自定义配置会被优先输出
        //focList.add(new FileOutConfig(templatePath) {
        //    @Override
        //    public String outputFile(TableInfo tableInfo) {
        //        // 自定义输出文件名
        //        return "/src/main/resources/mapper/" + pc.getModuleName()
        //                + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
        //    }
        //});
        //
        //cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        // templateConfig.setEntity();
        // templateConfig.setService();
        // templateConfig.setController();

        //templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setTablePrefix(genParams.getRemoveTablePrefix());
        strategy.setInclude(genParams.getIncludeTables());
        //strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        //strategy.setEntityLombokModel(true);
        //strategy.setRestControllerStyle(true);
        //strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        //strategy.setSuperEntityColumns("id");
        //strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }


}
