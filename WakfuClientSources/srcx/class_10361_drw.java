import org.apache.log4j.Logger;

public abstract class drw
{
  protected static final Logger K = Logger.getLogger(drw.class);
  protected final bhX ltX;
  protected rz ltY;
  protected final dsl QW = new dsl();

  protected drw(bhX parambhX)
  {
    this.ltX = parambhX;
  }

  public int bDx()
  {
    return this.QW.bDx();
  }

  public boolean Bj(int paramInt) {
    return (Bl(paramInt)) && (this.QW.Bj(paramInt));
  }

  public boolean Bk(int paramInt) {
    return (Bm(paramInt)) && (this.QW.BD(paramInt));
  }

  public void a(rz paramrz)
  {
    if (this.ltY != null)
      throw new UnsupportedOperationException("Listener already SET");
    this.ltY = paramrz;
    this.QW.a(paramrz);
  }

  public void cYn() {
    this.ltY = null;
    this.QW.a(null);
  }

  public boolean Bl(int paramInt)
  {
    return this.ltX.a(this.QW, paramInt);
  }

  public boolean Bm(int paramInt)
  {
    return this.ltX.b(this.QW, paramInt);
  }

  public void clear()
  {
    this.QW.BC(0);
  }

  public abstract boolean isFull();
}