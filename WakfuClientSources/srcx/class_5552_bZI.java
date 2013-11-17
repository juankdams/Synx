public class bZI extends cih
{
  public static final String hqo = "elementId";
  public static final String hqp = "userId";
  private final bpU[] hqq;

  public bZI(int paramInt1, aPb paramaPb, int paramInt2, bpU[] paramArrayOfbpU)
  {
    super(paramInt1, 0, paramaPb, paramInt2);
    this.hqq = paramArrayOfbpU;
  }

  public bpU[] cem() {
    return this.hqq;
  }

  private short cen() {
    int i = 0;
    for (bpU localbpU : this.hqq) {
      i += localbpU.byX();
    }
    return (short)i;
  }

  public bzS cV(short paramShort) {
    for (bpU localbpU : this.hqq) {
      for (bzS localbzS : bpU.a(localbpU)) {
        if (localbzS.bIu() == paramShort) {
          return localbzS;
        }
      }
    }
    return null;
  }

  public bpU cW(short paramShort) {
    for (bpU localbpU : this.hqq) {
      for (bzS localbzS : bpU.a(localbpU)) {
        if (localbzS.bIu() == paramShort) {
          return localbpU;
        }
      }
    }
    return null;
  }

  public dJO eR() {
    return dJO.eH((short)0);
  }

  public dJO[] eS() {
    dJO[] arrayOfdJO = new dJO[cen()];
    System.arraycopy(dJO.values(), 0, arrayOfdJO, 0, arrayOfdJO.length);
    return arrayOfdJO;
  }

  public String toString()
  {
    return "GenericActivableParameter{} " + super.toString();
  }
}