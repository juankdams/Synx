import java.util.ArrayList;
import java.util.List;

public class aFn extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw ebp;
  private boolean aMu = false;

  public aFn(ArrayList paramArrayList)
  {
    u(paramArrayList);
    if (paramArrayList.size() == 2) {
      dKY localdKY = (dKY)paramArrayList.remove(0);
      String str = ((cic)localdKY).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
      else if (str.equalsIgnoreCase("caster")) {
        this.aMu = false;
      }
    }
    this.ebp = ((aOw)paramArrayList.get(0));
  }

  public int aRG() {
    if ((this.ebp.sc()) && (this.ebp.pH())) {
      return (int)this.ebp.b(null, null, null, null);
    }
    return -1;
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    if (!(localaxQ instanceof dle)) {
      return -1;
    }
    dle localdle = (dle)localaxQ;

    int i = (byte)aRG();
    cfY localcfY = cfY.vg(i);

    if (localcfY == null) {
      throw new aIh("Le paramètre du critère HasFightProperty doit être un id de FightPropertyType valide (id=" + i + " n'existe pas)");
    }

    return localdle.c(localcfY) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bBI;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}