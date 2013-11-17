import java.util.ArrayList;

public class dVR
  implements dUK
{
  private final int aw;
  private final ArrayList mve = new ArrayList();
  private int mvf;
  private int mvg;
  private final aRq[] mvh = new aRq[20];
  private final FI[] mvi = new FI[20];

  dVR(int paramInt) {
    this.aw = paramInt;
  }

  void b(JF paramJF)
  {
    this.mve.add(paramJF);
  }

  public void ag(dGy paramdGy) {
    int i = 0; for (int j = this.mve.size(); i < j; i++)
      if (!paramdGy.d(this.mve.get(i)))
        return;
  }

  public int Eh(int paramInt) {
    return this.mvf + paramInt * this.mvg;
  }

  public lX a(int paramInt, G paramG) {
    int i = FI.eK(paramInt);
    return this.mvh[i].a(paramG);
  }

  public boolean a(dGy paramdGy, int paramInt) {
    int i = FI.eK(paramInt);
    return this.mvi[i].i(paramdGy);
  }

  public boolean a(dGy paramdGy, int paramInt, G paramG) {
    int i = FI.eK(paramInt);
    lX locallX = a(paramInt, paramG);
    return this.mvi[i].a(paramdGy, paramG.ab(), locallX);
  }

  public String getName() {
    return bU.fH().b(117, this.aw, new Object[0]);
  }

  public String getDescription() {
    return bU.fH().b(116, this.aw, new Object[0]);
  }

  void a(fH paramfH, boolean paramBoolean) {
    if ((!bB) && (this.mvh[paramfH.fn()] != null)) throw new AssertionError();
    this.mvh[paramfH.fn()] = new aRq(paramfH.mM(), paramfH.mL(), paramfH.mK(), paramfH.mJ(), paramBoolean);
  }

  void a(bP parambP) {
    if ((!bB) && (this.mvi[parambP.fn()] != null)) throw new AssertionError();
    FI localFI = new FI();
    for (IG localIG : parambP.fo()) {
      localFI.a(cLE.a(localIG.gw(), localIG.Sb(), localIG.Sa(), localIG.Sc()));
    }
    this.mvi[parambP.fn()] = localFI;
  }

  void fv(int paramInt1, int paramInt2) {
    this.mvf = paramInt1;
    this.mvg = paramInt2;
  }

  public String toString()
  {
    return "DungeonDefinition{m_id=" + this.aw + '}';
  }
}