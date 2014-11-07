package com.model.strategy;

/**
 * @author ganqi
 * 
 * @time 2014年11月6日 下午6:28:18
 * 
 * @see 求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {

	public void operate() {
		System.out.println("求吴国太开个绿灯，放行！");
	}

}
