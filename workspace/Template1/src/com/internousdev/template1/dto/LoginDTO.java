/**
 *
 */
package com.internousdev.template1.dto;

/**
 * @author internousdev
 *
 */
public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private String username;
	private boolean loginFlg = false;

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginpassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

}
