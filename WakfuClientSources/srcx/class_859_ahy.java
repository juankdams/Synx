import java.util.Iterator;

public class ahy
{
  private final cnv bdm;
  private final cOE ddj;

  public cnv auo()
  {
    return this.bdm;
  }

  public ahy(cOE paramcOE, cnv paramcnv)
  {
    if ((paramcOE == null) || (paramcnv == null))
      throw new IllegalArgumentException("aucun argument du constructeur de " + getClass().getSimpleName() + " ne doit être null");
    this.ddj = paramcOE;
    this.bdm = paramcnv;
  }

  public cjK cM(long paramLong)
  {
    aJD localaJD = this.ddj.LC();
    return localaJD == null ? null : localaJD.eb(paramLong);
  }

  public aVc cN(long paramLong) {
    if (this.ddj.LD() == null) {
      return null;
    }

    Iterator localIterator = this.ddj.LE().Lz();
    while (localIterator.hasNext()) {
      dle localdle = (dle)localIterator.next();
      if (localdle.atO() != null)
      {
        aVc localaVc = localdle.atO().kw(paramLong);
        if (localaVc != null)
          return localaVc;
      }
    }
    return null;
  }
}