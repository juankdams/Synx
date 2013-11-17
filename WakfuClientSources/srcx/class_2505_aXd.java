import org.apache.log4j.Logger;

public class aXd extends aru
{
  private short[] fcq;

  public aXd bmB()
  {
    return new aXd();
  }

  public boolean isEnabled()
  {
    if (!a(byv.bFN().bFO())) {
      this.cRA = 1;
      return false;
    }

    return super.isEnabled();
  }

  private boolean a(byz parambyz) {
    if ((this.fcq == null) || (this.fcq.length == 0)) {
      K.error("Teleporter sans instance liée");
      return false;
    }

    for (short s : this.fcq) {
      djR localdjR = new djR(this, s, parambyz);

      if (bGP.gDx.a(new aGH[] { localdjR })) {
        return true;
      }
    }
    return false;
  }

  public void l(short[] paramArrayOfShort) {
    this.fcq = paramArrayOfShort;
  }
}