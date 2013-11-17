import java.util.ArrayList;
import org.apache.log4j.Logger;

public class amY
{
  private static Logger K = Logger.getLogger(amY.class);

  public aIX dpM = new aIX();
  public bjI dpN = new bjI();
  private cYk dpO = null;
  private byte dpP;
  public dDU bjV;
  private dxL cZH = null;
  private boolean dpQ = false;
  private boolean dpR = false;
  private boolean dpS = false;
  private boolean dpT = false;
  private boolean dpU = false;
  private boolean bvn = false;
  private Ym dpV;
  private Ym[] dpW;
  private Ym[] dpX;
  private Ym dpY;
  private short dpZ = -1;
  private String cir;
  private int cis;
  private int dqa;
  private int dqb;
  private int aGC;
  private ceQ dqc;

  public amY azt()
  {
    amY localamY = new amY();
    Object localObject;
    if (this.dpM != null) {
      for (localObject = this.dpM.aVh(); ((cHL)localObject).hasNext(); ) {
        ((cHL)localObject).fl();
        localamY.dpM.c(((cHL)localObject).rC(), ((cHL)localObject).bid());
      }
    }

    if (this.dpN != null) {
      for (localObject = this.dpN.buW(); ((bjJ)localObject).hasNext(); ) {
        ((bjJ)localObject).fl();
        localamY.dpN.o(((bjJ)localObject).zY(), ((bjJ)localObject).Gh());
      }
    }

    localamY.dpO = this.dpO;
    localamY.dpP = this.dpP;
    localamY.bjV = this.bjV;
    localamY.cZH = this.cZH;
    localamY.dpQ = this.dpQ;
    localamY.dpR = this.dpR;
    localamY.dpS = this.dpS;
    localamY.dpT = this.dpT;
    localamY.dpU = this.dpU;
    localamY.bvn = this.bvn;
    localamY.dpV = this.dpV;
    int i;
    int j;
    if (this.dpW != null) {
      localamY.dpW = new Ym[this.dpW.length];
      i = 0; for (j = this.dpW.length; i < j; i++) {
        localamY.dpW[i] = this.dpW[i];
      }
    }

    if (this.dpX != null) {
      localamY.dpX = new Ym[this.dpX.length];
      i = 0; for (j = this.dpX.length; i < j; i++) {
        localamY.dpX[i] = this.dpX[i];
      }
    }

    localamY.dpY = this.dpY;
    localamY.dpZ = this.dpZ;
    localamY.cir = this.cir;
    localamY.cis = this.cis;
    localamY.dqa = this.dqa;
    localamY.dqb = this.dqb;
    localamY.aGC = this.aGC;

    return localamY;
  }

  public dDU EE() {
    return this.bjV;
  }

  public int getId() {
    return this.bjV.getId();
  }

  public aF EH() {
    return this.bjV.EH();
  }

  public cXa EI() {
    return this.bjV.EI();
  }

  public byte azu() {
    return this.dpP;
  }

  public void bg(byte paramByte) {
    this.dpP = paramByte;
  }

  public boolean azv() {
    return this.dpQ;
  }

  public void cx(boolean paramBoolean) {
    this.dpQ = paramBoolean;
  }

  public boolean azw() {
    return this.dpS;
  }

  public void cy(boolean paramBoolean) {
    this.dpS = paramBoolean;
  }

  public boolean azx()
  {
    return this.dpR;
  }

  public void bz(boolean paramBoolean) {
    if (this.dpR == paramBoolean) {
      return;
    }

    this.dpR = paramBoolean;
  }

  public Ym azy()
  {
    return this.dpV;
  }

  public void a(Ym paramYm) {
    this.dpV = paramYm;
  }

  public static amY b(dDU paramdDU) {
    amY localamY = new amY();
    localamY.bjV = paramdDU;
    ArrayList localArrayList1 = localamY.bjV.cfd();
    localamY.dpW = new Ym[localArrayList1.size()];
    for (int i = 0; i < localArrayList1.size(); i++) {
      localamY.dpW[i] = new Ym((Aa)localArrayList1.get(i));
    }
    ArrayList localArrayList2 = localamY.bjV.dfU();
    if (localArrayList2 != null) {
      localamY.dpX = new Ym[localArrayList2.size()];
      for (int j = 0; j < localArrayList2.size(); j++)
        localamY.dpX[j] = new Ym((Aa)localArrayList2.get(j));
    }
    else {
      localamY.dpX = null;
    }
    localamY.dqc = aUi.eUP.nW(paramdDU.getId());
    return localamY;
  }

  public byte a(dNR paramdNR) {
    if ((!bB) && (paramdNR == null)) throw new AssertionError("On essaye de récupérer le status d'un goal null");
    return this.dpN.get(paramdNR.getId());
  }

  public Ym[] azz() {
    return this.dpW;
  }

  public Ym[] azA() {
    return this.dpX;
  }

  public void b(cSi paramcSi) {
    for (int i = 0; i < paramcSi.size(); i++) {
      int j = paramcSi.get(i);
      if (this.dpN.get(j) != 1) {
        this.dpN.o(j, (byte)1);
      }
    }
    if (this.dqc != null)
      this.dqc.aLm();
  }

  public boolean b(byte paramByte, long paramLong) {
    boolean bool = (this.dpM.D(paramByte)) && (this.dpM.bO(paramByte) != paramLong);
    this.dpM.c(paramByte, paramLong);
    if (this.dqc != null)
      this.dqc.aLm();
    return bool;
  }

  public long eN(String paramString) {
    return this.dpM.bO(this.bjV.qU(paramString));
  }

  public String getTitle() {
    return this.bjV.dfQ();
  }

  public void jf(int paramInt) {
    if (this.dpN.get(paramInt) != 1)
      K.error("On essaie de terminer une action pas encore commencée, dans le scenario " + getId() + " action d'id " + paramInt);
    this.dpN.o(paramInt, (byte)2);

    if (this.dqc != null)
      this.dqc.aLm();
  }

  public void c(cSi paramcSi) {
    if ((this.dpV != null) && ((paramcSi == null) || (!paramcSi.contains(this.dpV.getId()))))
      this.dpV = null;
    for (Ym localYm : this.dpW)
      if ((paramcSi != null) && (paramcSi.contains(localYm.getId()))) {
        localYm.bC(true);
        if (this.dpV == null)
          this.dpV = localYm;
      } else {
        localYm.bC(false);
      }
  }

  public boolean FC()
  {
    dxL localdxL1 = this.bjV.dfV();
    dxL localdxL2 = dDE.dft().VN();
    if ((localdxL1 != null) && 
      (localdxL1.Q(localdxL2))) {
      return true;
    }
    if (this.cZH == null)
      return false;
    int i = this.bjV.azI();
    if (i > 0) {
      cYq localcYq = new cYq(this.cZH);
      localcYq.n(kb.I(i));
      if (localcYq.Q(localdxL2))
        return true;
    }
    return false;
  }

  public short azB()
  {
    if ((azH()) || (azx()))
      return 0;
    if (this.bjV.azI() == 0)
      return -1;
    if (this.cZH == null) {
      return this.bjV.azI();
    }
    cYq localcYq = new cYq(this.cZH);
    localcYq.n(kb.I(this.bjV.azI()));

    kb localkb = dDE.dft().VN().V(localcYq);
    return localkb.rN() ? (short)(int)localkb.rO() : 0;
  }

  public void cz(boolean paramBoolean)
  {
    this.dpT = paramBoolean;
  }

  public void e(dxL paramdxL) {
    this.cZH = paramdxL;
  }

  public boolean azC() {
    return this.bjV.azC();
  }

  public boolean IR() {
    return this.bvn;
  }

  public void bB(boolean paramBoolean) {
    this.bvn = paramBoolean;
  }

  public boolean azD() {
    if (this.bjV.azI() > 0)
      return true;
    return false;
  }

  public boolean apR() {
    return this.dpT;
  }

  public boolean azE() {
    return this.dpO != null;
  }

  public boolean azF() {
    for (Ym localYm : this.dpW) {
      if (localYm.isValid())
        return false;
    }
    return true;
  }

  public cYk azG() {
    return this.dpO;
  }

  public void r(cYk paramcYk)
  {
    if (paramcYk == null)
      cCZ.cyZ().czb();
    else
      cCZ.cyZ().a(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), this);
  }

  public void cA(boolean paramBoolean)
  {
    this.dpU = paramBoolean;
  }

  public boolean azH() {
    return this.dpU;
  }

  public short azI() {
    return this.bjV.azI();
  }

  public dxL EQ() {
    return this.cZH;
  }

  public int CB() {
    return this.aGC;
  }

  public void aM(int paramInt) {
    this.aGC = paramInt;
  }

  public short azJ() {
    return this.dpZ;
  }

  public void aF(short paramShort) {
    this.dpZ = paramShort;
    if (this.dqc != null)
      this.dqc.aLn();
  }

  public String toString()
  {
    return EE().dfQ();
  }

  public Ym jg(int paramInt) {
    if (this.dpW.length > paramInt)
      return this.dpW[paramInt];
    return null;
  }

  public void jh(int paramInt) {
    this.dpY = ((paramInt >= 0) && (paramInt < this.dpW.length) ? this.dpW[paramInt] : null);
    if (this.dqc != null)
      this.dqc.btC();
  }

  public Ym azK()
  {
    return this.dpY;
  }

  public String abD() {
    return this.cir;
  }

  public void eO(String paramString) {
    this.cir = paramString;
    if (this.dqc != null)
      this.dqc.btG();
  }

  public int abE()
  {
    return this.cis;
  }

  public void ji(int paramInt) {
    this.cis = paramInt;
    if (this.dqc != null)
      this.dqc.btH();
  }

  public int azL()
  {
    return this.dqa;
  }

  public void jj(int paramInt) {
    this.dqa = paramInt;
  }

  public int azM() {
    return this.dqb;
  }

  public void jk(int paramInt) {
    this.dqb = paramInt;
  }

  public void r(dxL paramdxL) {
    if (!paramdxL.avJ()) {
      this.cZH = paramdxL;
      this.dpT = true;
      cAo.cxf().a(beK.bsq(), 1000L, getId());
    }
  }
}