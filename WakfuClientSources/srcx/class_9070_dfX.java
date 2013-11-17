import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dfX
{
  private static final Logger K = Logger.getLogger(dfX.class);

  private static final dGy laE = new DR();

  public static final dfX laF = new dfX();

  private final cSR laG = new cSR();
  private final cSR laH = new cSR();
  private final cSR laI = new cSR();

  private final aoL bPQ = new aoL();

  private final aRa laJ = aRa.eNR;
  private short laK;

  public void f(cKg paramcKg)
  {
    ArrayList localArrayList = new ArrayList();
    this.laK = paramcKg.arI();

    bij localbij = cDj.iwy.dv(this.laK);
    int i = localbij.btZ();
    localbij = cDj.iwy.dw(this.laK);
    localbij.pK(i);

    paramcKg.o(new DP(this, localArrayList));

    ag(localArrayList);
  }

  public void ag(ArrayList paramArrayList) {
    cPz();

    int i = 0; for (int j = paramArrayList.size(); i < j; i++)
      j((cuF)paramArrayList.get(i));
  }

  public short cPy()
  {
    return this.laK;
  }

  private void cPz() {
    this.bPQ.s(laE);
    this.bPQ.clear();
  }

  public void clear() {
    this.laG.clear();
    this.laJ.aEs();

    cPz();
  }

  public aLw j(cUh paramcUh) {
    return ea(paramcUh.nc());
  }

  public aLw ea(short paramShort) {
    aLw localaLw = (aLw)this.laG.get(paramShort);
    if (localaLw == null) {
      this.laG.put(paramShort, localaLw = new aLw(ars.dzL.aM(paramShort), this.laJ));
    }
    return localaLw;
  }

  private aXZ h(bOB parambOB) {
    aXZ localaXZ = (aXZ)this.laH.get(parambOB.nc());
    if (localaXZ == null) {
      this.laH.put(parambOB.nc(), localaXZ = new aXZ(parambOB));
    }
    return localaXZ;
  }

  public aXZ eb(short paramShort) {
    return h(ars.dzL.aO(paramShort));
  }

  public mV d(cDs paramcDs) {
    short s = paramcDs.bqQ();
    mV localmV = (mV)this.laI.get(s);
    if (localmV == null) {
      this.laI.put(s, localmV = new mV(ars.dzL.aP(s), this.laJ));
    }
    return localmV;
  }

  private bIT b(bAb parambAb) {
    return new bIT(parambAb);
  }

  public boU jG(long paramLong) {
    return (boU)this.bPQ.get(paramLong);
  }

  public bZw b(bvy parambvy) {
    if ((parambvy instanceof bOB)) {
      return h((bOB)parambvy);
    }

    if ((parambvy instanceof cDs)) {
      return d((cDs)parambvy);
    }

    if ((parambvy instanceof bAb)) {
      return b((bAb)parambvy);
    }

    return null;
  }

  public boU j(cuF paramcuF) {
    long l = paramcuF.EN();
    boU localboU = boU.a(j(paramcuF.adj()), l, paramcuF.adl(), cYq.jq(paramcuF.rb()));

    if (localboU != null) {
      this.bPQ.put(l, localboU);
      localboU.byB();
    }

    return localboU;
  }
}