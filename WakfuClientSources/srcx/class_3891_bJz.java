import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bJz
  implements dBv
{
  private static final Logger K = Logger.getLogger(bJz.class);
  public static final String fLN = "shortcuts";
  public static final String bC = "name";
  public static final String aIE = "type";
  public static final String cXf = "index";
  public static final String gKO = "indexText";
  public static final String gKP = "keyList";
  public static final String gKQ = "opened";
  public static final String[] bF = { "shortcuts", "name", "type", "index", "indexText", "keyList", "opened" };
  private amS gKR;
  private dPx gKS = new dPx();
  private dPx gKT = new dPx();
  private dPx gKU = new dPx();

  private boolean aGX = false;
  private boolean aKX = false;
  private byte cXi;
  private static final String[] gKV = { "", "shift", "ctrl", "alt" };
  private ArrayList gKW = null;

  public bJz(aFy paramaFy, byte paramByte)
  {
    this.gKR = new amS(paramaFy, zg.HI(), paramaFy.aRM(), paramaFy.aRN(), false);
    this.cXi = paramByte;
  }

  public aFy azo()
  {
    return this.gKR.azo();
  }

  public boolean cH(short paramShort)
  {
    if (this.gKR == null) {
      return false;
    }
    return this.gKR.cH(paramShort);
  }

  public short c(dKD paramdKD) {
    if (this.gKR == null) {
      return -1;
    }

    return this.gKR.n(paramdKD);
  }

  public short bQI() {
    if (this.gKR == null) {
      return -1;
    }

    return this.gKR.bQI();
  }

  public dKD cI(short paramShort) {
    if (this.gKR == null) {
      return null;
    }

    return (dKD)this.gKR.dB(paramShort);
  }

  public ArrayList hi(int paramInt) {
    return this.gKR.hi(paramInt);
  }

  public dKD tc(int paramInt) {
    if (this.gKR == null) {
      return null;
    }

    return (dKD)this.gKR.hh(paramInt);
  }

  public dKD gP(long paramLong) {
    if (this.gKR == null) {
      return null;
    }

    return (dKD)this.gKR.ci(paramLong);
  }

  public boolean d(dKD paramdKD)
  {
    try
    {
      return this.gKR.l(paramdKD); } catch (Exception localException) {
    }
    return false;
  }

  public boolean a(dKD paramdKD, short paramShort)
  {
    if (this.gKR == null) {
      return false;
    }

    if (this.gKR.ci(paramdKD.oj()) != null) {
      String str1 = bU.fH().getString("error.shortcutItemAlreadyPresent");
      aEe localaEe1 = new aEe(str1);
      localaEe1.mm(3);
      CM.LV().ez(3).a(localaEe1);
      return false;
    }
    try
    {
      short s = paramShort;
      if (paramShort == -1)
      {
        s = 0;
        while ((s < this.gKR.cFy()) && 
          (!this.gKR.cH(s))) {
          s = (short)(s + 1);
        }
      }

      if (!this.gKR.cH(paramShort))
      {
        f(paramShort, true);
      }

      if (s >= this.gKR.cFy()) {
        return false;
      }
      boolean bool = this.gKR.b(paramdKD, s);

      if (bool)
      {
        byte b = (byte)s;
        int i = 1;
        if (this.gKT.bf(b) == paramdKD) {
          i = 0;
          this.gKT.be(b);
        }
        if (i != 0) {
          this.gKS.c(b, paramdKD);
        }
      }

      dLE.doY().a(this, new String[] { "shortcuts" });
      return bool;
    } catch (dI localdI) {
      str2 = bU.fH().getString("error.shortcutItemDropNotPossible");
      localaEe2 = new aEe(str2);
      localaEe2.mm(3);
      CM.LV().ez(3).a(localaEe2);
    } catch (dcF localdcF) {
      str2 = bU.fH().getString("error.shortcutItemAlreadyPresent");
      localaEe2 = new aEe(str2);
      localaEe2.mm(3);
      CM.LV().ez(3).a(localaEe2);
    } catch (bQT localbQT) {
      String str2 = bU.fH().getString("error.shortcutItemDropNotPossible");
      aEe localaEe2 = new aEe(str2);
      localaEe2.mm(3);
      CM.LV().ez(3).a(localaEe2);
    }

    return false;
  }

  public boolean f(short paramShort, boolean paramBoolean) {
    if (this.gKR == null) {
      return false;
    }

    if (!this.gKR.cH(paramShort))
    {
      dKD localdKD = (dKD)this.gKR.dB(paramShort);
      byte b = (byte)paramShort;
      int i = 1;

      if (this.gKS.bf(b) == localdKD) {
        this.gKS.be(b);
        i = 0;
      }

      if (i != 0)
        if (paramBoolean) {
          this.gKU.c(b, localdKD);

          paramBoolean = false;
        } else {
          this.gKT.c(b, localdKD);
        }
      boolean bool;
      if (paramBoolean)
        bool = this.gKR.dA(paramShort);
      else {
        bool = this.gKR.dz(paramShort) != null;
      }

      dLE.doY().a(this, new String[] { "shortcuts" });
      return bool;
    }

    return false;
  }

  public void a(int paramInt, bKq parambKq, boolean paramBoolean) {
    ArrayList localArrayList = this.gKR.hi(paramInt);
    if (localArrayList != null)
    {
      for (int i = localArrayList.size() - 1; i >= 0; i--) {
        dKD localdKD = (dKD)localArrayList.get(i);
        if ((localdKD != null) && (localdKD.asL() == parambKq))
          f(this.gKR.il(localdKD.oj()), paramBoolean);
      }
    }
  }

  public boolean e(dKD paramdKD)
  {
    if (this.gKR == null) {
      return false;
    }

    return this.gKR.d(paramdKD);
  }

  public void b(dKD paramdKD, short paramShort)
  {
    byte b = (byte)paramShort;
    if (this.gKT.bf(b) != null) {
      this.gKU.c(b, paramdKD);
    }

    dLE.doY().a(this, new String[] { "shortcuts" });
  }

  public boolean bQJ() {
    return (!this.gKS.isEmpty()) || (!this.gKU.isEmpty()) || (!this.gKT.isEmpty());
  }

  public void bQK() {
    this.gKS.clear();
    this.gKT.clear();
    aJp localaJp = this.gKU.dqF();
    while (localaJp.hasNext()) {
      localaJp.fl();
      ((dKD)localaJp.value()).release();
    }
    this.gKU.clear();
  }

  public aJp bQL() {
    return this.gKS.dqF();
  }

  public aJp bQM() {
    return this.gKT.dqF();
  }

  public aJp bQN() {
    return this.gKU.dqF();
  }

  public void a(bWp parambWp)
  {
    Iterator localIterator = this.gKR.iterator();

    while (localIterator.hasNext())
      parambWp.a((dKD)localIterator.next(), this);
  }

  public void clean()
  {
    this.gKR.ajx();
  }

  public void bQO()
  {
    dLE.doY().a(this, new String[] { "shortcuts" });
  }

  public void bQP() {
    for (dKD localdKD : this.gKR)
      dLE.doY().a(localdKD, new String[] { "usable" });
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("shortcuts"))
      return this.gKR.a(new dKD[this.gKR.cFy()]);
    if (paramString.equals("name"))
      return bU.fH().getString("desc.shortcut.type." + azo().ordinal());
    if (paramString.equals("type"))
      return Integer.valueOf(azo().ordinal());
    if (paramString.equals("index"))
      return Byte.valueOf(this.cXi);
    if (paramString.equals("indexText"))
      return azo() == aFy.ebI ? Integer.valueOf(1) : String.valueOf(bQQ());
    if (paramString.equals("keyList"))
      return bQR();
    if (paramString.equals("opened")) {
      return Boolean.valueOf(this.aGX);
    }

    return null;
  }

  private int bQQ() {
    return this.cXi - byv.bFN().bFO().bGD().fu(this.cXi).azo().aRP() + 1;
  }

  private ArrayList bQR() {
    if (this.gKW == null) {
      int i = this.gKR.cFy();
      this.gKW = new ArrayList(i);
      int j = bQQ();
      for (int k = 0; k < i; k++) {
        this.gKW.add(gKV[(j - 1)] + (j == 1 ? "" : "\n") + (k == 9 ? "0" : Integer.valueOf(k + 1)));
      }
    }
    return this.gKW;
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

  public boolean c(adm paramadm)
  {
    return this.gKR.b(paramadm);
  }

  public void p(long paramLong, boolean paramBoolean) {
    dKD localdKD = (dKD)this.gKR.ci(paramLong);
    if (localdKD != null)
      f(this.gKR.il(localdKD.oj()), paramBoolean);
  }

  public boolean isEmpty()
  {
    return this.gKR.isEmpty();
  }

  public boolean isFull() {
    return this.gKR.isFull();
  }

  public byte VH() {
    return this.cXi;
  }

  public void cI(byte paramByte) {
    this.cXi = paramByte;
  }

  public boolean axS() {
    return this.aGX;
  }

  public void cq(boolean paramBoolean) {
    this.aGX = paramBoolean;
  }

  public boolean isVertical() {
    return this.aKX;
  }

  public void setVertical(boolean paramBoolean) {
    this.aKX = paramBoolean;
  }

  public void gh(boolean paramBoolean) {
    for (dKD localdKD : this.gKR) {
      localdKD.setUsable(paramBoolean);
      dLE.doY().a(localdKD, new String[] { "usable" });
    }
  }

  public void release() {
    this.gKR.cleanup();
  }

  public amS bQS() {
    return this.gKR;
  }
}