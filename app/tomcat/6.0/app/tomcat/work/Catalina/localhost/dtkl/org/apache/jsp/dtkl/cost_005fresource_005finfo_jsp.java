/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2016-04-13 09:06:12 UTC
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

public final class cost_005fresource_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/dtkl/assets/css/configure.css\"    rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\trequires([\"baiduMap\",\"page\",\"laydate\",\"json\",\"echarts\",\"/dtkl/cost_resource_info.js\"]);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"un_map_left2\" style=\"margin-right:0;\">\r\n");
      out.write("\t<div class=\"un_crumbs2 view_right\">\r\n");
      out.write("        \t\r\n");
      out.write("            \r\n");
      out.write("        \t资源管理\r\n");
      out.write("\t</div>\r\n");
      out.write("\t    <h1 class=\"previewTitl \"><a href=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/dtkl/cost_resource_info.jsp\" style=\"color:#32b5cb\">资源查询</a></h1>\r\n");
      out.write("    \t<h1 class=\"leftTitl\"><a href=\"");
      out.print(GlobalValues.CONTENT_PATH);
      out.write("/dtkl/cost_resource_conf.jsp\" style=\"color:#8e8e8e\">资源设置</a></h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"configureRight\" style=\"margin-left:241px;\">\r\n");
      out.write("\t<div class=\"un_crumbs2 view_right\" style=\"font-size:14px;\">\r\n");
      out.write("        <p class=\"backBtn\" id=\"backBtn\" style = \"display:none;\"></p>\r\n");
      out.write("            \r\n");
      out.write("        \t资源查询\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"billing_option\">\r\n");
      out.write("\t\t<div class=\"billing\">\r\n");
      out.write("\t\t\t<span>计费组织：</span><p id=\"checkedGroup\"></p><button id=\"test\" style=\"display:none;\">test</button>\r\n");
      out.write("\t\t\t<div class=\"bililling_select\" id = \"groupList\" status = \"close\" style=\"display:none;z-index:999;\">\r\n");
      out.write("\t\t\t\t<h1>计费组织 <span id=\"closeGroupList\"></span></h1>\r\n");
      out.write("\t\t\t\t<h2>当前计费组织：<span id =\"checkedGroupCur\"><!-- 浙江省公安厅 --></span></h2>\r\n");
      out.write("\t\t\t\t<div class=\"select_bililling\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"输入计费组织名\" \r\n");
      out.write("\t\t\t\t\tonfocus=\"if(value=='输入计费组织名'){value=''}\"   \r\n");
      out.write("                \tonblur=\"if(value==''){value='输入计费组织名'}\" \r\n");
      out.write("\t\t\t\t\tclass=\"inp_text\" id=\"searchInput\"><input  id=\"searchBtn\" type=\"submit\" value=\"搜索\" class=\"inp_button\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"option_area\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"groupListUL\">\r\n");
      out.write("\t\t\t\t\t\t<li><span>Z</span><!-- 浙江省公安厅 --></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"color_that\">\r\n");
      out.write("\t\t<div class=\"beenot_using\"><span></span>未使用</div>\r\n");
      out.write("\t\t<div class=\"been_using\"><span></span>已使用</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<ul class=\"resourc_graph\">\r\n");
      out.write("\t\t<li class=\"sms_li\">\r\n");
      out.write("\t\t\t<p id=\"smsAllCount\">短信资源总量：-条<span></span></p>\r\n");
      out.write("\t\t\t<div id=\"sms\" class=\"smsDiv\"></div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"sector_li\">\r\n");
      out.write("\t\t\t<p id=\"lacciAllCount\">扇区资源总量：-个<span></span></p>\r\n");
      out.write("\t\t\t<div id=\"lacci\" class =\"lacciDiv\"></div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"crowd_li\">\r\n");
      out.write("\t\t\t<p id =\"personAllCount\">人群资源总量：-个<span></span></p>\r\n");
      out.write("\t\t\t<div class=\"crowd_chart\" id=\"person\">\r\n");
      out.write("\t\t\t\t<div class=\"crowd_chart_bg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"crowd_chart_up\" id=\"personUsed\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"crowd_chart_number\" id=\"personUsedNum\">0%</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"point_li\">\r\n");
      out.write("\t\t\t<p id=\"impactAllCount\">时空点资源总量：-个<span></span></p>\r\n");
      out.write("\t\t\t<div id=\"impact\" class=\"impactDiv\"></div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
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