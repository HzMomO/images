/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2016-04-14 03:08:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.dtkl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.linkage.bace.core.GlobalValues;
import com.asiainfo.manage.PermissionUtil;
import com.asiainfo.os.InitParam;
import com.asiainfo.os.SessionInfoUtil;
import com.asiainfo.os.bean.StaffSessBean;
import com.asiainfo.os.Base64;

public final class warn_005funknown_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/dtkl/../common/jsp/common.jsp", Long.valueOf(1460538780000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>大数据辅助突发公共安全事件防控平台</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	StaffSessBean staffSessBean = SessionInfoUtil.getStaffSessBean(session);
	PermissionUtil pUtil = new PermissionUtil(session);
	String curUserId = staffSessBean.getUserId();
	String curUserName = staffSessBean.getUserName();
	String curUserPwd = staffSessBean.getUserPassword();
	String curUserAreaId = staffSessBean.getAreaId();
	Boolean isAdmin = staffSessBean.isAdmin();

	String DEPLOY_TYPE_DEVELOP = InitParam.DEPLOY_TYPE_DEVELOP;
	String DEPLOY_TYPE_PRODUCT = InitParam.DEPLOY_TYPE_PRODUCT;
	String DEPLOY_TYPE = InitParam.DEPLOY_TYPE;
	String DATA_SOURCE = InitParam.DATA_SOURCE;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/common/js/head.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/common/js/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/common/js/base.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t// 参数定义\r\n");
      out.write("\tvar CONTENT_PATH               = '");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("';\r\n");
      out.write("\tvar curUserId                  = '");
      out.print(curUserId);
      out.write("';\r\n");
      out.write("\tvar curUserName                = '");
      out.print(curUserName);
      out.write("';\r\n");
      out.write("\tvar curUserAreaId              = '");
      out.print(curUserAreaId);
      out.write("';\r\n");
      out.write("\tvar BASE64_KEY        \t\t   = '");
      out.print(InitParam.BASE64_KEY);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_TYPE_DEVELOP        = '");
      out.print(InitParam.DEPLOY_TYPE_DEVELOP);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_TYPE                = '");
      out.print(InitParam.DEPLOY_TYPE);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_PROVINCE            = '");
      out.print(InitParam.DEPLOY_PROVINCE);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_PROVINCE_ID         = '");
      out.print(InitParam.DEPLOY_PROVINCE_ID);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_PROVINCE_NAME       = '");
      out.print(InitParam.DEPLOY_PROVINCE_NAME);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_ID_CARD_PROVINCE_ID = '");
      out.print(InitParam.DEPLOY_ID_CARD_PROVINCE_ID);
      out.write("';\r\n");
      out.write("\tvar DEPLOY_PROVINCE_NAME_SHORT = DEPLOY_PROVINCE_NAME.replace(\"省\", \"\").replace(\"市\", \"\").replace(\"自治区\", \"\");\r\n");
      out.write("\tvar AREA_CITY_LENGTH           = '");
      out.print(InitParam.AREA_CITY_LENGTH);
      out.write("';\r\n");
      out.write("\tvar AREA_COUNTY_LENGTH         = '");
      out.print(InitParam.AREA_COUNTY_LENGTH);
      out.write("';\r\n");
      out.write("\tvar AREA_REGION_LENGTH         = '");
      out.print(InitParam.AREA_REGION_LENGTH);
      out.write("';\r\n");
      out.write("\tvar AREA_SUB_REGION_LENGTH     = '");
      out.print(InitParam.AREA_SUB_REGION_LENGTH);
      out.write("';\r\n");
      out.write("\r\n");
      out.write("\t// 参数定义\r\n");
      out.write("\tvar logoutUrl = CONTENT_PATH + '/common/jsp/logout.jsp';\r\n");
      out.write("\tvar errorUrl = CONTENT_PATH + '/common/jsp/error.html';\r\n");
      out.write("\tvar\tpwdModifyUrl = CONTENT_PATH + '/dtkl/pwd_modify.jsp';\r\n");
      out.write("\tvar\tindexUrl = CONTENT_PATH + '/dtkl/index.jsp';\r\n");
      out.write("\r\n");
      out.write("\tvar lib_define = {\r\n");
      out.write("\t\t'jquery' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' : ''\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'jquery-ui' : {\r\n");
      out.write("\t\t\t'css' : [\r\n");
      out.write("\t\t\t\t'/common/js/jquery-ui/themes/base/jquery-ui.css',\r\n");
      out.write("\t\t\t\t'/common/js/jquery-ui/themes/base/jquery.ui.dialog.css'\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\t'js' : '/common/js/jquery-ui/jquery-ui-1.9.2.custom.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'artDialog' : {\r\n");
      out.write("\t\t\t'css' : '/common/js/artDialog/ui-dialog.css',\r\n");
      out.write("\t\t\t'js' : [ \r\n");
      out.write("\t\t\t\t'/common/js/artDialog/dialog-min.js',\r\n");
      out.write("\t\t\t\t'/common/js/artDialog/dialog-plus-min.js' \r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'ztree' : {\r\n");
      out.write("\t\t\t'css' : '/common/js/ztree/css/zTreeStyle/zTreeStyle.css',\r\n");
      out.write("\t\t\t'js' : '/common/js/ztree/js/jquery.ztree.all-3.5.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'ztree_table' : {\r\n");
      out.write("\t\t\t'css' : '/common/js/ztree/css/zTreeStyle/zTreeStyle_table.css',\r\n");
      out.write("\t\t\t'js' : '/common/js/ztree/js/jquery.ztree.all-3.5.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'iconfont' : {\r\n");
      out.write("\t\t\t'css' : '/common/iconfont/iconfont.css',\r\n");
      out.write("\t\t\t'js' : ''\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'base' : {\r\n");
      out.write("\t\t\t'css' : '/common/css/base.css',\r\n");
      out.write("\t\t\t'js' : ''\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'page' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' : '/common/js/page.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'echarts' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' :  '/common/js/echarts.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'json' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' :  '/common/js/json2.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'laydate' : {\r\n");
      out.write("\t\t\t'css' : [\r\n");
      out.write("\t\t\t\t'/common/js/laydate/need/laydate.css',\r\n");
      out.write("\t\t\t\t'/common/js/laydate/skins/danlan/laydate.css'\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\t'js' : '/common/js/laydate/laydate.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'validate' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' : '/common/js/validate.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'manage' : {\r\n");
      out.write("\t\t\t'css' : '/manage/manage.css',\r\n");
      out.write("\t\t\t'js' : '/manage/manage.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'baiduMapButton' : {\r\n");
      out.write("\t\t\t'css' : '',\r\n");
      out.write("\t\t\t'js' : [\r\n");
      out.write("\t\t\t\t'/dtkl/assets/js/BaiduMap/BMapButton.js'\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'baiduMap' : {\r\n");
      out.write("\t\t\t'css' : 'http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css',\r\n");
      out.write("\t\t\t'js' : [\r\n");
      out.write("\t\t\t\t'/dtkl/assets/js/BaiduMap/AreaRestriction_min.js',\r\n");
      out.write("\t\t\t\t'/dtkl/assets/js/BaiduMap/BMapDrawingManager.js',\r\n");
      out.write("\t\t\t\t'/dtkl/assets/js/BaiduMap/BMapLib_GeoUtils.js'\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'dtkl' : {\r\n");
      out.write("\t\t\t'css' : '/dtkl/assets/css/layout.css',\r\n");
      out.write("\t\t\t'js' : ''\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'dfig' : {\r\n");
      out.write("\t\t\t'css' : '/dtkl/assets/css/custom_area.css',\r\n");
      out.write("\t\t\t'js' : '/dfig/dfig.js'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t'dtklbj' : {\r\n");
      out.write("\t\t\t'css' : '/dtklbj/assets/css/layout.css',\r\n");
      out.write("\t\t\t'js' : ''\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t// 判断是否是数组\r\n");
      out.write("\tfunction _isArray(o) {\r\n");
      out.write("\t\treturn Object.prototype.toString.call(o) === '[object Array]';\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 让Array的indexOf支持IE8\r\n");
      out.write("\tif (!Array.prototype.indexOf) {\r\n");
      out.write("\t\tArray.prototype.indexOf = function(elt /*, from*/ ) {\r\n");
      out.write("\t\t\tvar len = this.length >>> 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar from = Number(arguments[1]) || 0;\r\n");
      out.write("\t\t\tfrom = (from < 0) ? Math.ceil(from) : Math.floor(from);\r\n");
      out.write("\t\t\tif (from < 0)\r\n");
      out.write("\t\t\t\tfrom += len;\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor (; from < len; from++) {\r\n");
      out.write("\t\t\t\tif (from in this &&\r\n");
      out.write("\t\t\t\t\tthis[from] === elt)\r\n");
      out.write("\t\t\t\t\treturn from;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn -1;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t// 异步加载js和css\r\n");
      out.write("\tfunction _requires(type, libs, callback) {\r\n");
      out.write("\t\t// 时间戳，防止缓存\r\n");
      out.write("\t\tvar date = new Date();\r\n");
      out.write("\t\tdate = '?date=' + date;\r\n");
      out.write("\r\n");
      out.write("\t\tlibs = libs ? libs : [];\r\n");
      out.write("\r\n");
      out.write("\t\t// 默认加载通用框架\r\n");
      out.write("\t\tlibs.unshift('jquery', 'base', 'iconfont');\r\n");
      out.write("\r\n");
      out.write("\t\t//调整加载顺序，如有百度地图，则优先加载\r\n");
      out.write("\t\tif(libs.indexOf('baiduMap') != -1){\r\n");
      out.write("\t\t\thead.load('http://api.map.baidu.com/getscript?v=2.0&ak=sGZOkeDdDDh55kIiuYC2qUg1&services=&t=20150818132813');\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 加载css\r\n");
      out.write("\t\tif('all' == type || 'css' == type){\r\n");
      out.write("\t\t\tvar css_arr = [];\r\n");
      out.write("\t\t\tfor (var i = 0; i < libs.length; i++) {\r\n");
      out.write("\t\t\t\tvar lib_name = libs[i];\r\n");
      out.write("\t\t\t\tif (lib_name.indexOf('.css') != -1) {\r\n");
      out.write("\t\t\t\t\t// 直接路径\r\n");
      out.write("\t\t\t\t\tvar lib_css = CONTENT_PATH + lib_name + date;\r\n");
      out.write("\t\t\t\t\tcss_arr.push(lib_css);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t// 已经定义的lib\r\n");
      out.write("\t\t\t\t\tvar lib = lib_define[lib_name];\r\n");
      out.write("\t\t\t\t\tif (null == lib) {\r\n");
      out.write("\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar lib_css = lib.css;\r\n");
      out.write("\t\t\t\t\tif (null == lib_css || lib_css.length < 1) {\r\n");
      out.write("\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (_isArray(lib_css)) {\r\n");
      out.write("\t\t\t\t\t\t//多个\r\n");
      out.write("\t\t\t\t\t\tfor (var j = 0; j < lib_css.length; j++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar css = lib_css[j];\r\n");
      out.write("\t\t\t\t\t\t\tif (!/^http/.test(css)){\r\n");
      out.write("\t\t\t\t\t\t\t\tcss = CONTENT_PATH + css + date;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tcss_arr.push(css);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//单个\r\n");
      out.write("\t\t\t\t\t\tif (!/^http/.test(lib_css)){\r\n");
      out.write("\t\t\t\t\t\t\tlib_css = CONTENT_PATH + lib_css + date;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tcss_arr.push(lib_css);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfor (var k = 0; k < css_arr.length; k++) {\r\n");
      out.write("\t\t\t\tvar c = css_arr[k];\r\n");
      out.write("\t\t\t\thead.load(c);\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 加载js\r\n");
      out.write("\t\tif('all' == type || 'js' == type){\r\n");
      out.write("\t\t\tvar js_arr = [];\t\r\n");
      out.write("\t\t\tfor (var i = 0; i < libs.length; i++) {\r\n");
      out.write("\t\t\t\tvar lib_name = libs[i];\r\n");
      out.write("\t\t\t\tif (lib_name.indexOf('.js') != -1) {\r\n");
      out.write("\t\t\t\t\t// 直接路径\r\n");
      out.write("\t\t\t\t\tvar lib_js = CONTENT_PATH + lib_name + date;\r\n");
      out.write("\t\t\t\t\tjs_arr.push(lib_js);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t// 已经定义的lib\r\n");
      out.write("\t\t\t\t\tvar lib = lib_define[lib_name];\r\n");
      out.write("\t\t\t\t\tif (null == lib) {\r\n");
      out.write("\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar lib_js = lib.js;\r\n");
      out.write("\t\t\t\t\tif (null == lib_js || lib_js.length < 1) {\r\n");
      out.write("\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (_isArray(lib_js)) {\r\n");
      out.write("\t\t\t\t\t\t//多个\r\n");
      out.write("\t\t\t\t\t\tfor (var j = 0; j < lib_js.length; j++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar js = lib_js[j];\r\n");
      out.write("\t\t\t\t\t\t\tif (!/^http/.test(js)){\r\n");
      out.write("\t\t\t\t\t\t\t\tjs = CONTENT_PATH + js + date;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tjs_arr.push(js);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//单个\r\n");
      out.write("\t\t\t\t\t\tif (!/^http/.test(lib_js)){\r\n");
      out.write("\t\t\t\t\t\t\tlib_js = CONTENT_PATH + lib_js + date;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tjs_arr.push(lib_js);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfor (var k = 0; k < js_arr.length; k++) {\r\n");
      out.write("\t\t\t\tvar j = js_arr[k];\r\n");
      out.write("\t\t\t\thead.load(j);\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 异步加载js和css\r\n");
      out.write("\tfunction requires(libs, callback) {\r\n");
      out.write("\t\tvar type = 'all';\r\n");
      out.write("\t\t_requires(type, libs, callback);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 异步加载css\r\n");
      out.write("\tfunction requires_css (libs, callback) {\r\n");
      out.write("\t\tvar type = 'css';\r\n");
      out.write("\t\t_requires(type, libs, callback);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 异步加载js\r\n");
      out.write("\tfunction requires_js (libs, callback) {\r\n");
      out.write("\t\tvar type = 'js';\r\n");
      out.write("\t\t_requires(type, libs, callback);\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/dtkl/assets/css/public.css\"  rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/dtkl/assets/css/warn_unknown.css\"    rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\trequires([\"baiduMap\",\"page\",\"laydate\",\"json\",\"/dtkl/warn_unknown_regionInit.js\",\"/dtkl/warn_unknown.js\"]);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"no_overflow\">\r\n");
      out.write("\t<div class=\"un_crumbs\">\r\n");
      out.write("\t    \r\n");
      out.write("        <span style=\"color:#32b5cb\" class=\"info\">区域智能预警：\r\n");
      out.write("        <div class=\"area_info_alert\" style=\"z-index: 99999; left: 75px; \"><div class=\"text\">1、原理简介</br>\r\n");
      out.write("区域智能预警采用统计检验的方法，通过分析大规模历史数据，总结区域人数变化规律，从数值角度对各个区域出现的人数突增情况进行预警，同时采用业务规则（如最小人数、超过阈值幅度、白名单等）对预警结果进行人工干预，减少非必要预警或误报。</br>\r\n");
      out.write("2、界面说明</br>\r\n");
      out.write("1）当地图视野范围内的预警数量小于等于10个时可以查看告警详细信息，其他场景可以通过切换到列表视图查看；</br>\r\n");
      out.write("2）当地图视野范围内的预警数量小于等于10个时，预警的圆形边界只是近似表示预警范围，与真实情形可能存在一定差异。\r\n");
      out.write("</div><div class=\"arr\"></div></div>\r\n");
      out.write("        </span>\r\n");
      out.write("       \t<label id=\"label_warn_tips\">您当前共有 <a href='javascript:void(0)'  onclick='show_warn_in_list($(this))'>\r\n");
      out.write("       \t    <span style='color:#32b5cb' id=\"warn_tip_total\" ></span></a> 个区域预警，\r\n");
      out.write("       \t    <span class=\"info\" style=\"font-size:unset;\">红色预警 <div class=\"area_info_alert\" style=\"z-index: 99999; left: 390px; \"><div class=\"text\"> 红色预警：超过阈值且人数增速加快</div><div class=\"arr\"></div></div></span><a href='javascript:void(0)' warn_level_id='3' warn_level_name='红色' onclick='show_warn_in_list($(this))'><span id=\"warn_tip_red\" style='color:#32b5cb'></span></a> 个，\r\n");
      out.write("       \t    <span class=\"info\" style=\"font-size:unset;\">橙色预警 <div class=\"area_info_alert\" style=\"z-index: 99999; left: 510px; \"><div class=\"text\"> 橙色预警：超过阈值且人数增速减慢</div><div class=\"arr\"></div></div></span>  <a href='javascript:void(0)' warn_level_id='2' warn_level_name='橙色' onclick='show_warn_in_list($(this))'><span id=\"warn_tip_orange\" style='color:#32b5cb'></span> </a> 个，\r\n");
      out.write("       \t    <span class=\"info\" style=\"font-size:unset;\">黄色预警  <div class=\"area_info_alert\" style=\"z-index: 99999; left: 630px; \"><div class=\"text\"> 黄色预警：超过阈值且人数净增减少</div><div class=\"arr\"></div></div></span><a href='javascript:void(0)' warn_level_id='1' warn_level_name='黄色' onclick='show_warn_in_list($(this))'><span id=\"warn_tip_yellow\" style='color:#32b5cb' ></span></a> 个\r\n");
      out.write("       \t  </label>\r\n");
      out.write("       \t<label id=\"label_warn_tips_empty\">暂无预警信息</label>\t\r\n");
      out.write("        <!-- 默认为列表模式 -->\r\n");
      out.write("        <ul id=\"ul_show_model\" class=\"un_btn_maplist\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("            \t<p class=\"qiehuan\" id=\"DIV_SHOW_MODEL\"><span id=\"un_crumbs_p_gis\" class=\"btnOn\"><a href=\"javascript:void(0);\">地图</a></span><span id=\"un_crumbs_p_grid\"><a href=\"javascript:void(0);\">列表</a></span></p>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--     <div style=\"border: 1px solid red;width: 150px;height:20px;position:absolute;top:9px;right:180px;\">\r\n");
      out.write("    \t<div id=\"cycle_loading\" style=\"background-color: red;width: 0px;height: 100%\">\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div> -->\r\n");
      out.write("\t<div id=\"warn_map_unknown\">   \r\n");
      out.write("    \t<div class=\"un_map_left loadingSmall hidden\">\r\n");
      out.write("        \t<ul class=\"un_map_left_info\" id=\"ul_warn_unknow_list\">\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"un_map_left_info_close\" class=\"left_open hidden\"></div>\r\n");
      out.write("        <div id=\"warn_map\" class=\"warn_map loadingBig\" ></div>  \r\n");
      out.write("        <div id=\"warn_map_2\"></div>  \r\n");
      out.write("        <div class=\"unknowm_map unknown_map_region\" id=\"unknown_map_region\">\r\n");
      out.write("\t    \t<ul class=\"un_set_condition\">\r\n");
      out.write("\t        \t<!--li  class=\"un_select\">\r\n");
      out.write("\t        \t\t<select id=\"map_city\" name=\"map_city\">\r\n");
      out.write("\t        \t\t</select>\r\n");
      out.write("\t        \t\t<select id=\"map_county\" name=\"map_county\">\r\n");
      out.write("\t        \t\t</select>\r\n");
      out.write("\t            </li-->\r\n");
      out.write("\t            <input type=\"hidden\"  id=\"region_id\" name=\"region_id\" value=\"\" />\r\n");
      out.write("\t        \t<li class=\"un_select\"></li>\r\n");
      out.write("\t            <!--城市下拉框开始-->\r\n");
      out.write("\t            <div class=\"un_city\" >\r\n");
      out.write("\t            \t<h1>城市列表<a href=\"javascript:void(0)\" id=\"un_city_info_close\"></a></h1>\r\n");
      out.write("\t                <div class=\"un_city_name\">\r\n");
      out.write("\t                \t当前城市：<span id=\"un_city_name_span\"></span>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"un_city_btn\">\r\n");
      out.write("                    \t<a href=\"javascript:void(0);\" id=\"un_city_all_prov\" class=\"big_city\" style=\"display: none;\">浙江省</a>\r\n");
      out.write("\t                    <div><input id=\"un_city_inp_key\" name=\"un_city_inp_key\" type=\"text\" value=\"输入区域名\" onfocus=\"if(this.value=='输入区域名'){this.value=''};this.style.color='black';\" onblur=\"if(this.value==''||this.value=='输入区域名'){this.value='输入区域名';this.style.color='#DFDFDF';}\">\r\n");
      out.write("               \t\t\t<a href=\"javascript:void(0)\" id=\"un_city_search\">搜索</a></div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"un_city_select_box\"\tid=\"unknown_map_region_select\">\r\n");
      out.write("                \t</div>\r\n");
      out.write("            \t</div>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"unknown_map_search\" id=\"unknown_map_search\">\r\n");
      out.write("\t    \t<ul class=\"un_set_condition\">\r\n");
      out.write("\t\t\t\t<li class=\"un_search\">\r\n");
      out.write("\t                <p>\r\n");
      out.write("\t                \t<input type=\"text\" id=\"inp_key\" name=\"inp_key\" value=\"搜索区域，如:西湖区政府\" onfocus=\"if(this.value=='搜索区域，如:西湖区政府'){this.value=''};this.style.color='black';\" onblur=\"if(this.value==''||this.value=='搜索区域，如:西湖区政府'){this.value='搜索区域，如:西湖区政府';this.style.color='#DFDFDF';}\">\r\n");
      out.write("\t                \t<span class=\"vi_del\"></span>\r\n");
      out.write("\t                \t<a href=\"javascript:void(0);\" onclick=\"cmdLocalSearch(true)\"><img src=\"./assets/css/images/unknown_btn_sech.png\" /></a>\r\n");
      out.write("\t                </p>\r\n");
      out.write("\t                <ul id=\"ul_map_search\">\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t            </li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>    \r\n");
      out.write("        <div class=\"unknowm_map unknown_map_reset\" id=\"unknown_map_reset\">\r\n");
      out.write("\t\t\t<span title=\"重置地图\" id=\"zoom_span\" class=\"zoom_span\">\r\n");
      out.write("\t\t\t\t<span id=\"zoom_span_1\" class=\"zoom_span_paint_reset\">\r\n");
      out.write("\t\t\t\t\t<!-- <span id=\"zoom_span_reset\" class=\"zoom_span_reset\">重置</span> -->\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t\t<div class=\"unknowm_map unknown_map_stop\" id=\"unknown_map_stop\">\r\n");
      out.write("\t\t\t<div title=\"开始计时\" id=\"zoom_span11\" class=\"zoom_span\">\r\n");
      out.write("\t\t\t\t<div id=\"zoom_span_111\" class=\"zoom_span_paint_stop\">\r\n");
      out.write("\t\t\t\t\t<!-- <span id=\"zoom_span_reset\" class=\"zoom_span_reset\">重置</span> -->\r\n");
      out.write("\t\t\t\t\t<div id=\"un_cycle_div\" class=\"un_cycle hidden\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ball-clip-rotate\" style=\"width: 30px;height:30px;\">\r\n");
      out.write("\t\t\t\t\t\t  <div></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"un_cycle\" id=\"cycle_timer\">60\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"unknowm_map unknown_map_zoom\" id=\"unknown_map_zoom\">\r\n");
      out.write("\t\t\t<span title=\"区域框选工具\" id=\"zoom_span\" class=\"zoom_span\">\r\n");
      out.write("\t\t\t\t<span id=\"zoom_span_1\" class=\"zoom_span_unpaint\">\r\n");
      out.write("\t\t\t\t\t<span id=\"zoom_span_11\" class=\"zoom_span_11\">\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span id=\"zoom_span_12\" class=\"zoom_span_12\">框选</span>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>   \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"warn_list_unknown\" style=\"display: none; overflow:auto; height:92%\">\r\n");
      out.write("\t\t<div class=\"un_list_select_box\">\r\n");
      out.write("\t\r\n");
      out.write("    <span class=\"un_liti\">所有预警：<span class=\"selected\"></span>共有 <al></al> 条相关预警    \t\r\n");
      out.write("    </span>\r\n");
      out.write("    <p class=\"un_list_shaixuan\" onclick=\"show_or_hide_selece_box()\">打开筛选</p>\r\n");
      out.write("    <ul class=\"un_list_select\" style=\"display:none;\">\r\n");
      out.write("    <li class=\"deal_state\">\r\n");
      out.write("           <div>\r\n");
      out.write("        \t处理状态：\r\n");
      out.write("           </div>\r\n");
      out.write("        \t<div class=\"xuanxiang\" id=\"xuanxiang\">\r\n");
      out.write("            \t<p><a href=\"javascript:void(0)\" deal_state=\"1\" onclick=\"select_deal_state($(this))\">已处理</a></p>\r\n");
      out.write("            \t<p><a href=\"javascript:void(0)\" deal_state=\"0\" onclick=\"select_deal_state($(this))\">未处理</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("                \r\n");
      out.write("        <li class=\"warn_level_id\">\r\n");
      out.write("        \t<div>\r\n");
      out.write("            \t预警级别：\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xuanxiang\" id=\"xuanxiang\">\r\n");
      out.write("                <p><input type=\"hidden\"  id=\"a\" warn_level_id=\"3\" warn_level_name=\"红色\"><a href=\"javascript:void(0)\" warn_level_id=\"3\">红色</a></p>\r\n");
      out.write("            \t<p><input type=\"hidden\" warn_level_id=\"2\" warn_level_name=\"橙色\"><a href=\"javascript:void(0)\" warn_level_id=\"2\">橙色</a></p>\r\n");
      out.write("                <p><input type=\"hidden\" warn_level_id=\"1\" warn_level_name=\"黄色\"><a href=\"javascript:void(0)\" warn_level_id=\"1\">黄色</a></p>\r\n");
      out.write("                <h2>\r\n");
      out.write("                \t<a href=\"javascript:void(0)\" onclick=\"select_warn_level()\">提交</a>\r\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"quxiao\">取消</a>\r\n");
      out.write("                </h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"xuanxbtn\">\r\n");
      out.write("            \t<a href=\"javascript:void(0)\" class=\"duoxuan\" state=\"close\">多选</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"li_last\">\r\n");
      out.write("        \t<div>\r\n");
      out.write("            \t所属地区：\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xuanxiang\" id=\"xuanxiang\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xuanxbtn\">\r\n");
      out.write("            \t<a href=\"javascript:void(0)\" class=\"duoxuan\" state=\"close\">多选</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \t<div class=\"xuanxiang\" id=\"xuanxiang1\">\r\n");
      out.write("            \t<h2>\r\n");
      out.write("                \t<a href=\"javascript:void(0)\" onclick=\"select_regions()\">提交</a>\r\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"quxiao\">取消</a>\r\n");
      out.write("                </h2> \r\n");
      out.write("            \t</div>\r\n");
      out.write("            \t\r\n");
      out.write("                            \r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"jizhan\">\r\n");
      out.write("        \t<div>\r\n");
      out.write("            \t基站名称：\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xuanxiang\" id=\"xuanxiang\">\r\n");
      out.write("            \t<div class=\"xiala gengduo\">\r\n");
      out.write("                \t   \r\n");
      out.write("                \t                \t\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"sousuo\"><input type=\"text\" id=\"jizhan_search\" ></input><span onclick=\"search_jizhan()\"></span></div>               \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xuanxbtn\">\r\n");
      out.write("            \t\t<a href=\"javascript:void(0)\" class=\"duoxuan\" state=\"close\" onclick=\"toggle_jizhan_checkbox()\">多选</a>\r\n");
      out.write("            \t\t<a href=\"javascript:void(0)\" class=\"more\" state=\"close\" onclick=\"toggle_jizhan_more($(this))\">更多</a>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("               <h2 class=\"jizhan_\">\r\n");
      out.write("                \t\t<a href=\"javascript:void(0)\" class=\"jizhan_tijiao\" onclick=\"select_jizhan()\">提交</a>\r\n");
      out.write("                    \t<a href=\"javascript:void(0)\" class=\"jizhan_quxiao\" onclick=\"quxiao_select_jizhan()\">取消</a>\r\n");
      out.write("               </h2>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t<p class=\"un_list_export\" href=\"\" onclick=\"export_warn_to_excel()\">导出</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<table class=\"un_table_text\" cellspacing=\"0\" id='warnTable'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"SID\">序号</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"list_shaixuan\" id=\"list_shaixuan\"><a href=\"javascript:void(0)\" onclick=\"initOrder($(this))\"> 预警产生时间</a><span order_name=\"d.warn_start_time\" id=\"datetime_id\" class=\"order\" order_type=\"asc\"></span></th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<th class=\"list_shaixuan\"><a href=\"javascript:void(0)\" onclick=\"initOrder($(this))\">预警级别</a><span order_name=\"b.warn_level_id\" class=\"order\" order_type=\"\"></span></th>\r\n");
      out.write("\t\t\t\t\t<th>当前客流总量</th>\r\n");
      out.write("\t\t\t\t\t<th>预警阈值</th>\r\n");
      out.write("\t\t\t\t\t<th>超阈值幅度</th>\r\n");
      out.write("\t\t\t\t\t<th>预警持续时间</th>\r\n");
      out.write("\t\t\t\t\t<th>所属基站</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"list_shaixuan\"><a href=\"javascript:void(0)\" onclick=\"initOrder($(this))\">所属地区</a><span order_name=\"e.city_name,c.county_name\" class=\"order\" order_type=\"\"></span></th> \t\t\t\t\t\t\t\t\t\r\n");
      out.write("                    <th class=\"list_shaixuan\"><a href=\"javascript:void(0)\" onclick=\"initOrder($(this))\">处理状态</a><span order_name=\"d.deal_type_id\" class=\"order\" order_type=\"\"></span></th>\r\n");
      out.write("\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"mytable\">\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"data-table-loading loadingSmall\" style=\"height:150px;\" ></div>\r\n");
      out.write("\t\t<div class=\"page-box\" id=\"pageBox\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
