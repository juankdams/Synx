import java.util.ArrayList;

public class bwZ
  implements bJs
{
  private CC ghy;
  private ArrayList ffN;

  public CC bEx()
  {
    return this.ghy;
  }

  public void b(CC paramCC) {
    this.ghy = paramCC;
  }

  public K jh(String paramString)
  {
    if (this.ghy != null) {
      return this.ghy.b(paramString);
    }
    return null;
  }

  public ArrayList ji(String paramString)
  {
    if (this.ghy != null) {
      return this.ghy.c(paramString);
    }
    return null;
  }

  public void a(bMJ parambMJ)
  {
    if (this.ffN == null) {
      this.ffN = new ArrayList();
    }
    if (!this.ffN.contains(parambMJ))
      this.ffN.add(parambMJ);
  }

  public void bEy()
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).e(this);
  }

  public void bEz()
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).f(this);
  }

  public void jj(String paramString)
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).b(this, paramString);
  }

  public void bEA()
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).g(this);
  }

  public void bEB()
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).h(this);
  }

  public void jk(String paramString)
  {
    if (this.ffN == null) {
      return;
    }
    int i = 0; for (int j = this.ffN.size(); i < j; i++)
      ((bMJ)this.ffN.get(i)).c(this, paramString);
  }
}