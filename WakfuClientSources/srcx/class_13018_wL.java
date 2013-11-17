public abstract class wL
{
  public static final int bov = 200;
  private long bow = 200L;
  private long box = 0L;
  private bOK boy;

  public bOK FO()
  {
    return ak(false);
  }

  public bOK ak(boolean paramBoolean)
  {
    if (this.boy == null) {
      this.boy = FP();
    }

    if ((paramBoolean) || ((this.box != 0L) && (System.currentTimeMillis() - this.box > this.bow))) {
      a(this.boy);
    }

    if (this.box == 0L) {
      this.box = System.currentTimeMillis();
    }

    return this.boy;
  }

  public void done()
  {
    this.box = 0L;
    if (this.boy != null) {
      this.boy.done();
      this.boy.dt("");
      this.boy.du("");
      b(this.boy);
    }
  }

  public void aO(long paramLong)
  {
    this.bow = paramLong;
  }

  protected abstract bOK FP();

  protected abstract void a(bOK parambOK);

  protected abstract void b(bOK parambOK);

  public long FQ()
  {
    return this.box;
  }
}