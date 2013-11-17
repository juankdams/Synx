import java.util.ArrayList;

public class Kl
{
  private final String m_name;
  private final ArrayList bWD = new ArrayList();

  public Kl(String paramString) {
    this.m_name = paramString;
  }

  public void a(String paramString1, String paramString2, int paramInt) {
    cFL localcFL = new cFL();
    localcFL.e(paramString1);
    localcFL.setPath(paramString2);
    localcFL.xI(paramInt);

    this.bWD.add(localcFL);
  }

  public String getPath() {
    cFL localcFL = UP();
    return localcFL == null ? null : localcFL.getPath();
  }

  private cFL UP() {
    cFI localcFI = cHO.cCa().ajJ();
    int i = 0; for (int j = this.bWD.size(); i < j; i++) {
      cFL localcFL = (cFL)this.bWD.get(i);
      if (localcFL.e(localcFI)) {
        return localcFL;
      }
    }
    return null;
  }

  public int UQ() {
    cFL localcFL = UP();
    return (localcFL == null ? null : Integer.valueOf(localcFL.UQ())).intValue();
  }

  public String getName() {
    return this.m_name;
  }

  public boolean isEmpty() {
    return this.bWD.isEmpty();
  }
}