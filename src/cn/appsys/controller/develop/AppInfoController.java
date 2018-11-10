package cn.appsys.controller.develop;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.AppCategory;
import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.DataDictionary;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.AppCategoryService;
import cn.appsys.service.developer.AppInfoService;
import cn.appsys.service.developer.DataDictionaryService;
import cn.appsys.tools.Constants;
import cn.appsys.tools.PageSupport;

@Controller
@RequestMapping(value="/dev/flatform/app")
public class AppInfoController {
	@Resource
	private AppInfoService appInfoService;	
	@Resource
	private DataDictionaryService dataDictionaryService;
	@Resource
	private AppCategoryService appCategoryService;
	private Logger logger=Logger.getLogger(DevUserController.class);
	@RequestMapping(value="/list")
	public String getAppInfoList(Model model,HttpSession session,@RequestParam(value="querySoftwareName",required=false)String querySoftwareName,
@RequestParam(value="queryStatus",required=false)String _queryStatus,
@RequestParam(value="queryCategroyLevel1",required=false)String _queryCategoryLevel1,
@RequestParam(value="queryCategroyLevel2",required=false)String _queryCategoryLevel2,
@RequestParam(value="queryCategroyLevel3",required=false)String _queryCategoryLevel3,
@RequestParam(value="queryFlatformId",required=false)String _queryFlatformId,
@RequestParam(value="pageIndex",required=false)String pageIndex){
		logger.info("getAppInfoList-->"+querySoftwareName);
		logger.info("getAppInfoList-->"+_queryStatus);
		logger.info("getAppInfoList-->"+_queryCategoryLevel1);
		logger.info("getAppInfoList-->"+_queryCategoryLevel2);
		logger.info("getAppInfoList-->"+_queryCategoryLevel3);
		logger.info("getAppInfoList-->"+_queryFlatformId);
		logger.info("getAppInfoList-->"+pageIndex);
		Integer devId =((DevUser)session.getAttribute(Constants.DEV_USER_SESSION)).getId();
		List<AppInfo> appInfoList =null;
		List<DataDictionary> statusList=null;
		List<DataDictionary> flatFormList=null;
		//列出一级分类列表
		List<AppCategory> categoryLevel1List =null;
		List<AppCategory> categoryLevel2List =null;
		List<AppCategory> categoryLevel3List =null;
		//页面容量
		int pageSize=Constants.pageSize;
		//当前页码
		Integer currentPageNo =1;
		if(pageIndex !=null){
			try{
				currentPageNo =Integer.valueOf(pageIndex);
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
		Integer queryStatus=null;
		if(_queryStatus !=null && !("").equals(_queryStatus)){
			queryStatus=Integer.parseInt(_queryStatus);
		}
		Integer queryCategoryLevel1 = null;
		if(_queryCategoryLevel1 != null && !_queryCategoryLevel1.equals("")){
			queryCategoryLevel1 = Integer.parseInt(_queryCategoryLevel1);
		}
		Integer queryCategoryLevel2 = null;
		if(_queryCategoryLevel2 != null && !_queryCategoryLevel2.equals("")){
			queryCategoryLevel2 = Integer.parseInt(_queryCategoryLevel2);
		}
		Integer queryCategoryLevel3 = null;
		if(_queryCategoryLevel3 != null && !_queryCategoryLevel3.equals("")){
			queryCategoryLevel3 = Integer.parseInt(_queryCategoryLevel3);
		}
		Integer queryFlatformId = null;
		if(_queryFlatformId != null && !_queryFlatformId.equals("")){
			queryFlatformId = Integer.parseInt(_queryFlatformId);
		}
		int totalCount =0;
		try {
			totalCount = appInfoService.getAppInfoCount(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//总页数
				PageSupport pages = new PageSupport();
				pages.setCurrentPageNo(currentPageNo);
				pages.setPageSize(pageSize);
				pages.setTotalCount(totalCount);
				int totalPageCount = pages.getTotalPageCount();
				//控制首页和尾页
				if(currentPageNo < 1){
					currentPageNo = 1;
				}else if(currentPageNo > totalPageCount){
					currentPageNo = totalPageCount;
				}
				try {
					appInfoList = appInfoService.getAppInfoList(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId, currentPageNo, pageSize);
					statusList = this.getDataDictionaryList("APP_STATUS");
					flatFormList = this.getDataDictionaryList("APP_FLATFORM");
					categoryLevel1List = appCategoryService.getAppCategoryListByParentId(null);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				model.addAttribute("appInfoList", appInfoList);
				model.addAttribute("statusList", statusList);
				model.addAttribute("flatFormList", flatFormList);
				model.addAttribute("categoryLevel1List", categoryLevel1List);
				model.addAttribute("pages", pages);
				model.addAttribute("queryStatus", queryStatus);
				model.addAttribute("querySoftwareName", querySoftwareName);
				model.addAttribute("queryCategoryLevel1", queryCategoryLevel1);
				model.addAttribute("queryCategoryLevel2", queryCategoryLevel2);
				model.addAttribute("queryCategoryLevel3", queryCategoryLevel3);
				model.addAttribute("queryFlatformId", queryFlatformId);
				
				
				return "developer/appinfolist";

	}
	public List<DataDictionary> getDataDictionaryList(String typeCode){
		List<DataDictionary> dataDictionaryList=null;
		try {
			dataDictionaryList=dataDictionaryService.getDataDictionaryList(typeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataDictionaryList;
	}
	
}
