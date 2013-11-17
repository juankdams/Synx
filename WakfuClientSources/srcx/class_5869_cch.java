import java.util.ArrayList;
import java.util.List;

public class cch extends bbH
{
  public static String htB = "rectangle or square";
  private int ia;
  private int ib;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Carré plein", new dou[] { new dou("Taille d'un côté (doit être impaire)") }), new cIE("Rectangle plein", new dou[] { new dou("Largeur (doit être impaire)"), new dou("Hauteur (doit être impaire)") }) });

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
    return htB + "-" + this.ia + "x" + this.ib;
  }

  public int eJ() {
    return Math.min(this.ia, this.ib);
  }

  public void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type square : 1 à 2 paramètre attendu, 0 trouvé(s)");
    if (paramArrayOfInt.length > 2)
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type carré : 1 à 2 paramètre attendu, " + paramArrayOfInt.length + " trouvé(s)");
    this.ia = paramArrayOfInt[0];

    if (paramArrayOfInt.length == 1)
      this.ib = this.ia;
    else {
      this.ib = paramArrayOfInt[1];
    }

    if ((this.ia != 0) && (this.ia % 2 == 0))
      this.ia += 1;
    if ((this.ib != 0) && (this.ib % 2 == 0)) {
      this.ib += 1;
    }
    int i = (this.ia - 1) / 2;
    int j = (this.ib - 1) / 2;
    for (int k = 0; k < this.ia; k++)
      for (int m = 0; m < this.ib; m++)
        this.kB.add(new int[] { k - i, m - j });
  }

  protected boolean eK()
  {
    return this.ia == this.ib;
  }

  public chY eL() {
    return chY.hGj;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    if ((this.ib == 0) && (this.ia == 0)) {
      return cgr.hDU;
    }
    if (this.ib == this.ia) {
      return cgr.hEa;
    }
    return cgr.hEc;
  }
}