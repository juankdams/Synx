import org.apache.log4j.Logger;

public abstract class eQ
{
  private static final Logger K = Logger.getLogger(eQ.class);
  protected bOL aAZ;

  public void a(bOL parambOL)
  {
    this.aAZ = parambOL;
  }

  public bBn a(cxg paramcxg) {
    if (this.aAZ == null) {
      throw new IllegalStateException("m_metaGemsList est null, le GemsDefinitionManager n'a pas été initialisé.");
    }

    bUp localbUp = lX();
    if (localbUp == null) {
      K.warn("[GemsDefinitionManager] La liste de méta-gemmes est vide !");
      return null;
    }

    byte b = dDw.f(paramcxg);

    return b(localbUp.ok(), b);
  }

  public bBn a(int paramInt, byte paramByte) {
    return b(paramInt, paramByte);
  }

  protected abstract bBn b(int paramInt, byte paramByte);

  private bUp lX() {
    double d1 = bCO.bLl();

    double d2 = 0.0D;
    int i = 0; for (int j = this.aAZ.size(); i < j; i++) {
      bUp localbUp = this.aAZ.lL(i);
      d2 += localbUp.DT();
      if (d1 < d2) {
        return localbUp;
      }
    }

    return null;
  }
}