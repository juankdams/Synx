import java.util.ArrayList;
import java.util.List;

public class dom extends bbH
{
  public static final String loy = "circle";
  private int cAK;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Cercle", new dou[] { new dou("rayon") }) });

  public qM aF()
  {
    return by;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return "circle-" + this.cAK;
  }

  public int eJ() {
    return this.cAK;
  }

  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length != 1)) {
      if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
        throw new IllegalArgumentException("Paramètres invalides pour une AOE de type cercle : 1 paramètre attendu, 0 trouvé(s)");
      }
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type cercle : 1 paramètre attendu, " + paramArrayOfInt.length + " trouvé(s)");
    }
    this.cAK = paramArrayOfInt[0];
    this.kB.clear();
    for (int i = -this.cAK; i <= this.cAK; i++) {
      int j = this.cAK - Math.abs(i);
      for (int k = -j; k <= j; k++)
        this.kB.add(new int[] { i, k });
    }
  }

  protected boolean eK()
  {
    return true;
  }

  public chY eL()
  {
    return chY.hGf;
  }

  public int getRadius() {
    return this.cAK;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    if (this.cAK == 0) {
      return cgr.hDU;
    }
    return cgr.hDY;
  }
}