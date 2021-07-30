package com.fz.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:
 * @date: 2021/7/29 10:55
 * @description:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}
