abstract class Lc
{
  protected final int aVF;

  protected Lc(int paramInt)
  {
    this.aVF = paramInt;
  }

  protected int wx() {
    return this.aVF;
  }

  protected abstract cWT Vz();

  protected cWT VA() {
    cWT localcWT = Vz();
    localcWT.d(this.aVF);
    return localcWT;
  }
}