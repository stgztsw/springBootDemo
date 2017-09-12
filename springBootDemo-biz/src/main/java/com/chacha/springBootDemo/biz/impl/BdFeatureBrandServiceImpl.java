package com.chacha.springBootDemo.biz.impl;

import com.chacha.springBootDemo.biz.BdFeatureBrandService;
import com.chacha.springBootDemo.client.to.BdFeatureBrandTO;
import com.chacha.springBootDemo.dao.dal.BdFeatureBrandDAO;

import java.util.ArrayList;
import java.util.List;

import com.chacha.springBootDemo.domain.BdFeatureBrandDO;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@Service("bdFeatureBrandService")
public class BdFeatureBrandServiceImpl implements BdFeatureBrandService {

    @Resource
    private BdFeatureBrandDAO bdFeatureBrandDAO;

    public List<BdFeatureBrandTO> findBdFeatureBrand() {

        List<BdFeatureBrandDO> bdFeatureBrandDOList = bdFeatureBrandDAO.findBdFeatureBrand();
        return makeBdFeatureBrandDO2BdFeatureBrandTOList(bdFeatureBrandDOList);
    }

    private List<BdFeatureBrandTO> makeBdFeatureBrandDO2BdFeatureBrandTOList(List<BdFeatureBrandDO> bdFeatureBrandDOList) {

        if (CollectionUtils.isEmpty(bdFeatureBrandDOList)) {
            return new ArrayList<BdFeatureBrandTO>();
        }

        List<BdFeatureBrandTO> bdFeatureBrandTOList = Lists.newArrayList();
        for (BdFeatureBrandDO bdFeatureBrandDO:bdFeatureBrandDOList) {
            BdFeatureBrandTO bdFeatureBrandTO = new BdFeatureBrandTO();
            BeanUtils.copyProperties(bdFeatureBrandDO, bdFeatureBrandTO);
            bdFeatureBrandTOList.add(bdFeatureBrandTO);
        }

        return bdFeatureBrandTOList;
    }

}
