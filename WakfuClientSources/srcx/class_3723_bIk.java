public class bIk
  implements EJ
{
  private int gHy = 0;
  private CharSequence gHz = null;

  public bIk(CharSequence paramCharSequence)
  {
    this.gHz = paramCharSequence;
  }

  public int NE()
  {
    return this.gHy;
  }

  public char NG()
  {
    if (this.gHy < this.gHz.length())
    {
      return this.gHz.charAt(this.gHy++);
    }
    return 65535;
  }

  public char NH() {
    if (this.gHy < this.gHz.length())
    {
      return this.gHz.charAt(this.gHy);
    }
    return '\000';
  }

  public String Y(int paramInt1, int paramInt2) {
    if ((paramInt1 >= 0) && (paramInt1 <= this.gHz.length()) && (paramInt2 >= 1) && (paramInt2 <= this.gHz.length()) && (paramInt1 < paramInt2))
    {
      return this.gHz.subSequence(paramInt1, paramInt2).toString();
    }
    return null;
  }

  public boolean NF()
  {
    if (this.gHy < this.gHz.length()) {
      return true;
    }
    return false;
  }

  public void eI(int paramInt)
  {
    this.gHy = paramInt;
  }

  public dKh NI()
  {
    return null;
  }

  public int size() {
    return this.gHz.length();
  }

  public boolean eJ(int paramInt) {
    if ((this.gHy + paramInt >= 0) && (this.gHy + paramInt < this.gHz.length()))
    {
      this.gHy += paramInt;
      return true;
    }
    return false;
  }

  public char getChar(int paramInt) {
    return this.gHz.charAt(paramInt);
  }
}