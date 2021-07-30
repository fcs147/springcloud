package com.fz.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:
 * @date: 2021/7/29 14:09
 * @description:
 */
@Component
public class MyLB implements LoadBalance {

    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current=this.atomicInteger.get();
            next=current>=2147483647?0:current+1;
        }while (this.atomicInteger.compareAndSet(current,next));
        System.out.println("**********next"+next);
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement( ) % serviceInstances.size( );

        return serviceInstances.get(index);
    }
}
