public class dVI extends cDG
{
  public dVI()
  {
    a(cUE.kHq);
    setEndIndex(1);
  }

  public int aOb()
  {
    return 1;
  }

  public void c(ddB paramddB)
  {
    super.c(paramddB);
  }

  public cKf dvv()
  {
    return (cKf)this.ixc;
  }

  public dDq getPixmap()
  {
    if (this.ixc != null) {
      return dvv().getPixmap();
    }
    return null;
  }

  public int getImageHeight()
  {
    return dvv().getHeight();
  }

  public int getHeight()
  {
    return Math.max(super.getHeight(), dvv().getHeight());
  }

  public int getWidth()
  {
    return Math.max(super.getWidth(), dvv().getWidth());
  }

  public int a(P paramP, int paramInt)
  {
    return 0;
  }

  public int b(P paramP, int paramInt)
  {
    return 0;
  }

  public int c(P paramP, int paramInt)
  {
    return getWidth();
  }
}