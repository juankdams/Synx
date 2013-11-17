package Effects;
public abstract class doX extends bGb //class_10042_doX
{
  protected transient byte[] lpp;
  protected static final byte lpq = 0;
  protected static final byte lpr = 1;
  protected static final byte lps = 2;

  public doX()
  {
  }

  public doX(int paramInt)
  {
    this(paramInt, 0.5F);
  }

  public doX(int paramInt, float paramFloat)
  {
    this.gCc = paramFloat;
    aO(asd.aB(paramInt / paramFloat));
  }

  public Object clone() {
    doX localdoX = (doX)super.clone();
    localdoX.lpp = ((byte[])this.lpp.clone());
    return localdoX;
  }

  protected int capacity()
  {
    return this.lpp.length;
  }

  protected void aQ(int paramInt)
  {
    this.lpp[paramInt] = 2;
    super.aQ(paramInt);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.lpp = new byte[i];
    return i;
  }
}