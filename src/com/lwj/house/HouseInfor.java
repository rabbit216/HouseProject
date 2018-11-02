package com.lwj.house;

public class HouseInfor {
    String string = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            " <head> \n" +
            "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\"> \n" +
            "  <title>楼盘销售表</title> \n" +
            "  <link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"> \n" +
            "  <script language=\"javascript\" src=\"favorites.js\"></script> \n" +
            "  <script type=\"text/javascript\" src=\"jquery-1.6.2.min.js\"></script> \n" +
            "  <script type=\"text/javascript\" language=\"javascript\"> \n" +
            "$(function(){\n" +
            " $(\"ul#menu>li:has(ul)\").hover( \n" +
            "  function(){ \n" +
            "   $(this).children('a').addClass('red').end().find('ul').fadeIn(400);\n" +
            "  },\n" +
            "  function(){\n" +
            "   $(this).children('a').removeClass('red').end().find('ul').fadeOut(400);\n" +
            "  }\n" +
            " );\n" +
            "});\n" +
            "</script> \n" +
            " </head> \n" +
            " <body> \n" +
            "  <div id=\"Container\"> \n" +
            "   <div id=\"Header\"> \n" +
            "    <div id=\"wrap\" style=\"padding-left: 10px; width: 985px;\"> \n" +
            "     <ul id=\"menu\" style=\"background:url(images/menu.jpg) top;\"> \n" +
            "      <li><a href=\"index.jsp\">首页</a></li> \n" +
            "      <!--<li><a href=\"news.jsp\" >新闻中心</a>\n" +
            "\t\t\t<ul>\n" +
            "\t\t\t\t<li><a href=\"list.jsp?ITID=15\">通知公告</a></li>\n" +
            "\t\t\t\t<li><a href=\"list.jsp?ITID=69\">业务指南</a></li>\n" +
            "\t\t\t\t<li><a href=\"downloadlist.jsp\">下载中心</a></li> \n" +
            "\t\t\t\t<li><a href=\"list.jsp?ITID=44\">常见问题</a></li>\n" +
            "\t\t\t</ul>\n" +
            "\t\t</li>--> \n" +
            "      <li><a href=\"nowonsale.jsp\">现售楼盘</a> \n" +
            "       <!--<ul>\n" +
            "\t\t\t\t<li><a href=\"nowonsale.jsp\">现售楼盘</a></li>\n" +
            "\t\t\t\t<li><a href=\"presale.jsp\">预售楼盘</a></li>\n" +
            "\t\t\t</ul>--> </li> \n" +
            "      <li><a href=\"#\">项目限制情况</a> \n" +
            "       <ul> \n" +
            "        <li><a href=\"limitinfo.jsp\">项目限制情况</a></li> \n" +
            "        <li><a href=\"/web/list.jsp?ITID=94\">项目信息公示栏</a></li> \n" +
            "       </ul> </li> \n" +
            "      <li><a href=\"contract.jsp\">合同查询</a> </li> \n" +
            "      <!--<li><a href=\"http://59.33.255.210/fcj/outconsearch.aspx\" target=\"_blank\">旧版合同查询</a>\n" +
            "\t\t</li>--> \n" +
            "      <li><a href=\"salepermit.jsp\">预售证信息</a> \n" +
            "       <!--<ul>\n" +
            "\t\t\t\t<li><a href=\"http://fgj.dayawan.gov.cn/ysgg/index.html\" target=\"_blank\" style=\"font-size: 12px;\">旧(2011.12至14.12)</a></li>\n" +
            "\t\t\t\t<li><a href=\"salepermit.jsp\">新(2015.1至目前)</a></li>\n" +
            "\t\t\t</ul>--> </li> \n" +
            "      <!--<li><a href=\"http://fgj.dayawan.gov.cn/ysgg/index1.html\" target=\"_blank\">现售楼盘</a>--> \n" +
            "      <li><a href=\"#\">存量房信息查询</a> \n" +
            "       <ul> \n" +
            "        <li><a href=\"esf.jsp\">存量房房源查询</a></li> \n" +
            "        <li><a href=\"contract1.jsp\">存量房签约查询</a></li> \n" +
            "        <li><a href=\"Intermediary.jsp\">中介机构查询</a></li> \n" +
            "       </ul> </li> \n" +
            "      <li><a href=\"developers.jsp\">开发企业查询</a></li> \n" +
            "      <!--<li><a href=\"schedule.jsp\" >业务办理查询</a></li>--> \n" +
            "      <li><a href=\"contact.jsp\">窗口指引</a></li> \n" +
            "     </ul> \n" +
            "    </div> \n" +
            "   </div> \n" +
            "   <div id=\"PageBody\"> \n" +
            "    <div id=\"Searchform\"> \n" +
            "     <h1><img src=\"images/boxicod9.jpg\" alt=\"房屋信息\" width=\"140\" height=\"30\"></h1> \n" +
            "     <div class=\"Salestable\"> \n" +
            "      <span class=\"Salestd\">美悦湾</span> \n" +
            "      <table width=\"862\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"> \n" +
            "       <tbody>\n" +
            "        <tr> \n" +
            "         <td height=\"30\" colspan=\"4\" class=\"Salestd\">-4栋33层01号房 - 基本信息</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th width=\"120\" height=\"30\" align=\"right\">项目名称：</th> \n" +
            "         <td width=\"311\">&nbsp;美悦湾</td> \n" +
            "         <th width=\"120\" align=\"right\">楼栋：</th> \n" +
            "         <td width=\"311\">&nbsp;4栋</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">房号：</th> \n" +
            "         <td>&nbsp;4栋33层01号房</td> \n" +
            "         <th align=\"right\">规划用途：</th> \n" +
            "         <td>&nbsp;住宅</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">房屋功能：</th> \n" +
            "         <td>&nbsp;住宅</td> \n" +
            "         <th align=\"right\">房屋户型：</th> \n" +
            "         <td>&nbsp;三房二厅</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">所在楼层：</th> \n" +
            "         <td>&nbsp;33</td> \n" +
            "         <th align=\"right\">层高：</th> \n" +
            "         <td>&nbsp;3.0</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">房屋朝向：</th> \n" +
            "         <td>&nbsp;西南</td> \n" +
            "         <th align=\"right\">房屋结构：</th> \n" +
            "         <td>&nbsp;钢筋混凝土</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">是否公建配套：</th> \n" +
            "         <td>&nbsp;否 </td> \n" +
            "         <th align=\"right\">是否回迁：</th> \n" +
            "         <td>&nbsp;否 </td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">是否自用：</th> \n" +
            "         <td>&nbsp;否 </td> \n" +
            "         <th align=\"right\">批准销售状态：</th> \n" +
            "         <td>&nbsp;是 </td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">商品房销售价目表(经物价部门监制)</th> \n" +
            "         <td colspan=\"3\">&nbsp;1218972 </td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <td height=\"30\" colspan=\"4\" class=\"Salestd\">配套设施数据（单位：个）</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">封闭阳台：</th> \n" +
            "         <td>&nbsp;0</td> \n" +
            "         <th align=\"right\">非封闭阳台：</th> \n" +
            "         <td>&nbsp;3</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">厨房：</th> \n" +
            "         <td>&nbsp;1</td> \n" +
            "         <th align=\"right\">卫生间：</th> \n" +
            "         <td>&nbsp;2</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <td height=\"30\" colspan=\"4\" class=\"Salestd\">预售面积情况（单位：平方米）</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">预测总面积：</th> \n" +
            "         <td>&nbsp;104.93</td> \n" +
            "         <th align=\"right\">实测面积：</th> \n" +
            "         <td>&nbsp;0.0</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">预测套内面积：</th> \n" +
            "         <td>&nbsp;82.26</td> \n" +
            "         <th align=\"right\">实测套内面积：</th> \n" +
            "         <td>&nbsp;0.0</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"30\" align=\"right\">预测公摊面积：</th> \n" +
            "         <td>&nbsp;22.67</td> \n" +
            "         <th align=\"right\">实测公摊面积：</th> \n" +
            "         <td>&nbsp;0.0</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <td height=\"30\" colspan=\"4\" class=\"Salestd\">查封抵押情况</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <th height=\"15\" align=\"right\">是否抵押：</th> \n" +
            "         <td>&nbsp;否 </td> \n" +
            "         <th align=\"right\">是否查封：</th> \n" +
            "         <td>&nbsp;否 </td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <td height=\"30\" colspan=\"4\" class=\"Salestd\" style=\"color:#F00;\">温馨提示：</td> \n" +
            "        </tr> \n" +
            "        <tr> \n" +
            "         <td colspan=\"4\" align=\"left\" style=\"line-height:24px; padding:15px 0px 15px 15px;\"> 1、导入的价格信息如有误差，以物价局核定的价格为准。<br> 2、层高﹑房屋朝向﹑封闭阳台数﹑非封闭阳台数﹑厨房数﹑卫生间数﹑户型均由开发企业自行录入，房管局未对数据审核，仅作参考。<br> 3、预测建筑面积﹑预测套内建筑面积﹑预测分摊面积为0代表该房屋未作预测绘。 </td> \n" +
            "        </tr> \n" +
            "       </tbody>\n" +
            "      </table> \n" +
            "     </div> \n" +
            "    </div> \n" +
            "   </div> \n" +
            "  </div>  \n" +
            " </body>\n" +
            "</html>";

    public HouseInfor(String string) {
        this.string = string;
    }

    public HouseInfor() {

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "HouseInfor{" +
                "string='" + string + '\'' +
                '}';
    }
}
