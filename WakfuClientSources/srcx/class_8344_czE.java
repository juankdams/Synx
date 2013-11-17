import org.apache.log4j.Logger;

public abstract class czE
{
  protected static czE ioG = null;

  protected static final Logger K = Logger.getLogger(czE.class);
  protected final cSR ioH = new cSR();

  protected final aoL ioI = new aoL();

  public static czE cwt()
  {
    if (ioG == null)
      throw new IllegalStateException("m_instance == null : pas d'instance de SpellManager concret");
    return ioG;
  }

  public void c(bzj parambzj) {
    this.ioH.put(parambzj.getId(), parambzj);
  }

  protected cSR cwu() {
    return this.ioH;
  }

  public bzj eb(int paramInt)
  {
    return (bzj)this.ioH.get(paramInt);
  }

  public boolean isEmpty() {
    return this.ioH.isEmpty();
  }

  public abstract bfE h(int paramInt, short paramShort);
}