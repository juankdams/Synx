import java.util.ArrayList;
import java.util.List;

public final class aQX extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aXA = false;

  public aQX(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null) {
      return -1;
    }
    bgJ localbgJ = localdhJ.ayK();

    for (aVc localaVc : localbgJ)
      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC != null)
        {
          if (localbJC.bRf())
            return 0;
        }
      }
    return -1;
  }

  public Enum gm() {
    return Bz.bCm;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu });
  }
}