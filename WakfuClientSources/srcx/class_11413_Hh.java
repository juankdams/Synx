import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

public class Hh
  implements adL, bDr, cjx, dJJ
{
  protected static final Logger K = Logger.getLogger(Hh.class);
  protected final cSR bPq = new cSR();

  protected final cSR bPr = new cSR();

  private static Hh bPs = new Hh();

  public static Hh QM() {
    return bPs;
  }

  public static void a(Hh paramHh) {
    bPs = paramHh;
  }

  public void c(bBn parambBn)
  {
    this.bPq.put(parambBn.getId(), parambBn);
  }

  public bBn dh(int paramInt) {
    return (bBn)this.bPq.get(paramInt);
  }

  public gA eO(int paramInt) {
    gA localgA = (gA)this.bPr.get(paramInt);
    if (localgA == null) {
      bBn localbBn = dh(paramInt);
      if (localbBn == null) {
        return null;
      }
      localgA = gA.a(localbBn);
      this.bPr.put(paramInt, localgA);
    }
    return localgA;
  }

  public gA c(dGD paramdGD)
  {
    gA localgA = QN();
    if (localgA.b(paramdGD)) {
      return localgA;
    }
    return null;
  }

  public gA QN() {
    return new gA();
  }

  public dGD QO() {
    return new dGD();
  }

  public dmn yF() {
    return this.bPq.yF();
  }

  public List asList() {
    return Arrays.asList(this.bPq.d(new bBn[this.bPq.size()]));
  }

  public cxg eP(int paramInt) {
    bBn localbBn = (bBn)this.bPq.get(paramInt);
    if (localbBn == null) {
      return null;
    }
    return localbBn.bKs();
  }
}