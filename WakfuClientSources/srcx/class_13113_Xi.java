public class Xi
{
  private cuU cHr;
  private byte cHs;

  Xi()
  {
  }

  public Xi(cuU paramcuU)
  {
    this.cHr = paramcuU;
  }

  public cuU ajm() {
    return this.cHr;
  }

  public boolean a(Ka paramKa) {
    return (this.cHs & paramKa.bWp) == paramKa.bWp;
  }

  public void b(Ka paramKa) {
    this.cHs = ((byte)(this.cHs | paramKa.bWp));
  }

  public void c(Ka paramKa) {
    this.cHs = ((byte)(this.cHs & (paramKa.bWp ^ 0xFFFFFFFF)));
  }

  public void a(CV paramCV) {
    paramCV.bHj = this.cHr.bUy;
    paramCV.bHk = this.cHs;
  }

  public void b(CV paramCV) {
    this.cHr = cuU.dY(paramCV.bHj);
    this.cHs = paramCV.bHk;
  }
}