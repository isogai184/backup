/**
 *
 */
package com.internousdev.template1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template1.util.DBConnector;
import com.internousdev.template1.util.DateUtil;
/**
 * @author internousdev
 *
 */
public class BuyItemCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "insert into user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) values(?, ?, ?, ?, ?, ?)";




	public void BuyItemInfo(String item_transaction_id, String user_master_id, String total_price, String total_count, String pay) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			preparedStatement.setString(3, total_price);
			preparedStatement.setString(4, total_count);
			preparedStatement.setString(5, pay);
			preparedStatement.setString(6, dateUtil.getDate());

			preparedStatement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
