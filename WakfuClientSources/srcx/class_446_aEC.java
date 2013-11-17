class aEC
  implements bDI
{
  private static final int eas = 50;
  private static final long eat = 500L;
  private long bYL;

  aEC(bbp parambbp)
  {
  }

  public void a(dQZ paramdQZ, int paramInt1, int paramInt2, dOc paramdOc)
  {
    if (this.bai.meE == null)
      return;
    bbp.a(this.bai, false);
    int i;
    float f;
    if (bbp.b(this.bai)) {
      if ((paramInt1 < this.bai.getDisplayX()) && (paramInt1 > this.bai.getDisplayX() - 50)) {
        i = Math.abs(this.bai.getDisplayX() - paramInt1);
        f = i / bbp.c(this.bai).getWidth();
        bbp.b(this.bai, -f);
        aRr();
      } else if ((paramInt1 > this.bai.getDisplayX() + this.bai.getWidth()) && (paramInt1 < this.bai.getDisplayX() + this.bai.getWidth() + 50)) {
        i = Math.abs(this.bai.getDisplayX() + this.bai.getWidth() - paramInt1);
        f = i / bbp.c(this.bai).getWidth();
        bbp.b(this.bai, f);
        aRr();
      }
    }
    if (bbp.d(this.bai)) {
      if ((paramInt2 < this.bai.getDisplayY()) && (paramInt2 > this.bai.getDisplayY() - 50)) {
        i = Math.abs(this.bai.getDisplayY() - paramInt2);
        f = i / bbp.c(this.bai).getHeight();
        bbp.c(this.bai, -f);
        aRr();
      } else if ((paramInt2 > this.bai.getDisplayY() + this.bai.getHeight()) && (paramInt2 < this.bai.getDisplayY() + this.bai.getHeight() + 50)) {
        i = Math.abs(this.bai.getDisplayY() + this.bai.getHeight() - paramInt2);
        f = i / bbp.c(this.bai).getHeight();
        bbp.c(this.bai, f);
        aRr();
      }
    }
    if (bbp.e(this.bai))
      this.bai.setNeedsToPreProcess();
  }

  private void aRr() {
    if (this.bYL == 0L)
      this.bYL = System.currentTimeMillis();
    if (this.bYL + 500L < System.currentTimeMillis())
      bbp.a(this.bai, true);
  }

  public void b(dQZ paramdQZ, int paramInt1, int paramInt2, dOc paramdOc) {
    bbp.c(this.bai, 0.0F);
    bbp.b(this.bai, 0.0F);
    bbp.a(this.bai, false);
    this.bai.setNeedsToPreProcess();
    this.bYL = 0L;
  }

  public boolean am(Object paramObject) {
    return (bbp.f(this.bai) == null) || (bbp.f(this.bai).validate(paramObject));
  }
}