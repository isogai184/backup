/**
 *
 */
package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class InquiryCompleteAction extends ActionSupport {
	private String name;
	private String qtype;
	private String body;

	public String execute() {
		return SUCCESS;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQtype() {
		return this.qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}