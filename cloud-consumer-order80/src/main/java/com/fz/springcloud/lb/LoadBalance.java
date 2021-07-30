package com.fz.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author:
 * @date: 2021/7/29 14:05
 * @description:
 */

public interface LoadBalance {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
