import java.util.ArrayList;
import java.util.List;

public class bA extends bbH
{
  public static String ky = "ring";
  private int kz;
  private int kA;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Anneau", new dou[] { new dou("rayon intérieur"), new dou("rayon extérieur") }) });

  public qM aF() {
    return by;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return ky + "-" + this.kz + "-" + this.kA;
  }

  public int eJ() {
    return this.kz + this.kA;
  }

  public void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type ring : 2 paramètres attendus, 0 trouvé");
    if (paramArrayOfInt.length != 2) {
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type ring : 2 paramètres attendus, " + paramArrayOfInt.length + " trouvé(s)");
    }
    this.kz = (paramArrayOfInt[0] < paramArrayOfInt[1] ? paramArrayOfInt[0] : paramArrayOfInt[1]);
    this.kA = (paramArrayOfInt[0] > paramArrayOfInt[1] ? paramArrayOfInt[0] : paramArrayOfInt[1]);

    this.kB.clear();
    for (int i = 0; i <= this.kA; i++)
      for (int j = Math.max(this.kz - i, 0); j <= Math.max(this.kA - i, 0); j++) {
        this.kB.add(new int[] { i, j });
        if (j != 0)
          this.kB.add(new int[] { i, -j });
        if (i != 0) {
          this.kB.add(new int[] { -i, j });
          if (j != 0)
            this.kB.add(new int[] { -i, -j });
        }
      }
  }

  protected boolean eK()
  {
    return true;
  }

  public chY eL()
  {
    return chY.hGi;
  }

  public int eM() {
    return this.kA;
  }

  public int eN() {
    return this.kz;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    if ((this.kz == 0) && (this.kA == 0)) {
      return cgr.hDU;
    }
    if (this.kz == 0) {
      return cgr.hDY;
    }
    return cgr.hDZ;
  }
}