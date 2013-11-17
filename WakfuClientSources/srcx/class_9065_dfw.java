import java.util.ArrayList;
import java.util.Iterator;

public class dfw extends cGj
{
  public static final String dQq = "currentPage";
  public static final String gdy = "tutorials";
  public static final String kZR = "hasSearch";
  public static final String kZS = "hasPreviousPage";
  public static final String kZT = "hasNextPage";
  public static final String kZU = "numPages";
  public static final String kZV = "searchResult";
  final cSR kZW = new cSR();
  private ArrayList kZX = new ArrayList();
  private String kZY;
  private int aPg = 0;

  public dfw() {
    dCw.lKQ.d(new aCQ(this));

    cPo();
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("currentPage")) {
      return this.kZW.get(this.aPg);
    }
    if (paramString.equals("tutorials")) {
      if (this.kZX.isEmpty())
        return null;
      return this.kZX;
    }
    if (paramString.equals("hasSearch")) {
      return Boolean.valueOf(cPp());
    }
    if (paramString.equals("hasPreviousPage")) {
      return Boolean.valueOf(this.aPg > 0);
    }
    if (paramString.equals("hasNextPage")) {
      return Boolean.valueOf(this.aPg < this.kZW.size() - 1);
    }
    if (paramString.equals("searchResult")) {
      return this.kZX.size() > 0 ? bU.fH().getString("resultNumber", new Object[] { Integer.valueOf(this.kZX.size()) }) : bU.fH().getString("marketBoard.noResults");
    }

    if (paramString.equals("numPages")) {
      if (cPp())
        return null;
      return this.aPg + 1 + "/" + this.kZW.size();
    }
    return null;
  }

  public void cjp() {
    if (this.aPg == 0)
      return;
    this.aPg -= 1;
    cPo();
    dLE.doY().a(this, new String[] { "hasNextPage", "hasPreviousPage", "numPages" });
  }

  public void cjq() {
    if (this.aPg == this.kZW.size() - 1)
      return;
    this.aPg += 1;
    cPo();
    dLE.doY().a(this, new String[] { "hasNextPage", "hasPreviousPage", "numPages" });
  }

  public void setSearch(String paramString) {
    this.kZY = ((paramString != null) && (paramString.length() > 0) ? paramString : null);
    cPo();
    dLE.doY().a(this, new String[] { "hasSearch", "hasNextPage", "hasPreviousPage", "numPages", "searchResult" });
  }

  private void cPo() {
    this.kZX.clear();
    Object localObject1;
    Object localObject2;
    if (cPp())
      for (localObject1 = this.kZW.yF(); ((dmn)localObject1).hasNext(); ) {
        ((dmn)localObject1).fl();
        for (localObject2 = ((dMf)((dmn)localObject1).value()).dpi().iterator(); ((Iterator)localObject2).hasNext(); ) { dum localdum = (dum)((Iterator)localObject2).next();
          if (localdum.getName().toLowerCase().contains(this.kZY.toLowerCase()))
            this.kZX.add(localdum); }
      }
    else
      for (localObject1 = ((dMf)this.kZW.get(this.aPg)).dpi().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dum)((Iterator)localObject1).next();
        this.kZX.add(localObject2);
      }
    dLE.doY().a(this, new String[] { "tutorials" });
  }

  private boolean cPp() {
    return this.kZY != null;
  }
}