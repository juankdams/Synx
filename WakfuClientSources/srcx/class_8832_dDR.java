import java.util.Iterator;

public class dDR
  implements Iterable, Iterator
{
  private dNQ lMx = null;
  private dcj lMy = new dcj(65536L);

  private boolean lMz = false;
  private int lMA = 0;

  private axA lMB = null;
  private int _flags = 4;

  public dDR(String paramString) {
    this(null, paramString, 4);
  }

  public dDR(String paramString1, String paramString2, int paramInt) {
    this._flags = paramInt;
    this.lMx = aZR.fgU.R(paramString1, paramString2);
    if (this.lMx == null)
      throw new ajA(cxj.ikc.GetLastError());
  }

  private boolean read()
  {
    if ((this.lMz) || (this.lMA > 0)) {
      return false;
    }

    cjs localcjs1 = new cjs();
    cjs localcjs2 = new cjs();

    if (!aZR.fgU.a(this.lMx, 0x1 | this._flags, 0, this.lMy, (int)this.lMy.size(), localcjs1, localcjs2))
    {
      int i = cxj.ikc.GetLastError();

      if (i == 122) {
        this.lMy = new dcj(localcjs2.getValue());

        if (!aZR.fgU.a(this.lMx, 0x1 | this._flags, 0, this.lMy, (int)this.lMy.size(), localcjs1, localcjs2))
        {
          throw new ajA(cxj.ikc.GetLastError());
        }
      }
      else
      {
        close();
        if (i != 38) {
          throw new ajA(i);
        }
        return false;
      }
    }

    this.lMA = localcjs1.getValue();
    this.lMB = this.lMy;
    return true;
  }

  public void close()
  {
    this.lMz = true;
    if (this.lMx != null) {
      if (!aZR.fgU.d(this.lMx)) {
        throw new ajA(cxj.ikc.GetLastError());
      }
      this.lMx = null;
    }
  }

  public Iterator iterator()
  {
    return this;
  }

  public boolean hasNext()
  {
    read();
    return !this.lMz;
  }

  public po dfO()
  {
    read();
    po localpo = new po(this.lMB);
    this.lMA -= localpo.getLength();
    this.lMB = this.lMB.dp(localpo.getLength());
    return localpo;
  }

  public void remove()
  {
  }
}