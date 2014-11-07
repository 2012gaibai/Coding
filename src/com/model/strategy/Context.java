package com.model.strategy;

/**
 * @author ganqi
 * 
 * @time 2014年11月6日 下午6:33:52
 * 
 * @see 计谋有了，那还要有锦囊
 */
public class Context {
	private IStrategy strategy;

	/**
	 * 构造函数，你要使用哪个妙计
	 */
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	// 使用计谋，看我出招了
	public void operate() {
		this.strategy.operate();
	}
}
