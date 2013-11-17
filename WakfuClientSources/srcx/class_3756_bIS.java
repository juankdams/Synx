import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bIS extends csi
{
  private static bIS gJt;
  private static final Logger K = Logger.getLogger(bIS.class);
  protected dCi ddP;
  protected air gJu = new air();
  protected int gJv;
  protected byte aHn;
  protected int aSg;
  protected byte fCI;
  protected byte fCL;
  protected byte fCK;
  protected byte fCH;
  protected byte fCJ;
  protected byte ctp;
  protected byte ctq;
  protected PX fnA;

  public bIS()
  {
  }

  public bIS(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.ddP = new dCi(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public static bIS bQr() {
    return gJt;
  }

  public static void a(bIS parambIS) {
    gJt = parambIS;
  }

  public bIS b(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    return new bIS(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public bIS age() {
    return new bIS();
  }

  public bIS b(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new bIS(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public bIS(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi) {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ.nU());
    setName(paramdhJ.getName());
    this.aSg = paramdhJ.oc();
    this.gJv = paramInt2;
    this.ddP = paramdCi;
    this.aHn = paramdhJ.xK();

    double d = this.gJv / 100.0F;
    bhh localbhh = paramdhJ.aJp();

    this.gJu.acY();
    air localair = paramdhJ.cRq();
    azp localazp = localair != null ? localair : paramdhJ.cQY();

    for (dSc localdSc1 : eu.values()) {
      if (localdSc1.isExpandable()) {
        this.gJu.d(localdSc1).setMax(localazp.f(localdSc1));
      }
      else {
        this.gJu.d(localdSc1).set(localazp.e(localdSc1));
      }

    }

    if ((localbhh instanceof SB)) {
      ((SB)localbhh).afL().a(this.gJu, paramShort2);
    }

    this.gJu.d(eu.ayN).cpx();
    this.gJu.d(eu.ayP).set(paramdhJ.e(eu.ayP));
    this.gJu.d(eu.ayO).cpx();
    this.gJu.d(eu.ayX).setMax(0);

    for (??? = bQG.bXD().bXE().iterator(); ((Iterator)???).hasNext(); ) { bsc localbsc = (bsc)((Iterator)???).next();
      ??? = localbsc.bAs();
      int n = localbsc.qI(paramShort2);
      localObject2 = eu.a(Byte.valueOf(???));
      if ((localObject2 != null) && (this.gJu.d((dSc)localObject2) != null))
        this.gJu.d((dSc)localObject2).gz(n);
    }
    Object localObject2;
    if (d != 1.0D)
    {
      for (dSc localdSc2 : eu.values()) {
        if ((localdSc2 != eu.ayN) && (localdSc2 != eu.ayO) && (localdSc2 != eu.ayP))
        {
          localObject2 = this.gJu.d(localdSc2);
          if (localdSc2.isExpandable())
          {
            ((Rx)localObject2).setMax((int)Math.ceil(((Rx)localObject2).max() * d));
          }
          else {
            ((Rx)localObject2).set((int)Math.ceil(((Rx)localObject2).value() * d));
          }
        }
      }
    }

    this.gJu.d(eu.ayM).set(paramdhJ.e(eu.ayM));
    this.gJu.d(eu.ayM).setMax((int)(localazp.f(eu.ayM) * d));
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);

    aN(paramdhJ1);
    p(paramdhJ1);
  }

  private void aN(dhJ paramdhJ)
  {
    paramdhJ.cQY().a(this.gJu);
    if (cqE() > 0)
      paramdhJ.d(eu.ayM).set(cqE());
  }

  protected void p(dhJ paramdhJ) {
    dCi localdCi = paramdhJ.auK();
    if (localdCi == null) {
      return;
    }

    double d = this.gJv / 100.0F;

    for (bfE localbfE1 : this.ddP)
      try {
        bfE localbfE2 = (bfE)localbfE1.ow();
        localbfE2.d((short)(int)(localbfE1.nU() * d), true);
        localdCi.c(localbfE2);
      } catch (dI localdI) {
        K.error("InventoryCapacityReachedException lors de l'initialisation des sorts d'un double : ", localdI);
      } catch (dcF localdcF) {
        K.error("ContentAlreadyPresentException lors de l'initialisation des sorts d'un double : ", localdcF);
      }
  }

  public byte xK()
  {
    return this.aHn;
  }

  public boolean a(aof paramaof) {
    paramaof.clear();
    super.a(paramaof);
    paramaof.dsK = new bBa();
    paramaof.dsK.grR.cGX = this.gJv;
    paramaof.dsK.grR.bUn = this.aHn;
    paramaof.dsK.grR.bUm = this.aSg;
    paramaof.dsK.grR.cGY = this.fCI;
    paramaof.dsK.grR.cGZ = this.fCL;
    paramaof.dsK.grR.cHa = this.fCH;
    paramaof.dsK.grR.cHb = this.fCK;
    paramaof.dsK.grR.cHc = this.fCJ;
    paramaof.dsK.grR.cHd = this.ctp;
    paramaof.dsK.grR.cHe = this.ctq;
    paramaof.dsK.grR.cHf = aTq();

    if (this.ddP != null)
      this.ddP.b(paramaof.dsK.grR.cHg);
    this.gJu.a(paramaof.dsK.grR.cHh);
    paramaof.dsK.grR.cHi.clear();
    if (this.fnA != null) {
      jR localjR = this.fnA.abM();
      while (localjR.hasNext()) {
        localjR.fl();
        rd localrd = new rd();
        localrd.aYU = localjR.rC();
        localrd.aDe = localjR.value();
        paramaof.dsK.grR.cHi.add(localrd);
      }
    }
    return true;
  }

  protected byte aTq() {
    return 1;
  }

  public boolean b(aof paramaof) {
    boolean bool = super.b(paramaof);
    this.gJv = paramaof.dsK.grR.cGX;
    this.aHn = paramaof.dsK.grR.bUn;
    this.aSg = paramaof.dsK.grR.bUm;
    this.fCI = paramaof.dsK.grR.cGY;
    this.fCL = paramaof.dsK.grR.cGZ;
    this.fCH = paramaof.dsK.grR.cHa;
    this.fCK = paramaof.dsK.grR.cHb;
    this.fCJ = paramaof.dsK.grR.cHc;
    this.ctp = paramaof.dsK.grR.cHd;
    this.ctq = paramaof.dsK.grR.cHe;
    if (this.ddP != null)
      bool &= this.ddP.c(paramaof.dsK.grR.cHg);
    bool &= this.gJu.b(paramaof.dsK.grR.cHh);
    this.fnA = null;
    if (paramaof.dsK.grR.cHi.size() > 0) {
      Iterator localIterator = paramaof.dsK.grR.cHi.iterator();
      this.fnA = new PX();
      while (localIterator.hasNext()) {
        rd localrd = (rd)localIterator.next();
        this.fnA.c(localrd.aYU, localrd.aDe);
      }
    }

    return bool;
  }

  public dCi auK() {
    return this.ddP;
  }

  public void clean() {
    super.clean();
    if (this.ddP != null) {
      this.ddP.ajx();
      this.ddP.cHU();
    }
  }
}