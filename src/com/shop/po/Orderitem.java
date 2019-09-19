package com.shop.po;

public class Orderitem {
    private Integer oiid;

    private Integer count;

    private Double subtotal;

    private Integer pid;
    
    private Integer oid;
//  关联商品
    private Product product;
    
    public Orderitem() {
    	
    }
    
    @Override
	public String toString() {
		return "Orderitem [oiid=" + oiid + ", count=" + count + ", subtotal=" + subtotal + ", pid=" + pid + ", oid="
				+ oid + ", product=" + product + "]";
	}

    
	public Orderitem(Integer oiid, Integer count, Double subtotal, Integer pid, Integer oid, Product product) {
		super();
		this.oiid = oiid;
		this.count = count;
		this.subtotal = subtotal;
		this.pid = pid;
		this.oid = oid;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getOiid() {
        return oiid;
    }

    public void setOiid(Integer oiid) {
        this.oiid = oiid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}