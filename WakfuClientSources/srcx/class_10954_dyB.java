import java.util.ArrayList;

public class dyB extends bCd
{
  public void dk(long paramLong)
  {
  }

  public void stop(long paramLong)
  {
  }

  public arK aEe()
  {
    if (!isValid()) {
      return null;
    }

    for (int i = this.aND.size() - 1; i >= 0; i--) {
      arK localarK = ((aWg)this.aND.get(i)).aEe();
      if (localarK != null) {
        return localarK;
      }
    }

    return null;
  }

  public void v(ArrayList paramArrayList)
  {
    if (!isValid()) {
      return;
    }

    for (int i = this.aND.size() - 1; i >= 0; i--)
      ((aWg)this.aND.get(i)).v(paramArrayList);
  }

  public void a(ArrayList paramArrayList, rP paramrP)
  {
    if (!isValid()) {
      return;
    }

    for (int i = this.aND.size() - 1; i >= 0; i--)
      ((aWg)this.aND.get(i)).a(paramArrayList, paramrP);
  }

  public void a(ArrayList paramArrayList, wK paramwK)
  {
    if (!isValid()) {
      return;
    }

    for (int i = this.aND.size() - 1; i >= 0; i--)
      ((aWg)this.aND.get(i)).a(paramArrayList, paramwK);
  }

  protected void a(czg paramczg)
  {
    super.a(paramczg);

    paramczg.inV = true;

    int i = 0; for (int j = this.aND.size(); i < j; i++)
      paramczg.inY.add(((aWg)this.aND.get(i)).getId());
  }

  public void z(dGy paramdGy)
  {
    for (int i = this.aND.size() - 1; i >= 0; i--)
      ((aWg)this.aND.get(i)).z(paramdGy);
  }
}