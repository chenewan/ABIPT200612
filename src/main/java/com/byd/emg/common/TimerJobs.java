package com.byd.emg.common;

import com.byd.emg.service.FUNCLOCtoDBService;
import com.byd.emg.service.MATtoDBService;
import com.byd.emg.service.ORDERtoDBService;
import com.byd.emg.webservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

@Component
public class TimerJobs {



    @Autowired
    private FUNCLOCtoDBService funcloCtoDBService;
    private MATtoDBService maTtoDBService;
    private ORDERtoDBService ordeRtoDBService;

//    每10秒      采集wincc1数据到table1
//    @Async
//    @Scheduled(cron="0/10 * * * * ?")

//    每天      采集wincc1数据到table1
    @Async
    @Scheduled(cron="0 0 0 * * ?" )

    public void TimeJobByDay() {
        try{
            SAPERPPMCNFUNCLOCDATASIService saperppmcnfunclocdatasiService = new SAPERPPMCNFUNCLOCDATASIService();
//            SAPERPPMCNMATDATASIService saperppmcnmatdatasiService = new SAPERPPMCNMATDATASIService();
            SAPERPPMCNFUNCLOCDATASI saperppmcnfunclocdatasi= saperppmcnfunclocdatasiService.getHTTPPort();
//            SAPERPPMCNMATDATASI saperppmcnmatdatasi= saperppmcnmatdatasiService.getHTTPPort();
//            saperppmcnfunclocdatasiService.wait(1200000);

//            ZCNIFUNCLOCMD zcnifunclocmd =new ZCNIFUNCLOCMD();
//            ZCNIFUNCLOCBOM zcnifunclocbom = new ZCNIFUNCLOCBOM();
//            ZCNIFUNCLOCTAPL zcnifuncloctapl = new ZCNIFUNCLOCTAPL();
//            ZCNIFUNCLOCPLKO zcnifunclocplko =new ZCNIFUNCLOCPLKO();
//            ZCNIFUNCLOCPLASPLPO zcnifunclocplasplpo = new ZCNIFUNCLOCPLASPLPO();
//            ZCNIFUNCLOCPLMZ zcnifunclocplmz =new ZCNIFUNCLOCPLMZ();
//            BAPIRET2 bapiret2 =new BAPIRET2();



            System.out.println("参数完成");
            ZCNFUNCLOCINFORFC zcnfunclocinforfc=new ZCNFUNCLOCINFORFC();
            zcnfunclocinforfc.setIBOM("X");
            zcnfunclocinforfc.setIMD("X");
//            zcnfunclocinforfc.setITASK("X");
            //声明同步数据的开始时间和结束时间
            String I_UPDAT_END, I_UPDAT_START;
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            Date end = c.getTime();
            I_UPDAT_END= format.format(end);//当前日期
            c.add(Calendar.DATE, -1);
            Date start = c.getTime();
            I_UPDAT_START= format.format(start);//前一天
//            I_UPDAT_START="20190101";
//            I_UPDAT_END="20201230";
            zcnfunclocinforfc.setIUPDATSTART(I_UPDAT_START);
            zcnfunclocinforfc.setIUPDATEND(I_UPDAT_END);

            ZCNFUNCLOCINFORFC.TWERKSSEL twerkssel = new ZCNFUNCLOCINFORFC.TWERKSSEL();
            List<WERKSRANG> werksrangList = twerkssel.getItem();

            WERKSRANG werksrang = new WERKSRANG();
            werksrang.setSIGN("I");
            werksrang.setOPTION("EQ");
            werksrang.setLOW("CN01");
//            werksrang.setHIGH("CN01");
            werksrangList.add(werksrang);
            zcnfunclocinforfc.setTWERKSSEL(twerkssel);

            ZCNFUNCLOCINFORFC.TTPLNRSEL ttplnrsel=new ZCNFUNCLOCINFORFC.TTPLNRSEL();
            List<WCSTPLNR> wcstplnrList = new ArrayList<WCSTPLNR>();
            WCSTPLNR wcstplnr = new WCSTPLNR();
            wcstplnrList.add(wcstplnr);
            zcnfunclocinforfc.setTTPLNRSEL(ttplnrsel);




            // 设置超时连接
            BindingProvider bp = (BindingProvider) saperppmcnfunclocdatasi;
            Map<String, Object> requestContext = bp.getRequestContext();
            requestContext.put("com.sun.xml.internal.ws.connection.timeout", 1000 * 1000);//建立连接的超时时间为1000秒
            requestContext.put("com.sun.xml.internal.ws.request.timeout", 1500 * 1000);//指定请求的响应超时时间为1500秒
            System.out.println("设置超时");

            // 设置访问接口服务器的用户名和密码
            Map<String, Object> context = bp.getRequestContext();
            context.put(BindingProvider.USERNAME_PROPERTY, "MDBCPIC");
            context.put(BindingProvider.PASSWORD_PROPERTY, "Mdbcpi2017!");
            System.out.println("设置访问接口服务器的用户名和密码");
            ZCNFUNCLOCINFORFCResponse zcnfunclocinforfcResponse =   saperppmcnfunclocdatasi.saperpPMCNFUNCLOCDATASI(zcnfunclocinforfc);
            String funcloCResponse = funcloCtoDBService.insertToDB(zcnfunclocinforfcResponse);

//            ZCNMATINFORFCResponse zcnmatinforfcResponse =   saperppmcnfunclocdatasi.saperpPMCNFUNCLOCDATASI(zcnfunclocinforfc);
//            String funcloCResponse = funcloCtoDBService.insertToDB(zcnfunclocinforfcResponse);
            System.out.println(funcloCResponse);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("每分钟执行一次");
    }


    //    每分钟      采集wincc1数据到table1
//    @Async
//    @Scheduled(cron="0 0/1 * * * ?")
//    @Scheduled(cron="0/10 * * * * ?")

//    每天      采集wincc1数据到table1
    @Async
    @Scheduled(cron="0 0 0 * * ?" )

    public void TimeJobByDayMAT() {
        try{
//            SAPERPPMCNFUNCLOCDATASIService saperppmcnfunclocdatasiService = new SAPERPPMCNFUNCLOCDATASIService();
            SAPERPPMCNMATDATASIService saperppmcnmatdatasiService = new SAPERPPMCNMATDATASIService();
//            SAPERPPMCNFUNCLOCDATASI saperppmcnfunclocdatasi= saperppmcnfunclocdatasiService.getHTTPPort();
            SAPERPPMCNMATDATASI saperppmcnmatdatasi= saperppmcnmatdatasiService.getHTTPPort();
//            saperppmcnfunclocdatasiService.wait(1200000);

//            ZCNIFUNCLOCMD zcnifunclocmd =new ZCNIFUNCLOCMD();
//            ZCNIFUNCLOCBOM zcnifunclocbom = new ZCNIFUNCLOCBOM();
//            ZCNIFUNCLOCTAPL zcnifuncloctapl = new ZCNIFUNCLOCTAPL();
//            ZCNIFUNCLOCPLKO zcnifunclocplko =new ZCNIFUNCLOCPLKO();
//            ZCNIFUNCLOCPLASPLPO zcnifunclocplasplpo = new ZCNIFUNCLOCPLASPLPO();
//            ZCNIFUNCLOCPLMZ zcnifunclocplmz =new ZCNIFUNCLOCPLMZ();
//            BAPIRET2 bapiret2 =new BAPIRET2();



            System.out.println("参数完成");
            ZCNMATINFORFC zcnmatinforfc=new ZCNMATINFORFC();
            zcnmatinforfc.setIMD("X");
            zcnmatinforfc.setIGM("X");
            //声明同步数据的开始时间和结束时间
            String I_UPDAT_END, I_UPDAT_START;
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            Date end = c.getTime();
            I_UPDAT_END= format.format(end);//当前日期
            c.add(Calendar.DATE, -1);
            Date start = c.getTime();
            I_UPDAT_START= format.format(start);//前一天
//            I_UPDAT_START="20200101";
//            I_UPDAT_END="20201230";
            zcnmatinforfc.setIUPDATSTART(I_UPDAT_START);
            zcnmatinforfc.setIUPDATEND(I_UPDAT_END);

            ZCNMATINFORFC.TWERKSSEL twerkssel = new ZCNMATINFORFC.TWERKSSEL();
            List<WERKSRANG> werksrangList = twerkssel.getItem();

            WERKSRANG werksrang = new WERKSRANG();
            werksrang.setSIGN("I");
            werksrang.setOPTION("EQ");
            werksrang.setLOW("CN01");
            werksrang.setHIGH("CN01");
            werksrangList.add(werksrang);
            zcnmatinforfc.setTWERKSSEL(twerkssel);

            ZCNMATINFORFC.TMATNRSEL tmatnrsel=new ZCNMATINFORFC.TMATNRSEL();
            List<RANGEMATNR> rangematnrList = new ArrayList<RANGEMATNR>();
            RANGEMATNR rangematnr = new RANGEMATNR();
            rangematnrList.add(rangematnr);
            zcnmatinforfc.setTMATNRSEL(tmatnrsel);




            // 设置超时连接
            BindingProvider bp = (BindingProvider) saperppmcnmatdatasi;
            Map<String, Object> requestContext = bp.getRequestContext();
            requestContext.put("com.sun.xml.internal.ws.connection.timeout", 1000 * 1000);//建立连接的超时时间为10秒
            requestContext.put("com.sun.xml.internal.ws.request.timeout", 1500 * 1000);//指定请求的响应超时时间为15秒
//            System.out.println("设置超时");

            // 设置访问接口服务器的用户名和密码
            Map<String, Object> context = bp.getRequestContext();
            context.put(BindingProvider.USERNAME_PROPERTY, "MDBCPIC");
            context.put(BindingProvider.PASSWORD_PROPERTY, "Mdbcpi2017!");
            System.out.println("设置访问接口服务器的用户名和密码");
            ZCNMATINFORFCResponse zcnmatinforfcResponse = saperppmcnmatdatasi.saperpPMCNMATDATASI(zcnmatinforfc);
            String matResponse = funcloCtoDBService.matinsertToDB(zcnmatinforfcResponse);
            System.out.println(matResponse);
//            System.out.println("OK");
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("每分钟执行一次");
    }


    //根据传入的年月减去一天
    public String subtractDay(String date) {
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String returnDate=date;
        try {
            Calendar rightNow = Calendar.getInstance();
            Date begin_d1=df.parse(date);
            rightNow.setTime(begin_d1);
            rightNow.add(Calendar.DAY_OF_MONTH,-1);
            returnDate=df.format(rightNow.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }

    //判断当前日期是否是本月的最后一天
    public static boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }




}

