public class aay extends dGU
  implements bxV
{
  private boolean cOU;

  public aay(bgo parambgo, aeE paramaeE)
  {
    super(parambgo, paramaeE);
    this.cOU = false;
  }

  public int b(aym paramaym) {
    return 0;
  }

  public void a(byte paramByte, long paramLong) {
    ((bgo)this.lRB).a(paramByte, paramLong);
  }

  public void aD(byte paramByte) {
    ((bgo)this.lRB).aD(paramByte);
  }

  public short nU() {
    return ((bgo)this.lRB).nU();
  }

  public String toString() {
    return ((bgo)this.lRB).getName();
  }

  public boolean anv() {
    return this.cOU;
  }

  public void bK(boolean paramBoolean) {
    this.cOU = paramBoolean;
  }

  public long aE(byte paramByte) {
    return ((bgo)this.lRB).aE(paramByte);
  }

  public cYk ML() {
    return new cYk(((bgo)this.lRB).getX(), ((bgo)this.lRB).getY(), ((bgo)this.lRB).IB());
  }

  public short Lk() {
    return ((bgo)this.lRB).Lk();
  }

  public void a(bJS parambJS) {
    if (parambJS == ((bgo)this.lRB).ldW) {
      if (byv.bFN().bFO().getId() != eq())
        CM.LV().f(bU.fH().getString("infoPop.levelUp", new Object[] { Short.valueOf(nU()), getName() }), 4);
    }
    else if (parambJS == ((bgo)this.lRB).ldU) {
      bKm localbKm = (bKm)CA.Lv().bj(((bgo)this.lRB).eq());
      if ((localbKm != null) && (localbKm != byv.bFN().bFO())) {
        Rx localRx = localbKm.d(eu.ayM);
        int i = ((bgo)this.lRB).cqE();
        int j = ((bgo)this.lRB).cPY();
        localRx.setMax(j);
        localRx.set(i);
        blB localblB = localbKm.bRI();
        localblB.bc(i, ((bgo)this.lRB).cRA());
      }
    } else if (parambJS == ((bgo)this.lRB).ldX) {
      bED.bMP().gy(eq());
    } else if (parambJS == ((bgo)this.lRB).ldY) {
      bED.bMP().gy(eq());
    }
  }
}