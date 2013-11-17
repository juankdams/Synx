import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import org.apache.log4j.Logger;

public class cBQ
  implements abQ, crD, dEO
{
  private static Logger K = Logger.getLogger(cBQ.class);

  private static cBQ isP = new cBQ();
  public static final boolean isQ = false;
  public static final long isR = 0L;
  public static final long isS = 1L;
  public static final long isT = 2L;
  public static final long isU = 4L;
  public static final long isV = 8L;
  public static final long isW = 16L;
  public static final long isX = 32L;
  public static final long isY = 64L;
  public static final long isZ = 128L;
  public static final long ita = 256L;
  public static final long itb = 512L;
  public static final long itc = 1024L;
  public static final long itd = 2048L;
  public static final long ite = 4096L;
  public static final long itf = 8192L;
  public static final long itg = 16384L;
  public static final long ith = 32768L;
  public static final long iti = 65536L;
  public static final long itj = 131072L;
  public static final long itk = 262144L;
  public static final int itl = 0;
  public static final int itm = 1;
  public static final int itn = 25999;
  public static final int ito = 26999;
  public static final int itp = 27000;
  public static final int itq = 29999;
  private cRd eMc;
  private cmV itr;
  private final uk its = new uk();

  private final dLE itt = dLE.doY();

  private final cDA hYg = new cDA();
  private final cDA itu = new cDA();

  private final apP itv = new apP();
  private aUb itw;
  private ZW itx;
  private cHO ity;
  private EE itz;
  public static final int itA = 2147483647;
  public static final int itB = -2147483648;
  private final ArrayList itC = new ArrayList();
  private final ArrayList itD = new ArrayList();

  private final akR itE = new akR();
  private final HashMap itF;
  private URL hkL;
  private boolean itG;
  private int itH;
  private final cSR itI = new cSR();
  private int itJ;
  private dFb itK;
  private cxO itL;
  private int itM;
  private dFb itN;
  private dBz itO;
  private boolean itP = true;
  public String itQ;
  public String ftS;
  public String itR;
  private final ArrayList itS = new ArrayList();

  private final ArrayList itT = new ArrayList();
  private final ArrayList itU = new ArrayList();
  private final ArrayList itV = new ArrayList();
  private final ArrayList itW = new ArrayList();
  private final ArrayList itX = new ArrayList();
  private final ArrayList itY = new ArrayList();

  private final Stack itZ = new Stack();

  private final ArrayList iua = new ArrayList();

  private bNa iub = new bNa(0, 0, 0, 0);
  private int bmM;
  private boolean iuc = true;
  private dVk iud;
  private final HashMap iue = new HashMap();

  public static cBQ cxL() {
    return isP;
  }

  private cBQ()
  {
    this.itF = new HashMap();
    j("xulor", ayw.class);
  }

  public void mG(String paramString)
  {
    this.itv.p(paramString, 1);
  }

  public void I(String paramString, int paramInt)
  {
    this.itv.p(paramString, paramInt);
  }

  public void mH(String paramString)
  {
    this.itv.fh(paramString);
  }

  public void cxM()
  {
    this.itv.aBK();
  }

  public void a(bnm parambnm)
  {
    if ((parambnm != null) && (!this.itV.contains(parambnm)))
      this.itV.add(parambnm);
  }

  public void b(bnm parambnm)
  {
    this.itW.add(parambnm);
  }

  public void a(bOW parambOW)
  {
    if ((parambOW != null) && (!this.itT.contains(parambOW)))
      this.itT.add(parambOW);
  }

  public void b(bOW parambOW)
  {
    this.itU.add(parambOW);
  }

  public void a(dvj paramdvj)
  {
    if ((paramdvj != null) && (!this.itX.contains(paramdvj)))
      this.itX.add(paramdvj);
  }

  public void b(dvj paramdvj)
  {
    this.itY.add(paramdvj);
  }

  public void mI(String paramString)
  {
    if ((paramString != null) && (!this.iua.contains(paramString)))
      this.iua.add(paramString);
  }

  public void mJ(String paramString)
  {
    this.iua.remove(paramString);
  }

  public void cxN() {
    this.iua.clear();
  }

  public bNa cxO()
  {
    return this.iub;
  }

  public void k(bNa parambNa) {
    this.iub = parambNa;
  }

  public ZW cxP() {
    return this.itx;
  }

  public void a(ZW paramZW) {
    this.itx = paramZW;
  }

  public void a(aUb paramaUb) {
    this.itw = paramaUb;
  }

  public aUb cxQ() {
    return this.itw;
  }

  public void a(EE paramEE)
  {
    this.itz = paramEE;
  }

  public EE cxR()
  {
    return this.itz;
  }

  public uk bSM()
  {
    return this.its;
  }

  public cDA coO()
  {
    return this.hYg;
  }

  public void a(cRd paramcRd)
  {
    this.eMc = paramcRd;
  }

  public cRd aww()
  {
    return this.eMc;
  }

  public cmV cxS()
  {
    return this.itr;
  }

  public void a(cmV paramcmV)
  {
    this.itr = paramcmV;
  }

  public dVk cxT() {
    return this.iud;
  }

  public void a(dVk paramdVk) {
    this.iud = paramdVk;
    cxU();
  }

  private void cxU()
  {
    ciW localciW = cZy.cMn();
    if (localciW != null)
    {
      if (localciW.contains("tooltipsDisplay")) {
        this.itP = localciW.getBoolean("tooltipsDisplay");
      }
      if (localciW.contains("tooltipsDuration"))
        BD.ec(localciW.getInt("tooltipsDuration"));
    }
  }

  public ciW mK(String paramString)
  {
    return this.iud.oA(paramString);
  }

  public void a(coN paramcoN) {
    String str = paramcoN.getPropertyName();

    if (str.equalsIgnoreCase("tooltipsDisplay"))
      this.itP = ((Boolean)paramcoN.getNewValue()).booleanValue();
    else if (str.equalsIgnoreCase("tooltipsDuration"))
      BD.ec(((Integer)paramcoN.getNewValue()).intValue());
  }

  public String mL(String paramString)
  {
    if (this.ity != null) {
      return this.ity.getString(paramString);
    }
    return paramString;
  }

  public void a(cHO paramcHO)
  {
    this.ity = paramcHO;
  }

  public String cxV()
  {
    StringBuilder localStringBuilder = new StringBuilder("# XULOR INFOS #");

    localStringBuilder.append('\n').append("- loadedElementCount = ").append(this.itE.size());
    localStringBuilder.append('\n').append("- loadedElements = \n");
    if (!this.itE.isEmpty()) {
      this.itE.r(new bKK(this, localStringBuilder));
    }

    return localStringBuilder.toString();
  }

  public URL cbS()
  {
    return this.hkL;
  }

  public void g(URL paramURL)
  {
    this.hkL = paramURL;
  }

  public boolean mM(String paramString)
  {
    return this.itF.containsKey(paramString);
  }

  public void j(String paramString, Class paramClass)
  {
    this.itF.put(paramString, paramClass);
  }

  public void mN(String paramString)
  {
    this.itF.remove(paramString);
  }

  public void cxW()
  {
    this.itF.clear();
    j("xulor", ayw.class);
  }

  public Class cxX()
  {
    return mO("xulor");
  }

  public Class mO(String paramString)
  {
    if (paramString == null) {
      return (Class)this.itF.get("xulor");
    }
    if (!this.itF.containsKey(paramString)) {
      K.error("Le package " + paramString + " est inconnue !");
      return null;
    }
    return (Class)this.itF.get(paramString);
  }

  public dFb mP(String paramString)
  {
    return L(paramString, false);
  }

  public dFb L(String paramString, boolean paramBoolean) {
    dFb localdFb1 = (dFb)this.iue.get(paramString);

    dFb localdFb2 = dFb.T(paramString, paramBoolean);
    QX.log("gui_dialog", paramString);
    this.iue.put(paramString, localdFb2);
    return localdFb2;
  }

  public void mQ(String paramString) {
    dFb localdFb = mP(paramString);
    if (localdFb != null)
      this.itI.put(0, localdFb);
  }

  public void e(cSR paramcSR)
  {
    dmn localdmn = paramcSR.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      dFb localdFb = mP((String)localdmn.value());
      if (localdFb != null)
        this.itI.put(localdmn.zY(), localdFb);
    }
  }

  public cKX mR(String paramString)
  {
    return a(paramString, " ", 2L, 0, 0);
  }

  public cKX k(String paramString, long paramLong)
  {
    return a(paramString, null, paramLong, 0, 0);
  }

  public cKX a(String paramString1, String paramString2, long paramLong)
  {
    return a(paramString1, paramString2, null, paramLong, 0, 0);
  }

  public cKX i(String paramString, int paramInt1, int paramInt2) {
    return a(paramString, " ", null, 2L, paramInt1, paramInt2);
  }

  public cKX a(String paramString, long paramLong, int paramInt1, int paramInt2) {
    return a(paramString, " ", null, paramLong, paramInt1, paramInt2);
  }

  public cKX a(String paramString1, String paramString2, long paramLong, int paramInt1, int paramInt2) {
    return a(paramString1, " ", paramString2, paramLong, paramInt1, paramInt2);
  }

  public cKX a(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt1, int paramInt2) {
    return a(paramString1, paramString2, paramString3, paramLong, null, paramInt1, paramInt2);
  }

  public cKX a(String paramString1, String paramString2, String paramString3, long paramLong, ArrayList paramArrayList, int paramInt1, int paramInt2) {
    return a(new NW(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramLong, paramArrayList, 0));
  }

  public cKX a(NW paramNW) {
    return Hm.QP().a(paramNW);
  }

  public cKX a(String paramString1, String paramString2, String paramString3, int paramInt, long paramLong, ArrayList paramArrayList) {
    cKX localcKX = null;

    dFb localdFb = (dFb)this.itI.get(paramInt);
    if (localdFb != null)
    {
      String str = "MessageBox_" + this.itH++;
      if (this.itH > 2147483646) {
        this.itH = 0;
      }

      localcKX = new cKX(str);

      a(localdFb, paramString1, paramString2, localcKX, paramString3, paramLong, paramArrayList);
    }

    return localcKX;
  }

  private void a(dFb paramdFb, String paramString1, String paramString2, cKX paramcKX, String paramString3, long paramLong, ArrayList paramArrayList) {
    if (paramdFb == null) {
      return;
    }

    try
    {
      cpa localcpa = this.hYg.nd(paramcKX.cEk());
      this.hYg.f(localcpa);
      aNL localaNL = a(paramdFb, this.hYg, localcpa);

      if ((localaNL != null) && ((localaNL instanceof bpn))) {
        localaNL.setElementMapRoot(true);
        bpn localbpn = (bpn)localaNL;
        localbpn.setId(paramcKX.cEk());
        localbpn.setModalLevel(Ts.cwl);

        a(localbpn.getId(), localbpn, bsP.getInstance().getLayeredContainer(), 26000, 256L);

        cZQ.a(localbpn, paramcKX, paramString1, paramString2, paramString3, paramLong, paramArrayList);

        f(paramcKX);

        MQ.WK().WS();
      }
      this.itG = true;
    } catch (Exception localException) {
      K.error("Erreur lors du chargement de la messageBox", localException);
    }
  }

  public void mS(String paramString)
  {
    this.itK = mP(paramString);
    if (this.itK == null)
      K.error("Le chemin '" + paramString + "' vers le fichier de définition des popupMenu est invalide !");
  }

  public cxO cxY()
  {
    if (this.itK == null) {
      return null;
    }
    cxO localcxO = null;
    try
    {
      String str = "PopupMenu_" + this.itJ++;
      if (this.itJ > 2147483646) {
        this.itJ = 0;
      }

      cpa localcpa = this.hYg.nd(str);
      this.hYg.f(localcpa);
      aNL localaNL = a(this.itK, this.hYg, localcpa);

      if ((localaNL != null) && ((localaNL instanceof cxO))) {
        localaNL.setElementMapRoot(true);
        localcxO = (cxO)localaNL;
        localcxO.setId(str);
        localcxO.setModalLevel(Ts.cwm);
        localcxO.setVisible(false);

        this.itr.getMasterRootContainer().getLayeredContainer().b(localcxO, 30000);

        this.itE.put(str, localcxO);
      }

      this.itG = true;
    }
    catch (Exception localException) {
      K.error(localException.getMessage());
    }

    return localcxO;
  }

  public void d(cxO paramcxO) {
    cxZ();
    this.itL = paramcxO;
    paramcxO.show();
  }

  public void a(cxO paramcxO, int paramInt1, int paramInt2) {
    cxZ();
    this.itL = paramcxO;
    paramcxO.ea(paramInt1, paramInt2);
  }

  public void cxZ() {
    if (this.itL != null)
      mW(this.itL.getId());
  }

  public void mT(String paramString)
  {
    this.itN = mP(paramString);
    if (this.itN == null)
      K.error("Le chemin '" + paramString + "' vers le fichier de définition des mrus est invalide !");
  }

  public void cya()
  {
    ArrayList localArrayList = new ArrayList();
    if (!this.itE.isEmpty()) {
      this.itE.s(new bKQ(this, localArrayList));
    }

    for (aNL localaNL : localArrayList)
      M(localaNL.getElementMap().getId(), true);
  }

  public dBz cyb()
  {
    if (this.itN == null) {
      return null;
    }
    dBz localdBz = null;
    try
    {
      String str = "MRU";
      dOc localdOc = (dOc)this.itE.get("MRU");
      if (localdOc != null) {
        localObject = new bxa(localdOc);
        ((bxa)localObject).aJ();
        localdOc.g((cSx)localObject);

        M("MRU", true);
      }

      Object localObject = this.hYg.nd("MRU");
      this.hYg.f((cpa)localObject);
      aNL localaNL = a(this.itN, this.hYg, (cpa)localObject);

      if ((localaNL != null) && ((localaNL instanceof dBz))) {
        localaNL.setElementMapRoot(true);
        localdBz = (dBz)localaNL;
        localdBz.setId("MRU");
        localdBz.setModalLevel(Ts.cwm);
        localdBz.setVisible(false);

        cxS().getMasterRootContainer().getLayeredContainer().b(localdBz, 0);

        this.itE.put("MRU", localdBz);
      }

      this.itG = true;
    }
    catch (Exception localException) {
      K.error(localException.getMessage());
    }

    return localdBz;
  }

  public void a(dBz paramdBz)
  {
    cyc();
    this.itO = paramdBz;
    paramdBz.show();
  }

  public void a(dBz paramdBz, int paramInt1, int paramInt2)
  {
    cyc();
    this.itO = paramdBz;

    cmV localcmV = cxL().cxS();
    if (localcmV.isScaled()) {
      paramInt1 = localcmV.vO(paramInt1);
      paramInt2 = localcmV.vP(paramInt2);
    }
    paramdBz.ea(paramInt1, paramInt2);
  }

  public void cyc()
  {
    if ((this.itO != null) && (!this.itO.isUnloading()))
      mW(this.itO.getElementMap().getId());
  }

  public boolean cyd()
  {
    return this.itP;
  }

  public aNL mU(String paramString)
  {
    return (aNL)this.itE.get(paramString);
  }

  public Iterator cye() {
    return this.itE.values().iterator();
  }

  public void a(String paramString, agn paramagn)
  {
    this.itC.add(new i(paramString, paramagn));
  }

  public void a(String paramString1, String paramString2, YA paramYA)
  {
    this.its.a(new URL(paramString1), paramString2, paramYA);
  }

  public void b(cTp paramcTp, cDt paramcDt, String paramString) {
    this.its.a(paramcTp, paramcDt, paramString);
  }

  public void aF(String paramString1, String paramString2)
  {
    try
    {
      this.its.a(new URL(paramString1), paramString2);
    } catch (Exception localException) {
      K.error("Erreur lors du chargement du Theme : " + localException.getMessage());
    }
  }

  public void aoa()
  {
    dQU.drS().drR();
    this.its.ab(true);
  }

  public aNL a(String paramString1, String paramString2, short paramShort)
  {
    return a(paramString1, paramString2, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, short paramShort)
  {
    return a(paramString1, paramString2, paramString3, paramBoolean, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt1, int paramInt2, short paramShort)
  {
    return a(paramString1, paramString2, paramString3, paramBoolean, paramInt1, paramInt2, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt, short paramShort)
  {
    return a(paramString1, paramString2, paramInt, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt, String paramString3, boolean paramBoolean, short paramShort)
  {
    return a(paramString1, paramString2, paramInt, paramString3, paramBoolean, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt1, String paramString3, boolean paramBoolean, int paramInt2, int paramInt3, short paramShort)
  {
    return a(paramString1, paramString2, paramInt1, paramString3, paramBoolean, paramInt2, paramInt3, 0L, paramShort);
  }

  public aNL a(String paramString1, String paramString2, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, 2147483647, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, 2147483647, paramString3, paramBoolean, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt1, int paramInt2, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, 2147483647, paramString3, paramBoolean, paramInt1, paramInt2, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, null, null, null, null, null, false, false, 0, 0, null, paramInt, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, null, paramString3, paramString4, null, paramString5, false, false, 0, 0, null, 2147483647, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt, String paramString3, boolean paramBoolean, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, null, null, null, paramString3, null, paramBoolean, false, 0, 0, null, paramInt, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, int paramInt1, String paramString3, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong, short paramShort)
  {
    return a(paramString1, paramString2, null, null, null, paramString3, null, paramBoolean, true, paramInt2, paramInt3, null, paramInt1, paramLong, paramShort);
  }

  public aNL a(String paramString1, aNL paramaNL, String paramString2, String paramString3, String paramString4, cpa paramcpa, long paramLong, short paramShort)
  {
    return a(null, paramString1, paramaNL, paramString2, paramString3, null, paramString4, false, false, 0, 0, paramcpa, 2147483647, paramLong, paramShort);
  }

  public aNL a(String paramString1, aNL paramaNL, String paramString2, boolean paramBoolean, cpa paramcpa, long paramLong, short paramShort)
  {
    return a(null, paramString1, paramaNL, null, null, paramString2, null, paramBoolean, false, 0, 0, paramcpa, 2147483647, paramLong, paramShort);
  }

  public aNL a(String paramString1, aNL paramaNL, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2, cpa paramcpa, long paramLong, short paramShort)
  {
    return a(null, paramString1, paramaNL, null, null, paramString2, null, paramBoolean, true, paramInt1, paramInt2, paramcpa, 2147483647, paramLong, paramShort);
  }

  public aNL a(String paramString1, String paramString2, aNL paramaNL, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, cpa paramcpa, int paramInt3, long paramLong, short paramShort)
  {
    aNL localaNL1 = this.itv.fi(paramString2);

    dFb localdFb = null;
    if (localaNL1 == null) {
      localdFb = L(paramString2, true);
      if (localdFb == null) {
        K.error("impossible de charger le dialog correspondant à cette ressource : " + paramString2);
      }
    }
    aNL localaNL2 = null;

    if ((paramLong & 0x1000) != 4096L) {
      localaNL2 = a(paramString1, localaNL1, localdFb, paramaNL, paramString3, paramString4, paramString5, paramString6, paramBoolean1, paramBoolean2, paramInt1, paramInt2, paramcpa, this.hkL, paramLong, paramShort);
      if (paramInt3 != 2147483647)
        this.itC.add(new LO(paramString1, paramInt3, 0L));
    }
    else {
      synchronized (this.itC) {
        this.itC.add(new bWQ(localdFb, localaNL1, paramString1, paramcpa, paramaNL, paramString3, paramString4, paramString5, paramString6, paramBoolean1, paramBoolean2, paramInt1, paramInt2, this.hkL, paramInt3, paramLong, paramShort));
      }
    }

    return localaNL2;
  }

  private aNL a(String paramString1, aNL paramaNL1, dFb paramdFb, aNL paramaNL2, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, cpa paramcpa, URL paramURL, long paramLong, short paramShort)
  {
    if (this.iua.contains(paramString1)) {
      for (i = this.itT.size() - 1; i >= 0; i--) {
        ((bOW)this.itT.get(i)).au(paramString1);
      }

    }

    if ((paramLong & 0x10) == 16L) {
      mX(paramString1);
    }

    int i = 0;

    if ((paramaNL1 != null) && (paramcpa == null)) {
      paramcpa = paramaNL1.getElementMap();
      if (paramcpa != null) {
        paramcpa.lD(paramString1);
      }
    }

    if ((paramString1 != null) && (paramcpa == null) && (!this.itE.containsKey(paramString1)))
    {
      paramcpa = this.hYg.nd(paramString1);
      i = 1;
    }
    Object localObject;
    if (paramcpa != null)
    {
      try
      {
        cpa localcpa = this.hYg.czv();

        this.hYg.f(paramcpa);

        localObject = this.hkL;
        this.hkL = paramURL;

        if (paramaNL1 == null) {
          if (paramdFb == null) {
            return null;
          }
          paramaNL1 = a(paramdFb, this.hYg, paramcpa);
        }
        if ((paramLong & 0x40) != 64L) {
          if (paramaNL2 == null)
          {
            cOP localcOP = cxS().getMasterRootContainer().getLayeredContainer();
            int k;
            if ((paramLong & 0x100) == 256L) {
              k = 26000;
              if (this.itx != null)
                this.itx.alK();
            }
            else if ((paramLong & 0x40000) == 262144L) {
              k = -10000;
            } else if ((paramLong & 0x10000) == 65536L) {
              k = -40000;
            }
            else if ((paramLong & 0x4) == 4L) {
              k = 27000;
            } else if ((paramLong & 0x20000) == 131072L) {
              k = 25999;
            } else if ((paramLong & 0x2) == 2L) {
              k = 26999;
            } else if ((paramLong & 0x8) == 8L) {
              k = 29999;
            } else {
              k = 0;
            }
            if ((paramaNL1 instanceof dOc))
            {
              localcOP.b((dOc)paramaNL1, k);
              paramaNL2 = localcOP;
            } else {
              localcOP.b(paramaNL1);
            }
          } else if (paramaNL2 != null) {
            paramaNL2.b(paramaNL1);
          }

        }

        paramaNL1.setElementMapRoot(i);

        if ((paramLong & 0x100) == 256L) {
          Ts.agx().e(paramaNL1);
          this.itS.add(paramString1);
        }

        if ((paramLong & 0x200) == 512L) {
          Ts.agx().d(paramaNL1);
          this.itS.add(paramString1);
        }

        this.hkL = ((URL)localObject);

        this.hYg.f(localcpa);
      }
      catch (Exception localException) {
        K.error("Le chargement de " + paramdFb.aJK + " a échoué", localException);
      }

      a(paramaNL1, paramString1, paramaNL2, paramString2, paramString3, paramString4, paramString5, paramBoolean1, paramBoolean2, paramInt1, paramInt2, paramcpa, paramURL, paramLong, paramShort);
    }
    else
    {
      K.error("On essaye de charger une dialog existant déjà sans avoir utilisé l'option FORCE_RELOAD");
    }

    for (int j = this.itX.size() - 1; j >= 0; j--) {
      localObject = (dvj)this.itX.get(j);
      if (!this.itY.contains(localObject)) {
        ((dvj)localObject).au(paramString1);
      }

    }

    return paramaNL1;
  }

  private void a(aNL paramaNL1, String paramString1, aNL paramaNL2, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, cpa paramcpa, URL paramURL, long paramLong, short paramShort)
  {
    if (paramaNL1 != null)
    {
      if (paramString1 != null)
      {
        this.itE.put(paramString1, paramaNL1);
      }

      if ((paramLong & 0x20) != 32L)
      {
        this.itG = true;
      }

      bMw localbMw = null;

      if ((paramLong & 0x400) == 1024L) {
        if (localbMw == null) {
          localbMw = new bMw((dOc)paramaNL1);
        }
        localbMw.gm(true);
        localbMw.gn(true);
      }

      if ((paramLong & 0x8000) == 32768L) {
        if (localbMw == null) {
          localbMw = new bMw((dOc)paramaNL1);
        }
        localbMw.gm(true);
      }

      if ((paramLong & 0x4000) == 16384L) {
        if (localbMw == null) {
          localbMw = new bMw((dOc)paramaNL1);
        }
        localbMw.gn(true);
      }

      if (localbMw != null)
      {
        paramaNL1.setUserDefinedManager(localbMw);
        paramaNL1.beL();
        this.iud.oA(paramString1).a(paramaNL1);
      }

      if (this.itw != null)
        if ((paramLong & 0x2000) == 8192L)
          this.itw.hh(paramString1);
        else
          this.itw.y(paramString1, false);
      Object localObject1;
      Object localObject2;
      if (paramString3 != null) {
        localObject1 = (dOc)paramaNL1;
        if (!(((dOc)localObject1).getLayoutData() instanceof cwP)) {
          ((dOc)localObject1).setLayoutData(new cwP());
        }
        localObject2 = (cwP)((dOc)localObject1).getLayoutData();
        ((cwP)localObject2).setReferentWidget((dOc)this.itE.get(paramString3));
        if (paramString2 != null) {
          ((cwP)localObject2).setCascadeMethodEnabled(true);
        }

        ((cwP)localObject2).setControlGroup(paramString5);
      }

      if (paramString5 != null) {
        localObject1 = paramaNL1.getParentOfType(dhh.class);
        if (localObject1 != null) {
          localObject2 = (dhh)localObject1;
          dOc localdOc = (dOc)paramaNL1;
          String str1 = paramString5;
          String str2 = paramString2;
          ((dhh)localObject2).getWindowManager().e(localdOc, paramString5);
          if (str2 != null) {
            ((dhh)localObject2).getWindowManager().g(localdOc, paramString5);
          }
          bKP localbKP = new bKP(this, localdOc, (dhh)localObject2, str1, str2);

          a(localbKP);
        }
      }

      if ((paramBoolean2) && 
        ((paramaNL1 instanceof dOc))) {
        if (paramInt1 != -2147483648) {
          ((dOc)paramaNL1).setX(paramInt1);
        }
        if (paramInt2 != -2147483648)
          ((dOc)paramaNL1).setY(paramInt2);
      }
    }
  }

  private void a(String paramString, aNL paramaNL1, aNL paramaNL2, int paramInt, long paramLong)
  {
    if ((paramaNL2 instanceof cOP))
      ((cOP)paramaNL2).b((dOc)paramaNL1, paramInt);
    else {
      paramaNL2.b(paramaNL1);
    }

    if ((paramLong & 0x100) == 256L) {
      Ts.agx().e(paramaNL1);
      this.itS.add(paramString);
    }
    if ((paramLong & 0x200) == 512L) {
      Ts.agx().d(paramaNL1);
      this.itS.add(paramString);
    }

    this.itE.put(paramString, paramaNL1);
  }

  public aNL mV(String paramString) {
    Class localClass = null;
    URL localURL = null;
    try
    {
      localClass = Class.forName(paramString);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    if (localClass == null) {
      try {
        localURL = new URL(paramString);
      }
      catch (MalformedURLException localMalformedURLException1)
      {
      }
      if (localURL == null) {
        try {
          localURL = bAy.c(this.hkL, paramString);
        }
        catch (MalformedURLException localMalformedURLException2)
        {
        }
      }
      if (localURL != null) {
        this.hkL = localURL;
      }
    }
    if ((localURL == null) && (localClass == null)) {
      K.error("impossible de charger le dialog correspondant à cette ressource : " + paramString);
      return null;
    }

    cpa localcpa = new cpa(null, this.hYg);
    try
    {
      if (localClass != null) {
        return a(localClass, this.hYg, localcpa);
      }
      return a(localURL, this.hYg, localcpa, false, null, null, null);
    }
    catch (Exception localException) {
      K.error("Impossible de charger la dialog de ressource " + paramString);
    }return null;
  }

  public aNL a(URL paramURL1, cDA paramcDA, cpa paramcpa, boolean paramBoolean, URL paramURL2, String paramString1, String paramString2)
  {
    bwZ localbwZ = h(paramURL1);
    return this.its.a(localbwZ, paramURL1, paramcDA, paramcpa, paramBoolean, paramURL2, paramString1, paramString2);
  }

  public static bwZ h(URL paramURL) {
    bwZ localbwZ = new bwZ();
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramURL.openStream());
    bpA localbpA = new bpA();
    QX.log("gui_dialog", paramURL.getFile());
    localbpA.i(localBufferedInputStream);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();
    localBufferedInputStream.close();
    return localbwZ;
  }

  public aNL a(dFb paramdFb, cDA paramcDA, cpa paramcpa) {
    if (paramdFb.lOx != null) {
      return a(paramdFb.lOx, paramcDA, paramcpa);
    }
    return a(paramdFb.aJK, paramcDA, paramcpa, false, null, null, null);
  }

  public aNL a(Class paramClass, cDA paramcDA, cpa paramcpa) {
    return (aNL)((cEa)paramClass.newInstance()).a(paramcDA, paramcpa);
  }

  public void mW(String paramString)
  {
    M(paramString, false);
  }

  public void M(String paramString, boolean paramBoolean)
  {
    if (!this.itE.containsKey(paramString)) {
      return;
    }
    if (paramBoolean)
      mX(paramString);
    else
      this.itC.add(new LO(paramString));
  }

  private void mX(String paramString)
  {
    if (this.itE.containsKey(paramString)) {
      aNL localaNL = (aNL)this.itE.get(paramString);

      if (localaNL != null)
        localaNL.beH();
    }
  }

  public void mY(String paramString)
  {
    if (this.itE.containsKey(paramString)) {
      for (int i = this.itV.size() - 1; i >= 0; i--) {
        bnm localbnm = (bnm)this.itV.get(i);
        if (!this.itW.contains(localbnm)) {
          localbnm.i(paramString);
        }
      }
      aNL localaNL = (aNL)this.itE.remove(paramString);
      if ((localaNL != null) && 
        (this.itS.contains(paramString))) {
        this.itS.remove(paramString);
        Ts.agx().f(localaNL);
      }

      if (this.itw != null)
        this.itw.hj(paramString);
    }
  }

  public void cyf()
  {
    cyg();
  }

  private void cyg()
  {
    if (!this.itE.isEmpty()) {
      K.info("Unloading All !");
      this.itE.r(new bKN(this));

      for (int i = this.itC.size() - 1; i >= 0; i--) {
        asx localasx = (asx)this.itC.get(i);
        if ((localasx instanceof LO)) {
          this.itC.remove(i);
        }
      }
    }

    Ts.agx().removeAllElements();
    this.itS.clear();

    this.itr.getMasterRootContainer().bAW();

    this.itE.clear();
  }

  public boolean mZ(String paramString)
  {
    aNL localaNL = (aNL)this.itE.get(paramString);
    return (localaNL != null) && (!localaNL.isUnloading());
  }

  public boolean aG(String paramString1, String paramString2)
  {
    if (this.itE.containsKey(paramString2)) {
      return false;
    }
    aNL localaNL = (aNL)this.itE.remove(paramString1);
    this.itE.put(paramString2, localaNL);
    return true;
  }

  public void a(dCp paramdCp, int paramInt)
  {
    this.bmM += paramInt;

    if (this.its.CW()) {
      this.its.CV();
    }

    this.itt.doZ();

    if (this.itU.size() > 0) {
      this.itT.removeAll(this.itU);
      this.itU.clear();
    }
    if (this.itY.size() > 0) {
      this.itX.removeAll(this.itY);
      this.itY.clear();
    }
    if (this.itW.size() > 0) {
      this.itV.removeAll(this.itW);
      this.itW.clear();
    }
    try
    {
      if (this.iuc) {
        synchronized (this.itC) {
          int i = this.itD.size();
          Object localObject1;
          for (int j = 0; j < i; j++) {
            localObject1 = (LO)this.itD.get(j);
            if (this.bmM - ((LO)localObject1).getDuration() - ((LO)localObject1).getStartTime() > 0L) {
              ((LO)localObject1).Wv();
              this.itC.add(this.itD.remove(j));
              j--;
              i--;
            }
          }
          while (!this.itC.isEmpty()) {
            asx localasx = (asx)this.itC.remove(0);
            if ((localasx instanceof LO)) {
              localObject1 = (LO)localasx;
              if (!((LO)localObject1).gI()) {
                ((LO)localObject1).Z(this.bmM);
                this.itD.add(localObject1);
              }
              else if (((LO)localObject1).Wu()) {
                cyg();
              } else {
                mX(((LO)localObject1).getId());
              }
            }
            else if ((localasx instanceof bWQ)) {
              localObject1 = (bWQ)localasx;
              if (((((bWQ)localObject1).getOptions() & 0x800) != 2048L) || (!mZ(((bWQ)localObject1).getId())))
              {
                if (((bWQ)localObject1).getDuration() != 2147483647) {
                  this.itD.add(new LO(((bWQ)localObject1).getId(), ((bWQ)localObject1).getDuration(), this.bmM));
                }
                a(((bWQ)localObject1).getId(), ((bWQ)localObject1).ccb(), ((bWQ)localObject1).cbR(), ((bWQ)localObject1).getParent(), ((bWQ)localObject1).cbU(), ((bWQ)localObject1).cbV(), ((bWQ)localObject1).cbW(), ((bWQ)localObject1).cbX(), ((bWQ)localObject1).cbT(), ((bWQ)localObject1).cbY(), ((bWQ)localObject1).cbZ(), ((bWQ)localObject1).cca(), ((bWQ)localObject1).getElementMap(), ((bWQ)localObject1).cbS(), ((bWQ)localObject1).getOptions(), ((bWQ)localObject1).nU());
              }

            }
            else if ((localasx instanceof bJm)) {
              localObject1 = (bJm)localasx;
              a(((bJm)localObject1).bYJ, ((bJm)localObject1).gKm, ((bJm)localObject1).etK, ((bJm)localObject1).gAI, ((bJm)localObject1).ceT);
            } else if ((localasx instanceof i)) {
              localObject1 = (i)localasx;
              aNL localaNL = (aNL)this.itE.get(((i)localObject1).l());
              if ((localaNL instanceof dxn))
                ((dxn)localaNL).setTarget(((i)localObject1).getTarget());
              else
                K.error("Tentative de SetWatcherTarget avec une id invalide " + ((i)localObject1).l());
            }
            else if ((localasx instanceof crK)) {
              localObject1 = (crK)localasx;
              bWx.cbz().setWidget(((crK)localObject1).ibk);
              bWx.cbz().setXOffset(((crK)localObject1).ibl);
              bWx.cbz().setYOffset(((crK)localObject1).ibm);
              bWx.cbz().a(((crK)localObject1).ibn);
              bWx.cbz().show();
            } else if ((localasx instanceof bEb)) {
              bWx.cbz().hide();
            }

          }

        }

      }

    }
    catch (Throwable localThrowable)
    {
      K.error("Exception dans Xulor.onProcess() : ", localThrowable);
    }
  }

  public void a(dCp paramdCp, int paramInt1, int paramInt2) {
    Vb.ain().a(this.itr, paramInt1, paramInt2);
  }

  public void b(dCp paramdCp) {
    this.itr = ((cmV)paramdCp);
  }

  public void f(cKX paramcKX) {
    this.itZ.push(paramcKX);
  }

  public void g(cKX paramcKX) {
    this.itZ.remove(paramcKX);
  }

  public boolean cyh() {
    if (this.itZ.empty()) {
      return false;
    }

    cKX localcKX = (cKX)this.itZ.pop();

    localcKX.a(32768, null);
    return true;
  }
}