package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class HelloAopLog {

	// 注入したいデータを入れる
	// 連携先クラスメソッドの呼び出しは不要!!パーツのみ記載

	@Before("within(com.example.demo.HelloAopController)")
	public void write1() {
		System.out.println("start");
	}

	@After("within(com.example.demo.HelloAopController)")
	public void write2() {
		System.out.println("end");
	}

}
