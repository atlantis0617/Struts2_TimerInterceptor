package org.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerAction extends ActionSupport {

	private static final long serialVersionUID = 4581767519818982841L;

	@Override
	public String execute() throws Exception {
		for (int i = 0; i < 1000; i++) {

			System.out.println("第" + i + "次循环");

		}
		return SUCCESS;
	}

}
