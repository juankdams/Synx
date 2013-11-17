import java.util.ArrayList;
import java.util.List;

abstract class cIf extends akN
{
  protected static ArrayList aAG = new ArrayList();
  protected boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null)
      return -1;
    Object localObject;
    if (this.aMu)
      localObject = paramObject1;
    else {
      localObject = paramObject2;
    }
    if ((localObject != null) && ((localObject instanceof dle))) {
      dle localdle = (dle)localObject;
      if (localdhJ.atN() != null) {
        adr localadr = localdhJ.atN().E(localdle.fa(), localdle.fb(), localdle.fc());
        if (a(localadr)) {
          return 0;
        }
      }
    }
    return -1;
  }

  protected abstract boolean a(adr paramadr);

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}