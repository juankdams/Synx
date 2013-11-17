import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bWh extends bbH
{
  private final UG iM;
  private final ArrayList hiv = new ArrayList();
  private final ArrayList hic = new ArrayList();

  public bWh(UG paramUG) {
    this.iM = paramUG;
    int i = this.iM.getWidth();
    int j = this.iM.getMinX();
    int k = j + i;
    int m = this.iM.getMinY();
    int n = m + this.iM.getHeight();

    for (int i1 = j; i1 < k; i1++)
      for (int i2 = m; i2 < n; i2++)
        if (paramUG.ap(i1, i2)) {
          this.hiv.add(new int[] { i1 - j, i2 - m });
          this.hic.add(new int[] { i1, i2 });
        }
  }

  public void a(int[] paramArrayOfInt)
  {
    throw new UnsupportedOperationException("Un BattlegroundBorderAreaOfEffect ne peut être initialisé avec un tableau d'entiers venant d'une base de données, par exemple. Il est créé dynamiquement par un combat");
  }

  public qM aF()
  {
    return null;
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2, CG paramCG, int paramInt5, int paramInt6, short paramShort3)
  {
    return this.iM.ap(paramInt5, paramInt6);
  }

  protected boolean eK()
  {
    return false;
  }

  public chY eL()
  {
    return null;
  }

  public List eH()
  {
    return this.hiv;
  }

  public Iterable cbv() {
    return Collections.unmodifiableList(this.hic);
  }

  public String eI()
  {
    return null;
  }

  public int eJ()
  {
    return 0;
  }

  public ArrayList eO()
  {
    return null;
  }

  public cgr eP()
  {
    return cgr.hDT;
  }
}