import java.io.IOException;
import org.apache.log4j.Logger;

final class SJ
  implements caY
{
  private static final Logger K = Logger.getLogger(SJ.class);
  private final ddn aBS;
  private int cug;

  SJ(ddn paramddn)
  {
    this.aBS = paramddn;
    this.cug = this.aBS.e(eu.aAg);
  }

  public void a(cqm paramcqm) {
    int i = paramcqm.value();
    if (this.aBS.Vj())
      gH(i);
    else {
      gI(i);
    }

    this.cug = i;
  }

  private void gH(int paramInt) {
    cYl localcYl = this.aBS.Vl();
    if (localcYl == null)
      return;
    cUo localcUo = ((bKm)localcYl).aeL().cJA();
    a(paramInt, localcUo, 1045, 1045);
  }

  private void gI(int paramInt) {
    dCb localdCb = this.aBS.Uc().cyG();
    a(paramInt, localdCb, 10022, 10022);
  }

  private void a(int paramInt1, dCb paramdCb, int paramInt2, int paramInt3) {
    if (paramdCb == null)
      return;
    try {
      String str = ay.bd().getString("ANMInteractiveElementPath");
      if (gK(paramInt1))
        str = String.format(str, new Object[] { Integer.valueOf(paramInt3) });
      else if (gJ(paramInt1))
        str = String.format(str, new Object[] { Integer.valueOf(paramInt2) });
      else {
        return;
      }
      paramdCb.em(str);
      paramdCb.b(str, true);
      ((cUo)paramdCb).e(1, agt.arQ().b((bKm)this.aBS.axG()).bcl());
    }
    catch (bdh localbdh) {
      K.error("Exception levee", localbdh);
    } catch (IOException localIOException) {
      K.error("Exception levee", localIOException);
    }
  }

  private boolean gJ(int paramInt) {
    return (paramInt > 1) && (this.cug == 1);
  }

  private boolean gK(int paramInt) {
    return (paramInt == 1) && (this.cug > 1);
  }
}