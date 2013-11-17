public final class bul
{
  public final int fbr;
  public final int gdJ;

  public bul(int paramInt1, int paramInt2)
  {
    this.fbr = paramInt1;
    this.gdJ = paramInt2;
  }

  public int hashCode()
  {
    return 31 * this.fbr + this.gdJ;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bul))
      return false;
    bul localbul = (bul)paramObject;
    return (this.fbr == localbul.fbr) && (this.gdJ == localbul.gdJ);
  }
}