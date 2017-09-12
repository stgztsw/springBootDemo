package com.chacha.springBootDemo.biz;

import com.chacha.springBootDemo.client.to.BdFeatureBrandTO;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public interface BdFeatureBrandService {

    public List<BdFeatureBrandTO> findBdFeatureBrand();
}
