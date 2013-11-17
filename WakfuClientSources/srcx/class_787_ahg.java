import org.apache.log4j.Logger;

public abstract class ahg
  implements bBz, dsj, eo
{
  protected static final Logger K = Logger.getLogger(ahg.class);
  protected bKq dbw;
  protected aee aOr;
  protected int dbx;
  protected long dby;
  protected int dbz;

  public bKq asL()
  {
    return this.dbw;
  }

  protected void a(int paramInt1, long paramLong, int paramInt2) {
    this.dbx = paramInt1;
    this.dby = paramLong;
    this.dbz = paramInt2;
  }

  public void release()
  {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("Exception dans le release de " + getClass().toString() + ". Normalement impossible");
      }
      this.aOr = null;
    } else {
      bc();
    }
  }

  public long oj()
  {
    return this.dby;
  }

  public int ok()
  {
    return this.dbx;
  }

  public int asM()
  {
    return this.dbz;
  }

  public void ic(int paramInt)
  {
    this.dbz = paramInt;
  }

  public void a(bKq parambKq, long paramLong, int paramInt1, int paramInt2)
  {
    this.dbw = parambKq;
    if (parambKq != bKq.gNf)
      this.dby = paramLong;
    else {
      this.dby = paramInt1;
    }
    this.dbx = paramInt1;
    this.dbz = paramInt2;
  }

  public boolean b(dlK paramdlK)
  {
    paramdlK.type = this.dbw.bJ();
    paramdlK.lji = this.dby;
    paramdlK.ljj = this.dbx;
    paramdlK.ljk = this.dbz;
    return true;
  }

  public boolean c(dlK paramdlK)
  {
    this.dbw = bKq.ds(paramdlK.type);
    this.dby = paramdlK.lji;
    this.dbx = paramdlK.ljj;
    this.dbz = paramdlK.ljk;
    return this.dbw != null;
  }

  public short nP() {
    return 1;
  }

  public void l(short paramShort) {
  }

  public void a(short paramShort) {
  }

  public boolean b(dsj paramdsj) {
    return false;
  }

  public short nR() {
    return 1;
  }

  public void aJ()
  {
    this.dbx = 0;
    this.dby = 0L;
    this.dbz = 0;
  }

  public void bc()
  {
    this.dbw = null;
  }

  public boolean og() {
    return true;
  }
}