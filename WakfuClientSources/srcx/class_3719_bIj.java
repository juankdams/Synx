import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class bIj extends cnv
{
  private final arO gHt;
  private final dDe gHu;
  private Comparator gHv;
  private List gHw;
  private List gHx;

  public bIj(arO paramarO, dDe paramdDe)
  {
    this.gHt = paramarO;
    this.gHu = paramdDe;
    this.gHv = new dnM(this.gHt.getId(), paramdDe);
  }

  protected void a(dbo paramdbo)
  {
    b(paramdbo);
    bPA();

    cbQ localcbQ = AO();

    a(paramdbo, localcbQ);
  }

  private void a(dbo paramdbo, cbQ paramcbQ) {
    paramdbo.bPL().o(paramcbQ.cfv());
    paramdbo.AO().o(paramcbQ.cfv());
  }

  private cbQ AO() {
    cbQ localcbQ = new cbQ();
    if ((this.gHw.isEmpty()) && (this.gHx.isEmpty())) {
      return localcbQ;
    }

    if (this.gHw.isEmpty()) {
      a(localcbQ, this.gHx);
      return localcbQ;
    }

    if (this.gHx.isEmpty()) {
      a(localcbQ, this.gHw);
      return localcbQ;
    }

    int i = 1;
    while ((!this.gHw.isEmpty()) && (!this.gHx.isEmpty())) {
      if (i != 0)
        localcbQ.add(((dhJ)this.gHw.remove(0)).getId());
      else {
        localcbQ.add(((dhJ)this.gHx.remove(0)).getId());
      }
      i = i == 0 ? 1 : 0;
      if (this.gHw.isEmpty())
        a(localcbQ, this.gHx);
      else if (this.gHx.isEmpty()) {
        a(localcbQ, this.gHw);
      }
    }
    return localcbQ;
  }

  private void a(cbQ paramcbQ, List paramList) {
    for (dhJ localdhJ : paramList)
      paramcbQ.add(localdhJ.getId());
  }

  private void b(dbo paramdbo)
  {
    paramdbo.AO().clear();
    paramdbo.bPL().clear();
  }

  private void bPA() {
    Collection localCollection1 = this.gHt.cj((byte)0);
    Collection localCollection2 = this.gHt.cj((byte)1);
    int i = r(localCollection1);
    int j = r(localCollection2);

    if (j > i) {
      this.gHw = new ArrayList(localCollection2);
      this.gHx = new ArrayList(localCollection1);
    } else if (j < i) {
      this.gHw = new ArrayList(localCollection1);
      this.gHx = new ArrayList(localCollection2);
    }
    else if (this.gHt.getId() % 2 == 0) {
      this.gHw = new ArrayList(localCollection2);
      this.gHx = new ArrayList(localCollection1);
    } else {
      this.gHw = new ArrayList(localCollection1);
      this.gHx = new ArrayList(localCollection2);
    }

    Collections.sort(this.gHw, this.gHv);
    Collections.sort(this.gHx, this.gHv);
  }

  private int r(Collection paramCollection) {
    if (paramCollection.isEmpty()) {
      return 0;
    }
    int i = 0;
    for (dhJ localdhJ : paramCollection) {
      i += this.gHu.fc(localdhJ.getId());
    }
    i /= paramCollection.size();
    return i;
  }

  protected void c(dbo paramdbo)
  {
  }

  protected void d(dbo paramdbo)
  {
  }

  protected void a(dbo paramdbo, long paramLong)
  {
    paramdbo.bPL().add(paramLong);
  }

  protected void a(dbo paramdbo, long paramLong, int paramInt)
  {
    paramdbo.AO().r(paramInt, paramLong);
    paramdbo.bPL().clear();
    paramdbo.bPL().o(paramdbo.AO().cfv());
  }

  protected void b(dbo paramdbo, long paramLong)
  {
    Cu.b(paramdbo.bPL(), paramLong);
  }
}