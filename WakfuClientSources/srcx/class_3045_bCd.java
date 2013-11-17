import java.util.ArrayList;

public abstract class bCd
  implements aWg
{
  private int aw;
  private String m_name;
  private ArrayList eVC = new ArrayList();
  protected ArrayList aND = new ArrayList();
  protected bCd gwn;
  private float cLN = -1.0F;
  private float cLM = -1.0F;

  public boolean isValid()
  {
    for (int i = this.eVC.size() - 1; i >= 0; i--) {
      if (!((XF)this.eVC.get(i)).isValid()) {
        return false;
      }
    }

    return true;
  }

  public void a(XF paramXF) {
    this.eVC.add(paramXF);
  }

  public void a(aWg paramaWg) {
    this.aND.add(paramaWg);
    paramaWg.b(this);
  }

  public ArrayList bKO() {
    return this.aND;
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public bCd bma() {
    return this.gwn;
  }

  public void b(bCd parambCd) {
    this.gwn = parambCd;
  }

  public czg bKP() {
    czg localczg = new czg();
    a(localczg);
    return localczg;
  }

  protected void a(czg paramczg) {
    paramczg.aw = this.aw;
    paramczg.eVC.addAll(this.eVC);

    paramczg.m_name = this.m_name;
  }

  protected void a(bCd parambCd) {
    parambCd.aw = this.aw;
    parambCd.m_name = this.m_name;

    parambCd.gwn = this.gwn;

    parambCd.cLN = this.cLN;
    parambCd.cLM = this.cLM;
  }

  public float alh()
  {
    if (this.cLN != -1.0F)
      return this.cLN;
    if (this.gwn != null) {
      return this.gwn.alh();
    }
    return 1.0F;
  }

  public void ae(float paramFloat)
  {
    this.cLN = paramFloat;
  }

  public float alj() {
    if (this.cLM != -1.0F)
      return this.cLM;
    if (this.gwn != null) {
      return this.gwn.alj();
    }
    return -1.0F;
  }

  public void ag(float paramFloat)
  {
    this.cLM = paramFloat;
  }

  protected boolean bKQ() {
    if (this.gwn != null) {
      return this.gwn.bKQ();
    }
    return false;
  }
}