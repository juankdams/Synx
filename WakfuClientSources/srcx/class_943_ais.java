import org.apache.log4j.Logger;

public abstract class ais
{
  protected static Logger K = Logger.getLogger(ais.class);
  protected static final float des = 0.05F;
  protected static final float det = 0.05F;
  protected final aid deu;
  protected final adz dev;
  protected final adz dew;

  protected ais(aid paramaid)
  {
    this.deu = paramaid;

    this.dev = new adz();
    this.dew = new adz();
  }

  public boolean iA(int paramInt)
  {
    return this.dev.contains(paramInt);
  }

  public boolean iB(int paramInt)
  {
    return this.dew.contains(paramInt);
  }

  public boolean iC(int paramInt)
  {
    this.dev.hL(paramInt);
    return true;
  }

  public boolean iD(int paramInt)
  {
    this.dew.hL(paramInt);
    return true;
  }

  public boolean iE(int paramInt)
  {
    this.dev.remove(paramInt);
    return true;
  }

  public boolean iF(int paramInt)
  {
    this.dew.remove(paramInt);
    return true;
  }

  public abstract boolean iG(int paramInt);

  public abstract boolean iH(int paramInt);

  public abstract boolean a(dhJ paramdhJ, int paramInt);

  public abstract boolean b(dhJ paramdhJ, int paramInt);

  public adz avl()
  {
    return this.dev;
  }

  public adz avm()
  {
    return this.dew;
  }
}