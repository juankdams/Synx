import java.util.ArrayList;
import org.apache.log4j.Logger;

final class dSu extends Mo
{
  private final yc mou;

  dSu(bKm parambKm, yc paramyc)
  {
    this.mou = paramyc;
    this.mou.ao().a(this);
  }

  public void aS() {
    this.mou.brr.clear();
    for (azO localazO : azO.values()) {
      gA localgA = (gA)this.aHq.ayJ().dB((short)localazO.hV);
      if ((localgA != null) && (localgA.isActive())) {
        dNb localdNb = new dNb();
        localdNb.aYU = localazO.hV;
        localdNb.bPw = localgA.ok();
        this.mou.brr.add(localdNb);
      }
    }
  }

  public void aT() {
    try {
      if (this.aHq.gML == null)
        this.aHq.gML = new PX();
      else {
        this.aHq.gML.clear();
      }

      for (dNb localdNb : this.mou.brr) {
        this.aHq.gML.c(localdNb.aYU, localdNb.bPw);
      }
      bKm.n(this.aHq).cCq();
      this.aHq.aek();
    } catch (Exception localException) {
      bKm.Re().error("Exception à la deserialisation de l'apparence d'un personnage id=" + this.aHq.getId(), localException);
    }
  }
}