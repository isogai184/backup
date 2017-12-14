/**
 *
 */
package com.internousdev.template2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String result;

	public String execute() {
		result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
