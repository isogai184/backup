/**
 *
 */
package com.internousdev.webproj6.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj6.dao.HelloStrutsDAO;
import com.internousdev.webproj6.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class HelloStrutsAction extends ActionSupport {

	private List<HelloStrutsDTO> HelloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

	public String execute() {
		String ret = ERROR;
		HelloStrutsDAO dao = new HelloStrutsDAO();
		HelloStrutsDTO dto = new HelloStrutsDTO();

		HelloStrutsDTOList = dao.select();

		if (HelloStrutsDTOList.size() > 0) {
			ret = SUCCESS;
		} else {
			ret = ERROR;
		}
		return ret;
	}

	public List<HelloStrutsDTO> getHelloStrutsDTOList() {
		return HelloStrutsDTOList;
	}
	public void setHelloStrutsDTOList(List<HelloStrutsDTO> helloStrutsDTOList) {
		HelloStrutsDTOList = helloStrutsDTOList;
	}

}
