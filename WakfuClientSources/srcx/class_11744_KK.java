import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public final class KK extends dAD
  implements dBv
{
  public static final String bXn = "fieldNames";
  public static final String bXo = "rows";
  public static final String bXp = "cellSize";
  public static final String[] bXq = { "fieldNames", "rows", "cellSize" };

  public static final String[] aOb = new String[bXq.length + dAD.bF.length];
  private String[] bXr;
  private List bXs = new ArrayList();

  public KK(String[] paramArrayOfString) {
    this.bXr = paramArrayOfString;
  }

  public void a(kt[] paramArrayOfkt)
  {
    if (paramArrayOfkt.length != this.bXr.length) {
      this.K.error("Impossible d'ajouter une ligne de stats a un tableau : taille de la ligne attendu " + this.bXr.length + ", trouvé " + paramArrayOfkt.length);
      return;
    }

    for (kt localkt : paramArrayOfkt)
      this.bXs.add(localkt);
  }

  public String[] Vg()
  {
    return this.bXr;
  }

  public List Vh()
  {
    return this.bXs;
  }

  public cHJ sh() {
    return cHJ.iCJ;
  }

  public void update() {
    for (kt localkt : this.bXs) {
      localkt.update();
    }
    super.update();
  }

  public String[] getFields()
  {
    return aOb;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("fieldNames"))
      return this.bXr;
    if (paramString.equals("rows"))
      return this.bXs;
    if (paramString.equals("cellSize")) {
      if (this.bXs.size() == 0) {
        return "100%, 18";
      }
      float f = 100.0F / this.bXr.length;
      return f + "%, 18";
    }
    return super.getFieldValue(paramString);
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  static
  {
    System.arraycopy(bXq, 0, aOb, 0, bXq.length);
    System.arraycopy(dAD.bF, 0, aOb, bXq.length, dAD.bF.length);
  }
}