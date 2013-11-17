import java.util.ArrayList;
import java.util.List;

public class cUC extends bbH
{
  public static String kHi = "rectangular or square ring";
  private int kHj;
  private int kHk;
  private int kHl;
  private int kHm;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Pourtour d'un carré", new dou[] { new dou("demi côté inférieur (cellule comprise dedans)"), new dou("demi côté supérieur (cellule comprise dedans)") }), new cIE("Pourtour d'un rectangle", new dou[] { new dou("demi longueur inférieure X (cellule comprise dedans)"), new dou("demi longueur inférieure Y (cellule comprise dedans)"), new dou("demi longueur supérieure X (cellule comprise dedans)"), new dou("demi longueur supérieure Y (cellule comprise dedans)") }) });

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
    return kHi + "-w:" + this.kHj + "-" + this.kHk + " / h:" + this.kHl + "-" + this.kHm;
  }

  public int eJ() {
    return Math.min(this.kHj + this.kHk, this.kHl + this.kHm);
  }

  public void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type rectring : 4 paramètres attendus, 0 trouvé");
    if ((paramArrayOfInt.length != 4) && (paramArrayOfInt.length != 2)) {
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type rectring :4 paramètres attendus, " + paramArrayOfInt.length + " trouvé(s)");
    }
    if (paramArrayOfInt.length == 2) {
      this.kHj = Math.min(paramArrayOfInt[0], paramArrayOfInt[1]);
      this.kHl = this.kHj;
      this.kHk = Math.max(paramArrayOfInt[0], paramArrayOfInt[1]);
      this.kHm = this.kHk;
    } else {
      this.kHj = paramArrayOfInt[0];
      this.kHl = paramArrayOfInt[1];
      this.kHk = paramArrayOfInt[2];
      this.kHm = paramArrayOfInt[3];
      if (this.kHl > this.kHm)
        throw new IllegalArgumentException("Paramètres invalides pour une AOE de type rectring : innerY > outerY");
      if (this.kHj > this.kHk) {
        throw new IllegalArgumentException("Paramètres invalides pour une AOE de type rectring : innerX > outerX");
      }
    }
    this.kB.clear();

    for (int i = 0; i <= this.kHk; i++)
      for (int j = 0; j <= this.kHm; j++)
        if ((i >= this.kHj) || (j >= this.kHl))
          if ((i == 0) && (j == 0)) {
            this.kB.add(new int[] { i, j });
          } else if (i == 0) {
            this.kB.add(new int[] { i, j });
            this.kB.add(new int[] { i, -j });
          } else if (j == 0) {
            this.kB.add(new int[] { i, j });
            this.kB.add(new int[] { -i, j });
          } else {
            this.kB.add(new int[] { i, j });
            this.kB.add(new int[] { -i, j });
            this.kB.add(new int[] { i, -j });
            this.kB.add(new int[] { -i, -j });
          }
  }

  protected boolean eK()
  {
    return false;
  }

  public chY eL()
  {
    return chY.hGk;
  }

  public int cJO() {
    return this.kHk;
  }

  public int cJP() {
    return this.kHj;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    if ((this.kHm == 0) && (this.kHk == 0)) {
      return cgr.hDU;
    }
    if ((this.kHm == this.kHk) && (this.kHl == this.kHj)) {
      return cgr.hEb;
    }
    return cgr.hEd;
  }
}