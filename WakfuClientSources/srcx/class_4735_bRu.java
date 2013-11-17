import org.apache.log4j.Logger;

public class bRu
{
  protected static final Logger K = Logger.getLogger(bRu.class);

  private static final bRu hbe = new bRu();
  private final cSR hbf;

  public bRu()
  {
    this.hbf = new cSR();
  }

  public void a(ciJ paramciJ) {
    int i = paramciJ.nn();
    if (!this.hbf.containsKey(i))
      this.hbf.put(i, paramciJ);
    else
      K.warn("tentative de surchage de la définition d'une famille dans le MonsterFamilyManager");
  }

  public ciJ tP(int paramInt)
  {
    return (ciJ)this.hbf.get(paramInt);
  }

  public dmn yF() {
    return this.hbf.yF();
  }

  public ciJ b(ciJ paramciJ) {
    return a(paramciJ, cZR.kNG);
  }

  public ciJ c(ciJ paramciJ) {
    return a(paramciJ, cZR.kNH);
  }

  public ciJ d(ciJ paramciJ) {
    return a(paramciJ, cZR.kNI);
  }

  private ciJ a(ciJ paramciJ, cZR paramcZR) {
    dmn localdmn = this.hbf.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ciJ localciJ = (ciJ)localdmn.value();
      if ((localciJ.ckB() == paramciJ.nn()) && (localciJ.ckC() == paramcZR)) {
        return localciJ;
      }
    }

    return null;
  }

  public static bRu bYI() {
    return hbe;
  }
}