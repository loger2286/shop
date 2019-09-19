package com.shop.test;


/*
 *
 *
@BeforeClass：针对所有测试，只执行一次，且必须为static void 

@Before：初始化方法 

@Test：测试方法，在这里可以测试期望异常和超时时间 

@After：释放资源 

@AfterClass：针对所有测试，只执行一次，且必须为static void 
 * */

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.mapper.CategoryMapper;
import com.shop.mapper.ProductMapper;
import com.shop.po.Category;
import com.shop.po.CategoryExample;


public class productTest {
	private ApplicationContext applicationContext;//创建控制applicationcontext的访问权限

	@Before
	public void before() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}
	@Test
	public void test() throws Exception {
		ProductMapper productMapper = applicationContext.getBean(ProductMapper.class);

	}

	@Test
	public void testselectByExample() throws Exception {
		CategoryMapper categoryMapper = applicationContext.getBean(CategoryMapper.class);
		Category category = new Category();
		category.setCname("123");
		categoryMapper.insert(category);
		CategoryExample example = new CategoryExample();
		List<Category> list = categoryMapper.selectByExample(example);
		for (Category categoryList : list) {
			System.out.println(categoryList.getCname());
		}
	}
	@Test
	public void testCategoryService() throws Exception {
		CategoryMapper categoryMapper = applicationContext.getBean(CategoryMapper.class);
	}
}
