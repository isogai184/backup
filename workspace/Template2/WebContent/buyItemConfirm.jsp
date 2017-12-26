<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>BuyItemConfirm画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form action="BuyItemConfirmAction">
				<table>
				<s:iterator value="#session.buyItemDTOList">
					<tr>
						<td>商品名</td>
						<td>
							<s:property value="itemName" />
						</td>
					</tr>
					<tr>
						<td>値段</td>
						<td>
							<s:property value="itemPrice" />
						</td>
					</tr>
					<tr>
						<td>購入個数</td>
						<td>
							<s:property value="stock" /><span>個</span>
						</td>
					</tr>
					</s:iterator>
					<tr>
						<td>支払い方法</td>
						<td>
							<s:property value="session.payment" />
						</td>
					</tr>

					<tr>
						<td>
							<s:submit value="完了" />
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>