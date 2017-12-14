/**
 *
 */
package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.BuyItemCompleteDAO;
import com.internousdev.template2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String result;

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException {

		@SuppressWarnings("unchecked")
		List<BuyItemDTO> buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

		// 複数回登録処理を回す必要があるので、登録したいデータが詰まったDTOをそのまま引数へ渡します。
		buyItemCompleteDAO.buyItemInfo(session.get("login_user_id").toString(), buyItemDTOList, session.get("payment").toString());

		result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
