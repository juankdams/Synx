import java.util.ArrayList;

public class aRP
{
  public static final aRP eOQ = new aRP();

  private final ArrayList eOR = new ArrayList();
  private final ArrayList eOS = new ArrayList();

  public void a(auW paramauW) {
    this.eOR.add(paramauW);
  }

  public void b(auW paramauW) {
    this.eOS.add(paramauW);
  }

  public bzE hd(String paramString) {
    if (paramString == null) {
      return bzE.gnP;
    }
    int i = 0; for (int j = this.eOR.size(); i < j; i++) {
      bzE localbzE = ((auW)this.eOR.get(i)).fL(paramString);
      if (localbzE != bzE.gnR) {
        return localbzE;
      }
    }
    return bzE.gnR;
  }

  public bzE he(String paramString) {
    if (paramString == null) {
      return bzE.gnP;
    }
    int i = 0; for (int j = this.eOS.size(); i < j; i++) {
      bzE localbzE = ((auW)this.eOS.get(i)).fL(paramString);
      if (localbzE != bzE.gnR) {
        return localbzE;
      }
    }
    return bzE.gnR;
  }
}