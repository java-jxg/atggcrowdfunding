package com.atguigu.crowd;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyGennerator {
    private String path = "/generatorConfig.xml";//指定配置文件路径
    private boolean overwrite = true; //当生成的代码重复时，覆盖原代码

    public static void main(String[] args) {
        MyGennerator generator = new MyGennerator();
        generator.generateMyBatis();
    }

    // targetRuntime="MyBatis3Simple", 不生成Example
    public void generateMyBatis() {
        //该集合记录MBG执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        InputStream is = MyGennerator.class.getResourceAsStream(path);//读取MBG配置文件
        ConfigurationParser cp = new ConfigurationParser(warnings);
        try {
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);//执行生成代码
        } catch (Exception e) {
            e.printStackTrace();
        }
        //打印出执行过程中的警告信息，以便于修改
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
