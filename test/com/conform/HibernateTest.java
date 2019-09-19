package com.conform;

import static org.junit.Assert.*;


import org.hibernate.Session;
import org.junit.Test;

//测试hibernate连接是否成功
public class HibernateTest {

	@Test
	public void test() {
		Session session=HibernateSessionFactory.getSession();
		System.out.print(session);
	}

}
