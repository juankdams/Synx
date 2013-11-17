import java.util.ArrayList;

public class cKX
{
  private NW iJF;
  private bpn iJG = null;
  private String iJH = null;
  private final ArrayList aBf;

  public cKX(String paramString)
  {
    this.iJH = paramString;
    this.aBf = new ArrayList();
  }

  public String cEk()
  {
    return this.iJH;
  }

  public bpn cEl()
  {
    return this.iJG;
  }

  public void h(bpn parambpn)
  {
    this.iJG = parambpn;
  }

  public NW cEm() {
    return this.iJF;
  }

  public void b(NW paramNW) {
    this.iJF = paramNW;
  }

  public int aan() {
    return this.iJF.aan();
  }

  public int getLevel() {
    return this.iJF.getLevel();
  }

  public boolean aap() {
    return this.iJF.aap();
  }

  public void cEn() {
    a(this.iJF.aaq(), null);
  }

  public void cEo()
  {
    Hm.QP().b(this);

    cBQ.cxL().g(this);

    cBQ.cxL().M(this.iJH, false);
  }

  public void a(int paramInt, String paramString)
  {
    cEo();

    for (dkT localdkT : this.aBf)
      localdkT.a(paramInt, paramString);
  }

  public void a(dkT paramdkT)
  {
    this.aBf.add(paramdkT);
  }

  public void b(dkT paramdkT)
  {
    this.aBf.remove(paramdkT);
  }
}