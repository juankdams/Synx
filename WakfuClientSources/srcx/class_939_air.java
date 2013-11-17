import java.util.ArrayList;
import org.apache.log4j.Logger;

public class air
  implements azp
{
  private static final Logger K = Logger.getLogger(air.class);

  private final dkr der = new dkr();

  public air() {
    for (eu localeu : eu.values()) {
      Rx localRx = new Rx(localeu, localeu.lo(), localeu.lp());
      this.der.a(localeu.bJ(), localRx);
    }

    acY();
  }

  public void acY() {
    this.der.M(new bwd(this));
  }

  public void a(air paramair)
  {
    this.der.M(new bww(this, paramair));
  }

  public boolean c(dSc paramdSc)
  {
    return (paramdSc != null) && (this.der.contains(paramdSc.bJ()));
  }

  public Rx d(dSc paramdSc) {
    return this.der.fc(paramdSc.bJ());
  }

  public int e(dSc paramdSc) {
    return this.der.fc(paramdSc.bJ()).value();
  }

  public int f(dSc paramdSc) {
    return this.der.fc(paramdSc.bJ()).max();
  }

  public void q(dGy paramdGy) {
    this.der.M(paramdGy);
  }

  public boolean a(cZr paramcZr)
  {
    paramcZr.clear();
    this.der.c(new bwu(this, paramcZr));

    return true;
  }

  public boolean a(cZr paramcZr, dSc[] paramArrayOfdSc)
  {
    paramcZr.clear();
    for (int i = 0; i < paramArrayOfdSc.length; i++) {
      byte b = paramArrayOfdSc[i].bJ();
      Rx localRx = this.der.fc(b);
      cpD localcpD = new cpD();
      localcpD.cUJ = b;
      localcpD.current = localRx.crh;
      localcpD.min = localRx.crj;
      localcpD.max = localRx.cri;
      paramcZr.kMW.add(localcpD);
    }
    return true;
  }

  public boolean b(cZr paramcZr)
  {
    boolean bool = true;
    for (cpD localcpD : paramcZr.kMW) {
      Rx localRx = this.der.fc(localcpD.cUJ);
      if (localRx != null)
      {
        localRx.crj = localcpD.min;
        localRx.cri = localcpD.max;
        localRx.set(localcpD.current);
      } else {
        K.error("Impossible de trouver la caractéristique à l'index " + localcpD.cUJ);
        bool = false;
      }
    }
    return bool;
  }

  public void a(caY paramcaY)
  {
    this.der.M(new bwz(this, paramcaY));
  }

  public void b(caY paramcaY)
  {
    this.der.M(new bwx(this, paramcaY));
  }
}