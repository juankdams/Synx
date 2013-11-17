import java.util.ArrayList;

public final class bLH
{
  private final dqG gPm;
  private final dQW gPn;

  public bLH(dqG paramdqG, dQW paramdQW)
  {
    this.gPm = paramdqG;
    this.gPn = paramdQW;
  }

  void tq() {
    aOX localaOX = (aOX)this.gPm;
    this.gPn.aZC.clear();

    for (short s = 0; s < localaOX.bfO(); s = (short)(s + 1)) {
      gA localgA = localaOX.bn(s);
      if (localgA != null)
      {
        aTg localaTg = new aTg();
        localgA.a(localaTg.cpq);
        localaTg.cIh = s;

        this.gPn.aZC.add(localaTg);
      }
    }
  }

  public void tr() { aOX localaOX = (aOX)this.gPm;
    localaOX.clear();

    int i = 0; for (int j = this.gPn.aZC.size(); i < j; i++) {
      aTg localaTg = (aTg)this.gPn.aZC.get(i);
      gA localgA = Hh.QM().c(localaTg.cpq);

      localaOX.J(localgA);
    }
  }

  public String toString()
  {
    return "TemporaryInventorySerializer{m_inventory=" + this.gPm + '}';
  }
}