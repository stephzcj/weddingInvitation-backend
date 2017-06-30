package weddinginvitation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import weddinginvitation.domain.Danmu;
import weddinginvitation.domain.Guest;
import weddinginvitation.service.DanmuService;
import weddinginvitation.util.Utility;
import weddinginvitation.util.WiConfig;
@Controller
@ResponseBody
public class DanmuController {
	@Autowired
	private Utility utility;
	@Autowired
	DanmuService danmuService;
	@Autowired
	WiConfig wiConfig;
	private Gson gson=new Gson();
	
	@RequestMapping(value="/getdanmu",method=RequestMethod.GET)
	public String getDanmu(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
		return utility.crossDomain(httpServletResponse, gson.toJson(danmuService.getDanmu()));
	}
	
	@RequestMapping(value="/adddanmu",method=RequestMethod.POST)
	public void addDanmu(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
		Danmu danmu=new Danmu();
		danmu.setContext(httpServletRequest.getParameter("context"));
		httpServletResponse.setHeader("Access-Control-Allow-Origin", wiConfig.getCrossDomainUrl());
	    danmuService.addDanmu(danmu);
	}
	
	@RequestMapping(value="/recordguest",method=RequestMethod.POST)
	public void recordGuest(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
		Guest guest=new Guest();
		guest.setName(httpServletRequest.getParameter("name"));
		guest.setpNum(Integer.parseInt(httpServletRequest.getParameter("pnum")));
		httpServletResponse.setHeader("Access-Control-Allow-Origin", wiConfig.getCrossDomainUrl());
	    danmuService.recordGuest(guest);
	}
}
