import java.util.ArrayList;
import java.util.List;

public class cuu extends bbH
{
  public static String ifb = "t inv";
  private int gNB;
  private int gNC;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Zone en T Inversé (barre en bas) (order 0: defaut, 1: pied->barre, 2: barre->pied)", new dou[] { new dou("largeur de la barre (par rapport au centre : 1 = barre de 3 cellules)"), new dou("hauteur du pied (par rapport au centre : 1 = barre de 1)") }) });

  public qM aF()
  {
    return by;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt;
    int m;
    switch (bqg())
    {
    case 1:
      for (int i = this.gNC; i >= 0; i--) {
        bqn localbqn1 = new bqn();
        localbqn1.a(new int[] { i, 0 });
        localArrayList.add(localbqn1);
      }

      arrayOfInt = new int[this.gNB * 4];
      for (int j = 1; j <= this.gNB; j++) {
        m = (j - 1) * 4;
        arrayOfInt[(m + 0)] = 0;
        arrayOfInt[(m + 1)] = j;
        arrayOfInt[(m + 2)] = 0;
        arrayOfInt[(m + 3)] = (-j);
      }
      bqn localbqn2 = new bqn();
      localbqn2.a(arrayOfInt);
      localArrayList.add(localbqn2);

      break;
    case 2:
      arrayOfInt = new int[this.gNB * 4];
      for (int k = 1; k <= this.gNB; k++) {
        m = (k - 1) * 4;
        arrayOfInt[(m + 0)] = 0;
        arrayOfInt[(m + 1)] = k;
        arrayOfInt[(m + 2)] = 0;
        arrayOfInt[(m + 3)] = (-k);
      }
      bqn localbqn3 = new bqn();
      localbqn3.a(arrayOfInt);
      localArrayList.add(localbqn3);

      for (m = 0; m <= this.gNC; m++) {
        bqn localbqn4 = new bqn();
        localbqn4.a(new int[] { m, 0 });
        localArrayList.add(localbqn4);
      }

      break;
    default:
      localArrayList.add(this);
    }

    return localArrayList;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return ifb + "-barre:" + this.gNB + "-pied:" + this.gNC;
  }

  public int eJ() {
    return this.gNC + 1;
  }

  public void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type TI : 2 paramètres attendus, 0 trouvé");
    if (paramArrayOfInt.length != 2) {
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type TI : 2 paramètres attendus, " + paramArrayOfInt.length + " trouvé(s)");
    }
    this.gNB = Math.abs(paramArrayOfInt[0]);
    this.gNC = Math.abs(paramArrayOfInt[1]);

    this.kB.clear();

    this.kB.add(new int[] { 0, 0 });

    for (int i = 1; i <= this.gNB; i++) {
      this.kB.add(new int[] { 0, i });
      this.kB.add(new int[] { 0, -i });
    }

    for (i = 1; i <= this.gNC; i++)
      this.kB.add(new int[] { i, 0 });
  }

  protected boolean eK() {
    return false;
  }

  public chY eL() {
    return chY.hGm;
  }

  public int bSN() {
    return this.gNB;
  }

  public int bSO() {
    return this.gNC;
  }

  public cgr eP() {
    if ((this.gNB == 0) && (this.gNC == 0)) {
      return cgr.hDU;
    }
    if (this.gNB == 0) {
      return cgr.hDV;
    }
    if (this.gNC == 0) {
      return cgr.hDW;
    }
    return cgr.hDZ;
  }
}