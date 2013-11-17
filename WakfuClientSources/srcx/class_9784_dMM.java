import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dMM extends cUo
  implements bUv
{
  private static final byte mcS = 0;
  private static final byte mcT = 1;
  private static final byte mcU = 2;
  protected final List mcV = new ArrayList(5);
  protected final Set mcW = new HashSet(5);

  public static final int[][] mcX = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
  public static final int[][] mcY = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
  public static final short mcZ = 4;
  public static final short mda = 8;
  public int[][] mdb = mcX;

  protected short mdc = 4;

  private chO mdd = dFc.dgE();
  private dkU mde = cRD.cHZ();

  private float mdf = 1.0F;
  protected cuB mdg;
  protected int mdh;
  protected int mdi;
  protected static boolean mdj = false;
  public static boolean mdk = false;
  public static boolean mdl = false;
  protected adz mdm = new adz();
  protected static final float mdn = 2.0F;
  protected ckr mdo;
  protected cEi mdp;
  private int mdq;
  protected byte mdr = 8;
  protected boolean mds = true;
  private static final boolean aRN = false;
  private static final bep[] beo = bep.brZ();

  private final iP mdt = new iP(null);
  private final iP mdu = new iP(null);

  public dMM(long paramLong)
  {
    super(paramLong);
  }

  public dMM(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramLong, paramFloat1, paramFloat2, paramFloat3);
  }

  public dMM(long paramLong, float paramFloat1, float paramFloat2)
  {
    super(paramLong, paramFloat1, paramFloat2);
  }

  public void dpv()
  {
    this.mdg = null;
    this.mdh = -1;
    this.mdi = -1;
    this.mdo = null;
    this.mcV.clear();
    this.mdd.b(this);
    if (chu()) {
      this.mde.a(this, 0);
      this.mde.d(this);
    }
  }

  protected boolean chu() {
    return (this.mde != null) && (!Vj());
  }

  public boolean a(bye parambye) {
    return this.mcV.contains(parambye);
  }

  public final void b(bye parambye) {
    if (this.mcV.contains(parambye)) {
      this.mcW.remove(parambye);
      return;
    }
    this.mcV.add(parambye);
  }

  public final void c(bye parambye) {
    if (parambye != null)
      this.mcW.add(parambye);
  }

  public final void dpw()
  {
    this.mcW.addAll(this.mcV);
  }

  public void j(int paramInt, short paramShort)
  {
    super.j(paramInt, paramShort);
    cUo localcUo = cJA();
    if (localcUo != null)
      localcUo.j(paramInt, paramShort);
  }

  private static void a(int paramInt1, int paramInt2, int paramInt3, iP paramiP)
  {
    if (paramiP.d(paramInt1, paramInt2, paramInt3)) {
      return;
    }

    paramiP.reset();
    tF localtF = cwO.dV(paramInt1, paramInt2);

    if (localtF == null) {
      return;
    }
    int i = localtF.BV().a(paramInt1, paramInt2, beo, 0);
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++) {
      bep localbep = beo[j];
      if (localbep.aOl == paramInt3)
      {
        DisplayedScreenElement localDisplayedScreenElement = btb.bBd().c(localbep.hY, localbep.hZ, localbep.aOl, cWj.kJi);
        if (localDisplayedScreenElement != null)
        {
          cid localcid = localDisplayedScreenElement.bpc().ddL();
          paramiP.aJo = localcid.cjI();
          if (paramiP.aJo != 0)
            paramiP.aJp = ((byte)localcid.cjJ());
          else {
            paramiP.aJp = 0;
          }
          paramiP.setPosition(paramInt1, paramInt2, paramInt3);
          break;
        }
      }
    }
    if (paramiP.aJs == 2147483647) {
      paramiP.aJo = 0;
      paramiP.aJp = 0;
      paramiP.setPosition(paramInt1, paramInt2, paramInt3);
    }
  }

  protected final void dpx()
  {
    cEi localcEi = this.mdo.akl();
    super.k(localcEi.getX(), localcEi.getY(), localcEi.aCv());

    if (cJA() != null) {
      cJA().k(this.dcl, this.dcm, this.cQv + BC());
    }

    ArrayList localArrayList = cJF();
    if (localArrayList != null) {
      i = 0; for (j = localArrayList.size(); i < j; i++) {
        ((cUo)localArrayList.get(i)).k(this.dcl, this.dcm, this.cQv);
      }
    }

    this.mdo = null;
    this.mdg = null;
    this.mdh = -1;
    this.mdi = -1;
    this.mde.a(this, 0);
    this.mde.d(this);
    this.mdd.b(this);

    this.mcV.removeAll(this.mcW);
    this.mcW.clear();

    int i = 0; for (int j = this.mcV.size(); i < j; i++) {
      ((bye)this.mcV.get(i)).b(this, (int)this.dcl, (int)this.dcm, (short)(int)this.cQv);
    }

    this.mcV.removeAll(this.mcW);
    this.mcW.clear();

    bdB.b(this);
  }

  public void a(cXf paramcXf, int paramInt)
  {
    this.mdq += paramInt;

    if (this.mdo == null) {
      return;
    }

    if (this.mdq >= this.mdo.aki()) {
      dpx();
      return;
    }

    this.mcV.removeAll(this.mcW);
    this.mcW.clear();

    if (mdk) {
      cho();
    }

    float f1 = a(this.mdo, this.mdq);

    cEi localcEi1 = this.mdo.cp(this.mdq);

    cEi localcEi2 = this.mdo.cn(this.mdq);

    float f2 = localcEi1.getX();
    float f3 = localcEi1.getY();
    float f4 = localcEi1.aCv();

    CG localCG = a(localcEi1, this.mdp);

    int i = bCO.bC(f2);
    int j = bCO.bC(localcEi2.getX());
    int k = bCO.bC(f3);
    int m = bCO.bC(localcEi2.getY());
    int n = bCO.bC(f4);
    int i1 = bCO.bC(localcEi2.aCv());

    n = am(i, k, n);
    i1 = am(j, m, i1);

    int i2 = fn(i, k);

    al(i, k, i2);

    if ((j != i) || (m != k))
    {
      a(i, k, n, this.mdt);
      a(j, m, i1, this.mdu);
    }

    this.mdp = localcEi1;

    if ((!bB) && (Float.isNaN(f2))) throw new AssertionError();
    if ((!bB) && (Float.isNaN(f3))) throw new AssertionError();

    if ((i != fa()) || (k != fb()) || (n != fc())) {
      bdB.b(this);
    }

    float[] arrayOfFloat = { this.cQv };
    if (!a(localcEi1, j, m, arrayOfFloat))
    {
      if (this.mdg != null)
        this.mde.a(this, (int)(f1 * this.mdg.csW()));
    }
    else {
      this.mdi = this.mdh;
    }

    if (localCG != null) {
      this.mde.b(this, localCG);
    }

    super.k(f2, f3, arrayOfFloat[0]);

    dpy();
  }

  private CG a(cEi paramcEi1, cEi paramcEi2)
  {
    float f1 = paramcEi1.aOR - paramcEi2.aOR;
    float f2 = paramcEi1.aOS - paramcEi2.aOS;
    if ((f1 == 0.0F) && (f2 == 0.0F)) {
      return null;
    }

    if (cgR() == 8) {
      return cEi.l(f1, f2);
    }
    return cEi.m(f1, f2);
  }

  private void dpy()
  {
    if (cJA() != null) {
      cJA().k(this.dcl, this.dcm, this.cQv + BC());
    }

    ArrayList localArrayList = cJF();
    if (localArrayList != null) {
      int i = 0; for (int j = localArrayList.size(); i < j; i++)
        ((cUo)localArrayList.get(i)).k(this.dcl, this.dcm, this.cQv);
    }
  }

  protected void al(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > this.mdh) {
      int i = this.mdh;
      for (int j = this.mdh + 1; j < paramInt3; j++) {
        M(this.mdg.wR(j));
      }

      if (this.mdh != i)
        this.mdh = fn(paramInt1, paramInt2);
      else {
        this.mdh = paramInt3;
      }

      if (mdl)
        chp();
    }
  }

  private int fn(int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    int j = 0;
    for (int k = this.mdh; k < this.mdg.csW(); k++) {
      int[] arrayOfInt = this.mdg.wR(k);
      int m = (arrayOfInt[0] - paramInt1) * (arrayOfInt[0] - paramInt1) + (arrayOfInt[1] - paramInt2) * (arrayOfInt[1] - paramInt2);
      if (m < i) {
        i = m;
        j = k;
      }
    }
    return j;
  }

  private static float a(ckr paramckr, int paramInt) {
    long l = paramckr.aki();
    return (float)(l - paramInt) / (float)(l - paramckr.akh());
  }

  private boolean a(cEi paramcEi, int paramInt1, int paramInt2, float[] paramArrayOfFloat)
  {
    if ((!this.mdt.initialized()) || (!this.mdu.initialized())) {
      return false;
    }
    float f1 = paramInt1 - paramcEi.getX();
    float f2 = paramInt2 - paramcEi.getY();
    float f3 = cEl.ag(f1, f2);

    int i = this.mdu.aJq - this.mdt.aJq;
    int j = this.mdu.aJr - this.mdt.aJr;
    int k = this.mdu.aJs - this.mdt.aJs;
    float f4 = cEl.ag(i, j);

    float f5 = f4 == 0.0F ? 0.0F : bCO.t(1.0F - bCO.bK(f3 / f4), 0.0F, 1.0F);

    if (f3 == 0.0D) {
      paramArrayOfFloat[0] = (this.mdt.aJs + f5 * k);
      return false;
    }
    boolean bool = this.mde.c(this, k);

    int m = a(this.mdt, this.mdu, 1);

    if ((bool) && ((m == 1) || (m == 2))) {
      int n = 0;
      bmE localbmE = k >= 0 ? this.mde.aBN() : this.mde.aBM();
      cOo localcOo = localbmE.bo(f5);
      switch (cgX.aKD[localcOo.ordinal()])
      {
      case 1:
        break;
      case 2:
        paramArrayOfFloat[0] = this.mdu.aJs;
        break;
      case 3:
      case 4:
      case 5:
        n = 1;
        paramArrayOfFloat[0] = localbmE.a(this.mdt.aJs, this.mdu.aJs, f5, localcOo);
      }

      if ((this.mds) && (n != 0) && (m != 2)) {
        this.mde.a(this, k, localcOo);

        if ((f5 <= 0.5D) && (this.mdh == this.mdi + 1)) {
          asZ();
        }
        return true;
      }
      return false;
    }

    paramArrayOfFloat[0] = dA(f5);
    return false;
  }

  private float dA(float paramFloat)
  {
    iP localiP = paramFloat <= 0.5F ? this.mdt : this.mdu;

    int i = this.mdu.aJs - this.mdt.aJs;
    float f1;
    if (localiP.aJo == 0) {
      if ((i == 0) || (this.mdt.aJo != this.mdu.aJo)) {
        return localiP.aJs;
      }
      if (this.mdt.aJo == this.mdu.aJo) {
        f1 = 0.5F - paramFloat;
        float f2 = 0.1F;
        if (Math.abs(f1) > 0.1F) {
          return localiP.aJs;
        }

        return this.mdt.aJs + (0.1F - f1) / 0.1F * 0.5F * i;
      }

    }

    if (this.mdt.aJo == this.mdu.aJo) {
      f1 = paramFloat;
    }
    else if (paramFloat <= 0.5F)
      f1 = paramFloat * 2.0F;
    else {
      f1 = paramFloat * 2.0F - 1.0F;
    }

    return this.mdt.aJs + f1 * i;
  }

  private int am(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.mdg.csW();
    int j = this.mdh;
    while (j < i) {
      int[] arrayOfInt = this.mdg.wR(j);
      if ((arrayOfInt[0] == paramInt1) && (arrayOfInt[1] == paramInt2) && (Math.abs(paramInt3 - arrayOfInt[2]) < arG())) {
        return arrayOfInt[2];
      }
      j++;
    }

    int k = cwO.U(paramInt1, paramInt2, (short)paramInt3);
    if (k == -32768) {
      return paramInt3;
    }
    return k;
  }

  public void bIS() {
    if (this.mdg == null) {
      return;
    }
    cuB localcuB = this.mdg.dM(this.mdh, this.mdh + 2);
    a(localcuB, false, true);
  }

  protected void cho()
  {
  }

  protected void chp()
  {
  }

  private static byte a(iP paramiP1, iP paramiP2, int paramInt)
  {
    int i = paramiP2.aJq - paramiP1.aJq;
    int j = paramiP2.aJr - paramiP1.aJr;
    int k = paramiP1.aJp;
    int m = paramiP2.aJp;
    int n = paramiP1.aJo;
    int i1 = paramiP2.aJo;
    int i2 = paramiP2.aJs - (i1 != 0 ? m / 2 : 0) - (paramiP1.aJs - (n != 0 ? k / 2 : 0));

    if ((i == 0) || (j == 0)) {
      if (i > 0) {
        if (((n & 0xC) == 12) && ((i1 & 0x3) == 3)) {
          return 2;
        }

        i3 = (n & 0x4) == 4 ? k : 0;
        i4 = (n & 0x8) == 8 ? k : 0;
        i5 = (i1 == 0) || ((i1 & 0x1) == 1) ? m : 0;
        i6 = (i1 == 0) || ((i1 & 0x2) == 2) ? m : 0;

        return (Math.abs(i3 - (i6 + i2)) <= Math.abs(paramInt)) && (Math.abs(i4 - (i5 + i2)) <= Math.abs(paramInt)) ? 0 : 1;
      }

      if (i < 0)
      {
        if (((n & 0x3) == 3) && ((i1 & 0xC) == 12)) {
          return 2;
        }

        i3 = (n & 0x1) == 1 ? k : 0;
        i4 = (n & 0x2) == 2 ? k : 0;
        i5 = (i1 == 0) || ((i1 & 0x8) == 8) ? m : 0;
        i6 = (i1 == 0) || ((i1 & 0x4) == 4) ? m : 0;

        return (Math.abs(i3 - (i5 + i2)) <= Math.abs(paramInt)) && (Math.abs(i4 - (i6 + i2)) <= Math.abs(paramInt)) ? 0 : 1;
      }

      if (j > 0) {
        if (((n & 0x9) == 9) && ((i1 & 0x6) == 6)) {
          return 2;
        }

        i3 = (n & 0x1) == 1 ? k : 0;
        i4 = (n & 0x8) == 8 ? k : 0;
        i5 = (i1 == 0) || ((i1 & 0x2) == 2) ? m : 0;
        i6 = (i1 == 0) || ((i1 & 0x4) == 4) ? m : 0;

        return (Math.abs(i3 - (i5 + i2)) <= Math.abs(paramInt)) && (Math.abs(i4 - (i6 + i2)) <= Math.abs(paramInt)) ? 0 : 1;
      }

      if (((n & 0x6) == 6) && ((i1 & 0x9) == 9)) {
        return 2;
      }

      i3 = (n & 0x2) == 2 ? k : 0;
      i4 = (n & 0x4) == 4 ? k : 0;
      int i5 = (i1 == 0) || ((i1 & 0x1) == 1) ? m : 0;
      int i6 = (i1 == 0) || ((i1 & 0x8) == 8) ? m : 0;

      return (Math.abs(i4 - (i6 + i2)) <= Math.abs(paramInt)) && (Math.abs(i3 - (i5 + i2)) <= Math.abs(paramInt)) ? 0 : 1;
    }

    if (i > 0) {
      if (j > 0) {
        i3 = (n & 0x8) == 8 ? k : 0;
        i4 = (i1 == 0) || ((i1 & 0x2) == 2) ? m : 0;

        return Math.abs(i3 - (i4 + i2)) <= Math.abs(paramInt) ? 0 : 1;
      }
      i3 = (n & 0x4) == 4 ? k : 0;
      i4 = (i1 == 0) || ((i1 & 0x1) == 1) ? m : 0;

      return Math.abs(i3 - (i4 + i2)) <= Math.abs(paramInt) ? 0 : 1;
    }

    if (j > 0) {
      i3 = (n & 0x1) == 1 ? k : 0;
      i4 = (i1 == 0) || ((i1 & 0x4) == 4) ? m : 0;

      return Math.abs(i3 - (i4 + i2)) <= Math.abs(paramInt) ? 0 : 1;
    }
    int i3 = (n & 0x2) == 2 ? k : 0;
    int i4 = (i1 == 0) || ((i1 & 0x8) == 8) ? m : 0;

    return Math.abs(i3 - (i4 + i2)) <= Math.abs(paramInt) ? 0 : 1;
  }

  public short arG()
  {
    return this.mdc;
  }

  public void eJ(short paramShort)
  {
    this.mdc = paramShort;
  }

  public final cuB dpz()
  {
    return this.mdg;
  }

  private void CZ(int paramInt) {
    dkU localdkU = this.mdd.b(this, paramInt);
    if ((!bB) && (localdkU == null)) throw new AssertionError();
    this.mde = localdkU;
  }

  public final dkU cat()
  {
    return this.mde;
  }

  public chO caw() {
    return this.mdd;
  }

  public void cax() {
    this.mdd.c(this);
  }

  public void b(boolean paramBoolean, String paramString) {
    dkU localdkU = ZV.alJ().dV(paramString);
    a(bQA.a(paramBoolean, this, localdkU, localdkU));
  }

  public void a(boolean paramBoolean, String paramString1, String paramString2) {
    dkU localdkU1 = ZV.alJ().dV(paramString1);
    dkU localdkU2 = ZV.alJ().dV(paramString2);
    a(bQA.a(paramBoolean, this, localdkU1, localdkU2));
  }

  public void a(chO paramchO) {
    if ((!bB) && (this.mdd == null)) throw new AssertionError();
    this.mdd = paramchO;
    CZ(0);
  }

  public void dB(float paramFloat) {
    this.mdf = paramFloat;
  }

  public void a(cuB paramcuB, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramcuB.csW() < 2) {
      return;
    }

    if ((paramcuB.csW() == 2) && (paramcuB.csY()[0] == paramcuB.csZ()[0]) && (paramcuB.csY()[1] == paramcuB.csZ()[1]))
    {
      CZ(0);
      return;
    }

    CZ(paramcuB.csW());

    float f = this.mde.a(this) / this.mdf;
    Object localObject1 = paramcuB.q((int)f, true);

    cEi localcEi = new cEi(this.dcl, this.dcm, this.cQv);
    Object localObject2;
    if (this.mdo != null) {
      localObject2 = (bmM)((ArrayList)localObject1).get(0);
      ((bmM)localObject2).a(localcEi);
      ((bmM)localObject2).b(((bmM)localObject2).akl().o(((bmM)localObject2).akj()));
    }

    this.mdq = 0;

    if ((paramBoolean2) && (((ArrayList)localObject1).size() > 1))
    {
      localObject2 = new ArrayList(((ArrayList)localObject1).size());
      for (bmM localbmM : (ArrayList)localObject1) {
        ((ArrayList)localObject2).addAll(localbmM.r(2.0D));
      }
      localObject1 = localObject2;

      this.mdo = new amw((List)localObject1, this.mdq);
    } else {
      int i = this.mde.aBO();
      if (i >= 0) {
        this.mde.a(this, paramcuB.wS(1));
      }
      this.mdo = new bEh((List)localObject1, this.mdq + Math.max(0, i));
    }

    this.mdp = new cEi(this.dcl, this.dcm, this.cQv);

    this.mdg = paramcuB;

    this.mdh = 0;

    if (mdk)
    {
      this.mdm.g(new cgW(this));

      this.mdm.clear();
    }
  }

  public ckr dpA()
  {
    return this.mdo;
  }

  public int dpB()
  {
    if (this.mdg != null) {
      return this.mdg.wR(this.mdh)[0];
    }
    return (int)this.dcl;
  }

  public int dpC()
  {
    if (this.mdg != null) {
      return this.mdg.wR(this.mdh)[1];
    }
    return (int)this.dcm;
  }

  public short dpD()
  {
    if (Vj()) {
      return (short)(int)cJB().getAltitude();
    }
    if (this.mdg != null) {
      return (short)this.mdg.wR(this.mdh)[2];
    }
    return (short)(int)this.cQv;
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (cat().e(this))
    {
      cuB localcuB;
      if (this.mdg == null) {
        localcuB = new cuB(2);
        localcuB.a(0, (int)this.dcl, (int)this.dcm, (short)(int)this.cQv);
        localcuB.a(1, (int)paramFloat1, (int)paramFloat2, (short)(int)paramFloat3);
      } else {
        localcuB = new cuB(3);
        localcuB.a(0, (int)this.dcl, (int)this.dcm, (short)(int)this.cQv);
        localcuB.i(1, this.mdg.csZ());
        localcuB.a(2, (int)paramFloat1, (int)paramFloat2, (short)(int)paramFloat3);
      }
      a(localcuB, true, false);
      return;
    }

    super.k(paramFloat1, paramFloat2, paramFloat3);

    dpv();
  }

  public void fR(byte paramByte) {
    this.mdr = paramByte;
  }

  public byte cgR() {
    return this.mdr;
  }

  public void kY(boolean paramBoolean) {
    this.mds = paramBoolean;
  }

  public int afE() {
    return 5;
  }

  public aqh cau() {
    return aqh.dxF;
  }

  public aqh cav() {
    return aqh.dxG;
  }

  public String cas() {
    return atp();
  }

  public boolean dpE() {
    return this.mdg != null;
  }

  protected void M(int[] paramArrayOfInt)
  {
    int[] arrayOfInt1 = { paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2] };
    int k;
    if (this.mdg != null) {
      int i = this.mdg.csW();
      int j = 0;
      for (k = 0; k < i; k++) {
        int[] arrayOfInt2 = this.mdg.wR(k);
        if ((arrayOfInt2[0] == paramArrayOfInt[0]) && (arrayOfInt2[1] == paramArrayOfInt[1])) {
          arrayOfInt1[2] = arrayOfInt2[2];
          j = 1;
          break;
        }
      }

      if (j == 0) {
        return;
      }
    }

    if (this.kGJ != null) {
      Qh[] arrayOfQh1 = (Qh[])this.kGJ.toArray(new Qh[this.kGJ.size()]);
      for (Qh localQh : arrayOfQh1) {
        localQh.a(this, arrayOfInt1[0], arrayOfInt1[1], (short)arrayOfInt1[2]);
      }
    }

    if (cJA() != null)
      cJA().M(arrayOfInt1);
  }

  public boolean aeI()
  {
    return false;
  }

  public boolean w(float paramFloat1, float paramFloat2)
  {
    if (dpE()) {
      return j(paramFloat1, paramFloat2, 2.0F);
    }
    return super.w(paramFloat1, paramFloat2);
  }

  protected void reset()
  {
    super.reset();
    this.mcV.clear();
    this.mcW.clear();
    this.mdg = null;
    this.mdo = null;
  }
}