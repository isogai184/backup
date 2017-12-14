/**
 *
 */
package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.internousdev.template2.dto.BuyItemDTO;
import com.internousdev.template2.util.DBConnector;
import com.internousdev.template2.util.DateUtil;
/**
 * @author internousdev
 *
 */
public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "insert into user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) values(?, ?, ?, ?, ?, ?)";

	public void buyItemInfo(String user_master_id, List<BuyItemDTO> buyItemDTOList, String pay) throws SQLException {

		try {
			for(int i=0; i < buyItemDTOList.size(); i++) {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, buyItemDTOList.get(i).getId());
				preparedStatement.setInt(2, buyItemDTOList.get(i).getTotalPrice());
				preparedStatement.setString(3, buyItemDTOList.get(i).getStock());
				preparedStatement.setString(4, user_master_id);
				preparedStatement.setString(5, pay);
				preparedStatement.setString(6, dateUtil.getDate());

				preparedStatement.execute();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
