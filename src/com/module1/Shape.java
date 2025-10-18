package com.module1;

abstract class Shape{
	abstract void draw();                 //connecting with AbstractionDemo
}

class Circle extends Shape{

	void draw() {
		System.out.println("Drawing Circle");
	}
}