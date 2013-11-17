import java.util.ArrayList;

public final class cGM extends aZQ
{
  public cGM(aEq paramaEq)
  {
    super(paramaEq);
  }

  public boolean sI() {
    return ((aEq)this.fgT).aQE() == 0;
  }

  public Ka[] sJ() {
    return new Ka[] { Ka.bWh, Ka.bWg };
  }

  public aFk sK() {
    return aFk.ebf;
  }

  public void a(Dy paramDy) {
    if (paramDy.N() == 3) {
      bRW localbRW = (bRW)paramDy;
      ArrayList localArrayList = localbRW.hbQ.fbM;
      int[] arrayOfInt = new int[localArrayList.size()];
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        azt localazt = (azt)localArrayList.get(i);
        arrayOfInt[i] = localazt.dQG;
      }

      ((aEq)this.fgT).t(arrayOfInt);

      ((aEq)this.fgT).aQB();
    }
  }
}