package com.chacha.springBootDemo.client.to;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class BdFeatureBrandTO {

    private Long id;

    private String brandCode;

    private String brandName;

    private String brandUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandUrl() {
        return brandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }

}
