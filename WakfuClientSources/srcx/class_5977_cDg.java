import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class cDg extends aAn
{
  private static final int iwc = 1;
  private static final int iwd = 2;
  private static final int iwe = 4;
  private static final int iwf = 8;
  private static final int iwg = 16;
  private static final int iwh = 32;
  private static final int iwi = 64;
  public static final int iwj = 1;
  public static final int iwk = 2;
  public static final int iwl = 3;
  public static final int iwm = 4;
  public static final int iwn = 5;
  public static final int iwo = 6;
  public static final dJC aCh = new dJC((ec[])localArrayList1.toArray(new axp[0]));
  protected CG ax;
  protected boolean iwp;
  protected boolean iwq;
  protected boolean iwr;
  protected boolean iws;
  protected byte io;
  protected int iwt;
  protected aoV dcN;
  protected dDN dcP;
  private final long[] aGI = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  public cDg(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public cDg q(agg paramagg)
  {
    cDg localcDg = (cDg)super.a(paramagg);
    if ((paramagg != null) && (paramagg.E() != null)) {
      localcDg.c(paramagg.E());
    }
    return localcDg;
  }

  protected cDg()
  {
  }

  public int getType() {
    return xj.bpy.xj();
  }

  public void initialize()
  {
    this.iwt = Math.round(vy(0));
    int i = vy(1) != -1.0F ? 1 : 0;
    int j = (vy(9) >= 0.0F) && (vy(9) <= 127.0F) ? 1 : 0;
    int k = this.baW.length >= 14 ? 1 : 0;

    if ((i != 0) || (j != 0) || (k != 0)) {
      localObject = new ArrayList();

      if (i != 0) {
        ((ArrayList)localObject).add(eu.ayM);
      }
      if (j != 0)
        ((ArrayList)localObject).add(eu.azc);
      byte b;
      eu localeu;
      for (int m = 10; this.baW.length >= m + 4; m += 4) {
        b = (byte)(int)vy(m);
        localeu = eu.a(Byte.valueOf(b));
        if (localeu == null) {
          K.error("Unable to add dynamic charac " + vy(m) + " to effectarea : unknown charac");
        }
        else {
          ((ArrayList)localObject).add(localeu);
        }
      }
      if (((ArrayList)localObject).size() > 0) {
        this.dcN = new aoV((Iterable)localObject);
        this.dcN.acY();
      }

      for (m = 10; this.baW.length >= m + 4; m += 4) {
        b = (byte)(int)vy(m);
        localeu = eu.a(Byte.valueOf(b));
        if (localeu != null)
        {
          Rx localRx = (Rx)a(localeu);
          if (localRx == null) {
            K.error("UNable to find a newly created dynamic charac for this effect area");
          }
          else {
            int i3 = (int)vy(m + 1);
            int i4 = (int)vy(m + 2);
            int i5 = (int)vy(m + 3);
            if (i4 == -2)
              localRx.setMin(localRx.lo());
            else if (i4 != -1) {
              localRx.setMin(i4);
            }

            if (i5 == -2)
              localRx.setMax(localRx.lp());
            else if (i5 != -1) {
              localRx.setMax(i5);
            }
            localRx.set(i3);
          }
        }
      }
    }
    Object localObject = axG();
    if (i != 0) {
      float f1 = vy(1);
      float f2 = vy(2);
      int i2 = (int)(f1 + nU() * f2);
      this.dcN.a(eu.ayM).setMax(i2);
      this.dcN.a(eu.ayM).cpx();
    }
    if ((j != 0) && (localObject != null)) {
      cqm localcqm = a(eu.azc);

      int i1 = (byte)(int)vy(9);
      if ((((dle)localObject).b(eu.azc)) && ((i1 & 0x1) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.azc));
      }
      if ((((dle)localObject).b(eu.azd)) && ((i1 & 0x2) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.azd));
      }
      if ((((dle)localObject).b(eu.aze)) && ((i1 & 0x4) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.aze));
      }
      if ((((dle)localObject).b(eu.azf)) && ((i1 & 0x8) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.azf));
      }
      if ((((dle)localObject).b(eu.azg)) && ((i1 & 0x10) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.azg));
      }
      if ((((dle)localObject).b(eu.aAh)) && ((i1 & 0x20) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.aAh));
      }
      if ((((dle)localObject).b(eu.azI)) && ((i1 & 0x40) != 0)) {
        localcqm.gv(((dle)localObject).e(eu.azI));
      }
    }

    this.iwp = (vy(3) == 1.0F);
    this.iwq = (vy(4) == 1.0F);

    if (vy(5) == 1.0F)
      this.dcP = new bgJ(this);
    else {
      this.dcP = null;
    }

    this.iwr = (vy(6) == 1.0F);
    this.iws = (vy(7) == 1.0F);
    int n = (int)vy(8);
    if (n <= 0)
      this.io = 6;
    else
      this.io = ((byte)n);
  }

  public boolean atP()
  {
    return (this.iwp) || (this.iwq);
  }

  public boolean aeH()
  {
    return this.iwp;
  }

  public boolean atQ()
  {
    return this.iwq;
  }

  public boolean c(alr paramalr)
  {
    if (paramalr == this.fuA) {
      return this.iwr;
    }
    return this.iws;
  }

  public dDN atO()
  {
    return this.dcP;
  }

  public cqm atJ()
  {
    switch (this.iwt) {
    case 1:
      return axG().a(eu.azX);
    }
    if (b(eu.aAg)) {
      return a(eu.aAg);
    }

    return a(eu.ayM);
  }

  public cqm a(dSc paramdSc)
  {
    if (this.dcN == null) {
      return null;
    }
    return this.dcN.a(paramdSc);
  }

  public aoV atK()
  {
    return this.dcN;
  }

  public boolean b(dSc paramdSc)
  {
    if (this.dcN == null) {
      return false;
    }
    return this.dcN.c(paramdSc);
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aGI;
    }
    return null;
  }

  public List d(alr paramalr)
  {
    return Collections.singletonList(this.fuA);
  }

  public byte bY()
  {
    return this.io;
  }

  public int czh() {
    return this.iwt;
  }

  public boolean atL()
  {
    if (super.atL()) {
      return true;
    }
    if ((this.dcN != null) && (b(eu.ayM)) && 
      (this.dcN.e(eu.ayM) <= 0)) {
      return true;
    }

    if ((this.dcN != null) && (b(eu.aAg)) && 
      (this.dcN.e(eu.aAg) <= 0)) {
      return true;
    }

    return false;
  }

  public void c(CG paramCG) {
    this.ax = paramCG;
  }

  public CG E() {
    if (this.ax == null) {
      return super.E();
    }
    return this.ax;
  }

  static
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    localArrayList2.add(new dou("UserDefined ID"));
    localArrayList2.add(new dou("HP (-1 = pas de pdv)"));
    localArrayList2.add(new dou("HP inc par level (useless si HP == -1)"));
    localArrayList2.add(new dou("Bloque mouvement (oui si 1, non sinon)"));
    localArrayList2.add(new dou("Bloque ligne de vue (oui si 1, non sinon)"));
    localArrayList2.add(new dou("Avec RunningEffectManager (oui si 1, non sinon)"));
    localArrayList2.add(new dou("P-e triggered par owner (oui si 1, non sinon)"));
    localArrayList2.add(new dou("P-e triggered par qqun d'autre (oui si 1, non sinon)"));
    localArrayList2.add(new dou("Hauteur (NORMAL_HEIGHT si <= 0)"));
    localArrayList2.add(new dou("Bonus dégats owner recopiés (-1:aucun 1:phys 2:Feu 4:Eau 8:Terre 16:Air 32:Stasis 64:Meca"));

    localArrayList1.add(new axp("Fake fighter sous forme d'effect area", (dou[])localArrayList2.toArray(new dou[0])));

    for (int i = 1; i < 6; i++) {
      localArrayList2.add(new dou("Charac#" + i + " : id"));
      localArrayList2.add(new dou("Charac#" + i + " : valeur initiale"));
      localArrayList2.add(new dou("Charac#" + i + " : valeur min (-1 = default min, -2 = lower bound)"));
      localArrayList2.add(new dou("Charac#" + i + " : valeur max (-1 = default max, -2 = upper bound)"));
      localArrayList1.add(new axp("Fake fighter avec " + i + " charac dynamique", (dou[])localArrayList2.toArray(new dou[0])));
    }
  }
}