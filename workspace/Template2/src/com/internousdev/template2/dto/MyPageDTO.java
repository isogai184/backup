/**
 *
 */
package com.internousdev.template2.dto;

/**
 * @author internousdev
 *
 */
public class MyPageDTO {

	public String itemName;
	public String totalPrice;
	public String totalCount;
	public String payment;
	public String userName;
	public int id;
	public String insert_date;
	public boolean checked;

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public boolean getChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		//this.checked = checked;
		this.checked = false;
	}

}
