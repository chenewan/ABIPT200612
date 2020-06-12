package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.LastvpoMapper;
import com.byd.emg.mapper.*;
import com.byd.emg.pojo.*;
import com.byd.emg.pojo.ZCNIFUNCLOCBOM;
import com.byd.emg.pojo.ZCNIFUNCLOCMD;
import com.byd.emg.pojo.ZCNIFUNCLOCPLASPLPO;
import com.byd.emg.pojo.ZCNIFUNCLOCPLKO;
import com.byd.emg.pojo.ZCNIFUNCLOCPLMZ;
import com.byd.emg.pojo.ZCNIFUNCLOCTAPL;
import com.byd.emg.pojo.ZCNIMATGM;
import com.byd.emg.pojo.ZCNIMATMD;
import com.byd.emg.service.FUNCLOCtoDBService;
import com.byd.emg.service.JavaToTableService;
import com.byd.emg.webservice.*;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class FUNCLOCtoDBServiceImpl implements FUNCLOCtoDBService {
    @Autowired
    private ZCNIFUNCLOCBOMMapper zcnifunclocbomMapper;
    @Autowired
    private ZCNIFUNCLOCMDMapper zcnifunclocmdMapper;
    @Autowired
    private ZCNIMATMDMapper zcnimatmdMapper;
    @Autowired
    private ZCNIMATGMMapper zcnimatgmMapper;
    @Autowired
    private ZCNIFUNCLOCPLMZMapper zcnifunclocplmzMapper;
    @Autowired
    private ZCNIFUNCLOCTAPLMapper zcnifuncloctaplMapper;


    @Override
    public String insertToDB(ZCNFUNCLOCINFORFCResponse zcnfunclocinforfcResponse) {
        DbContextHolder.setDbType(DBTypeEnum.db1);
        String funcloCResponse="";
        if(zcnfunclocinforfcResponse.getTBOM().getItem()!=null && zcnfunclocinforfcResponse.getTBOM().getItem().size()>0){
            for (int i=0;i<zcnfunclocinforfcResponse.getTBOM().getItem().size();i++){
                ZCNIFUNCLOCBOM zcnifunclocbom=new ZCNIFUNCLOCBOM();
                zcnifunclocbom.setAedatStpo(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getAEDATSTPO());
                zcnifunclocbom.setAedatTpst(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getAEDATTPST());
                zcnifunclocbom.setIdnrk(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getIDNRK());
                zcnifunclocbom.setMeins(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getMEINS());
                zcnifunclocbom.setMenge(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getMENGE().toString());
                zcnifunclocbom.setPosnr(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getPOSNR());
                zcnifunclocbom.setTplnr(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getTPLNR());
                zcnifunclocbom.setWerks(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getWERKS());
                zcnifunclocbom.setAndatStpo(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getANDATSTPO());
                zcnifunclocbom.setAndatTpst(zcnfunclocinforfcResponse.getTBOM().getItem().get(i).getANDATTPST());
                zcnifunclocbomMapper.insertSelective(zcnifunclocbom);
            }
            funcloCResponse=funcloCResponse+"  getTBOM"+zcnfunclocinforfcResponse.getTBOM().getItem().size();
        }
        if(zcnfunclocinforfcResponse.getTMD().getItem()!=null && zcnfunclocinforfcResponse.getTMD().getItem().size()>0){
            for (int i=0;i<zcnfunclocinforfcResponse.getTMD().getItem().size();i++){
                ZCNIFUNCLOCMD zcnifunclocmd=new ZCNIFUNCLOCMD();
                zcnifunclocmd.setAbckz(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getABCKZ());
                zcnifunclocmd.setAedat(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getAEDAT());
                zcnifunclocmd.setAnsdt(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getANSDT());
                zcnifunclocmd.setAnswt(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getANSWT().toString());
                zcnifunclocmd.setArbpl(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getARBPL().toString());
                zcnifunclocmd.setBaujj(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getBAUJJ());
                zcnifunclocmd.setBaumm(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getBAUMM());
                zcnifunclocmd.setBeber(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getBEBER());
                zcnifunclocmd.setBrgew(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getBRGEW().toString());
                zcnifunclocmd.setEartx(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getEARTX());
                zcnifunclocmd.setEqart(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getEQART());
                zcnifunclocmd.setEqfnr(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getEQFNR());
                zcnifunclocmd.setErdat(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getERDAT());
                zcnifunclocmd.setGewei(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getGEWEI());
                zcnifunclocmd.setGroes(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getGROES());
                zcnifunclocmd.setHerld(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getHERLD());
                zcnifunclocmd.setHerst(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getHERST());
                zcnifunclocmd.setIngrp(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getINGRP());
                zcnifunclocmd.setIwerk(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getIWERK());
                zcnifunclocmd.setKostl(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getKOSTL());
                zcnifunclocmd.setMsgrp(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getMSGRP());
                zcnifunclocmd.setPltxt(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getPLTXT());
                zcnifunclocmd.setSerge(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getSERGE());
                zcnifunclocmd.setStort(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getSTORT());
                zcnifunclocmd.setSttxt(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getSTTXT());
                zcnifunclocmd.setTplma(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getTPLMA());
                zcnifunclocmd.setTplnr(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getTPLNR());
                zcnifunclocmd.setTypbz(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getTYPBZ());
                zcnifunclocmd.setWaers(zcnfunclocinforfcResponse.getTMD().getItem().get(i).getWAERS());
                zcnifunclocmdMapper.insertSelective(zcnifunclocmd);
                System.out.println("1");
            }
            funcloCResponse=funcloCResponse+"  getTMD"+zcnfunclocinforfcResponse.getTMD().getItem().size();
        }

//        if(zcnfunclocinforfcResponse.getTPLASPLPO().getItem()!=null && zcnfunclocinforfcResponse.getTPLASPLPO().getItem().size()>0 ){
//            for (int i=0;i<zcnfunclocinforfcResponse.getTPLASPLPO().getItem().size();i++){
//                ZCNIFUNCLOCPLASPLPO zcnifunclocplasplpo=new ZCNIFUNCLOCPLASPLPO();
//                zcnifunclocplasplpo.setAedatPlas(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getAEDATPLAS());
//                zcnifunclocplasplpo.setAedatPlpo(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getAEDATPLPO());
//                zcnifunclocplasplpo.setAndatPlas(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getANDATPLAS());
//                zcnifunclocplasplpo.setAndatPlpo(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getANDATPLPO());
//                zcnifunclocplasplpo.setArbeh(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getARBEH());
//                zcnifunclocplasplpo.setArbei(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getARBEI().toString());
//                zcnifunclocplasplpo.setLoekz(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getLOEKZ());
//                zcnifunclocplasplpo.setLtxa1(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getLTXA1());
//                zcnifunclocplasplpo.setPlnal(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getPLNAL());
//                zcnifunclocplasplpo.setPlnnr(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getPLNNR());
//                zcnifunclocplasplpo.setVornr(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getVORNR());
//                zcnifunclocplasplpo.setWerks(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getWERKS());
//                zcnifunclocplasplpo.setZaehl(zcnfunclocinforfcResponse.getTPLASPLPO().getItem().get(i).getZAEHL());
//                zcnifunclocplasplpoMapper.insertSelective(zcnifunclocplasplpo);
//            }
//            funcloCResponse=funcloCResponse+"  getTPLASPLPO"+zcnfunclocinforfcResponse.getTPLASPLPO().getItem().size();
//        }

//        if(zcnfunclocinforfcResponse.getTPLKO().getItem()!=null && zcnfunclocinforfcResponse.getTPLKO().getItem().size()>0 ){
//            for (int i=0;i<zcnfunclocinforfcResponse.getTPLKO().getItem().size();i++){
//                ZCNIFUNCLOCPLKO zcnifunclocplko=new ZCNIFUNCLOCPLKO();
//                zcnifunclocplko.setAedat(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getAEDAT());
//                zcnifunclocplko.setAndat(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getANDAT());
//                zcnifunclocplko.setAnlzu(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getANLZU());
//                zcnifunclocplko.setKtext(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getKTEXT());
//                zcnifunclocplko.setLoekz(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getLOEKZ());
//                zcnifunclocplko.setPlnal(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getPLNAL());
//                zcnifunclocplko.setPlnnr(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getPLNNR());
//                zcnifunclocplko.setStrat(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getSTRAT());
//                zcnifunclocplko.setVagrp(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getVAGRP());
//                zcnifunclocplko.setWerks(zcnfunclocinforfcResponse.getTPLKO().getItem().get(i).getWERKS());
//                zcnifunclocplkoMapper.insertSelective(zcnifunclocplko);
//            }
//            funcloCResponse=funcloCResponse+"  getTPLKO"+zcnfunclocinforfcResponse.getTPLKO().getItem().size();
//        }
//
//        if(zcnfunclocinforfcResponse.getTPLMZ().getItem()!=null && zcnfunclocinforfcResponse.getTPLMZ().getItem().size()>0 ){
//            for (int i=0;i<zcnfunclocinforfcResponse.getTPLMZ().getItem().size();i++){
//                ZCNIFUNCLOCPLMZ zcnifunclocplmz=new ZCNIFUNCLOCPLMZ();
//                zcnifunclocplmz.setAedat(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getAEDAT());
//                zcnifunclocplmz.setAndat(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getANDAT());
//                zcnifunclocplmz.setIdnrk(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getIDNRK());
//                zcnifunclocplmz.setImein(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getIMEIN());
//                zcnifunclocplmz.setImeng(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getIMENG().toString());
//                zcnifunclocplmz.setLoekz(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getLOEKZ());
//                zcnifunclocplmz.setPlnal(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getPLNAL());
//                zcnifunclocplmz.setPlnnr(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getPLNNR());
//                zcnifunclocplmz.setZaehl(zcnfunclocinforfcResponse.getTPLMZ().getItem().get(i).getZAEHL());
//                zcnifunclocplmzMapper.insertSelective(zcnifunclocplmz);
//            }
//            funcloCResponse=funcloCResponse+"  getTPLMZ"+zcnfunclocinforfcResponse.getTPLMZ().getItem().size();
//        }
//
//        if(zcnfunclocinforfcResponse.getTTAPL().getItem()!=null && zcnfunclocinforfcResponse.getTTAPL().getItem().size()>0){
//            for (int i=0;i<zcnfunclocinforfcResponse.getTTAPL().getItem().size();i++){
//                ZCNIFUNCLOCTAPL zcnifuncloctapl=new ZCNIFUNCLOCTAPL();
//                zcnifuncloctapl.setAedat(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getAEDAT());
//                zcnifuncloctapl.setAndat(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getANDAT());
//                zcnifuncloctapl.setIwerk(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getIWERK());
//                zcnifuncloctapl.setLoekz(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getLOEKZ());
//                zcnifuncloctapl.setPlnal(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getPLNAL());
//                zcnifuncloctapl.setPlnnr(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getPLNNR());
//                zcnifuncloctapl.setTplnr(zcnfunclocinforfcResponse.getTTAPL().getItem().get(i).getTPLNR());
//                zcnifuncloctaplMapper.insertSelective(zcnifuncloctapl);
//            }
//            funcloCResponse=funcloCResponse+"  getTTAPL"+zcnfunclocinforfcResponse.getTTAPL().getItem().size();
//        }
        return     funcloCResponse;
    }

    @Override
    public String matinsertToDB(ZCNMATINFORFCResponse zcnmatinforfcResponse) {
        DbContextHolder.setDbType(DBTypeEnum.db1);
        String matinforfcResponse="";
        if(zcnmatinforfcResponse.getTMD().getItem()!=null && zcnmatinforfcResponse.getTMD().getItem().size()>0){
            for (int i=0;i<zcnmatinforfcResponse.getTMD().getItem().size();i++){
                ZCNIMATMD zcnimatmd=new ZCNIMATMD();
                zcnimatmd.setMatnr(zcnmatinforfcResponse.getTMD().getItem().get(i).getMATNR());
                zcnimatmd.setDispo(zcnmatinforfcResponse.getTMD().getItem().get(i).getDISPO());
                zcnimatmd.setErsda(zcnmatinforfcResponse.getTMD().getItem().get(i).getERSDA());
                zcnimatmd.setLaeda(zcnmatinforfcResponse.getTMD().getItem().get(i).getLAEDA());
                zcnimatmd.setLgort(zcnmatinforfcResponse.getTMD().getItem().get(i).getLGORT());
                zcnimatmd.setLgpbe(zcnmatinforfcResponse.getTMD().getItem().get(i).getLGPBE());
                zcnimatmd.setLvormMara(zcnmatinforfcResponse.getTMD().getItem().get(i).getLVORMMARA());
                zcnimatmd.setLvormMarc(zcnmatinforfcResponse.getTMD().getItem().get(i).getLVORMMARC());
                zcnimatmd.setLvormMard(zcnmatinforfcResponse.getTMD().getItem().get(i).getLVORMMARD());
                zcnimatmd.setMaktx(zcnmatinforfcResponse.getTMD().getItem().get(i).getMAKTX());
                zcnimatmd.setMeins(zcnmatinforfcResponse.getTMD().getItem().get(i).getMEINS());
                zcnimatmd.setMfrpn(zcnmatinforfcResponse.getTMD().getItem().get(i).getMFRPN());
                zcnimatmd.setMmsta(zcnmatinforfcResponse.getTMD().getItem().get(i).getMMSTA());
                zcnimatmd.setMtart(zcnmatinforfcResponse.getTMD().getItem().get(i).getMTART());
                zcnimatmd.setWerks(zcnmatinforfcResponse.getTMD().getItem().get(i).getWERKS());
                zcnimatmdMapper.insertSelective(zcnimatmd);
            }
            matinforfcResponse=matinforfcResponse+"  getTMD"+zcnmatinforfcResponse.getTMD().getItem().size();
        }
        if(zcnmatinforfcResponse.getTGM().getItem()!=null && zcnmatinforfcResponse.getTGM().getItem().size()>0){
            for (int i=0;i<zcnmatinforfcResponse.getTGM().getItem().size();i++){
                ZCNIMATGM zcnimatgm=new ZCNIMATGM();
                zcnimatgm.setAufnr(zcnmatinforfcResponse.getTGM().getItem().get(i).getAUFNR());
                zcnimatgm.setBudat(zcnmatinforfcResponse.getTGM().getItem().get(i).getBUDAT());
                zcnimatgm.setBwart(zcnmatinforfcResponse.getTGM().getItem().get(i).getBWART());
                zcnimatgm.setBwtar(zcnmatinforfcResponse.getTGM().getItem().get(i).getBWTAR());
                zcnimatgm.setCpudt(zcnmatinforfcResponse.getTGM().getItem().get(i).getCPUDT());
                zcnimatgm.setCputm(zcnmatinforfcResponse.getTGM().getItem().get(i).getCPUTM());
                zcnimatgm.setDmbtr(zcnmatinforfcResponse.getTGM().getItem().get(i).getDMBTR().toString());
                zcnimatgm.setErfme(zcnmatinforfcResponse.getTGM().getItem().get(i).getERFME());
                zcnimatgm.setErfmg(zcnmatinforfcResponse.getTGM().getItem().get(i).getERFMG().toString());
                zcnimatgm.setLfbja(zcnmatinforfcResponse.getTGM().getItem().get(i).getLFBJA());
                zcnimatgm.setLfbnr(zcnmatinforfcResponse.getTGM().getItem().get(i).getLFBNR());
                zcnimatgm.setLfpos(zcnmatinforfcResponse.getTGM().getItem().get(i).getLFPOS());
                zcnimatgm.setLgort(zcnmatinforfcResponse.getTGM().getItem().get(i).getLGORT());
                zcnimatgm.setMatnr(zcnmatinforfcResponse.getTGM().getItem().get(i).getMATNR());
                zcnimatgm.setMblnr(zcnmatinforfcResponse.getTGM().getItem().get(i).getMBLNR());
                zcnimatgm.setMeins(zcnmatinforfcResponse.getTGM().getItem().get(i).getMEINS());
                zcnimatgm.setMenge(zcnmatinforfcResponse.getTGM().getItem().get(i).getMENGE().toString());
                zcnimatgm.setWaers(zcnmatinforfcResponse.getTGM().getItem().get(i).getWAERS());
                zcnimatgm.setWerks(zcnmatinforfcResponse.getTGM().getItem().get(i).getWERKS());
                zcnimatgm.setZeile(zcnmatinforfcResponse.getTGM().getItem().get(i).getZEILE());
                zcnimatgmMapper.insertSelective(zcnimatgm);
                System.out.println("1");
            }
            matinforfcResponse=matinforfcResponse+"  getTGM"+zcnmatinforfcResponse.getTGM().getItem().size();
        }
        return     matinforfcResponse;
    }


}
