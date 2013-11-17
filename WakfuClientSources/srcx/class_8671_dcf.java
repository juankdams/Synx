import java.util.ArrayList;

final class dcf extends Mo
{
  private final cVI kUN;

  private dcf(byz parambyz, cVI paramcVI)
  {
    this.kUN = paramcVI;
    this.kUN.ao().a(this);
  }

  public void aS()
  {
  }

  public void aT() {
    int i = this.kUN.kIp.size();
    short[] arrayOfShort = new short[i];
    for (int j = 0; j < i; j++) {
      arrayOfShort[j] = ((wq)this.kUN.kIp.get(j)).bmn;
    }

    this.iZ.m(arrayOfShort);
  }
}