/**
 *
 */
package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	public String execute() {
		return SUCCESS;
	}

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
