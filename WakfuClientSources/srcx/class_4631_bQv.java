import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class bQv extends aAn
{
  private static final ArrayList gYA = new ArrayList();
  private boolean gYB;
  private boolean gYC;
  private static final dSc[] gYD = { eu.azj, eu.azn, eu.azk, eu.azl, eu.azm };
  protected aoV dcN;
  protected eu gYE;
  private dDN gYF = null;

  public static final dJC aCh = new dJC(new ec[] { new axp("Mur destructible, avec HP", new dou[] { new dou("HP"), new dou("incr par level"), new dou("bloque le mouvement (l:oui, 0:non)"), new dou("bloque la ligne de vue (l:oui, 0:non)") }), new axp("Mur destructible, avec HP ou AREA_HP", new dou[] { new dou("HP ou AREA_HP"), new dou("incr par level"), new dou("bloque le mouvement (1:oui, 0:non)"), new dou("bloque la ligne de vue (1:oui, 0:non)"), new dou("Utilise des AREA_HP plutôt que des HP (1:oui, 0:non(defaut))") }) });

  public dJC mi()
  {
    return aCh;
  }

  public bQv(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public aAn a(agg paramagg)
  {
    aAn localaAn = super.a(paramagg);
    if ((paramagg != null) && (paramagg.E() != null)) {
      localaAn.c(paramagg.E());
    }
    else {
      localaAn.c(CG.bFI);
    }
    return localaAn;
  }

  protected bQv()
  {
  }

  public int getType() {
    return xj.bpq.xj();
  }

  public void initialize()
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(gYD));

    int i = (this.baW != null) && (this.baW.length >= 5) && (vy(4) == 1.0F) ? 1 : 0;
    if (i != 0)
      this.gYE = eu.aAg;
    else {
      this.gYE = eu.ayM;
    }

    localArrayList.add(this.gYE);
    this.dcN = new aoV(localArrayList);
    this.dcN.acY();
    if ((this.baW != null) && (this.baW.length >= 4)) {
      int j = (int)(vy(0) + nU() * vy(1));
      this.dcN.a(this.gYE).setMax(j);
      this.dcN.a(this.gYE).cpx();
      this.gYB = (vy(2) == 1.0F);
      this.gYC = (vy(3) == 1.0F);
      this.gYF = new bgJ(this);
    } else {
      K.error("nombre de paramètre incorrect pour la création d'un mur");
    }
  }

  public boolean c(alr paramalr)
  {
    return false;
  }

  public cqm atJ()
  {
    return a(this.gYE);
  }

  public cqm a(dSc paramdSc)
  {
    return this.dcN.a(paramdSc);
  }

  public aoV atK()
  {
    return this.dcN;
  }

  public boolean b(dSc paramdSc)
  {
    if (this.dcN != null) {
      return this.dcN.c(paramdSc);
    }
    return false;
  }

  public boolean atL()
  {
    return (super.atL()) || (this.dcN.e(this.gYE) <= 0);
  }

  public long[] a(alr paramalr)
  {
    return null;
  }

  public ArrayList b(alr paramalr)
  {
    return gYA;
  }

  public byte bY()
  {
    return 6;
  }

  public boolean atP()
  {
    return (this.gYB) || (this.gYC);
  }

  public boolean aeH()
  {
    return this.gYB;
  }

  public boolean atQ()
  {
    return this.gYC;
  }

  public boolean bXy()
  {
    return this.gYC;
  }

  public dDN atO()
  {
    return this.gYF;
  }
}