import java.util.List;

public class bAu extends aSt
{
  private dso gpp = null;

  public void a(String paramString, cpa paramcpa, dso paramdso)
  {
    this.gpp = paramdso;
    a(paramString, paramcpa);
  }

  protected void a(String[] paramArrayOfString, List paramList1, List paramList2)
  {
    paramList1.add(dso.class);
    paramList2.add(this.gpp);
    super.a(paramArrayOfString, paramList1, paramList2);
  }

  public void a(bAu parambAu) {
    parambAu.a(this.brS, this.cUY, this.gpp);
  }

  public bAu bII() {
    bAu localbAu = new bAu();
    a(localbAu);
    return localbAu;
  }
}