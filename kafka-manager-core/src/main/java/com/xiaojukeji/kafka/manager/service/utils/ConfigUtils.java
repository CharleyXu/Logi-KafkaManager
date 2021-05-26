package com.xiaojukeji.kafka.manager.service.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author zengqiao
 * @date 20/4/26
 */
@Service("configUtils")
public class ConfigUtils {
    @Value(value = "${custom.idc:}")
    private String idc;

    @Value("${custom.jmx.max-conn:10}")
    private Integer jmxMaxConn;

    @Value(value = "${spring.profiles.active:}")
    private String kafkaManagerEnv;

    @Value(value = "${custom.store-metrics-task.save-days:7}")
    private Integer maxMetricsSaveDays;

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getKafkaManagerEnv() {
        return kafkaManagerEnv;
    }

    public void setKafkaManagerEnv(String kafkaManagerEnv) {
        this.kafkaManagerEnv = kafkaManagerEnv;
    }

    public Integer getMaxMetricsSaveDays() {
        return maxMetricsSaveDays;
    }

    public void setMaxMetricsSaveDays(Integer maxMetricsSaveDays) {
        this.maxMetricsSaveDays = maxMetricsSaveDays;
    }
}
