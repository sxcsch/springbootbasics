package com.mecool.controller;

import com.mecool.service.TestService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/7.
 */
@RestController
public class TestController extends BaseController{

    @Autowired
    TestService testService;

    @GetMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }

    @PostMapping("/dowload")
    @ResponseBody
    public Map dowload(HttpServletRequest request,HttpServletResponse response) {
        Map map = getReqMap(request);
        System.out.println(map);
        map.put("errorCode","0");
        map.put("message","信息");
        map.put("fileUrl","E:\\WORKSPACE\\epdaworkspace\\.metadata\\.plugins\\org.jboss.ide.eclipse.as.core\\JBoss_AS_4.21496719073360\\deploy\\Epda.war\\resources\\attendanceDownload\\2018-05-21\\考勤信息报表1526882793256.xlsx");
        //String[] headers = { "ID", "主题", "姓名", "手机","创建时间","开始时间","结束时间"};
        try {
            /*// 声明一个工作薄
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 生成一个表格
            HSSFSheet sheet = workbook.createSheet();
            // 设置表格默认列宽度为15个字节
            sheet.setDefaultColumnWidth((short) 18);
            HSSFRow row = sheet.createRow(0);
            for (short i = 0; i < headers.length; i++) {
                HSSFCell cell = row.createCell(i);
                HSSFRichTextString text = new HSSFRichTextString(headers[i]);
                cell.setCellValue(text);
            }
            response.setHeader("content-disposition", "attachment;filename="
                    + new String(("123" + ".xls").getBytes(), "UTF-8"));
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setContentType("text/html;charset=UTF-8");
            response.setContentType("application/octet-stream");
            response.setCharacterEncoding("utf-8");
            response.flushBuffer();*/
            //OutputStream out = response.getOutputStream();
            //workbook.write(out);
            //out.flush();
            //out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","GET,POST");
        response.setContentType("text/html;charset=utf-8");
        //OutputStream out = response.getOutputStream();
        //workbook.write(out);
        //out.flush();
        //out.close();
        return map;
    }

}
