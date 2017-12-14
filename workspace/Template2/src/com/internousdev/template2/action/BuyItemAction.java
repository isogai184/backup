/**
 *
 */
package com.internousdev.template2.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class BuyItemAction extends ActionSupport implements SessionAware {

	private List<String> stock;

	private String pay;

	public Map<String, Object> session;

//	private List<Integer> totalPriceList = new ArrayList<>();

//	private List<String> paymentList = new ArrayList<>();;

	private String result;

	public String execute() {

		result = SUCCESS;

		// LoginActionでsessionにつめた商品情報DTOのデータを取得します。
		@SuppressWarnings("unchecked")
		List<BuyItemDTO> buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");

		// 商品の購入個数(商品分)だけ同じ処理を繰り返します。
		for(int i=0; i < stock.size(); i++) {

			int intStock = Integer.parseInt(stock.get(i));
			int intPrice = Integer.parseInt(buyItemDTOList.get(i).getItemPrice());

			// 合計金額を商品DTOへ格納します。
			buyItemDTOList.get(i).setTotalPrice(intStock * intPrice);

			if(pay.equals("1")) {
				session.put("payment", "現金払い");
			} else {
				session.put("payment", "クレジットカード");
			}

			// 商品DTOはLoginActionで取得した古い情報なので、新しい情報へ更新します。
			buyItemDTOList.get(i).setStock(stock.get(i));
		}

		session.put("buyItemDTOList", buyItemDTOList);
		return result;
	}

	public List<String> getStock() {
		return stock;
	}
	public void setStock(List<String> stock) {
		this.stock = stock;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
