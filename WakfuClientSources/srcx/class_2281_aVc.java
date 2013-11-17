import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aVc extends cGF
  implements aqm, bBz, uY
{
  private static final byte eWJ = 3;
  protected static final Logger K = Logger.getLogger(aVc.class);
  protected aee aOr;
  private byte eWK;
  protected duF eWL;
  protected Ce eWM;
  protected dle evo;
  protected dle evp;
  protected final cYk eUw = new cYk();
  private ZS eWN;
  private dDN eWO = null;
  protected cOE ejP;
  protected int aw;
  protected long bkH;
  protected long eWP;
  protected cMe eWQ;
  protected int cxl;
  protected final BitSet eWR = new BitSet();
  protected int eWS;
  private aVc eWT;
  protected boolean eWU = true;
  private boolean eWV;
  private static short eWW;
  private static final short eWX = 200;
  protected cUz eWY;
  private static final boolean aRN = false;
  private boolean eWZ = false;
  private boolean eXa;
  private bWc eXb;
  private static long cxL = 0L;

  private static MW eXc = null;

  protected boolean eXd = false;
  protected bbq eXe;
  private boolean eXf = false;
  protected boolean eXg = false;

  private static boolean eXh = false;

  private boolean eXi = false;

  public cCH eXj = new IJ(this, 34);

  public cCH eXk = new IK(this, 8);

  public cCH aDV = new IM(this, 8);

  public static void bka()
  {
    eWW = 0;
  }

  public static void a(MW paramMW)
  {
    eXc = paramMW;
  }

  private static long asd()
  {
    if (cxL < 9223372036854775807L) {
      return cxL++;
    }
    cxL = 0L;
    return cxL;
  }

  protected aVc()
  {
    bkp();
    this.eWZ = false;
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public long oj() {
    return this.bkH;
  }

  public long bkb() {
    return this.eWP;
  }

  public void aH(long paramLong) {
    this.bkH = paramLong;
  }

  public cMe DU() {
    return this.eWQ;
  }

  public void a(cMe paramcMe) {
    this.eWQ = paramcMe;
  }

  public duF bkc() {
    return this.eWL;
  }

  public void b(duF paramduF) {
    this.eWL = paramduF;
  }

  public void bkd()
  {
    if (eXh)
      this.eXe = new bbq();
    this.eXg = true;
  }

  public dle bke() {
    return this.evo;
  }

  public void i(dle paramdle) {
    this.evo = paramdle;
  }

  public dle bkf() {
    return this.evp;
  }

  public cYk bkg() {
    return this.eUw;
  }

  public Ce wa() {
    return this.eWM;
  }

  public void j(dle paramdle) {
    this.evp = paramdle;
  }

  public void C(int paramInt1, int paramInt2, short paramShort) {
    this.eUw.ac(paramInt1, paramInt2, paramShort);
  }

  public ZS bkh() {
    return this.eWN;
  }

  public void b(Ce paramCe) {
    this.eWM = paramCe;
  }

  public void b(cOE paramcOE) {
    this.ejP = paramcOE;
  }

  public cOE aIq() {
    return this.ejP;
  }

  public int getValue() {
    return this.cxl;
  }

  public void kf(int paramInt)
  {
    this.cxl = paramInt;
  }

  public int yR() {
    if (this.eWL == null)
      return -1;
    return this.eWL.yR();
  }

  public boolean bki()
  {
    return false;
  }

  public void release()
  {
    if (this.eWK > 0) {
      K.error("On essaye de release un RunningEffect encore référencé refCount=" + this.eWK + " id=" + this.aw);
      return;
    }

    if ((this.eWZ) && (akZ())) {
      K.error("Double release sur un " + getClass().getSimpleName() + " hashCode : " + hashCode() + " : " + bBd.bJO());
      bc();
      return;
    }

    if (!this.eWZ) {
      bc();
      return;
    }

    bkj();
  }

  public boolean akZ() {
    return this.aOr == null;
  }

  private void bkj() {
    try {
      this.aOr.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + " normalement impossible");
    }
    this.aOr = null;
  }

  public List bkk() {
    return a(this.eWL, this.evo, this.ejP, this.eUw.getX(), this.eUw.getY(), this.eUw.IB());
  }

  public static void ed(boolean paramBoolean)
  {
    eXh = paramBoolean;
  }

  public void bkl() {
    if (this.eXe != null)
      this.eXe.clear();
  }

  public bbq a(duF paramduF, Ce paramCe, cOE paramcOE, dle paramdle1, int paramInt1, int paramInt2, short paramShort, dle paramdle2, ZS paramZS)
  {
    if (eXh) {
      if (this.eXe != null) {
        this.eXe.clear();
      } else {
        this.eXe = bbq.bpU();
        this.eXf = true;
      }

    }

    if ((paramZS == null) || (paramZS.alB())) {
      bka();
    }

    a(paramduF, paramCe, paramcOE, paramdle1, null, paramInt1, paramInt2, paramShort, paramZS);
    Object localObject;
    if ((aN()) && (!aM()))
    {
      localObject = bko();
      if (localObject != null)
      {
        if ((((aVc)localObject).bkM()) && (!((aVc)localObject).isInfinite())) {
          ((aVc)localObject).bkI();
        }

        if (((aVc)localObject).bkt()) {
          if ((((aVc)localObject).aM()) && (this.evp == null)) {
            K.warn(" on veut calculer un effet qui a besoin d'une cible, sans cible : " + bkC());
          }
          if ((((aVc)localObject).aL()) && (this.evo == null)) {
            K.warn("on veut calculer un effet qui a besoin d'un caster, sans caster : " + bkC());
          }
          if ((((aVc)localObject).aN()) && (this.eUw == null)) {
            K.warn("on veut calculer un effet qui a besoin d'une cellule cible, sans cellule cible : " + bkC());
          }
          ((aVc)localObject).B(null);
        }

        if ((this.evo != null) && (this.evo.atO() != null))
        {
          if ((((aVc)localObject).isInfinite()) || (((aVc)localObject).bkM())) {
            this.evo.atO().F((aVc)localObject);
          }
        }
        else
        {
          ((aVc)localObject).bkB();
        }

        if (!((aVc)localObject).aug()) {
          ((aVc)localObject).bkz();
        }
      }
    }
    if (aM())
    {
      if ((paramdle2 == null) || ((paramduF != null) && (paramduF.beC()))) {
        localObject = a(paramduF, paramdle1, paramcOE, paramInt1, paramInt2, paramShort);

        for (List localList : (List)localObject) {
          w(localList);
          if ((eXh) && (this.eXe != null))
            this.eXe.k(localList);
        }
      } else {
        k(paramdle2);
        if ((eXh) && (this.eXe != null)) {
          this.eXe.n(paramdle2);
        }
      }

    }

    if (this.eXg)
      clearParameters();
    if (eXh) {
      return this.eXe;
    }
    return null;
  }

  public void a(duF paramduF, Ce paramCe, cOE paramcOE, dle paramdle1, dle paramdle2, int paramInt1, int paramInt2, short paramShort, ZS paramZS)
  {
    this.eWL = paramduF;
    this.eWM = paramCe;
    this.evo = paramdle1;
    this.ejP = paramcOE;
    this.evp = paramdle2;
    C(paramInt1, paramInt2, paramShort);
    if (this.eWN != null)
      this.eWN.release();
    if (paramZS != null)
      this.eWN = paramZS.alA();
    else {
      this.eWN = null;
    }

    bkm();
  }

  public void a(ZS paramZS) {
    if (this.eWN != null)
      this.eWN.release();
    this.eWN = paramZS;
  }

  protected void bkm() {
    if (this.eWL != null)
      this.eWS = this.eWL.auj();
  }

  protected void clearParameters() {
    this.eWL = null;
    this.eWM = null;
    this.evo = null;
    this.ejP = null;
    this.evp = null;
    if (this.eWN != null)
      this.eWN.release();
    this.eWN = null;
  }

  public aVc bkn() {
    return this.eWT;
  }

  public void u(aVc paramaVc) {
    this.eWT = paramaVc;
  }

  public aVc a(cOE paramcOE, adf paramadf)
  {
    aVc localaVc = bko();
    localaVc.d(getId());
    localaVc.b(paramcOE);
    localaVc.a(DU());
    return localaVc;
  }

  public aVc bko()
  {
    aVc localaVc = aO();

    if (eXc != null)
      localaVc.bkH = eXc.i(localaVc);
    else {
      localaVc.bkH = asd();
    }

    localaVc.v(this);

    localaVc.eWP = localaVc.bkH;

    return localaVc;
  }

  public abstract aVc aO();

  public void aJ()
  {
    bkp();
    this.eWV = false;
    this.eWZ = true;
  }

  protected void bkp()
  {
    this.eWO = null;
    this.eWK = 0;
    this.eWS = -1;
    this.evo = null;
    this.evp = null;
    this.ejP = null;
    this.eWL = null;
    this.eWM = null;
    this.eWU = true;
    this.eWR.clear();
    this.eXg = false;
    this.eXe = null;
    this.bkH = -1L;
    this.eWP = -1L;
    this.eXf = false;
    this.eWY = null;
    this.eXa = false;
  }

  public void bc() {
    this.eXi = false;

    bkp();

    this.eUw.ac(-2147483648, -2147483648, (short)-32768);

    if (this.eWN != null) {
      this.eWN.release();
    }
    this.eWN = null;

    this.cxl = 0;

    this.eWT = null;

    this.eXd = false;
    if (this.eXb != null)
      this.eXb.cbt();
    this.eXb = null;
    if ((eXh) && (this.eXe != null) && (this.eXf))
      this.eXe.release();
  }

  protected void v(aVc paramaVc)
  {
    this.eXi = paramaVc.eXi;
    this.eWL = paramaVc.eWL;
    this.eWM = paramaVc.eWM;
    this.evo = paramaVc.evo;
    this.evp = paramaVc.evp;
    this.eUw.ae(paramaVc.eUw);
    if (this.eWN != null)
      this.eWN.release();
    if (paramaVc.eWN != null)
      this.eWN = paramaVc.eWN.alA();
    else {
      this.eWN = null;
    }

    this.ejP = paramaVc.ejP;

    this.aw = paramaVc.aw;
    this.eWQ = paramaVc.eWQ;
    this.cxl = paramaVc.cxl;
    aH();
    this.eWR.or(paramaVc.eWR);
    bkx();
    this.eWS = paramaVc.eWS;
    this.eWT = paramaVc.eWT;
    this.eXd = false;
    this.eXe = paramaVc.eXe;
    this.eWU = paramaVc.eWU;
  }

  public dDN bkq()
  {
    return this.eWO;
  }

  public void a(dDN paramdDN) {
    this.eWO = paramdDN;
  }

  public void bkr() {
    this.eWU = false;
  }

  public void bks()
  {
    this.eWU = true;
  }

  public boolean bkt() {
    return this.eWU;
  }

  public bbq bku() {
    if (!eXh)
      return null;
    return this.eXe;
  }

  public BitSet aua()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.aua();
  }

  public BitSet aub()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.aub();
  }

  public BitSet aud()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.aud();
  }

  public BitSet bkv()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.aue();
  }

  public BitSet bkw()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.auf();
  }

  public boolean ob(int paramInt) {
    if ((aub() != null) && (aub().get(paramInt)))
      return true;
    if ((aua() != null) && (aua().get(paramInt)))
      return true;
    if ((aud() != null) && (aud().get(paramInt)))
      return true;
    if ((bkv() != null) && (bkv().get(paramInt)))
      return true;
    if ((bkw() != null) && (bkw().get(paramInt))) {
      return true;
    }
    return false;
  }

  public BitSet auc()
  {
    if (this.eWL == null)
      return null;
    return this.eWL.auc();
  }

  public BitSet DV() {
    if ((this.eWL != null) && (this.eWL.auh() != null))
      this.eWR.or(this.eWL.auh());
    return this.eWR;
  }

  public void aH() {
    this.eWR.clear();
    this.eWR.set(0);
  }

  protected void bkx() {
  }

  public boolean aug() {
    if ((aub() != null) && (aub().length() > 0))
      return true;
    if ((aua() != null) && (aua().length() > 0))
      return true;
    if ((aud() != null) && (aud().length() > 0))
      return true;
    if ((bkv() != null) && (bkv().length() > 0))
      return true;
    if ((bkw() != null) && (bkw().length() > 0))
      return true;
    return false;
  }

  public abstract boolean aL();

  public abstract boolean aM();

  public abstract boolean aN();

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
  }

  public boolean yL()
  {
    return (this.eWL != null) && (this.eWL.yL());
  }

  public boolean atT() {
    return (this.eWL != null) && (this.eWL.atT());
  }

  public void U(byte[] paramArrayOfByte)
  {
    if (DV() == null)
      return;
    for (byte b : paramArrayOfByte)
      ct(b);
  }

  public void bky()
  {
    this.eXi = true;
  }

  public boolean aiz() {
    return (this.eXi) || ((this.eWL != null) && (this.eWL.aiz()));
  }

  public boolean ct(byte paramByte) {
    if (DV() == null) {
      return false;
    }
    boolean bool = false;
    ArrayList localArrayList;
    switch (paramByte)
    {
    case 1:
      localArrayList = new ArrayList();

      while ((bke() != null) && (!localArrayList.contains(bke()))) {
        localArrayList.add(bke());
        bool |= bke().a(DV(), this, (byte)10);
      }
      localArrayList.clear();
    case 2:
    case 3:
    case 4:
    case 6:
      while ((bkf() != null) && (!localArrayList.contains(bkf()))) {
        localArrayList.add(bkf());
        bool |= bkf().a(DV(), this, (byte)1); continue;

        if (bke() != null)
          bool |= bke().a(DV(), this, (byte)20);
        if (bkf() != null) {
          bool |= bkf().a(DV(), this, (byte)2); break;

          if (bke() != null)
            bool |= bke().a(DV(), this, (byte)30);
          if (bkf() != null) {
            bool |= bkf().a(DV(), this, (byte)3); break;

            if (bke() != null)
              bool |= bke().a(DV(), this, (byte)40);
            if (bkf() != null) {
              bool |= bkf().a(DV(), this, (byte)4); break;

              if (bke() != null)
                bool |= bke().a(DV(), this, (byte)60);
              if (bkf() != null)
                bool |= bkf().a(DV(), this, (byte)6); 
            }
          }
        }
      }
    case 5:
    }
    return bool;
  }

  public void oT() {
    if ((this.ejP != null) && (this.ejP.LF() != null))
      this.ejP.LF().m(this);
  }

  public void nt()
  {
    if ((this.ejP != null) && (this.ejP.LF() != null))
      this.ejP.LF().n(this);
  }

  public void k(dle paramdle)
  {
    if (paramdle == null)
      return;
    w(Collections.singletonList(paramdle));
  }

  public boolean w(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return false;
    }
    boolean bool = false;

    eWW = (short)(eWW + 1);
    if (eWW >= 200) {
      if (eWW == 200) {
        localObject1 = new StringBuilder().append("boucle infinie pour un runningEffect ? action id=").append(getId()).append(", effect Id ").append(yR());

        if ((aIq() != null) && (aIq().agb() != null)) {
          ((StringBuilder)localObject1).append(", Sort a l'origine ").append(aIq().agb().Fh());
        }
        ((StringBuilder)localObject1).append(", historique de trigger ").append(bqX.fMi);
        K.error(((StringBuilder)localObject1).toString(), new NullPointerException("erreur generee pour etude de stack"));
      }

      return false;
    }

    Object localObject1 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = paramList.iterator(); localIterator.hasNext(); ) { localObject2 = (dle)localIterator.next();

      aVc localaVc = bko();
      localaVc.j((dle)localObject2);

      if ((this.ejP != null) && (this.ejP.LH() != null)) {
        localaVc.eWY = this.ejP.LH().Ba();
      }

      if (!localaVc.aug())
      {
        if (localObject2 != null)
          localaVc.ct((byte)1);
        if (localaVc.eXa) {
          localaVc.release();
        }
        else {
          if ((bkt()) && (localaVc.bkt()))
          {
            if ((aL()) && (localaVc.bke() == null)) {
              K.warn("on veut calculer un effet qui a besoin d'un caster, sans caster " + getId() + (this.eWL != null ? " generic effect " + this.eWL.yR() + "action " + this.eWL.eo() : ""));
            }

            if ((aN()) && (localaVc.bkg() == null)) {
              K.warn("on veut calculer un effet qui a besoin d'une cellule cible, sans cellule cible" + getId() + (this.eWL != null ? " generic effect" + this.eWL.yR() + " action " + this.eWL.eo() : ""));
            }

            localaVc.B(null);
          }

          bool = true;
          ((ArrayList)localObject1).add(localaVc);
        }
      } else {
        if ((localaVc.bkM()) && (!localaVc.isInfinite()))
        {
          bool = true;
          localaVc.bkI();
        }

        if ((localaVc.bkM()) || (localaVc.bkL()))
          if (atX()) {
            if ((localaVc.bke() != null) && (localaVc.bke().atO() != null))
            {
              localaVc.bke().atO().F(localaVc);
              localaVc.oT();
            }
            else {
              localArrayList.add(localaVc);
            }
          }
          else if ((localaVc.bkf() != null) && (localaVc.bkf().atO() != null))
          {
            localaVc.bkf().atO().F(localaVc);
            localaVc.oT();
          }
          else {
            localArrayList.add(localaVc);
          }
      }
    }
    Object localObject2;
    for (localIterator = ((ArrayList)localObject1).iterator(); localIterator.hasNext(); ) { localObject2 = (aVc)localIterator.next();

      if ((((aVc)localObject2).bkM()) && (!((aVc)localObject2).isInfinite())) {
        ((aVc)localObject2).bkI();
      }

      if (!((aVc)localObject2).bkL()) {
        ((aVc)localObject2).bkz();
      }
      else {
        ((aVc)localObject2).bkH();
      }

    }

    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject2 = (aVc)localIterator.next();
      ((aVc)localObject2).release();
    }

    return bool;
  }

  public void ee(boolean paramBoolean)
  {
    this.eXa = paramBoolean;
  }

  public abstract boolean Cu();

  public boolean w(aVc paramaVc) {
    return true;
  }

  public void bkz()
  {
    if (Cu())
    {
      if ((bkf() != null) && (bkf().byd())) {
        eg(false);
        return;
      }

      ct((byte)2);

      if ((bkf() != null) && (bkf().byd())) {
        eg(false);
        return;
      }

      c(bkn(), false);
      return;
    }
    eg(false);
  }

  protected void bkA() {
  }

  public void bkB() {
    this.eXd = true;
  }

  protected void x(aVc paramaVc) {
    paramaVc.bkB();
  }

  public void y(aVc paramaVc)
  {
    dle localdle1 = A(paramaVc);
    long l1 = localdle1 != null ? localdle1.getId() : 0L;
    dle localdle2 = z(paramaVc);
    long l2 = localdle2 != null ? localdle2.getId() : 0L;

    if (bqX.fMi.b(yR(), l1, l2)) {
      return;
    }
    if (!w(paramaVc)) {
      return;
    }

    aVc localaVc = bko();
    localaVc.u(this);
    localaVc.eWP = oj();
    x(localaVc);

    if (paramaVc != null) {
      localaVc.i(A(paramaVc));
      localaVc.j(z(paramaVc));
      if (localaVc.bkf() != null) {
        localObject = localaVc.bkf();
        localaVc.C(((dle)localObject).fa(), ((dle)localObject).fb(), ((dle)localObject).fc());
      } else {
        localObject = paramaVc.bkg();
        localaVc.C(((cYk)localObject).getX(), ((cYk)localObject).getY(), ((cYk)localObject).IB());
      }
    }
    if (((localaVc.aM()) && (localaVc.bkf() == null)) || ((localaVc.aL()) && (localaVc.bke() == null)) || ((localaVc.bkf() != null) && (localaVc.bkf().byd())) || ((localaVc.aN()) && (localaVc.bkg() == null)))
    {
      if ((localaVc.aM()) && (localaVc.bkf() == null))
        K.error("on veut executer un effet qui a besoin d'une cible, sans cible (action=" + localaVc.bkC() + ")");
      if ((localaVc.aL()) && (localaVc.bke() == null))
        K.error("on veut executer un effet qui a besoin d'un caster, sans caster\t(action = " + localaVc.bkC() + ")");
      if ((localaVc.aN()) && (localaVc.bkg() == null))
        K.error("on veut executer un effet qui a besoin d'une cellule cible, sans cellule cible (action=" + localaVc.bkC() + ")");
      localaVc.release();
      return;
    }

    Object localObject = bqX.fMi.a(yR(), l1, l2);
    int i = ((drS)localObject).cYC() == null ? 1 : 0;
    try {
      if (localaVc.bkt()) {
        localaVc.B(paramaVc);
      }
      localaVc.U(new byte[] { 1, 2 });

      long l3 = oj();

      localaVc.c(paramaVc, true);

      if (oj() == l3)
        eg(true);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }

    bqX.fMi.bzM();
    if (i != 0)
      bqX.fMi.clear();
  }

  public String bkC()
  {
    return "Act#" + this.eWL.eo() + "@Eff#" + this.eWL.yR();
  }

  protected dle z(aVc paramaVc)
  {
    if ((paramaVc == null) || (this.eWL == null) || (atT())) {
      return this.evp;
    }

    if (yL())
    {
      if (this.eWL.atU())
      {
        return paramaVc.bke();
      }

      return paramaVc.bkf();
    }

    if (this.eWL.atU())
    {
      return paramaVc.bkf();
    }

    return paramaVc.bke();
  }

  protected dle A(aVc paramaVc)
  {
    return this.evo;
  }

  public void bkD() {
    if (this.eWO != null)
    {
      this.eWO.G(this);
    }
    else
      bkG();
  }

  public void bkE()
  {
    bkD();
  }

  public boolean bkF() {
    return this.eWV;
  }

  public void bkG()
  {
    ef(true);
  }

  public void aK() {
  }

  public void ef(boolean paramBoolean) {
    aK();
    if (paramBoolean)
      bkO();
    nt();
    this.eWV = true;
    if (!this.eXg)
      release();
  }

  public abstract void bkH();

  public abstract void bkI();

  public cUz bkJ()
  {
    return this.eWY;
  }

  public abstract bvk bkK();

  public abstract boolean bkL();

  public boolean atX()
  {
    return (this.eWL != null) && (this.eWL.atX());
  }

  public boolean bkM() {
    if (this.eXd)
      return false;
    return aug();
  }

  public abstract boolean isInfinite();

  public boolean bkN() {
    return this.eWZ;
  }

  public void c(aVc paramaVc, boolean paramBoolean)
  {
    bkO();

    if ((eXh) && (this.eXe != null)) {
      this.eXe.b(DV());
      this.eXe.bpV();
    }

    U(new byte[] { 3, 4 });

    bkA();
    eg(true);
  }

  public void eg(boolean paramBoolean)
  {
    int i = 0;

    if ((paramBoolean) && (this.eWS >= 0))
    {
      if (this.eWS > 0) {
        this.eWS -= 1;
      }

      if (this.eWS == 0) {
        i = 1;
      }

    }

    if ((!bkF()) && ((!bkM()) || (i != 0)))
      bkD();
  }

  protected void bkO() {
    int i = 0;
    try {
      while ((bkP()) && (i < 3))
        i = (byte)(i + 1);
    }
    catch (Exception localException) {
      K.error("Exception catchée : ", localException);
    }
  }

  protected boolean bkP()
  {
    boolean bool = false;

    if ((this.evp != null) && (!this.evp.aJu()) && (this.evp.atL()) && (this.evp.adX())) {
      this.evp.he(true);
      bool = true;
      this.evp.b(this.evo);
      if (this.evp != null)
        this.evp.he(false);
    }
    if ((this.evo != null) && (!this.evo.aJu()) && (this.evo.atL()) && (this.evo.adX())) {
      this.evo.he(true);
      bool = true;
      this.evo.b(this.evo);
      if (this.evo != null)
        this.evo.he(false);
    }
    return bool;
  }

  public abstract void B(aVc paramaVc);

  public boolean C(aVc paramaVc)
  {
    return false;
  }

  public byte[] bkQ() {
    return a(new cCH[] { this.eXj, bkT(), lJ(), bkU(), bkV() });
  }

  public byte[] j()
  {
    return a(new cCH[] { this.eXj, bkT(), nu(), lJ(), bkU(), bkV() });
  }

  public byte[] bkR()
  {
    return a(new cCH[] { this.eXj, lJ(), bkU(), bkV() });
  }

  public cCH[] tn() {
    return new cCH[] { this.eXj, bkT(), nu(), lJ(), bkU(), bkV() };
  }

  public cCH bkS()
  {
    return this.eXj;
  }

  public cCH bkT() {
    return this.eXk;
  }

  public cCH nu() {
    return this.aDV;
  }

  public cCH lJ() {
    return cCH.ivi;
  }

  public cCH bkU() {
    return cCH.ivi;
  }

  public cCH bkV() {
    return cCH.ivi;
  }

  public abstract duF bkW();

  public boolean isPersistent()
  {
    return false;
  }

  public void eJ(long paramLong) {
    this.eWP = paramLong;
  }

  public void a(bWc parambWc) {
    this.eXb = parambWc;
  }
}