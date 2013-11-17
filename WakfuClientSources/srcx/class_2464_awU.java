import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class awU extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw dMn;

  protected List kM()
  {
    return aAG;
  }

  public awU(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i != 0) {
      K.error("Paramétrage de critère inconnu : " + this);
      return;
    }
    this.dMn = ((aOw)paramArrayList.get(0));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null) {
      throw new aIh("User null");
    }

    long l = this.dMn.b(paramObject1, paramObject2, paramObject3, paramObject4);
    ctU localctU = localdhJ.afu().cn((short)(int)l);
    bZH localbZH = localdhJ.ayJ();
    int i = 1;
    for (Iterator localIterator = localctU.iterator(); localIterator.hasNext(); ) {
      if (!localbZH.hg(((bBn)localIterator.next()).getId())) {
        i = 0;
      }

    }

    return i != 0 ? 0 : 1;
  }

  public Enum gm() {
    return Bz.bBi;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
  }
}