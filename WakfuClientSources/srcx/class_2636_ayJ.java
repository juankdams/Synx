import java.util.ArrayList;

public class ayJ
{
  private static final String dPv = "event.client.";
  private final int aw;
  private final int dPw;
  private final String[] dPx;
  private final bZA dPy;
  private final int dPz;
  private final int dPA;
  private final boolean dPB;
  private boolean aFc;
  private final chC dPC;

  public ayJ(int paramInt1, int paramInt2, String[] paramArrayOfString, bZA parambZA, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this.aw = paramInt1;
    this.dPw = paramInt2;
    this.dPx = paramArrayOfString;
    this.dPy = parambZA;
    this.dPz = paramInt3;
    this.dPA = paramInt4;
    this.aFc = paramBoolean;
    this.dPB = paramBoolean;

    this.dPC = new chC();
  }

  public void a(aAM paramaAM) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz == null) {
      return;
    }

    ciW localciW = cZy.cMl();
    if ((this.dPA > 0) && 
      (localciW != null)) {
      i = localciW.getInt("event.client." + this.aw);
      if (i >= this.dPA) {
        return;
      }

    }

    if ((this.dPy != null) && (!this.dPy.i(localbyz, null, paramaAM, localbyz.ayL())))
    {
      return;
    }

    int i = dpe.AX(100);
    if (i > this.dPz) {
      return;
    }

    aTY localaTY = (aTY)this.dPC.j(localbyz, null, paramaAM, localbyz.ayL());
    if (localaTY != null)
    {
      ArrayList localArrayList = localaTY.bjo();
      int k = 0; for (int m = localArrayList.size(); k < m; k++) {
        ((Ig)localArrayList.get(k)).execute();
      }

    }

    if ((this.dPA > 0) && 
      (localciW != null)) {
      int j = localciW.getInt("event.client." + this.aw);
      localciW.E("event.client." + this.aw, j + 1);
    }
  }

  public chC aKG()
  {
    return this.dPC;
  }

  public void a(aTY paramaTY) {
    this.dPC.a(paramaTY);
  }

  public int aKH() {
    return this.dPw;
  }

  public String[] aKI() {
    return this.dPx;
  }

  public bZA aKJ() {
    return this.dPy;
  }

  public float aKK() {
    return this.dPz;
  }

  public int getId() {
    return this.aw;
  }

  public boolean isActive() {
    return this.aFc;
  }

  public void setActive(boolean paramBoolean) {
    this.aFc = paramBoolean;
  }

  public void aKL() {
    this.aFc = this.dPB;
  }
}