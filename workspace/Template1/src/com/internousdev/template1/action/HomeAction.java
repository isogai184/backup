/**
 *
 */
package com.internousdev.template1.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class HomeAction extends ActionSupport {

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @rerturn SUCCESS
	 */
	public String execute() {
		return SUCCESS;
	}
}
