import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ou
{
  private String cfC;
  private String cfD = null;
  private int aKT;
  private ArrayList cfE = new ArrayList();
  private static final ArrayList cfF = new ArrayList();
  private static final Ou cfG = new Ou();

  public static final Ou aaC()
  {
    return cfG;
  }

  public void cU(String paramString) {
    this.cfC = paramString;
    this.cfD = null;
    aaD();
    aaE();
    this.aKT = 0;
  }

  private void aaD() {
    cfF.clear();
    CA.Lv().f(new dJL(this));

    Fs localFs = byv.bFN().bFO().bHj().Ta();
    if (localFs != null)
      for (localObject1 = localFs.dbH().aBa(); ((cHu)localObject1).hasNext(); ) {
        ((cHu)localObject1).fl();
        localObject2 = ((aay)((cHu)localObject1).value()).getName();
        if (!cfF.contains(localObject2))
          cfF.add(localObject2);
      }
    Object localObject2;
    for (Object localObject1 = dmY.cUs().cUu().iterator(); ((Iterator)localObject1).hasNext(); ) {
      localObject2 = (dbV)((Iterator)localObject1).next();
      if (((dbV)localObject2).aJl()) {
        String str = ((dbV)localObject2).aJm();
        if (!cfF.contains(str))
          cfF.add(str);
      }
    }
  }

  private void aaE()
  {
    this.cfE.clear();
    for (String str : cfF) {
      if ((str.toLowerCase().startsWith(this.cfC.toLowerCase())) && (!this.cfE.contains(str))) {
        this.cfE.add(str);
      }
    }
    Collections.sort(this.cfE);

    if (!this.cfE.contains(this.cfC))
      this.cfE.add(this.cfC);
  }

  public String aaF()
  {
    if (this.cfE.size() == 0) {
      this.cfD = "";
    } else {
      this.cfD = ((String)this.cfE.get(this.aKT));
      this.aKT = ((this.aKT + 1) % this.cfE.size());
    }
    return this.cfD;
  }

  public String aaG() {
    return this.cfC;
  }

  public void cV(String paramString) {
    this.cfC = paramString;
  }

  public boolean cW(String paramString) {
    return (paramString != null) && ((paramString.equalsIgnoreCase(this.cfC.toLowerCase())) || (paramString.equals(this.cfD)));
  }
}