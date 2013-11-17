import java.util.ArrayList;

public final class bXs
{
  private final int aw;
  private final bXs hml;
  private final String m_name;
  private ArrayList bFw;
  private ArrayList hmm;

  bXs(int paramInt, bXs parambXs, String paramString)
  {
    this.aw = paramInt;
    this.m_name = (paramString != null ? paramString.intern() : null);
    this.hml = parambXs;
  }

  public int getId() {
    return this.aw;
  }

  public String getName() {
    return this.m_name;
  }

  public bXs ccH() {
    return this.hml;
  }

  public ArrayList getChildren() {
    return this.bFw;
  }

  public ArrayList ccI() {
    return this.hmm;
  }

  void a(bXs parambXs) {
    if (this.bFw == null)
      this.bFw = new ArrayList();
    if (!this.bFw.contains(parambXs))
      this.bFw.add(parambXs);
  }

  void b(dEE paramdEE) {
    if (this.hmm == null)
      this.hmm = new ArrayList();
    if (!this.hmm.contains(paramdEE))
      this.hmm.add(paramdEE);
  }

  public boolean um(int paramInt) {
    if (paramInt == this.aw)
      return true;
    return (this.hml != null) && (this.hml.um(paramInt));
  }
}