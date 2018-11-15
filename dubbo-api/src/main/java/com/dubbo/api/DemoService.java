package com.dubbo.api;

import java.util.List;

/**
 * DemoService
 *
 * @author DingwenDeng
 * @summary DemoService
 * @since 2018-11-14 14:57
 */
public interface DemoService {
    List<String> getServiceName(Long id);
}