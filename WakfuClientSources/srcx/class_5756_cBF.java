public class cBF
{
  public static final cBF isG = new cBF();

  private final cSR isH = new cSR();
  private final cSR isI = new cSR();
  private adz isJ;

  public void a(dlp paramdlp, int paramInt)
  {
    this.isH.put(paramdlp.getId(), paramdlp);
    if ((!bB) && (this.isI.contains(paramInt))) throw new AssertionError();
    this.isI.put(paramInt, paramdlp);
    this.isJ = null;
  }

  public dlp xm(int paramInt) {
    return (dlp)this.isH.get(paramInt);
  }

  public dlp xn(int paramInt) {
    return (dlp)this.isI.get(paramInt);
  }

  public String toString()
  {
    return "PetDefinitionManager{m_petDefinitions=" + this.isH.size() + '}';
  }

  public boolean xo(int paramInt)
  {
    if (this.isJ == null)
      this.isJ = cxG();
    return this.isJ.contains(paramInt);
  }

  private adz cxG() {
    adz localadz = new adz();
    this.isH.s(new bu(this, localadz));

    return localadz;
  }
}