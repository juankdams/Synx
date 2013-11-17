public abstract class ig
{
  protected final dQx aHF;
  private final dnt aHG;
  private dsd aHH;
  private dsd aHI;
  private bFr aHJ;

  ig(dnt paramdnt, dQx paramdQx)
  {
    this.aHG = paramdnt;
    this.aHF = paramdQx;
  }

  public dQx pR() {
    return new dQx(this.aHF);
  }

  public dnt pS() {
    return this.aHG;
  }

  public dsd pT() {
    return this.aHH;
  }

  public dsd pU() {
    return this.aHI;
  }

  public bFr pV()
  {
    return this.aHJ;
  }

  void a(bFr parambFr) {
    this.aHJ = parambFr;
  }

  void a(dsd paramdsd) {
    this.aHH = paramdsd;
  }

  void b(dsd paramdsd) {
    this.aHI = paramdsd;
  }
}