package com.ankamagames.wakfu.client;

import CM;
import Cl;
import Cn;
import Dn;
import Fi;
import Hh;
import IU;
import IZ;
import JH;
import KT;
import LC;
import Lu;
import MQ;
import NW;
import Pb;
import Pg;
import Pt;
import SW;
import TD;
import TO;
import VG;
import VV;
import Vb;
import Vr;
import Yo;
import Zt;
import aAx;
import aBa;
import aBg;
import aDM;
import aEK;
import aEi;
import aFP;
import aGb;
import aGt;
import aHR;
import aHv;
import aIH;
import aLD;
import aLz;
import aNh;
import aOf;
import aP;
import aPB;
import aPI;
import aPJ;
import aPK;
import aPL;
import aPO;
import aPR;
import aPS;
import aPT;
import aQC;
import aQL;
import aQi;
import aRF;
import aRc;
import aRd;
import aRm;
import aRt;
import aTI;
import aTL;
import aTP;
import aUk;
import aVG;
import aVc;
import aWc;
import aX;
import aYr;
import aaX;
import aat;
import acL;
import aci;
import adG;
import aej;
import ahm;
import aiI;
import ale;
import alm;
import anK;
import aoP;
import aqx;
import arV;
import asC;
import asq;
import atb;
import ay;
import ayX;
import ayc;
import azl;
import bAU;
import bBq;
import bDH;
import bDj;
import bDk;
import bEf;
import bEs;
import bGc;
import bGm;
import bHd;
import bIS;
import bMF;
import bMp;
import bNa;
import bOE;
import bOK;
import bOh;
import bOp;
import bPE;
import bQD;
import bQK;
import bSx;
import bU;
import bUD;
import bUd;
import bVB;
import bVl;
import bWW;
import bWx;
import bXT;
import bZq;
import bap;
import bdA;
import bdh;
import bdz;
import bem;
import bfK;
import bfT;
import bhD;
import biF;
import biI;
import bih;
import bjE;
import bjY;
import bjo;
import bmX;
import bmz;
import bnM;
import bnj;
import boT;
import bpd;
import bqJ;
import bsJ;
import bsY;
import bsz;
import btL;
import btS;
import btb;
import bvt;
import bwG;
import bxF;
import bxy;
import byn;
import byv;
import bzN;
import bzZ;
import cBP;
import cBQ;
import cIM;
import cLy;
import cNO;
import cOj;
import cPV;
import cQI;
import cQa;
import cRd;
import cSR;
import cVa;
import cWS;
import cXf;
import cYI;
import cYb;
import cZa;
import cZk;
import cZy;
import cbk;
import ccT;
import ccm;
import cdb;
import cgL;
import chb;
import ciW;
import cip;
import ckU;
import clL;
import cmV;
import coO;
import cof;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import com.ankamagames.baseImpl.graphics.script.EffectFunctionsLibrary;
import com.ankamagames.framework.script.JavaFunctionLoader;
import com.ankamagames.wakfu.client.binaryStorage.ItemBinaryData;
import com.ankamagames.wakfu.client.ui.script.UIFunctionsLibrary;
import com.ankamagames.wakfu.client.ui.script.function.bubbleText.BubbleText;
import cpG;
import cpt;
import crA;
import crf;
import cwO;
import cwl;
import cyU;
import cyY;
import czK;
import czd;
import cze;
import dAE;
import dCp;
import dDE;
import dDF;
import dEX;
import dEa;
import dFa;
import dGF;
import dGx;
import dHL;
import dHu;
import dIJ;
import dIP;
import dIu;
import dJR;
import dLE;
import dMl;
import dMp;
import dNv;
import dO;
import dOR;
import dPV;
import dSz;
import dTC;
import dUI;
import dUJ;
import dWe;
import dbL;
import dbu;
import dcQ;
import dcU;
import dec;
import dfe;
import djz;
import dlD;
import dly;
import dmM;
import dmS;
import dnq;
import doU;
import doh;
import dpp;
import dps;
import dqB;
import dsE;
import dsp;
import dsw;
import dtb;
import dto;
import duB;
import duQ;
import dus;
import dvc;
import dwF;
import dxd;
import dxo;
import dyR;
import dye;
import dzN;
import eX;
import gA;
import jF;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import javax.media.opengl.GL;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jr;
import kG;
import kd;
import org.apache.log4j.Logger;
import pN;
import qW;
import rS;
import rl;
import sS;
import tq;
import uC;
import uz;
import vd;
import vv;
import wv;
import yR;
import zw;

public class WakfuClientInstance extends dnq
{
  private static final Logger K = Logger.getLogger(WakfuClientInstance.class);
  private static final WakfuClientInstance djl = new WakfuClientInstance();
  private final cRd djm;
  private boolean djn;
  private bsz djo;
  private final ArrayList djp;

  private WakfuClientInstance()
  {
    super(true);

    this.djm = new czK();

    b(new aPO(this));

    a(new bGm());
    b(new aBa());

    aUO();

    this.djp = new ArrayList();
  }

  public cRd aww()
  {
    return this.djm;
  }

  private void awx() {
    Color localColor = Color.white;
    JColorChooser localJColorChooser = new JColorChooser(localColor);
    JDialog localJDialog = JColorChooser.createDialog(this.djm.cHK(), "ColorPicker", false, localJColorChooser, null, null);
    localJDialog.setVisible(true);
  }

  public static WakfuClientInstance awy()
  {
    return djl;
  }

  public static Logger getLogger()
  {
    return K;
  }

  public byv awz() {
    return byv.bFN();
  }

  protected void awA()
  {
    dWe.dvA().a(dLE.doY());
  }

  public aIH awB()
  {
    return (aIH)super.axc();
  }

  protected void awC()
  {
    b(new aIH());
  }

  public void awD()
  {
    super.awD();
    cZy.cMn().hb(true);
  }

  protected String awE()
  {
    try {
      return ay.bd().getString("gfxPath");
    } catch (bdh localbdh) {
      K.error("", localbdh);
    }
    return null;
  }

  protected boolean d(String paramString, int paramInt1, int paramInt2)
  {
    if (aWc.blo().initialize()) {
      aWc.blo().start();
      return true;
    }
    K.error("Problème d'initialisation du SoundManager.");
    return false;
  }

  public void initialize()
  {
    super.initialize();

    aIH localaIH = awB();

    String str = ay.bd().getString("gfxConfigFile");
    aDM.aPZ().gm(str);
    byn.bFr().jm(str);

    aWc.blo();
    cof.a(new cyY());
    aat.cOE.a(dDE.dft());

    dIu localdIu = dIu.rj(localaIH.f(yR.bsA));
    boolean bool = localaIH.a(bmz.fEv);
    dIP localdIP = new dIP();
    localdIP.lUo = 0;
    localdIP.lUp = 8;
    a(localdIu, bool, localdIP);
    aww().cHB();

    float f1 = ay.bd().getFloat("cameraMinZoom", adG.cUe);
    float f2 = ay.bd().getFloat("cameraMaxZoom", adG.cUg);
    a(rs(), f1, f2);
    cUV().a(new aPJ(this));

    btS.g("wci", 4, 11);
    cOj.kwA.a(bUd.cak(), this.lnh);

    jF(awy().awB().a(bmz.fEX));
  }

  public void awF() {
    czd.inP.a(dFa.lOv);
    bU.fH();

    ay localay = ay.bd();

    bOp.gTA.setFileName(localay.getString("cacheTagDataFile"));
    bOp.gTA.load();

    URL localURL = ay.bd().br();
    String str1 = ay.bd().bs();
    Zt.cKQ.b(localURL, str1);

    new dcU().a(bU.fH(), cYI.kMv);

    cze.cwb().setPath(localay.getString("binaryDataFile"));

    String str2 = localay.getString("shadersPath");
    eI(str2);

    aIH localaIH = awB();

    dxo.lDw.a(aci.cRd);

    if (this.djn) {
      awx();
    }

    cBQ.cxL().itQ = ay.bd().getString("ANMGUIPath");

    cBQ.cxL().ftS = ay.bd().getString("particlePath");
    cBQ.cxL().itR = ay.bd().getString("shadersPath");

    cqq.hZY = dPV.mjE;
    bfT.setParticlePath(ay.bd().getString("worldPositionMarkerApsPath"));

    bXH.hns = 80;

    bfK.bsS().lJ(ay.bd().getString("contentStaticDataStorageDirectory"));
    bfK.bsS().aiu();

    btL.gcv.initialize();

    Pb localPb = Pb.aaU();

    rs().fM(localaIH.a(bmz.fEv));
    anK.drx.cz(localaIH.a(bmz.fEr));

    ahm.cj(localaIH.a(bmz.fEw));

    dSz localdSz = awy().Dg();

    bDk.bLI().load(localay.getString("worldInfoFile"));

    String str3 = localay.getString("mapsGfxCoord");
    bOh.ao(localay.getString("mapsTplgCoord"), str3);

    bMp.bTJ().setPath(localay.getString("mapsLightPath"));

    cwO.cuh();
    cwO.cui();

    cwO.setPath(localay.getString("mapsTopologyPath"));

    cPV localcPV = cPV.cGZ();
    localcPV.setPath(localay.getString("mapsEnvironmentPath"));

    String str4 = localay.getString("mapsGfxPath");
    btb.bBd().setPath(str4);

    bxF.ag(localay.getString("patchMiniImagePath"), localay.getString("buildingMiniImagePath"));

    awW();

    iS(localaIH.d(yR.bsK));
    dmM.cUe().AP(localaIH.d(yR.bsL));

    for (int i = 0; i < this.lng.length; i++) {
      this.lng[i].cLc().setPath(str4);
    }

    localcPV.a(new aPI(this));

    String str5 = localay.getString("ANMDynamicElementPath");
    aRd.a(new aPL(this, str5));

    localcPV.a(ay.bd().getBoolean("activateMapParticles") ? cWS.cKD() : null);

    localcPV.c(aWc.blo());

    aaX.anG().setPath(localay.getString("mapsAmbienceDataPath"));

    bGc.bOn().setFile(localay.getString("ambienceBankFile"));
    try
    {
      dO.hI().initialize(localay.getString("graphicalAmbienceFile"));
    } catch (Exception localException1) {
      K.error("Problème de chargement des ambiance graphqiue", localException1);
    }

    cwO.setPath(localay.getString("mapsTopologyPath"));

    anK.drx.aAf();
    anK.drx.start();

    cBP.isO.a(new dMp());

    aYr.a(new aPK(this));

    ccm.a(new cQa[] { new cZa(), new cZk(), new doU(), new dto(), new dNv() });

    bWW.ccf().initialize();
    biI.fzg.a(bDj.gyk);

    awI();

    a(localay, localaIH, localdSz);

    awH();

    String str6 = ay.bd().getString("dayLightFile");
    String str7 = ay.bd().getString("defaultDayLightFile");

    K.info("Loading embedded DayLight file.");
    try {
      try {
        bzZ.goz.jv(str6);
      } catch (Exception localException2) {
        bzZ.goz.jv(str7);
      }
    } catch (Exception localException3) {
      K.error("Exception : ", localException3);
      throw new Exception("Impossible de charger les définitions de couleur de Jour/Nuit embarqués depuis le fichier " + str6 + " !");
    }

    awG();

    gA.oh().a(dwF.dbS(), false, new cQI(), dsp.cYV());

    clL.a(Dn.MA());

    aQC.bhe().initialize();

    bjo.a(new dyR());

    dsE.init(0);

    cNO.cFX().a(new dvc());

    bMF.a(new bdA());

    Hh.a(new vd());

    bIS.a(new SW());
    Pg.a(new IU());
    aHv.a(new dDF());
    dTC.a(new cpt());

    aHR.a(aRt.bhP());

    bQK.bXG().a(dUJ.msI);

    bQK.bXG().a(dUJ.msI);
    acL.apd().a(dUJ.msI);

    acL.apd().a(dUJ.msI);
    bVl.caZ().a(dUJ.msI);

    bVl.caZ().a(dUJ.msI);

    aVc.a(new bdz());

    bOE.bVz().kg(ay.bd().getString("ANMIndexFile"));

    dec.bcC();

    boolean bool = Zt.cKQ.cq(1000L);
    if (!bool) {
      K.info("News pas chargees dans le temps imparti. On continue.");
    }

    bXT.hnW.start();

    Zt.cKQ.cq(4000L);
    Zt.cKQ.akB();

    bXy.hmI = bUD.getBoolean(ay.bd().getString("enableAsianCharacters"), false);

    dLE.doY().t("isBrowserAvailable", Boolean.valueOf(bjY.ais()));
    dLE.doY().t("isShopAvailable", Boolean.valueOf((bjY.ais()) && (ay.bd().getBoolean("shopActivated"))));

    bjY.d(new aPR(this));
  }

  private static void a(String paramString1, long paramLong, String paramString2)
  {
    uz localuz = tq.Bg().a(dHL.lSB.dhZ(), paramLong, paramString1 + paramString2, false);
    if (localuz != null)
      localuz.gQ();
  }

  private void awG()
  {
    JavaFunctionLoader.bEu.a(bHd.vM());
    boolean bool = true;
    try {
      bool &= ay.bd().getBoolean("useCompiledLua");
    }
    catch (bdh localbdh)
    {
    }

    if (bool) {
      dlD.cTt().cTs();
    }

    JavaFunctionLoader.bEu.load(ay.bd().getString("scriptFunctionLibraryFile"));
    dlD.cTt().setPath(ay.bd().getString("scriptPath"));

    CameraFunctionsLibrary.bvj().d(this.lnh);
    EffectFunctionsLibrary.cPR().n(this.lnh);

    Properties localProperties = new Properties();
    try {
      File localFile = new File("script.properties");
      if (localFile.exists())
        localProperties.load(new FileInputStream(localFile));
    }
    catch (FileNotFoundException localFileNotFoundException) {
      K.error(localFileNotFoundException.getMessage());
    }

    Enumeration localEnumeration = localProperties.keys();

    while (localEnumeration.hasMoreElements()) { String str = (String)localEnumeration.nextElement();
      int i;
      try {
        i = Integer.parseInt(str); } catch (NumberFormatException localNumberFormatException) {
      }
      continue;

      String[] arrayOfString = localProperties.getProperty(str).split(":");
      if (arrayOfString.length >= 1)
      {
        alm.axU().b(i, arrayOfString[0].trim(), arrayOfString[1].trim());
      } }
  }

  private void awH() {
    bEs localbEs = bEs.bMK();

    String str1 = ay.bd().getString("shortcutsFile");

    String str2 = ay.bd().getString("defaultShortcutsFile");
    try
    {
      try
      {
        localbEs.g(str2, false);

        if (dtb.pU(new URL(ay.bd().getString("shortcutsFile")).getFile()))
          localbEs.g(str1, true);
      }
      catch (Exception localException1) {
        K.debug("Exception à la lecture des shortcuts : ", localException1);
      }
      localbEs.e("debug", false);
      localbEs.e("admin", false);
      localbEs.e("default", true);

      this.djm.rs().a(localbEs, false);
    } catch (Exception localException2) {
      K.error("Exception : ", localException2);
      throw new Exception("Impossible de charger les raccourcis clavier depuis le fichier " + str1 + " !");
    }
  }

  private void awI()
  {
    btL.gcv.a(btb.bBd());

    btL.gcv.a(bQK.bXG());
    btL.gcv.a(acL.apd());
    btL.gcv.a(bVl.caZ());
    btL.gcv.a(dps.cXa());

    btL.gcv.a(cWS.cKD());

    btL.gcv.a(bzZ.goz);
    btL.gcv.a(aOf.eup);
    btL.gcv.a(aOf.eup);

    bzZ.goz.dm(true);
  }

  private void a(ay paramay, aIH paramaIH, cXf paramcXf) {
    String str1 = paramay.getString("soundDevice");
    boolean bool = paramay.getBoolean("soundEnable");
    try
    {
      aWc.blo().ho(ay.bd().getString("soundSourceFlavor"));
    } catch (Exception localException1) {
      K.error("impossible d'initialiser WakfuSoundManager.SOUND_SOURCE_FLAVOR", localException1);
    }

    if ((bool) && (d(str1, 32, 1000))) { aWc.blo().a(paramcXf.cKV());

      aWc.blo().ba(paramaIH.c(yR.bsC));
      aWc.blo().eq(paramaIH.a(yR.bsF));

      aWc.blo().aZ(paramaIH.c(yR.bsD));
      aWc.blo().ep(paramaIH.a(yR.bsG));

      aWc.blo().aY(paramaIH.c(yR.bsB));
      aWc.blo().eo(paramaIH.a(yR.bsE));

      aWc.blo().ej(paramaIH.a(yR.bsH));
      String str2;
      try { str2 = ay.bd().getString("lowPassPresetFile");
        aWc.blo().hq(str2);
      } catch (Exception localException2) {
        K.error("impossible d'initialiser WakfuSoundManager.LOWPASS_PRESET_FILE", localException2);
      }
      try {
        str2 = ay.bd().getString("reverbPresetFile");
        aWc.blo().hp(str2);
      } catch (Exception localException3) {
        K.error("impossible d'initialiser WakfuSoundManager.REVERB_PRESET", localException3);
      }
      try {
        str2 = ay.bd().getString("rollOffPresetFile");
        aWc.blo().hr(str2);
      } catch (Exception localException4) {
        K.error("impossible d'initialiser WakfuSoundManager.ROLLOFF_PRESET_FILE", localException4);
      }
      try {
        str2 = ay.bd().getString("barksFile");
        aWc.blo().hs(str2);
      } catch (Exception localException5) {
        K.error("impossible d'initialiser WakfuSoundManager.BARKS_FILE", localException5);
      }
      try {
        str2 = ay.bd().getString("groundsFile");
        aWc.blo().ht(str2);
      } catch (Exception localException6) {
        K.error("impossible d'initialiser WakfuSoundManager.GROUNDS_FILE", localException6);
      }
      if (!awX()) {
        try {
          str2 = ay.bd().getString("particlesAudioFile");
          bem localbem = (bem)Yo.ajW();
          localbem.id(str2);
        } catch (Exception localException7) {
          K.error("impossible d'initialiser ParticleSoundManager", localException7);
        }
        try {
          str2 = ay.bd().getString("animatedElementsAudioFile");
          dbu localdbu = (dbu)aGb.aSn();
          localdbu.id(str2);
        } catch (Exception localException8) {
          K.error("impossible d'initialiser AnmActionRunScriptManager", localException8);
        }
      } }
  }

  protected void awJ()
  {
    aIH localaIH = awB();
    Pb.aaU().bg((aNh.eth.a(dEX.lOj)) && (localaIH.a(bmz.fEq)));

    Fi localFi = this.lnh.MG();
    Pb.aaU().ai(localFi.getWidth(), localFi.getHeight());
  }

  protected void awK()
  {
    dUI.msG.a(new aEi());
    dUI.msG.a(new biF());
    dUI.msG.a(new dzN());
    dUI.msG.a(new bjE());
    dUI.msG.a(new dpp());
    dUI.msG.a(new cip());
    dUI.msG.a(new crf());
    dUI.msG.a(new JH());
    dUI.msG.a(new cgL());

    dUI.msG.initialize();
    dUI.msG.TV();
    dUI.msG.cleanUp();

    awJ();
  }

  protected void awL()
  {
    aBg.dUP.a(new aFP());
    aBg.dUP.a(new azl());
    aBg.dUP.a(new bmX());

    ccT localccT = new ccT();
    aBg.dUP.initialize();
    aBg.dUP.a(localccT);
    aBg.dUP.cleanUp();
    localccT.bIt();

    bzN localbzN = new bzN();
    localbzN.b(localccT);
    localbzN.bIt();
  }

  protected void awM()
  {
    awN();

    b(new bDH());
    b(aPB.bgv());
    b(aQL.bhm());
    b(new uC());
    b(new aQi());

    b(new bQD());

    b(aTP.biW());

    b(new aTI());

    b(dOR.dqr());

    b(aX.cg());

    b(new vv());

    b(aLz.bdd());

    b(new KT());

    b(Lu.Wa());

    b(new bvt());
    b(new aEK());
    b(new dxd());

    b(new qW());
    b(TO.agI());

    b(jr.rh());

    b(new dly());
    b(VG.aiL());

    b(new dGF());

    b(new Cl());
    b(new dye());
    b(new kG());
    b(new Pt());

    b(asC.aEO());
    b(dHu.dhU());

    b(new dcQ());
    b(new bVB());

    b(new aRc());

    b(atb.dDc);
    b(aGt.edv);
    b(duQ.lzH);
    b(cdb.hvM);
    b(bsJ.fZN);
    b(dus.lyk);
    b(djz.lgE);
    b(dfe.kZi);
    b(new zw());
    b(new bsY());
    b(new coO());
    b(new cyU());
    b(new bZq());
    b(new aRF());
    b(new aP());
    b(aqx.dyc);
    b(ale.dlT);
    b(new bih());
    b(new rl());

    b(new aej());
  }

  private void awN() {
    bSx.hdo.a(new aVG(new ItemBinaryData()));
    bSx.hdo.a(new aoP());
  }

  public void start()
  {
    dLE localdLE = dLE.doY();
    String str = awB().f(bmz.fEe);
    localdLE.t("account.name", str == null ? "" : str);
    localdLE.t("account.remember", Boolean.valueOf(awB().a(bmz.fEd)));
    bqJ.bzC().initialize();
    dLE.doY().t("shortcutsList", bqJ.bzC());

    doh.lox = new bpd();
    ArrayList localArrayList = doh.a(ay.bd(), "proxyGroup", "proxyAddresses", "proxyCommunity");
    int i = awB().d(bmz.fEf) - 1;
    doh localdoh = null;

    if ((i >= 0) && (i < localArrayList.size())) {
      localdoh = (doh)localArrayList.get(i);
    } else {
      TD localTD = bU.fE();
      localdoh = a(localArrayList, localTD);
      if (localdoh == null) {
        localdoh = a(localArrayList, TD.cwB);
      }

    }

    localdLE.t("proxy.list", localArrayList.toArray());

    if (localdoh != null) {
      localdLE.t("proxy.selected", localdoh);
    }

    dLE.doY().t("isAdmin", Boolean.valueOf(false));
    dLE.doY().t("isInGame", Boolean.valueOf(false));

    byv.bFN().a(chb.hET);
    byv.bFN().a(dAE.ddW());
    byv.bFN().a(rS.ys());
    pN.xa();
  }

  private doh a(ArrayList paramArrayList, TD paramTD) {
    for (int i = 0; i < paramArrayList.size(); i++) {
      doh localdoh = (doh)paramArrayList.get(i);
      if (localdoh.fE() == paramTD) {
        return localdoh;
      }
    }
    return null;
  }

  public void awO()
  {
    byv.bFN().awO();

    super.awO();

    awP();

    bEs.bMK().Nz();
    duB.dai().Y((short)-1);
    awB().c(null);
    duB.dai().cf(null);
  }

  public void cleanUp()
  {
    try
    {
      byv.bFN().cleanUp();
    } catch (Exception localException1) {
      K.error("Exception lors du cleanUp de la GameEntity", localException1);
    }

    super.cleanUp();

    awP();
    try
    {
      duB.dai().qp(null);
      awB().b(null);
      duB.dai().qo(null);
    } catch (Exception localException2) {
      K.error("Exception lors de la sauvegarde des préférences du compte", localException2);
    }
  }

  private void awP()
  {
    dmS.cUp();
    bPE.bWu().clean();
    dqB.cXD().clean();
    arV.cP(false);
    jF.aMl.clean();
    try
    {
      bEs.bMK().e("world", false);
      bEs.bMK().e("fight", false);
      bEs.bMK().e("common", false);
      bEs.bMK().e("binding", false);
    } catch (Exception localException1) {
      K.error("Exception lors du nettoyage des racourcis", localException1);
    }

    try
    {
      aiI.cl(true);
    } catch (Exception localException2) {
      K.error("Exception lors du nettoyage du MRU", localException2);
    }

    ckU.cmE().done();
    try
    {
      cBQ.cxL().cyf();
    } catch (Exception localException3) {
      K.error("Exception lors du nettoyage de Xulor", localException3);
    }

    try
    {
      cBQ.cxL().cxW();
    } catch (Exception localException4) {
      K.error("Exception lors du retrait des ActionClass", localException4);
    }

    try
    {
      dGx.dhr().unlock();
      bWx.cbz().hide();
      cBQ.cxL().cxZ();

      cBQ.cxL().cxM();

      awU();
    } catch (Exception localException5) {
      K.error("Exception lors du nettoyage des éléments flottants Xulor", localException5);
    }
    try
    {
      aAx.aMd().aMo();
      aAx.aMd().aMm();
    } catch (Exception localException6) {
      K.error("Exception lors du nettoyage du chat.", localException6);
    }

    axa();
    try
    {
      CM.LV().clean();
    } catch (Exception localException7) {
      K.error("Exception lors du nettoyage des listes de contacts privés", localException7);
    }

    cYb.cLu().clear();

    bOh.clear();

    aTL localaTL = (aTL)Dg();
    localaTL.dV(false);
    localaTL.dZ(false);

    awW();
  }

  protected void awQ()
  {
    a(cBQ.cxL());
    cIM.cDe().a(cBQ.cxL());

    super.awQ();

    NW.cQ(Cn.et(7));

    cBQ.cxL().mI("craftDialog");
    cBQ.cxL().mI("craftTableDialog");

    cBQ.cxL().mI("characterSheetDialog");
    cBQ.cxL().mI("spellsDialog");

    cBQ.cxL().mI("equipmentDialog");

    MQ.WK().a(aWc.blo().blA());

    cBQ.cxL().a(bU.fH());

    cBQ.cxL().a(bEs.bMK());

    cBQ.cxL().a(bBq.bKG());

    awU();

    boolean bool = false;
    try {
      bool = ay.bd().getBoolean("useXmlTheme");
    } catch (bdh localbdh) {
      K.info("useXmlTheme n'est pas défini, on utilise le theme compilé par défaut.");
    }
    if (bool)
      cBQ.cxL().aF(ay.bd().getString("themeFile"), ay.bd().getString("themeDirectory"));
    else {
      cBQ.cxL().b(new ayX(), new cLy(), ay.bd().getString("themeDirectory"));
    }

    cSR localcSR = new cSR();
    localcSR.put(0, VV.dJ("messageBoxDialog"));
    localcSR.put(1, VV.dJ("deathMessageBoxDialog"));
    cBQ.cxL().e(localcSR);

    cBQ.cxL().mS(VV.dJ("popupDialog"));
    cBQ.cxL().mT(VV.dJ("mruDialog"));

    dLE.doY().t("buildVersion", aUk.eUX);

    dLE.doY().t("wakfu.config", ay.bd());

    cBQ.cxL().a(new cVa());

    cBQ.cxL().k(new bNa(0.02F, 0.08F, 0.1F, 0.75F));
  }

  public void awR()
  {
    super.awR();

    IZ localIZ = IZ.Sq();
    localIZ.d("interactiveBubble", dIJ.class);
    localIZ.d("InteractiveBubbleAppearance", wv.class);
    localIZ.d("timeline", kd.class);
    localIZ.d("WorldEditor", aLD.class);

    localIZ.d("timePointBar", cbk.class);
    localIZ.d("timePointBarDecorator", cpG.class);
  }

  protected cmV awS()
  {
    return new cmV();
  }

  protected void a(dCp paramdCp)
  {
  }

  protected bnM y(float paramFloat1, float paramFloat2)
  {
    return new aTL(this, paramFloat1, paramFloat2);
  }

  protected void b(cXf paramcXf)
  {
    super.b(paramcXf);
    ay localay = ay.bd();
    try {
      dsw.load(localay.getString("elementsFile"));

      LC.We().setPath(localay.getString("groupsFile"));

      paramcXf.ik(localay.getString("gfxPath"));
      paramcXf.oD(localay.getString("soundBankFile"));

      bap.fij.initialize();

      String str = localay.getString("particlePath");
      cof.cop().setPath(str);
    }
    catch (bdh localbdh)
    {
      K.error("Erreur à l'initialisation de la worldScene", localbdh);
    }
  }

  public void awT()
  {
    try
    {
      String str = ay.bd().getString("highLightGfxDefaultFile");
      dbL.cNv().dF(str);
    }
    catch (Exception localException) {
      K.error("Erreur à l'initialisation du HighLightManager", localException);
    }
  }

  private void awU()
  {
    cBQ.cxL().j("wakfu", eX.class);
    cBQ.cxL().j("console", bxy.class);
  }

  protected void iQ(int paramInt)
  {
    ckU.cmE().ak(true).g(bU.fH().getString("loading"), paramInt);
  }

  protected void iR(int paramInt)
  {
    ckU.cmE().done();
  }

  protected void a(asq paramasq)
  {
    ckU.cmE().ak(true).du(paramasq.getName());
  }

  protected void a(asq paramasq, Exception paramException)
  {
    cBQ.cxL().a(bU.fH().getString("error.loading") + paramasq.getName(), Cn.et(1), 1026L, 4, 2);

    K.error("Erreur au chargement sur le loader " + paramasq.getClass().getSimpleName(), paramException);
  }

  protected void a(asq paramasq, int paramInt)
  {
    ckU.cmE().ak(true).gs(paramInt);
    ckU.cmE().ak(true).du(" ");
  }

  public void a(Object paramObject, String paramString) {
    GL localGL = (GL)dHL.lSB.dhZ().bZk();
    String str = bU.fH().getString(cwl.ctO() == cwl.ihJ ? "error.unsupportedMaterialMac" : "error.unsupportedMaterial", new Object[] { localGL.glGetString(7936), localGL.glGetString(7937), localGL.glGetString(7938) });

    K.error("Erreur au lancement de l'application : matériel non supporté : " + localGL.glGetString(7936) + " - " + localGL.glGetString(7937) + " : " + localGL.glGetString(7938));

    JOptionPane.showMessageDialog(this.djm.cHK(), str, "Error", 0);
  }

  public void awV()
  {
    super.awV();
    try
    {
      arV.save();
    } catch (Exception localException) {
      K.error("Echec de la tentative de sauvegarde des paramètres de chat");
    }
    aWc.blo().bIL();
    Vb.ain().aio();
    byv.bFN().js("UI Closed");
  }

  public void cn(boolean paramBoolean) {
    this.djn = paramBoolean;
  }

  public void iS(int paramInt) {
    btb.bBd().iS(paramInt);

    bAU localbAU = rs();
    for (int i = 0; i < this.lng.length; i++) {
      aRm localaRm = this.lng[i];
      localaRm.cLc().iS(paramInt);
      if (localaRm.bhF())
      {
        this.lnh.b(localaRm);
        this.lnh.a(localaRm);
      }
    }
    i = 0; for (int j = this.djp.size(); i < j; i++)
      ((bnj)this.djp.get(i)).ke(paramInt);
  }

  public void a(bnj parambnj)
  {
    if (!this.djp.contains(parambnj))
      this.djp.add(parambnj);
  }

  public void awW()
  {
    this.djp.clear();
    awy().a(new aPS(this));
  }

  public static void eI(String paramString)
  {
    Pb.aaU().a(new aPT());

    byn.bFr().jn(paramString);
  }

  protected void a(dJR paramdJR)
  {
    super.a(paramdJR);
    paramdJR.aq(crA.class);
    paramdJR.aq(bEf.class);
    paramdJR.aq(dEa.class);
    paramdJR.aq(dMl.class);
  }

  protected boolean awX()
  {
    try {
      return bUD.getBoolean(ay.bd().getString("useLuaAudio")); } catch (bdh localbdh) {
    }
    return false;
  }

  public void awY()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception localException) {
      K.error("erreur pendant le set du look'n'feel swing", localException);
    }

    K.info("Initialisation du panel de moderation");
    this.djo = new bsz(this);
    this.djo.setVisible(true);
  }

  public bsz awZ() {
    return this.djo;
  }

  public void axa()
  {
    anK.drx.aAg();
    sS.Al().a(null);

    Vr.cAl.aiF();
    bwG.bEl();
    try
    {
      Dg().dY(false);
    } catch (Exception localException1) {
      K.error("Exception lors du nettoyage de la world scene", localException1);
    }

    for (int i = 0; i < this.lng.length; i++) {
      this.lng[i].reset();
    }
    try
    {
      dlD.cTt().cTu();
      bhD.btQ().clean();
      alm.axU().clear();
      cIM.cDe().clean();
    } catch (Exception localException2) {
      K.error("Exception lors du nettoyage du moteur de scripts", localException2);
    }

    try
    {
      UIFunctionsLibrary.Xv().clear();
      BubbleText.dhV().clear();
    } catch (Exception localException3) {
      K.error("Exception lors du nettoyage des bulles de texte", localException3);
    }
  }
}