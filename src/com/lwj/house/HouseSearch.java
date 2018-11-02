package com.lwj.house;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class HouseSearch {
        public static void main(String[] args) throws SQLException, IOException {
               // HouseInfor houseInfor=new HouseInfor();
                //String url = "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0";
                Document document = Jsoup.connect(
                        "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0"
                ).get();
                //String str =houseInfor.getString() ;
                //Document doc = Jsoup.parse(str);
                Elements trs = document.select("table").select("tr");
               for(int i = 0;i<trs.size();i++){
                        Elements tds = trs.get(i).select("td");
                        for(int j = 0;j<tds.size();j++){
                                String text = tds.get(j).text();
                                System.out.println(text);
                                }
                        }
                }
        }
