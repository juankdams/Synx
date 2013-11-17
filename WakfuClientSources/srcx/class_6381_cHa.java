import java.util.ArrayList;
import java.util.List;

public class cHa extends bbH
{
  public static String iCe = "Directed rectangle";
  static final aAH iCf = new aAH(new ec[] { new cIE("Rectangle directionnel", new dou[] { new dou("Distance maximale à la ligne centrale"), new dou("Longueur") }) });
  private ArrayList iCg;
  private int iCh;
  private int m_length;
  private List kB;

  public qM aF()
  {
    return iCf;
  }

  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length != 2)) {
      int i = paramArrayOfInt == null ? 0 : paramArrayOfInt.length;
      throw new IllegalArgumentException("Deux paramètres attendus pour une aire d'effet rectangle directionnel, " + i + " trouvés");
    }
    if (paramArrayOfInt[0] < 0) {
      throw new IllegalArgumentException("Rectangle directionnel : " + iCf.cs(2).aC(0).getName() + " doit être au moins 0.");
    }

    if (paramArrayOfInt[1] < 1) {
      throw new IllegalArgumentException("Rectangle directionnel : " + iCf.cs(2).aC(0).getName() + " doit être au moins 1.");
    }

    this.iCh = paramArrayOfInt[0];
    this.m_length = paramArrayOfInt[1];
    cBP();
  }

  private void cBP() {
    this.kB = new ArrayList();
    for (int i = -this.iCh; i <= this.iCh; i++)
      for (int j = 0; j < this.m_length; j++)
        this.kB.add(new int[] { j, i });
  }

  protected boolean eK()
  {
    return false;
  }

  public chY eL() {
    return chY.hGn;
  }

  public List eH()
  {
    return this.kB;
  }

  public String eI()
  {
    return iCe + "-" + (2 * this.iCh + 1) + "x" + this.m_length;
  }

  public int eJ() {
    return this.m_length;
  }

  public ArrayList eO() {
    if (this.iCg == null) {
      this.iCg = new ArrayList(1);
      this.iCg.add(this);
    }
    return this.iCg;
  }

  public cgr eP()
  {
    if (this.m_length == 1)
      return this.iCh == 0 ? cgr.hDU : cgr.hDW;
    return this.iCh == 0 ? cgr.hDV : cgr.hEc;
  }
}