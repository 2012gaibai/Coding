package com.model.strategy;

public class ZhaoYun {

	/**
	 * 赵云出场，以诸葛亮的妙计行事
	 */
	public static void main(String[] args) {
		Context context;
		//刚刚到吴国的时候拆第一个
		System.out.println("--------刚刚到吴国的时候拆第一个---------");
		context=new Context(new BackDoor());   //拿到妙计
		context.operate();   //拆开执行
		System.out.println();
		
		//刘备乐不思蜀了，拆开第二个
		System.out.println("-------刘备乐不思蜀了，拆开第二个--------");
		context=new Context(new GivenGreenLight());
		context.operate();  //执行第二个锦囊
		System.out.println();
		
		//孙权的追兵追来了，拆第三个
		System.out.println("-------孙权的追兵追来了，拆第三个-----");
		context=new Context(new BlockEnemy());
		context.operate();  // 执行第三个
		System.out.println();

	}
}
