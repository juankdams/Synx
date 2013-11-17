public class dCI
  implements aBt
{
  public static final int lKX = 988;
  public static final int lKY = 995;
  public static final String lKZ = "xelorTickTackImage";
  public static final String lLa = "xelorTick";
  public static final String lLb = "xelorTack";
  private final bKm aBR;
  private czv fyP;

  public dCI(bKm parambKm)
  {
    this.aBR = parambKm;

    cpa localcpa = cBQ.cxL().coO().nf("worldAndFightBarDialog");
    if (localcpa == null) {
      return;
    }
    this.fyP = ((czv)localcpa.fi("xelorTickTackImage"));
  }

  public void a(bXL parambXL) {
    if (parambXL.getId() == 1000) {
      doA localdoA = ((cpl)parambXL).coV();
      if (localdoA.getId() != bsj.fSj.getId())
        return;
      if (localdoA.bkf() != this.aBR) {
        return;
      }
      bJC localbJC = ((bPD)localdoA).bWk();
      if (localbJC.bQW() == 988)
        this.fyP.setStyle("xelorTick");
      else if (localbJC.bQW() == 995)
        this.fyP.setStyle("xelorTack");
    }
  }

  public void a(cjK paramcjK)
  {
  }

  public void b(cjK paramcjK) {
  }

  public void clear() {
    cfA.hAC.a(this.aBR);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EcaflipFightListener");
    localStringBuilder.append("{m_character=").append(this.aBR);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}