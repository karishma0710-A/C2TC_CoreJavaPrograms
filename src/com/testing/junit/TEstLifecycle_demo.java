package com.testing.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class TEstLifecycle_demo {
	
	@TestInstance
	@AfterEach
	void AfterEach(){
		System.out.println(" AfterEach ");
	}
	
	@BeforeAll
	void BeforeAll(){
		System.out.println(" BeforeAll ");
	}
	
	@AfterAll
	void AfterAll(){
		System.out.println(" AfterAll ");
	}
	
	@BeforeEach
	void BeforeEach(){
		System.out.println(" BeforeEach ");
	}
	
	@Test
	void Test (){
		System.out.println(" Test1 ");
	}
	
	

}
