import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ars
{
  public static final ars dzL = new ars();

  private final cSR dzM = new cSR();
  private final KR dzN = new KR();

  private final bPu dzO = new bPu();
  private final bPu dzP = new bPu();

  private final bPu dzQ = new bPu();
  private final bPu dzR = new bPu();

  public void b(brW parambrW)
  {
    this.dzM.put(parambrW.getId(), parambrW);
    this.dzN.a(parambrW.arI(), parambrW.getId());
  }

  public brW jG(int paramInt) {
    return (brW)this.dzM.get(paramInt);
  }

  public brW aL(short paramShort) {
    return jG(this.dzN.L(paramShort));
  }

  public void a(cUh paramcUh)
  {
    aDF.aPK();
    this.dzO.c(paramcUh.nc(), paramcUh);
  }

  public cUh aM(short paramShort) {
    return (cUh)this.dzO.cx(paramShort);
  }

  public void a(dAi paramdAi) {
    aDF.aPK();
    this.dzP.c(paramdAi.ddw(), paramdAi);
  }

  public dAi aN(short paramShort) {
    return (dAi)this.dzP.cx(paramShort);
  }

  public void a(bOB parambOB)
  {
    aDF.aPK();
    this.dzQ.c(parambOB.nc(), parambOB);
  }

  public bOB aO(short paramShort) {
    return (bOB)this.dzQ.cx(paramShort);
  }

  public void a(cDs paramcDs) {
    aDF.aPK();
    this.dzR.c(paramcDs.bqQ(), paramcDs);
  }

  public cDs aP(short paramShort) {
    return (cDs)this.dzR.cx(paramShort);
  }

  public bOB[] aDR()
  {
    bOB[] arrayOfbOB = new bOB[this.dzQ.size()];
    this.dzQ.d(arrayOfbOB);
    Arrays.sort(arrayOfbOB, new boN(this));

    return arrayOfbOB;
  }

  public void u(dGy paramdGy) {
    cDs[] arrayOfcDs = new cDs[this.dzR.size()];
    this.dzR.d(arrayOfcDs);
    Arrays.sort(arrayOfcDs, new dtM());
    int i = 0; for (int j = arrayOfcDs.length; i < j; i++)
      if (!paramdGy.d(arrayOfcDs[i]))
        return;
  }

  public void v(dGy paramdGy)
  {
    this.dzM.s(paramdGy);
  }

  public void w(dGy paramdGy) {
    this.dzO.s(paramdGy);
  }

  public void x(dGy paramdGy) {
    this.dzP.s(paramdGy);
  }

  public void y(dGy paramdGy) {
    this.dzQ.s(paramdGy);
  }

  public ArrayList b(bOB parambOB) {
    ArrayList localArrayList = new ArrayList(3);
    for (bM localbM = this.dzP.bVW(); localbM.hasNext(); ) {
      localbM.fl();
      dAi localdAi = (dAi)localbM.value();
      if (localdAi.bVJ() == parambOB.nc()) {
        localArrayList.add(localbM.value());
      }
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
}