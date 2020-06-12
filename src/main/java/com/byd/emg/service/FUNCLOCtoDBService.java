package com.byd.emg.service;

import com.byd.emg.webservice.ZCNFUNCLOCINFORFCResponse;
import com.byd.emg.webservice.ZCNMATINFORFCResponse;

public interface FUNCLOCtoDBService {
//    int insertVpo(String vpoNO);

    String insertToDB(ZCNFUNCLOCINFORFCResponse zcnfunclocinforfcResponse);
    String matinsertToDB(ZCNMATINFORFCResponse zcnmatinforfcResponse);
}
