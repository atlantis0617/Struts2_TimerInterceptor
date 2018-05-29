package org.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = -8089938005877403172L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		 // 获取当前时间:ms
        long start = System.currentTimeMillis();
        System.out.println("test------------");
        // 执行下一个拦截器，若已是最后一个拦截器则执行action方法(result为逻辑视图名称)
        String result = invocation.invoke();
        // 获取当前时间:ms
        long end = System.currentTimeMillis();
        // 计算action执行时间并输出
        System.out.println("action执行时间为：" + (end - start) + "ms");
        // 返回逻辑视图
        return result;
	}

}
