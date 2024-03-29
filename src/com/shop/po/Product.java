package com.shop.po;

import java.util.Date;

public class Product {
    private Integer pid;

    private String pname;

    private Double marketPrice;

    private Double shopPrice;

    private String image;

    private String pdesc;

    private Integer isHot;

    private Date pdate;

    private Integer csid;
    
    public Product() {
    	
    }
    

    @Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", marketPrice=" + marketPrice + ", shopPrice=" + shopPrice
				+ ", image=" + image + ", pdesc=" + pdesc + ", isHot=" + isHot + ", pdate=" + pdate + ", csid=" + csid
				+ "]";
	}


	public Product(Integer pid, String pname, Double marketPrice, Double shopPrice, String image, String pdesc,
			Integer isHot, Date pdate, Integer csid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.marketPrice = marketPrice;
		this.shopPrice = shopPrice;
		this.image = image;
		this.pdesc = pdesc;
		this.isHot = isHot;
		this.pdate = pdate;
		this.csid = csid;
	}


	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }
}