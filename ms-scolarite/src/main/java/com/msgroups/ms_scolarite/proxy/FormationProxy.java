package com.msgroups.ms_scolarite.proxy;

import com.msgroups.ms_scolarite.models.Formation;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "ms_formation")
//@LoadBalancerClient(name="ms_formation")
public interface FormationProxy {
    @GetMapping("/formations/{id}")
    @CircuitBreaker(name="fall",fallbackMethod = "fallbackFormation")
    public Formation getFormation(@PathVariable("id") Long idf);

    default Formation fallbackFormation(@PathVariable("id") Long idf, Throwable throwable){
    return new Formation();

    };

}