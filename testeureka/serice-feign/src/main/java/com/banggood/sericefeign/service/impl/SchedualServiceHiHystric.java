package com.banggood.sericefeign.service.impl;

import com.banggood.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author liangjunxi
 * @date 2018/2/19
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
