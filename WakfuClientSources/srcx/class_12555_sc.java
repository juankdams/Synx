import org.apache.log4j.Logger;

public class sc extends Gz
{
  private static final Logger K = Logger.getLogger(sc.class);
  private final Gz bak;

  public sc(bNi parambNi, Gz paramGz)
  {
    super(parambNi);
    this.bak = paramGz;
  }

  public Gz yD() {
    return this.bak;
  }

  public boolean a(Gz paramGz) {
    if (this == paramGz)
      return true;
    if ((paramGz == null) || (getClass() != paramGz.getClass())) {
      return false;
    }
    sc localsc = (sc)paramGz;
    return this.bOP.equals(localsc.bOP);
  }

  public String toString() {
    return "BuildingDependency{m_item=" + this.bOP + ", m_constructionError=" + this.bak + '}';
  }

  public final cLT yE()
  {
    return cLT.iLD;
  }
}