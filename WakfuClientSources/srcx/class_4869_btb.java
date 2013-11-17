import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class btb
  implements cnk
{
  private static final int gaC = 25;
  private static final int gaD = 0;
  private static final int gaE = 1;
  private static final int gaF = 2;
  private static final int gaG = 3;
  public static final int gaH = 0;
  public static final int gaI = 1;
  public static final int gaJ = 2;
  private final ArrayList gaK = new ArrayList(2048);
  private crO gaL;
  private ArrayList gaM;
  private String gaN;
  private String gaO;
  private dDL gaP;
  private int brP = -2147483648;
  private byte gaQ;
  private static byte gaR = -1;

  private static final btb gaS = new btb();

  private static final Logger K = Logger.getLogger(btb.class);

  private final HA gaT = new HA();
  private final ArrayList gaU = new ArrayList();
  private final ArrayList gaV = new ArrayList();
  private final dTQ gaW;
  private final bcm gaX = new bcm();

  private final zR gaY = new zR();

  private final ArrayList gaZ = new ArrayList();
  private int gba;
  private boolean gbb = false;

  private btb()
  {
    this.gaM = new ArrayList(25);
    this.gaW = new dTQ(this.gaT);
    this.gaL = new crO();
    clear();
  }

  public static btb bBc() {
    return new btb();
  }

  public static btb bBd()
  {
    return gaS;
  }

  public Iterator bBe() {
    return this.gaM.iterator();
  }

  public void a(crO paramcrO, dDL paramdDL) {
    this.gaL.clear();
    this.gaL = paramcrO;
    a(paramdDL);
  }

  public void clear() {
    this.gaZ.clear();
    this.gaV.clear();
    this.gaU.clear();
    this.gaQ = 0;
    this.gaM.clear();
    this.gaL.clear();
    this.gaW.clear();
    this.gaX.clear();

    this.gaT.clear();
  }

  public void bBf() {
    this.gaW.clear();
    bBg();
  }

  private static String x(String paramString, int paramInt) {
    if (paramString == null) {
      return null;
    }

    if ((!bB) && ((!paramString.contains("%d")) || (!paramString.endsWith("/")))) throw new AssertionError();
    return String.format(paramString, new Object[] { Integer.valueOf(paramInt) });
  }

  public void qL(int paramInt) {
    if (this.brP == paramInt) {
      return;
    }
    QX.gr(paramInt);
    this.brP = paramInt;
    if (this.gaO != null) {
      this.gaN = x(this.gaO, this.brP);
    }
    this.gaQ = ((byte)(this.gaQ & 0xFFFFFFFD));
  }

  public void setPath(String paramString) {
    this.gaO = paramString;
    this.gaN = x(this.gaO, this.brP);
    this.gaQ = ((byte)(this.gaQ & 0xFFFFFFFD));
  }

  public void b(cXf paramcXf, int paramInt)
  {
    this.gaX.clear();

    cuA localcuA = paramcXf.apE();
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      ArrayList localArrayList = localKn.UR();
      int k = localArrayList.size();
      if ((k != 0) && (localKn.a(localcuA)))
      {
        for (int m = 0; m < k; m++) {
          DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localArrayList.get(m);
          if ((localDisplayedScreenElement.fis.cjQ()) && (localDisplayedScreenElement.fiu != null))
          {
            if (!this.gaX.contains(localDisplayedScreenElement))
            {
              localDisplayedScreenElement.bF((short)paramInt);
              this.gaX.add(localDisplayedScreenElement);
            }
          }
        }
      }
    }
  }

  public final void a(dQx paramdQx)
  {
    o(paramdQx.hqx, paramdQx.hqu, paramdQx.hqw, paramdQx.hqv);
  }

  private void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((!bB) && (this.gaN == null)) throw new AssertionError("You must call setPath before");

    this.gaL.a(this.gaN, paramInt1, paramInt2, paramInt3, paramInt4, this.gaP);
    boolean bool1 = this.gaL.cqi();
    if ((bool1) && 
      (bBg())) {
      bBh();
    }

    this.gaW.a(this.gaL.bjH(), this.gaL.bjI(), 25, this.gaM);

    int i = this.gaM.size();
    if (i != 0) {
      if ((!bool1) && (gI())) {
        return;
      }
      this.gbb = false;
      boolean bool2 = true;
      for (int j = 0; j < i; j++) {
        Kn localKn = (Kn)this.gaM.get(j);
        if (localKn != null) {
          localKn.update();
          boolean bool3 = localKn.gI();
          bool2 &= bool3;
        }
      }
      if (bool2)
        this.gaQ = ((byte)(this.gaQ | 0x1));
      else
        this.gaQ = ((byte)(this.gaQ & 0xFFFFFFFE));
    }
    else
    {
      this.gaQ = ((byte)(this.gaQ | 0x1));

      if (!this.gbb) {
        this.gbb = true;
        K.error("pas de maps à charger (screen map=" + this.gaL.bjH() + ", " + this.gaL.bjI() + ") @" + this.brP);
      }
    }
  }

  private boolean bBg() {
    Xg localXg = this.gaL.gPL;
    int i = (short)localXg.size();

    boolean bool = false;
    this.gaM.clear();
    for (int j = 0; j < i; j++) {
      int k = localXg.uM(j);
      gn localgn = (gn)localXg.hc(j);

      Kn localKn = (Kn)this.gaW.tB(k);
      if (localKn == null) {
        bool = true;
        localKn = new Kn();
        localKn.a(localgn, this.gaT, false);
        this.gaW.put(k, localKn);
      }
      this.gaM.add(localKn);
    }
    return bool;
  }

  private void bBh() {
    for (int i = 0; i < this.gaV.size(); i++)
      ((dTz)this.gaV.get(i)).dcc();
  }

  public void a(dTz paramdTz)
  {
    if (!this.gaV.contains(paramdTz))
      this.gaV.add(paramdTz);
  }

  public void b(dTz paramdTz)
  {
    this.gaV.remove(paramdTz);
  }

  public boolean a(aHT paramaHT) {
    return this.gaU.add(paramaHT);
  }

  public boolean b(aHT paramaHT) {
    return this.gaU.remove(paramaHT);
  }

  public void bBi() {
    if ((!bB) && (this.gaM.size() != this.gaL.cqj())) throw new AssertionError();

    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      localKn.a(localKn.US(), this.gaT, true);
    }
    for (i = 0; i < this.gaU.size(); i++)
      ((aHT)this.gaU.get(i)).aTY();
  }

  public void f(adG paramadG)
  {
    int i = 0; for (int j = this.gaK.size(); i < j; i++) {
      ((DisplayedScreenElement)this.gaK.get(i)).fiw = false;
    }
    this.gaK.clear();

    cuA localcuA = paramadG.apE();
    j = 0; for (int k = this.gaM.size(); j < k; j++) {
      ((Kn)this.gaM.get(j)).a(paramadG, this.gaK, localcuA);
    }

    j = 0; for (k = this.gaZ.size(); j < k; j++) {
      ((DisplayedScreenElement)this.gaZ.get(j)).a(paramadG, this.gaK, localcuA);
    }

    paramadG.s(this.gaK);

    this.gaQ = ((byte)(this.gaQ | 0x2));
  }

  public final void a(int paramInt1, int paramInt2, ArrayList paramArrayList, cWj paramcWj)
  {
    int i = 0; for (int j = this.gaM.size(); i < j; i++)
      ((Kn)this.gaM.get(i)).a(paramInt1, paramInt2, paramArrayList, paramcWj);
  }

  public final DisplayedScreenElement a(int paramInt1, int paramInt2, cWj paramcWj)
  {
    Object localObject = null;
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      DisplayedScreenElement localDisplayedScreenElement = localKn.a(paramInt1, paramInt2, paramcWj);
      if (localDisplayedScreenElement != null)
      {
        if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
        {
          localObject = localDisplayedScreenElement;
        }
      }
    }
    return localObject;
  }

  public final DisplayedScreenElement a(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    Object localObject = null;
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      DisplayedScreenElement localDisplayedScreenElement = localKn.a(paramInt1, paramInt2, paramInt3, paramcWj);
      if (localDisplayedScreenElement != null)
      {
        if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
        {
          localObject = localDisplayedScreenElement;
        }
      }
    }
    return localObject;
  }

  public final DisplayedScreenElement b(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    Object localObject = null;
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      DisplayedScreenElement localDisplayedScreenElement = localKn.b(paramInt1, paramInt2, paramInt3, paramcWj);
      if (localDisplayedScreenElement != null)
      {
        if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
        {
          localObject = localDisplayedScreenElement;
        }
      }
    }
    return localObject;
  }

  public final DisplayedScreenElement c(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    Object localObject = null;
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      DisplayedScreenElement localDisplayedScreenElement = localKn.c(paramInt1, paramInt2, paramInt3, paramcWj);
      if (localDisplayedScreenElement != null)
      {
        if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
        {
          localObject = localDisplayedScreenElement;
        }
      }
    }
    return localObject;
  }

  public final DisplayedScreenElement d(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    int i = cwO.U(paramInt1, paramInt2, (short)paramInt3);
    if (i == -32768) {
      return null;
    }
    return c(paramInt1, paramInt2, i, paramcWj);
  }

  public final DisplayedScreenElement e(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    int i = cwO.V(paramInt1, paramInt2, (short)paramInt3);
    if (i == -32768) {
      return null;
    }
    return b(paramInt1, paramInt2, i, paramcWj);
  }

  public void a(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    int i = 0; for (int j = this.gaM.size(); i < j; i++) {
      Kn localKn = (Kn)this.gaM.get(i);
      gn localgn = localKn.US();
      if (localgn != null)
      {
        localKn.a(paramInt1, paramInt2, paramArrayList);
      }
    }
  }

  public final ArrayList bBj() { return this.gaM; }

  public final boolean gI()
  {
    return (this.gaQ & 0x1) == 1;
  }

  final boolean bBk() {
    return this.gaQ == 3;
  }

  public void a(dDL paramdDL) {
    this.gaP = paramdDL;
  }

  public void iS(int paramInt) {
    this.gba = paramInt;
    byte b = (byte)(gaR & 0xFFFFFFF8 | qM(paramInt));
    db(b);

    bBi();
  }

  public int bBl() {
    return this.gba;
  }

  public void j(byte paramByte, boolean paramBoolean) {
    byte b = gaR;
    if (paramBoolean)
      b = (byte)(b | paramByte);
    else {
      b = (byte)(b & (paramByte ^ 0xFFFFFFFF));
    }
    db(b);
  }

  public static byte qM(int paramInt) {
    switch (paramInt) {
    case 2:
      return 7;
    case 1:
      return 3;
    case 0:
      return 1;
    }
    return 1;
  }

  private void db(byte paramByte) {
    if (paramByte > gaR)
    {
      this.gaT.X(paramByte);
      btL.gcv.ie();
    }
    gaR = paramByte;
  }

  public static byte bBm() {
    return gaR;
  }

  public final void a(cuA paramcuA, ArrayList paramArrayList) {
    int i = 0; for (int j = this.gaK.size(); i < j; i++)
      paramArrayList.add(this.gaK.get(i));
  }

  public boolean e(DisplayedScreenElement paramDisplayedScreenElement)
  {
    return this.gaZ.add(paramDisplayedScreenElement);
  }

  public boolean aG(Object paramObject) {
    return this.gaZ.remove(paramObject);
  }

  public void bBn() {
    this.gaZ.clear();
  }
}