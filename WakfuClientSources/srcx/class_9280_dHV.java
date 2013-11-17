import java.util.ArrayList;
import java.util.List;

class dHV extends doC
{
  private final List lSI;

  dHV(cLO paramcLO)
  {
    this.lSI = new ArrayList();
    paramcLO.a(new RX(this));
  }

  protected void a(azp paramazp, short paramShort1, short paramShort2)
  {
    for (doC localdoC : this.lSI)
      localdoC.a(paramazp, paramShort1, paramShort2);
  }

  public int a(eu parameu, short paramShort1, short paramShort2)
  {
    int i = 0;
    for (doC localdoC : this.lSI) {
      i += localdoC.a(parameu, paramShort1, paramShort2);
    }
    return i;
  }
}