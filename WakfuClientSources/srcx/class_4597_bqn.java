import java.util.ArrayList;
import java.util.List;

public class bqn extends bbH
{
  public static String fLq = "forme à base de points";

  private static final bqn fLr = new bqn();

  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[] { new cIE("Liste de 1 point : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1") }), new cIE("Liste de 2 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2") }), new cIE("Liste de 3 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3") }), new cIE("Liste de 4 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4") }), new cIE("Liste de 5 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5") }), new cIE("Liste de 6 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6") }), new cIE("Liste de 7 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7") }), new cIE("Liste de 8 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8") }), new cIE("Liste de 9 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8"), new dou("x9"), new dou("y9") }), new cIE("Liste de 10 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8"), new dou("x9"), new dou("y9"), new dou("x10"), new dou("y10") }), new cIE("Liste de 11 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8"), new dou("x9"), new dou("y9"), new dou("x10"), new dou("y10"), new dou("x11"), new dou("y11") }), new cIE("Liste de 12 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8"), new dou("x9"), new dou("y9"), new dou("x10"), new dou("y10"), new dou("x11"), new dou("y11"), new dou("x12"), new dou("y12") }), new cIE("Liste de 15 points : prendre l'axe sud-est pour construire", new dou[] { new dou("x1"), new dou("y1"), new dou("x2"), new dou("y2"), new dou("x3"), new dou("y3"), new dou("x4"), new dou("y4"), new dou("x5"), new dou("y5"), new dou("x6"), new dou("y6"), new dou("x7"), new dou("y7"), new dou("x8"), new dou("y8"), new dou("x9"), new dou("y9"), new dou("x10"), new dou("y10"), new dou("x11"), new dou("y11"), new dou("x12"), new dou("y12"), new dou("x13"), new dou("y13"), new dou("x14"), new dou("y14"), new dou("x15"), new dou("y15") }) });

  public qM aF()
  {
    return by;
  }

  public static bqn bzu()
  {
    return fLr;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return fLq;
  }

  public int eJ() {
    return 0;
  }

  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length % 2 != 0))
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type Point : modulo2 attendu, " + paramArrayOfInt.length + " fourni(s)");
    this.kB.clear();
    for (int i = 0; i < paramArrayOfInt.length; i += 2)
      this.kB.add(new int[] { paramArrayOfInt[i], paramArrayOfInt[(i + 1)] });
  }

  protected boolean eK()
  {
    return false;
  }

  public chY eL() {
    return chY.hGl;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    if (this.kB.size() == 1) {
      return cgr.hDU;
    }
    return cgr.hDT;
  }
}