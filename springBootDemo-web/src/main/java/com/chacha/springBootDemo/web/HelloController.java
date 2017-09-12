package com.chacha.springBootDemo.web;

import com.chacha.springBootDemo.biz.BdFeatureBrandService;
import com.chacha.springBootDemo.client.to.BdFeatureBrandTO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@RequestMapping("/springBootDemo")
@RestController
public class HelloController {

    @Resource
    private BdFeatureBrandService bdFeatureBrandService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){

        List<BdFeatureBrandTO> bdFeatureBrandTOList = bdFeatureBrandService.findBdFeatureBrand();
        map.put("name", bdFeatureBrandTOList);
        return "Hello";
    }

}
