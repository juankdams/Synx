import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class dpr
  implements dBv
{
  private static final Logger K = Logger.getLogger(dpr.class);
  public static final String lpQ = "currentShortcutBarType";
  public static final String lpR = "selectedShortcutBar";
  public static final String lpS = "currentShortcutBarNumber";
  public static final String lpT = "currentShortcutBarNumberText";
  public static final String lpU = "leftHandWeaponShortcut";
  public static final String lpV = "rightHandWeaponShortcut";
  public static final String lpW = "closedShortcutBars";
  public static final String lpX = "displaySymbiotBar";
  public static final String[] bF = { "currentShortcutBarType", "selectedShortcutBar", "currentShortcutBarNumber", "currentShortcutBarNumberText", "leftHandWeaponShortcut", "rightHandWeaponShortcut", "closedShortcutBars", "displaySymbiotBar" };
  private bJz[] lpY;
  private boolean lpZ = false;

  private byte lqa = 0;
  private byte lqb = 0;
  private byte[] lqc;
  private byte[] lqd;
  private final dKD lqe;
  private final dKD lqf;
  private aFy lqg = aFy.ebG;

  private final ArrayList lqh = new ArrayList();

  public dpr()
  {
    int i = aFy.aRR();

    this.lpY = new bJz[i];
    byte b = 0;

    for (aFy localaFy : aFy.values()) {
      int m = localaFy.aRO();
      bJz[] arrayOfbJz = new bJz[m];
      for (int n = 0; n < m; n++) {
        switch (dGn.gTg[localaFy.ordinal()]) {
        case 1:
          arrayOfbJz[n] = new dMU(b);
          break;
        default:
          arrayOfbJz[n] = new bJz(localaFy, b);
        }

        this.lpY[b] = arrayOfbJz[n];
        b = (byte)(b + 1);
      }
    }

    ??? = Hh.QM().dh(2145);
    if (??? != null) {
      this.lqf = dKD.b(bKq.gNh, -1L, ((bBn)???).getId(), ((bBn)???).oc());
      this.lqe = dKD.b(bKq.gNh, -1L, -1, 0);
    } else {
      this.lqf = null;
      this.lqe = null;
    }
  }

  public void release()
  {
    if (this.lqf != null) {
      this.lqf.release();
    }
    if (this.lqe != null) {
      this.lqe.release();
    }

    for (int i = 0; i < this.lpY.length; i++) {
      this.lpY[i].release();
    }
    this.lpY = null;
  }

  public void setActive(boolean paramBoolean) {
    bAq.gpk = paramBoolean;
  }

  public void c(aFy paramaFy) {
    for (int i = this.lqh.size() - 1; i >= 0; i--)
      ((dCn)this.lqh.get(i)).e(paramaFy);
  }

  public void a(dCn paramdCn)
  {
    if (!this.lqh.contains(paramdCn))
      this.lqh.add(paramdCn);
  }

  public void b(dCn paramdCn)
  {
    this.lqh.remove(paramdCn);
  }

  public aFy cWy()
  {
    return this.lqg;
  }

  public dMU cWz() {
    return (dMU)this.lpY[aFy.ebI.aRP()];
  }

  public void cWA() {
    if (!this.lpZ) {
      this.lpZ = true;
      d(aFy.ebI);
      cWV();
      dLE.doY().a(this, new String[] { "displaySymbiotBar" });
    }
  }

  public void cWB() {
    if (this.lpZ) {
      this.lpZ = false;
      d(aFy.ebH);
      cWV();
      dLE.doY().a(this, new String[] { "displaySymbiotBar" });
    }
  }

  public void d(aFy paramaFy) {
    aIH localaIH = WakfuClientInstance.awy().awB();
    a(paramaFy, true, (byte)localaIH.d(paramaFy == aFy.ebH ? bmz.fEm : bmz.fEn));
  }

  public void a(aFy paramaFy, boolean paramBoolean)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    a(paramaFy, paramBoolean, (byte)localaIH.d(paramaFy == aFy.ebH ? bmz.fEm : bmz.fEn));
  }

  public void b(aFy paramaFy, byte paramByte)
  {
    a(paramaFy, true, paramByte);
  }

  public void a(aFy paramaFy, boolean paramBoolean, byte paramByte)
  {
    if ((this.lpZ) && (paramaFy != aFy.ebI)) {
      return;
    }

    if (this.lqg == paramaFy) {
      return;
    }

    c(paramaFy);

    this.lqg = paramaFy;
    q(paramByte != -1 ? paramByte : (byte)this.lqg.aRP(), false);

    if (paramBoolean) {
      cWV();
    }

    zV.IH().IM();

    if (paramaFy.VD())
      WakfuClientInstance.awy().awB().c(bmz.fEl, this.lqg.name());
  }

  private boolean fn(byte paramByte)
  {
    for (int i = 0; i < this.lqd.length; i++) {
      if (this.lqd[i] == paramByte) {
        return true;
      }
    }
    return false;
  }

  private boolean fo(byte paramByte) {
    for (int i = 0; i < this.lqc.length; i++) {
      if (this.lqc[i] == paramByte) {
        return true;
      }
    }
    return false;
  }

  public bJz cWC()
  {
    if ((this.lqb < 0) || (this.lqb >= this.lpY.length)) {
      return null;
    }
    return this.lpY[this.lqb];
  }

  public byte cWD() {
    return this.lqb;
  }

  public String cWE() {
    return String.valueOf(cWD() - cWC().azo().aRP() + 1);
  }

  public void fp(byte paramByte) {
    o(paramByte, true);
  }

  private void o(byte paramByte, boolean paramBoolean) {
    if ((this.lqb != paramByte) && (fo(paramByte))) {
      this.lqb = paramByte;
      WakfuClientInstance.awy().awB().a(bmz.fEm, this.lqb);
      if (paramBoolean)
        cWV();
    }
  }

  public bJz cWF()
  {
    if ((this.lqa < 0) || (this.lqa >= this.lpY.length)) {
      return null;
    }
    return this.lpY[this.lqa];
  }

  public byte cWG() {
    return this.lqa;
  }

  public String cWH() {
    return String.valueOf(cWG() - cWF().azo().aRP() + 1);
  }

  public void fq(byte paramByte) {
    p(paramByte, true);
  }

  private void p(byte paramByte, boolean paramBoolean) {
    if ((this.lqa != paramByte) && (fn(paramByte))) {
      this.lqa = paramByte;
      WakfuClientInstance.awy().awB().a(bmz.fEn, this.lqa);
      if (paramBoolean)
        cWV();
    }
  }

  public int a(bJz parambJz)
  {
    for (int i = 0; i < this.lpY.length; i++) {
      if (this.lpY[i] == parambJz) {
        return i;
      }
    }

    return -1;
  }

  private void cWI() {
    int i = -1;
    for (int j = 0; j < this.lqc.length; j++) {
      if (this.lqc[j] == this.lqb) {
        i = j;
        break;
      }
    }

    if (i != -1)
      fp(this.lqc[((i + 1) % this.lqc.length)]);
  }

  private void cWJ()
  {
    int i = -1;
    for (int j = 0; j < this.lqc.length; j++) {
      if (this.lqc[j] == this.lqb) {
        i = j;
        break;
      }
    }

    if (i != -1)
      fp(this.lqc[((i - 1 + this.lqc.length) % this.lqc.length)]);
  }

  private void cWK()
  {
    int i = -1;
    for (int j = 0; j < this.lqd.length; j++) {
      if (this.lqd[j] == this.lqa) {
        i = j;
        break;
      }
    }

    if (i != -1)
      fq(this.lqd[((i + 1) % this.lqd.length)]);
  }

  private void cWL()
  {
    int i = -1;
    for (int j = 0; j < this.lqd.length; j++) {
      if (this.lqd[j] == this.lqa) {
        i = j;
        break;
      }
    }

    if (i != -1)
      fq(this.lqd[((i - 1 + this.lqd.length) % this.lqd.length)]);
  }

  public void cWM()
  {
    if (this.lqg == aFy.ebH)
      cWI();
    else if (this.lqg == aFy.ebG) {
      cWK();
    }
    dLE.doY().a(this, new String[] { "closedShortcutBars" });
  }

  public void cWN() {
    if (this.lqg == aFy.ebH)
      cWJ();
    else if (this.lqg == aFy.ebG) {
      cWL();
    }
    dLE.doY().a(this, new String[] { "closedShortcutBars" });
  }

  private boolean adF()
  {
    return byv.bFN().bFO().adF();
  }

  public bJz fr(byte paramByte) {
    return c(aFy.ebG, paramByte);
  }

  public bJz fs(byte paramByte) {
    return c(aFy.ebH, paramByte);
  }

  public bJz ft(byte paramByte) {
    return c(this.lqg, paramByte);
  }

  public bJz c(aFy paramaFy, byte paramByte) {
    if ((!bB) && ((paramByte < 0) || (paramByte >= paramaFy.aRO()))) throw new AssertionError("On essaye de récupérer une ShortCutBar de type " + paramaFy + " de numéro " + paramByte);
    return this.lpY[(paramByte + paramaFy.aRP())];
  }

  public ArrayList jZ(boolean paramBoolean)
  {
    if (this.lqg == aFy.ebH)
      return ka(paramBoolean);
    if (this.lqg == aFy.ebG) {
      return kb(paramBoolean);
    }

    return null;
  }

  public ArrayList ka(boolean paramBoolean)
  {
    return a(aFy.ebH, cWD(), paramBoolean);
  }

  public ArrayList kb(boolean paramBoolean)
  {
    return a(aFy.ebG, cWG(), paramBoolean);
  }

  private ArrayList a(aFy paramaFy, byte paramByte, boolean paramBoolean) {
    int i = paramaFy.aRP();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramaFy.aRO(); j++) {
      byte b = j + i;
      if ((!paramBoolean) || (b != paramByte))
      {
        localArrayList.add(this.lpY[b]);
      }
    }
    return localArrayList;
  }

  public bJz fu(byte paramByte) {
    if ((!bB) && ((paramByte < 0) || (paramByte >= this.lpY.length))) throw new AssertionError("On essaye de récupérer la shortcutBar de numéro " + paramByte);
    return this.lpY[paramByte];
  }

  private byte a(aFy paramaFy, dKD paramdKD)
  {
    int i = -1;
    byte b1 = -1;
    byte b2 = -1;

    for (int k = 0; k < paramaFy.aRO(); k = (byte)(k + 1)) {
      int m = (byte)(k + paramaFy.aRP());
      int j = this.lpY[m].c(paramdKD);
      if (j != -1) {
        i = b1 = m;
        break;
      }if (this.lpY[m].d(paramdKD)) {
        i = b2 = m;
        break;
      }

    }

    if (i != -1) {
      switch (dGn.gTg[paramaFy.ordinal()]) {
      case 2:
        fq(b1);
        break;
      case 3:
        fp(b1);
      }

    }

    return b2;
  }

  public boolean a(dKD paramdKD, int paramInt, short paramShort)
  {
    if (paramInt == -1)
    {
      aFy localaFy = cWy();
      switch (dGn.gTg[localaFy.ordinal()]) {
      case 3:
        if (!cWC().isFull())
          paramInt = cWD(); break;
      default:
        if (!cWF().isFull()) {
          paramInt = cWG();
        }
        break;
      }
      if (paramInt == -1) {
        paramInt = a(localaFy, paramdKD);
      }
    }

    if (paramInt == -1) {
      return false;
    }

    bJz localbJz = fu((byte)paramInt);

    boolean bool = localbJz.a(paramdKD, paramShort);

    if ((bool) && (paramShort == -1))
    {
      switch (dGn.gTg[localbJz.azo().ordinal()]) {
      case 2:
        fq((byte)paramInt);
        break;
      case 3:
        fp((byte)paramInt);
      }

    }

    return bool;
  }

  public void a(int paramInt, bKq parambKq, boolean paramBoolean) {
    for (int i = 0; i < this.lpY.length; i = (byte)(i + 1))
      this.lpY[i].a(paramInt, parambKq, paramBoolean);
  }

  public void p(long paramLong, boolean paramBoolean)
  {
    for (int i = 0; i < this.lpY.length; i = (byte)(i + 1))
      this.lpY[i].p(paramLong, paramBoolean);
  }

  public boolean b(int paramInt, short paramShort, boolean paramBoolean)
  {
    return fu((byte)paramInt).f(paramShort, paramBoolean);
  }

  public void b(dKD paramdKD, int paramInt, short paramShort) {
    fu((byte)paramInt).b(paramdKD, paramShort);
  }

  public void cWO() {
    if (this.lpY == null) {
      return;
    }
    cUl localcUl = null;
    int i = 0;
    for (bJz localbJz : this.lpY) {
      if (localbJz.bQJ()) {
        if (localcUl == null) {
          localcUl = new cUl();
        }
        byte b = (byte)(i - localbJz.azo().aRP());
        aJp localaJp = localbJz.bQL();
        while (localaJp.hasNext()) {
          localaJp.fl();

          localcUl.a((byte)localbJz.azo().ordinal(), b, localaJp.rC(), (dKD)localaJp.value());
        }

        localaJp = localbJz.bQM();
        while (localaJp.hasNext()) {
          localaJp.fl();
          localcUl.d((byte)localbJz.azo().ordinal(), b, localaJp.rC());
        }

        localaJp = localbJz.bQN();
        while (localaJp.hasNext()) {
          localaJp.fl();
          localcUl.d((byte)localbJz.azo().ordinal(), b, localaJp.rC());
        }

        localbJz.bQK();
      }
      i = (byte)(i + 1);
    }
    if (localcUl != null)
      byv.bFN().aJK().d(localcUl);
  }

  public void a(bWp parambWp)
  {
    for (bJz localbJz : this.lpY)
      localbJz.a(parambWp);
  }

  public boolean AZ(int paramInt)
  {
    for (bJz localbJz : this.lpY) {
      if (localbJz.tc(paramInt) != null) {
        return true;
      }
    }
    return false;
  }

  public void cWP() {
    g(this.lqe);
  }

  public void cWQ() {
    g(this.lqf);
  }

  private void g(dKD paramdKD) {
    Object localObject1 = (gA)byv.bFN().bFO().ayJ().ci(paramdKD.oj());
    Object localObject2;
    byte b;
    if ((localObject1 == null) && (paramdKD.ok() == 2145)) {
      localObject2 = Hh.QM().dh(2145);
      gA localgA = new gA(-1L);

      localgA.b((bBn)localObject2);
      localgA.l((short)1);
      localObject1 = localgA;
      b = azO.dRM.hV;
    } else {
      b = (byte)byv.bFN().bFO().ayJ().il(((gA)localObject1).oj());
    }
    if (((gA)localObject1).isActive()) {
      localObject2 = new cGl();
      ((cGl)localObject2).e((gA)localObject1, b);
      ((cGl)localObject2).d(18009);
      cjO.clE().j((cWG)localObject2);
    }
  }

  public void f(byte paramByte, short paramShort)
  {
    bAq.useItem(null, fu(paramByte).cI(paramShort), false);
  }

  public void m(gA paramgA) {
    int i = paramgA.ok();
    for (bJz localbJz : this.lpY) {
      ArrayList localArrayList = localbJz.hi(i);
      if (localArrayList != null)
        for (int m = localArrayList.size() - 1; m >= 0; m--) {
          dKD localdKD = (dKD)localArrayList.get(m);
          dLE.doY().a(localdKD, new String[] { "quantity", "usable" });
        }
    }
  }

  public void b(gA paramgA1, gA paramgA2)
  {
    byte b;
    if (paramgA2 != null) {
      b = (paramgA2.isUsable()) && (paramgA2.isActive()) ? 2 : 3;
      this.lqe.a(bKq.gNg, paramgA2.oj(), paramgA2.ok(), paramgA2.oc());
      this.lqe.bg(b);
    } else {
      this.lqe.a(bKq.gNh, -1L, -1, 0);
    }

    if (paramgA1 != null) {
      b = (paramgA1.isUsable()) && (paramgA1.isActive()) ? 2 : 3;
      this.lqf.a(bKq.gNg, paramgA1.oj(), paramgA1.ok(), paramgA1.oc());
      this.lqf.bg(b);
    } else if (paramgA2 != null) {
      bBn localbBn = Hh.QM().dh(2145);

      this.lqf.a(bKq.gNh, -1L, localbBn.getId(), localbBn.oc());
    }

    dLE.doY().a(this, new String[] { "leftHandWeaponShortcut", "rightHandWeaponShortcut" });
  }

  public void a(gA paramgA, YS paramYS)
  {
    try
    {
      int j;
      int k;
      if ((paramYS.aks() == azO.dRM.hV) || (paramYS.aks() == azO.dRN.bJ())) {
        int i = 0; j = 0;

        k = (paramgA.isUsable()) && (paramgA.isActive()) ? 2 : 3;

        if (paramYS.aks() == azO.dRN.hV) {
          this.lqe.a(bKq.gNg, paramgA.oj(), paramgA.ok(), paramgA.oc());
          this.lqe.bg(k);
          i = 1;
        } else {
          this.lqf.a(bKq.gNg, paramgA.oj(), paramgA.ok(), paramgA.oc());
          this.lqf.bg(k);
          j = 1;
        }

        if (i != 0) {
          dLE.doY().a(this, new String[] { "leftHandWeaponShortcut" });
        }

        if (j != 0)
          dLE.doY().a(this, new String[] { "rightHandWeaponShortcut" });
      }
      bJz localbJz;
      int n;
      int i1;
      if ((paramgA.isUsable()) && (paramgA.isActive()))
      {
        for (localbJz : this.lpY) {
          try {
            ArrayList localArrayList1 = localbJz.hi(paramgA.ok());
            n = 0; for (i1 = localArrayList1.size(); n < i1; n++)
              ((dKD)localArrayList1.get(n)).bg((byte)2);
          }
          catch (Exception localException2) {
            K.error("Erreur a la modification d'un shortcut " + localException2);
          }
        }
      }
      else {
        for (localbJz : this.lpY) {
          try {
            ArrayList localArrayList2 = localbJz.hi(paramgA.ok());
            n = 0; for (i1 = localArrayList2.size(); n < i1; n++)
              ((dKD)localArrayList2.get(n)).bg((byte)3);
          }
          catch (Exception localException3) {
            K.error("Erreur a la modification d'un shortcut " + localException3);
          }
        }
      }

      bGI();
    } catch (Exception localException1) {
      K.error("Erreur a l'ajout d'un shortcut " + localException1);
    }
  }

  public void c(gA paramgA) {
    int i = 0; int j = 0;

    if (paramgA.oj() == this.lqe.oj()) {
      this.lqe.a(bKq.gNh, -1L, -1, 0);
      i = 1;
    } else if (paramgA.oj() == this.lqf.oj()) {
      this.lqf.a(bKq.gNh, -1L, -1, 0);
      j = 1;
    }
    Object localObject1;
    if ((this.lqe.ok() == -1) && (this.lqf.ok() == -1))
    {
      localObject1 = Hh.QM().dh(2145);

      this.lqf.a(bKq.gNh, -1L, ((bBn)localObject1).getId(), ((bBn)localObject1).oc());
      j = 1;
    }

    if (i != 0) {
      dLE.doY().a(this, new String[] { "leftHandWeaponShortcut" });
    }

    if (j != 0) {
      dLE.doY().a(this, new String[] { "rightHandWeaponShortcut" });
    }

    for (Object localObject2 : this.lpY) {
      try {
        ArrayList localArrayList = localObject2.hi(paramgA.ok());
        int n = 0; for (int i1 = localArrayList.size(); n < i1; n++)
          if ((paramgA.oi().a(azO.dRM)) || (paramgA.oi().a(azO.dRN)))
          {
            ((dKD)localArrayList.get(n)).bg((byte)5);
          }
          else ((dKD)localArrayList.get(n)).bg((byte)0);
      }
      catch (Exception localException)
      {
        K.error("Erreur a la modification d'un shortcut " + localException);
      }
    }

    bGI();
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentShortcutBarType"))
      return Integer.valueOf(this.lqg.ordinal());
    if (paramString.equals("selectedShortcutBar"))
      return cWU();
    if (paramString.equals("currentShortcutBarNumber"))
      return Byte.valueOf(cWT());
    if (paramString.equals("currentShortcutBarNumberText"))
      return cWS();
    if (paramString.equals("leftHandWeaponShortcut")) {
      if ((this.lqe != null) && (this.lqe.ok() != -1)) {
        return this.lqe;
      }
      return null;
    }
    if (paramString.equals("rightHandWeaponShortcut")) {
      if (this.lqf.ok() != -1) {
        return this.lqf;
      }
      return null;
    }
    if (paramString.equals("displaySymbiotBar")) {
      return Boolean.valueOf(this.lpZ);
    }
    return null;
  }

  public boolean cWR() {
    return this.lpZ;
  }

  public String cWS() {
    if (this.lqg == aFy.ebH)
      return cWE();
    if (this.lqg == aFy.ebG) {
      return cWH();
    }
    return null;
  }

  public byte cWT() {
    if (this.lqg == aFy.ebH)
      return cWD();
    if (this.lqg == aFy.ebG) {
      return cWG();
    }
    return -1;
  }

  public void q(byte paramByte, boolean paramBoolean) {
    if (this.lqg == aFy.ebH)
      o(paramByte, paramBoolean);
    else if (this.lqg == aFy.ebG)
      p(paramByte, paramBoolean);
  }

  private bJz cWU()
  {
    if (this.lpZ) {
      return cWz();
    }
    if (this.lqg == aFy.ebH)
      return cWC();
    if (this.lqg == aFy.ebG) {
      return cWF();
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void cWV()
  {
    dLE.doY().a(this, new String[] { "currentShortcutBarType", "selectedShortcutBar", "currentShortcutBarNumber", "currentShortcutBarNumberText", "closedShortcutBars" });

    cWW();
  }

  public void cWW() {
    dLE.doY().a(this, new String[] { "rightHandWeaponShortcut", "leftHandWeaponShortcut" });
  }

  public void cWX() {
    for (bJz localbJz : this.lpY)
      localbJz.bQP();
  }

  public void bGI()
  {
    int i = this.lqg.aRP(); for (int j = this.lqg.aRO() + i; i < j; i++) {
      this.lpY[i].bQO();
    }

    dLE.doY().a(this, new String[] { "leftHandWeaponShortcut", "rightHandWeaponShortcut" });
  }

  public void a(dEe paramdEe)
  {
    int i = paramdEe.lMQ.size();

    aFy[] arrayOfaFy1 = aFy.values();
    int[] arrayOfInt = new int[arrayOfaFy1.length];
    boolean[] arrayOfBoolean = new boolean[aFy.aRR()];
    Arrays.fill(arrayOfInt, 0);
    Arrays.fill(arrayOfBoolean, false);

    for (aFy localaFy : arrayOfaFy1) {
      arrayOfInt[localaFy.ordinal()] = localaFy.aRP();
    }

    for (int j = 0; j < i; j++)
    {
      byte tmp110_107 = ((cwp)paramdEe.lMQ.get(j)).ihP.type;
      int[] tmp110_90 = arrayOfInt;
      int tmp112_111 = tmp110_90[tmp110_107]; tmp110_90[tmp110_107] = (tmp112_111 + 1); ??? = tmp112_111;
      arrayOfBoolean[???] = true;
      if (!this.lpY[???].c(((cwp)paramdEe.lMQ.get(j)).ihP)) {
        K.error("Impossible de récupérer l'inventaire de shortcut #" + j);
      }
    }

    j = 0;
    ??? = 0;
    this.lqc = new byte[aFy.ebH.aRO()];
    this.lqd = new byte[aFy.ebG.aRO()];
    for (tmp110_107 = 0; tmp110_107 < this.lpY.length; tmp110_107 = (byte)(tmp110_107 + 1)) {
      if (this.lpY[tmp110_107].azo() == aFy.ebH) {
        j = (byte)(j + 1); this.lqc[j] = tmp110_107;
      } else if (this.lpY[tmp110_107].azo() == aFy.ebG) {
        ??? = (byte)(??? + 1); this.lqd[???] = tmp110_107;
      }
    }
    if (this.lqd.length > 0) {
      this.lqa = this.lqd[0];
    }
    if (this.lqc.length > 0) {
      this.lqb = this.lqc[0];
    }

    for (tmp110_107 = 0; tmp110_107 < arrayOfBoolean.length; tmp110_107++)
      if (arrayOfBoolean[tmp110_107] == 0)
        this.lpY[tmp110_107].clean();
  }

  public dKD cWY()
  {
    return this.lqe;
  }

  public dKD cWZ() {
    return this.lqf;
  }

  public void a(bZH parambZH, bMD parambMD) {
    a(new dGs(this, parambZH, parambMD));
  }
}