package com.shop.po;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.shop.po.Adminuser;

public class AdminuserTest {

	@Test
	public void testSaveAdminuser() {
		//创建配置对象
		Configuration config = new Configuration().configure();
		//创建服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//创建会话工厂对象
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//Session对象
		Session session=sessionFactory.getCurrentSession();
		//创建事务对象
		Transaction tx =session.beginTransaction();
		
		Adminuser s1=new Adminuser(2,"aw","123");
		
		session.save(s1);
		
		tx.commit();
		sessionFactory.close();
	}

}

