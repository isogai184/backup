/**
 *
 */
package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.MyPageDAO;
import com.internousdev.template2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class GoMyPageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public MyPageDAO myPageDAO = new MyPageDAO();
	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	public String execute() throws SQLException {

		String user_master_id = session.get("login_user_id").toString();

		//ループでListのidを複数作成→Listに入れる→session.put
		myPageList = myPageDAO.getMyPageUserInfo(user_master_id);

		Iterator<MyPageDTO> iterator = myPageList.iterator();
		if (!(iterator.hasNext())) {
			myPageList = null;
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
