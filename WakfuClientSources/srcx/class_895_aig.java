import java.util.HashMap;

public class aig
{
  public static final aig dej = new aig();

  private final HashMap dek = new HashMap();

  public void ev(String paramString)
  {
    this.dek.put(paramString, new cdT(paramString));
  }

  public void ew(String paramString) {
    this.dek.remove(paramString);
  }

  public void a(String paramString, dOc paramdOc) {
    cdT localcdT = (cdT)this.dek.get(paramString);
    if (localcdT != null)
      localcdT.i(paramdOc);
  }

  public void b(String paramString, dOc paramdOc)
  {
    cdT localcdT = (cdT)this.dek.get(paramString);
    if (localcdT != null)
      localcdT.j(paramdOc);
  }

  public void o(String paramString, boolean paramBoolean)
  {
    cdT localcdT = (cdT)this.dek.get(paramString);
    if (localcdT != null)
      localcdT.setEnabled(paramBoolean);
  }
}