package com.red.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("ipProperties")
@ConfigurationProperties(prefix = "tools.ip")
@Data
public class IpProperties {
    /**
     * 日志显示周期
     */
    private Long cycle = 5L;

    /**
     * 是否周期内重置数据
     */
    private Boolean cycleReset = false;

    /**
     * 日志输出模式:detail(详细模式);simple(极简模式)
     */
    private String model = LogModel.DETAIL.value;

    /**
     * 需要统计ip的路径
     */
    private String[] path = {"/**"};

    /**
     * 需要排除统计ip的路径
     */
    private String[] excludePath = {""};

    public enum LogModel{
        DETAIL("detail"),
        SIMPLE("simple");
        private String value;

        LogModel(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}
