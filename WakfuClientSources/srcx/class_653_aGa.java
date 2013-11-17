public class aGa
  implements Comparable
{
  private final int ia;
  private final int ib;

  public aGa(int paramInt1, int paramInt2)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    aGa localaGa = (aGa)paramObject;

    if (this.ib != localaGa.ib)
      return false;
    if (this.ia != localaGa.ia) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int i = this.ia;
    i = 31 * i + this.ib;
    return i;
  }

  public String toString() {
    StringBuffer localStringBuffer = new StringBuffer();
    return this.ia + "x" + this.ib;
  }

  public int a(aGa paramaGa) {
    return this.ia * this.ib - paramaGa.ia * paramaGa.ib;
  }
}