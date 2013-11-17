import java.util.Iterator;
import java.util.NoSuchElementException;

public class Po
  implements Iterator
{
  private final Iterator chl;
  private boolean chm = false;
  private dle chn;
  private boolean cho;

  public Po(aPH paramaPH)
  {
    this.chl = aPH.b(paramaPH);
  }

  private boolean a(dle paramdle) {
    long l = paramdle.getId();

    dhJ localdhJ = this.chp.eMF.a(new cGB[] { cGB.iw(l), cGB.c(new cGB[] { cGB.cBA(), cGB.cBC() }) });
    if (localdhJ != null) {
      return true;
    }
    if ((this.chp.eMI != null) && (this.chp.eMI.ed(l)))
      return true;
    return this.chp.ex(l);
  }

  private boolean abl()
  {
    this.chm = abm();
    return this.chm;
  }

  private boolean abm() {
    if (!this.chl.hasNext()) {
      return false;
    }
    dle localdle = (dle)this.chl.next();
    if (a(localdle)) {
      this.chn = localdle;
      return true;
    }
    return abm();
  }

  private dle abn()
  {
    if (!this.chm)
      throw new NoSuchElementException();
    return this.chn;
  }

  public boolean hasNext()
  {
    if (this.cho)
      return this.chm;
    this.cho = true;
    return abl();
  }

  public dle abo() {
    if (!this.cho)
      abl();
    this.cho = false;
    return abn();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}