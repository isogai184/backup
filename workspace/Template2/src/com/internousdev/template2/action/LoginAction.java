/**
 *
 */
package com.internousdev.template2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.BuyItemDAO;
import com.internousdev.template2.dao.LoginDAO;
import com.internousdev.template2.dto.BuyItemDTO;
import com.internousdev.template2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String result;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	public String execute() {
		result =ERROR;

		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser", loginDTO);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

//			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			List<BuyItemDTO> buyItemDTOList = buyItemDAO.getBuyItemInfoList();

			session.put("login_user_id", loginDTO.getLoginId());
//			session.put("id", buyItemDTO.getId());
//			session.put("buyItem_name", buyItemDTO.getItemName());
//			session.put("buyItem_price", buyItemDTO.getItemPrice());

			session.put("buyItemDTOList",buyItemDTOList);

		}
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}


	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}