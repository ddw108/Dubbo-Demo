package com.dubbo.provider;

import com.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * DemoServiceImpl
 *
 * @author DingwenDeng
 * @summary DemoServiceImpl
 * @since 2018-11-14 15:00
 */
public class DemoServiceImpl implements DemoService {

    public List<String> getServiceName(Long id) {
        String name = "demo";
        List<String> result = new ArrayList<String>();
        result.add(name);
        result.add(id.toString());
        return result;
    }
}