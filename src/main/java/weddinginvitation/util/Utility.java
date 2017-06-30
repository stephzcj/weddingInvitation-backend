package weddinginvitation.util;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Utility {
	@Autowired
	WiConfig wiConfig;
	public  String crossDomain(HttpServletResponse httpServletResponse,String returnData){
		httpServletResponse.setHeader("Access-Control-Allow-Origin", wiConfig.getCrossDomainUrl());
		return returnData;
	}
}
