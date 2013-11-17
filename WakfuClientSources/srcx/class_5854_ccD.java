import java.util.ArrayList;
import java.util.List;

public class ccD extends bbH
{
  public static String huD = "point";

  private static final ccD huE = new ccD();

  private List kB = new ArrayList(1);

  public static final qM by = new aAH(new ec[0]);

  public qM aF() {
    return by;
  }

  public static ccD cfK()
  {
    return huE;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return huD;
  }

  public int eJ() {
    return 0;
  }

  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
      throw new IllegalArgumentException("Paramètres invalides pour une AOE de type Point : 0 attendu, " + paramArrayOfInt.length + " fourni(s)");
    this.kB.clear();
    this.kB.add(new int[] { 0, 0 });
  }

  protected boolean eK() {
    return true;
  }

  public chY eL()
  {
    return chY.hGe;
  }

  public ArrayList eO() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this);
    return localArrayList;
  }

  public cgr eP() {
    return cgr.hDU;
  }
}