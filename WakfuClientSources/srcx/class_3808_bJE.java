import java.util.ArrayList;
import java.util.List;

public class bJE extends bbH
{
  public static final String gLr = "cross";
  private int gLs;
  private int gLt;
  private int gLu;
  private int gLv;
  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Croix (deux barres de tailles identiques)", new dou[] { new dou("distance centre -> extrémité") }), new cIE("Croix (deux barres de tailles différentes)", new dou[] { new dou("distance centre -> extrémité face à soi"), new dou("distance centre -> extrémité sur le côté") }), new cIE("Croix (4 barres de tailles différentes)", new dou[] { new dou("distance centre -> extrémité face à soi vers le haut"), new dou("distance centre -> extrémité face à soi vers le bas"), new dou("distance centre -> extrémité sur le côté vers la gauche"), new dou("distance centre -> extrémité sur le côté vers la droite") }) });

  public qM aF()
  {
    return by;
  }

  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type cross : 1 paramètre attendu, 0 trouvé(s)");
    if ((paramArrayOfInt.length != 1) && (paramArrayOfInt.length != 2) && (paramArrayOfInt.length != 4)) {
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type cross : 1 ou 2 ou 4 paramètres attendus, " + paramArrayOfInt.length + " trouvé(s)");
    }
    this.gLs = paramArrayOfInt[0];
    if (paramArrayOfInt.length == 2) {
      this.gLv = paramArrayOfInt[1];
      this.gLu = this.gLs;
      this.gLt = this.gLv;
    } else if (paramArrayOfInt.length == 4) {
      this.gLu = paramArrayOfInt[1];
      this.gLv = paramArrayOfInt[2];
      this.gLt = paramArrayOfInt[3];
    } else {
      this.gLv = this.gLs;
      this.gLu = this.gLs;
      this.gLt = this.gLs;
    }

    this.kB.clear();

    this.kB.add(new int[] { 0, 0 });
    for (int i = 1; i <= this.gLv; i++) {
      this.kB.add(new int[] { 0, -i });
    }
    for (i = 1; i <= this.gLt; i++) {
      this.kB.add(new int[] { 0, i });
    }
    for (i = 1; i <= this.gLs; i++) {
      this.kB.add(new int[] { i, 0 });
    }
    for (i = 1; i <= this.gLu; i++)
      this.kB.add(new int[] { -i, 0 });
  }

  protected boolean eK()
  {
    return true;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return "cross-h" + this.gLs + "b" + this.gLu + "-g" + this.gLv + "d" + this.gLt;
  }

  public int eJ() {
    return Math.min(Math.min(this.gLv, this.gLt), Math.min(this.gLs, this.gLu));
  }

  public chY eL()
  {
    return chY.hGg;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public int bRk() {
    return this.gLv;
  }

  public cgr eP() {
    if ((this.gLu == 0) && (this.gLs == 0) && (this.gLv == 0) && (this.gLt == 0))
      return cgr.hDU;
    if ((this.gLu == 0) && (this.gLs == 0))
      return cgr.hDV;
    if ((this.gLv == 0) && (this.gLt == 0)) {
      return cgr.hDW;
    }
    return cgr.hDX;
  }
}