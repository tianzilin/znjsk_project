package com.znjsk.znjsk_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.swing.*;


@SpringBootTest()
public class ZnjskProjectApplicationTests {

	@Before
	public void beginTest(){
		System.out.println("开始测试");
	}

	@After
	public void endTest(){
		System.out.println("结束测试");
	}



	@Test
	public void contextLoads(){
	}


}
