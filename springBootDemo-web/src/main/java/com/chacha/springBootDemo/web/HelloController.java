package com.chacha.springBootDemo.web;

import com.chacha.springBootDemo.biz.BdFeatureBrandService;
import com.chacha.springBootDemo.client.to.BdFeatureBrandTO;
import java.util.List;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@RequestMapping("/springBootDemo")
@Controller
public class HelloController {

    @Resource
    private BdFeatureBrandService bdFeatureBrandService;

    @ResponseBody
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public List<BdFeatureBrandTO> hello(@RequestParam(value = "name", required = true, defaultValue = "stranger") String name){
        //System.out.println(name);
        List<BdFeatureBrandTO> bdFeatureBrandTOList = bdFeatureBrandService.findBdFeatureBrand();
        return bdFeatureBrandTOList;
    }

}
