import org.apache.log4j.Logger;

class dkr
{
  private static final Logger K = Logger.getLogger(dkr.class);
  private final Rx[] lhA;

  dkr()
  {
    this.lhA = new Rx[eu.lE() + 1];
  }

  public boolean contains(byte paramByte) {
    return this.lhA[paramByte] != null;
  }

  public Rx fc(byte paramByte) {
    return this.lhA[paramByte];
  }

  public void a(byte paramByte, Rx paramRx) {
    this.lhA[paramByte] = paramRx;
  }

  public void c(bPA parambPA) {
    int i = 0; for (int j = this.lhA.length; i < j; i++) {
      Rx localRx = this.lhA[i];
      if (localRx != null)
      {
        if (!parambPA.c(i, localRx))
          return; 
      }
    }
  }

  public void M(dGy paramdGy) { int i = 0; for (int j = this.lhA.length; i < j; i++) {
      Rx localRx = this.lhA[i];
      if (localRx != null)
      {
        if (!paramdGy.d(localRx))
          return;
      }
    }
  }
}