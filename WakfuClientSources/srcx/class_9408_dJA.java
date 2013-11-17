import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dJA
{
  protected static final Logger K = Logger.getLogger(dJA.class);
  private static final dJA lVi = new dJA();
  private final cSR bel = new cSR();

  public static dJA diT()
  {
    return lVi;
  }

  public void a(int paramInt, duF paramduF) {
    Object localObject = (List)this.bel.get(paramInt);
    if (localObject == null) {
      localObject = new ArrayList();
      this.bel.put(paramInt, localObject);
    }
    ((List)localObject).add(paramduF);
  }

  public List CK(int paramInt)
  {
    return (List)this.bel.get(paramInt);
  }
}