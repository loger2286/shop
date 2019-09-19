package com.shop.po;

public class Adminuser {
    private Integer auid;

    private String username;

    private String password;
    public Adminuser() {
    	
    }
    

    //创建tostring方法
    @Override
	public String toString() {
		return "Adminuser [auid=" + auid + ", username=" + username + ", password=" + password + "]";
	}


    //构造方法
	public Adminuser(Integer auid, String username, String password) {
		super();
		this.auid = auid;
		this.username = username;
		this.password = password;
	}


	public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}