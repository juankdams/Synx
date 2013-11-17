import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dO
  implements dBv
{
  public static final int Um = -1;
  public static final int Un = -2;
  public static final int Uo = 1009;
  private static final Logger K = Logger.getLogger(dO.class);
  private short az;
  private agq Up;
  private int Uq = -1;
  private boolean Ur = false;
  private bKs Us;
  private dJN Ut;
  private String m_name;
  private int Uu = 0;

  private final qo Uv = new qo();

  private static final dO Uw = new dO();

  public final String Ux = "zoneName";

  public void k(boolean paramBoolean)
  {
    a(paramBoolean, 5000);
  }

  private void a(boolean paramBoolean, int paramInt) {
    int i = this.Ur != paramBoolean ? 1 : 0;
    if (i != 0) {
      ar(paramInt);
    }
    this.Ur = paramBoolean;
    if (i != 0) {
      this.Up = a(this.Up);
      aWc.blo().blu();
    }

    if (this.Up != null)
      aq(this.Up.cZW);
  }

  public void initialize(String paramString)
  {
  }

  private void aq(int paramInt)
  {
    if (this.Ur) {
      paramInt = -2;
    }

    if (paramInt == this.Uq) {
      return;
    }

    hG();

    if (paramInt != -1) {
      if (paramInt == -2)
        hF();
      else {
        um.bhU.cY(paramInt);
      }

    }

    this.Uq = paramInt;
  }

  private void hF() {
    anK localanK = anK.drx;
    localanK.d(Pr.chM);
    localanK.az(0.9F);
    localanK.cB(true);

    this.Us = new bKs(null);
    this.Us.start();
  }

  private void ar(int paramInt) {
    if (!this.Ur) {
      return;
    }

    this.Us.stop(paramInt);
    cIB localcIB = sS.Al().Aq().abJ();
    anK localanK = anK.drx;
    localanK.cB(false);
    if (localcIB != null) {
      localanK.a(localcIB.cCC(), paramInt);
      localanK.az(localcIB.oz());
    }
  }

  private void hG() {
    if (this.Uq != -1) {
      cOj.kwA.yK(this.Uq);
      um.bhU.cX(this.Uq);
      this.Uq = -1;
    }
  }

  public void h(short paramShort) {
    cOj.kwA.clear();
    hG();
    this.az = paramShort;
  }

  private void hH() {
    if (this.Ut == null) {
      return;
    }

    dUx localdUx = bDk.bLI().cr((short)cwO.anM());
    float f1;
    if (localdUx == null)
      f1 = 0.0F;
    else {
      f1 = localdUx.cYh;
    }

    float f2 = byv.bFN().bFO().getAltitude();

    int i = this.Ut.nx();
    int j = this.Ut.ny();

    int k = 0;
    int m = 0; int n = 0;

    for (int i1 = -1; i1 < 2; i1 = (short)(i1 + 1)) {
      for (int i2 = -1; i2 < 2; i2++) {
        dJN localdJN = (dJN)cPV.cGZ().V((short)(i + i1), (short)(j + i2));
        if (localdJN != null)
        {
          float f3 = localdJN.aDe() * 100.0F;
          m += (int)(i1 * f3);
          n += (int)(i2 * f3);

          k = (int)(k + f3);
        }
      }
    }

    k = (int)(k / 9.0F);

    cEi localcEi = new cEi(m, n, 0.0F).czS();
    aWc.blo().b(new td(new aAv(localcEi.getX() * 10.0F, localcEi.getY() * 10.0F, f2 - f1, true, 0), byu.gkt, k));
  }

  public void j(int paramInt1, int paramInt2)
  {
    this.Ut = ((dJN)cPV.cGZ().es(paramInt1, paramInt2));

    hH();
    Xm.cHv.j((short)(paramInt1 / 18), (short)(paramInt2 / 18));

    cOj.kwA.reset();
    um.bhU.reset();
  }

  public static dO hI()
  {
    return Uw;
  }

  private agq a(agq paramagq) {
    if (paramagq == null) {
      return null;
    }

    if (!this.Ur) {
      return bGc.bOn().sI(paramagq.biu);
    }

    paramagq = new agq(paramagq.biu, paramagq.m_name, paramagq.cZS, paramagq.cZT, paramagq.cZU, bib.fxJ.bJ(), -2);

    return paramagq;
  }

  public agq hJ() {
    return this.Up;
  }

  public void k(int paramInt1, int paramInt2) {
    if (this.Ut == null) {
      return;
    }

    if (!this.Ut.p(paramInt1, paramInt2)) {
      this.Ut = ((dJN)cPV.cGZ().es(paramInt1, paramInt2));

      if (this.Ut != null) {
        hH();
        Xm.cHv.j(this.Ut.nx(), this.Ut.ny());
      }
    }

    Xm.cHv.aI(paramInt1, paramInt2);

    int i = l(paramInt1, paramInt2);

    if ((this.Up != null) && (i == this.Up.biu)) {
      return;
    }

    bGc localbGc = bGc.bOn();
    agq localagq = localbGc.sI(i);
    if (localagq != null)
    {
      aWc localaWc = aWc.blo();

      localaWc.bt((short)localagq.cZS);
      try
      {
        if (localagq.cZT)
          localaWc.rQ(localagq.cZU);
        else
          localaWc.rQ(-1);
      }
      catch (Exception localException) {
        K.error("Exception :", localException);
      }

      String str = bU.fH().b(54, i, new Object[0]);
      if (!str.equals(this.m_name)) {
        this.m_name = str;
        b(paramInt1, paramInt2, i);
      }
    } else {
      this.m_name = "";
      cCZ.cyZ().sv(-1);
    }

    dLE.doY().a(this, new String[] { "zoneName" });
    localagq = a(localagq);

    if ((((localagq == null ? 1 : 0) ^ (this.Up == null ? 1 : 0)) != 0) || ((localagq != null) && (localagq.cZV != this.Up.cZV))) {
      aWc.blo().blu();
    }
    aq(localagq == null ? -1 : localagq.cZW);
    this.Up = localagq;
  }

  private int l(int paramInt1, int paramInt2)
  {
    if (this.Ut == null) {
      K.error("La map de coord cell(" + paramInt1 + "," + paramInt2 + ") n'est pas chargée ");
      return -1;
    }
    if (Vr.cAl.aiI()) {
      return 1009;
    }

    return this.Ut.eF(paramInt1, paramInt2);
  }

  public final void l(boolean paramBoolean) {
    if (this.Up == null) {
      return;
    }

    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    int i = paramBoolean ? localaWe.RV() : 0;
    if (this.Uu == i) {
      return;
    }

    this.Uu = i;

    if (!bU.fH().ed(88, i)) {
      return;
    }

    lZ locallZ = new lZ();
    locallZ.a(this.m_name);
    if (this.Uu != 0) {
      locallZ.tH();
      locallZ.tz().bx(14);
      locallZ.a(bU.fH().b(88, i, new Object[0]));
      locallZ.tA();
    }
    a(locallZ, 100, this.Up.biu);
  }

  private void a(lZ paramlZ, int paramInt1, int paramInt2) {
    String str = as(paramInt2);
    if (str == null) {
      return;
    }
    KO.Vm().a(new bMo(cMS.kse, paramlZ.tP(), paramInt1, 2500, str));
  }

  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.aeQ() != null) {
      return;
    }

    if ((this.m_name != null) && (this.m_name.length() == 0));
    lZ locallZ = new lZ();
    locallZ.a(this.m_name);
    bva localbva = byJ.gma.cF(paramInt1, paramInt2);
    locallZ.tH();
    if (localbva != null) {
      aid localaid = localbva.boT();
      if (localaid != null) {
        locallZ.tz().bx(14);
        int i = localaid.avc();
        ctE localctE = (ctE)localbyz.cJf();

        locallZ.am(bPl.a(localctE, dsh.luB.BA(i)).bUV());

        locallZ.a(bU.fH().b(39, i, new Object[0]));
        locallZ.tA();
      }
    }
    a(locallZ, 500, paramInt3);
  }

  private String as(int paramInt) {
    agq localagq = bGc.bOn().sI(paramInt);
    bib localbib = bib.cM(localagq.cZV);
    if (localbib.btW()) {
      return "AnimAmbiance-" + localbib.bJ();
    }
    dUx localdUx = bDk.bLI().cr(this.az);
    int i = localdUx.mrO;
    if (i == 0) {
      return null;
    }
    return "AnimInstance-" + i;
  }

  public void clear() {
    this.Ut = null;
    this.m_name = "";
    this.Up = null;
    a(false, 0);
    hG();
  }

  public String[] getFields()
  {
    return new String[] { "zoneName" };
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equalsIgnoreCase("zoneName")) {
      return (this.m_name != null) && (this.m_name.length() > 0) ? this.m_name : null;
    }
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public String getName() {
    return this.m_name;
  }
}