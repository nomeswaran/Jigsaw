/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-03-19 10:21:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("background: #f0f0f0;\r\n");
      out.write("}\r\n");
      out.write(".center {\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write(".right {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 0px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Jigsaw HelpDesk</title>\r\n");
      out.write("<link rel=\"icon\" href=\"http://www.jigsawacademy.com/assets/front/images/favicon.ico\">\r\n");
      out.write("<link rel=\"canonical\" href=\"http://www.jigsawacademy.com/\">\r\n");
      out.write("<link rel=\"publisher\" href=\"https://plus.google.com/+Jigsawacademy2011\">\r\n");
      out.write("<link rel=\"publisher\" href=\"https://plus.google.com/103098642565786032282\">\r\n");
      out.write("<link href=\"http://www.jigsawacademy.com/assets/front/css/theme.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<h1 class=\"center\">\r\n");
      out.write("    <img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" alt=\"Foo Co.: Where everyone can fizz the buzz\" /> Welcome to Jigsaw Helpdesk\r\n");
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p style=\"padding-left:900px;\"><a href=\"./signin\">Sign in</a> &nbsp;  &nbsp; &nbsp;<a href=\"./signup\">Sign up</a>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<div class=\"tab-content text-center\">\r\n");
      out.write("    <div class=\"tab-pane active\" id=\"beginners-courses-analytics\">\r\n");
      out.write("    <div class=\"col-md-12 nopaddingleft-1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <div class=\"container nopaddingleftright mrbot13 mrtopbot45\">\r\n");
      out.write("            <div class=\"col-md-12 text-center nopaddingleftright nopaddingleft\">\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/analytics-for-beginners\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/analytics-beginners1.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Analytics for Beginners</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">1 week, 5 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    7000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/analytics-for-managers-business-leaders\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/analytics-for-leaders.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Analytics for Leaders</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">3 weeks, 3 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    28000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/big-data-for-beginners\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/Bigdata_for_beginners-3.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Big Data for Beginners</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">2 weeks,  4 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    8000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/online-sas-training\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/sas.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Data Science  with SAS</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">16 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    25000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/r-analytics-training\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_datascience2.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Data Science with R</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">16 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    25000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/big-data-specialist-wiley\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_bigdata2.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Wiley Big Data Specialist</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">16 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    27000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/hr-analytics-courses\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_hr2.png);\">\r\n");
      out.write("                    <div class=\"course-title\">HR Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">5 weeks, 8 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    22000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/web-analytics-training\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_webanalytics1.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Web Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">6 weeks, 8 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    27000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <a href=\"#\"> </a></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"tab-pane \" id=\"advanced-courses-analytics\">\r\n");
      out.write("    <div class=\"col-md-12 nopaddingleft-1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <div class=\"container nopaddingleftright mrbot13 mrtopbot45\">\r\n");
      out.write("            <div class=\"col-md-12 text-center nopaddingleftright nopaddingleft\">\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/text-mining-with-r\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/TextMining.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Text Mining with R</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">6 weeks, 3 hours / week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    10000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/financial-analytics\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_financial1.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Financial Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">6 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    22000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/retail-analytics\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_retails.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Retail Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">6 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    18000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/online-vba-courses\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_vba.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Visual Basic for Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">5 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    18000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/dimension-reduction-techniques\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_vrt.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Dimension Reduction Techniques</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">3 weeks, 5 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    11000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/fraud-analytics-course\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/Courses-Box.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Fraud Analytics</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">1 week, 5 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    3500                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <a href=\"#\"> </a></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"tab-pane \" id=\"specializations-in-analytics\">\r\n");
      out.write("    <div class=\"col-md-12 nopaddingleft-1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <div class=\"container nopaddingleftright mrbot13 mrtopbot45\">\r\n");
      out.write("            <div class=\"col-md-12 text-center nopaddingleftright nopaddingleft\">\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/data-science-training\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_adv_datascience1.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Data Science Specialization</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">24 weeks, 8 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    62000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/big-data-training\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_adv_bigdata2.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Big Data Specialization</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">32 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    72000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"><a href=\"http://www.jigsawacademy.com/financial-analytics-specialization\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/home_adv_financial2.png);\">\r\n");
      out.write("                    <div class=\"course-title\">Financial Analytics Specialization</div>\r\n");
      out.write("                    <!--                                            <div class=\"course-sub-text\">Specialist</div>-->\r\n");
      out.write("                    <div class=\"course-bg\">Duration: <span class=\"week-text\">21 weeks, 10 hours/week</span></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <div class=\"course-line\"></div>-->\r\n");
      out.write("\t\t\t\t  <!-- Pricing changed to Self-paced by default. if($course->learning_mode == 3 || $course->learning_mode == 1) -->\r\n");
      out.write("                  <div class=\"fees-text\">Fee: <span class=\"week-text\">Rs.\r\n");
      out.write("                    57000                    </span> <span class=\"pull-right round-padd\"> <img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </a></div>\r\n");
      out.write("                            <a href=\"#\"> </a></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"tab-pane\" id=\"campus\">\r\n");
      out.write("    <div class=\"col-md-12 nopaddingleft-1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <div class=\"container nopaddingleftright mrbot13 mrtopbot45\">\r\n");
      out.write("            <div class=\"col-md-12 text-center nopaddingleftright nopaddingleft\">\r\n");
      out.write("              <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"> <a href=\"http://www.jigsawacademy.com/corporate-training-analytics\">\r\n");
      out.write("                <div class=\"courses-table\">\r\n");
      out.write("                  <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/corporate-training.png)\" ;=\"\">\r\n");
      out.write("                  <div class=\"course-title\">Corporate Training</div>\r\n");
      out.write("                  <div class=\"course-bg\"><span class=\"week-text\">Learn to use data at the workplace</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"fees-text\"><span class=\"week-text\">Learn more</span><span class=\"pull-right round-padd\"><img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              </a> </div>\r\n");
      out.write("            <div class=\"col-md-4 col-md-4-img homecoursebox nopaddingleftright\"> <a href=\"http://www.jigsawacademy.com/college-training-analytics\">\r\n");
      out.write("              <div class=\"courses-table\">\r\n");
      out.write("                <div class=\"cource\" style=\"background-image: url(http://www.jigsawacademy.com/assets/images/course/university-training.png)\" ;=\"\">\r\n");
      out.write("                <div class=\"course-title\">University Training</div>\r\n");
      out.write("                <div class=\"course-bg\"><span class=\"week-text\">Give your students the data edge</span></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"fees-text\"><span class=\"week-text\">Learn more</span><span class=\"pull-right round-padd\"><img src=\"http://www.jigsawacademy.com/assets/front/images/circle.png\" width=\"33px\" height=\"33px\" alt=\"arrow\"></span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </a> </div>\r\n");
      out.write("          <a href=\"#\"> </a> </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /index.jsp(33,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/images/logo.png");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}