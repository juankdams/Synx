import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class dwv extends alO
{
  private static final Logger K = Logger.getLogger(dwv.class);

  private final LinkedList lBK = new LinkedList();
  private final cAN lBL = new cAN(this);

  private boolean lBM = true;

  public void a(cew paramcew, dpI paramdpI, int paramInt, bBr parambBr, cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2)
  {
    gy localgy = new gy(paramdpI, paramInt, paramcYk, paramBoolean1, paramBoolean2, parambBr, this);
    b(paramcew, localgy);
    if (!localgy.aEK) {
      this.dmN.add(localgy);
    }
    localgy.a(paramcew);
  }

  public void a(cew paramcew, gy paramgy) {
    if (paramgy.aEN == null) {
      paramgy.aEN = this;
    }
    super.b(paramcew, paramgy);
  }

  private void b(gy paramgy) {
    Su localSu = paramgy.aEM.cbD();
    if ((localSu != null) && (localSu.afk())) {
      paramgy.aEL = null;
      return;
    }

    paramgy.aEL = cof.cop().vY(paramgy.aEG);
    paramgy.aEL.setVisible(this.lBM);
    cWS.cKD().b(paramgy.aEL);

    if (paramgy.aEH != null)
      paramgy.aEL.k(paramgy.aEH.getX(), paramgy.aEH.getY(), paramgy.aEH.IB());
    else {
      switch (aEd.dZv[paramgy.aEJ.ordinal()]) {
      case 1:
      case 2:
        paramgy.aEL.b(paramgy.aEM);
        break;
      case 3:
        paramgy.aEL.a(paramgy.aEM, 1.0F, 0);
        break;
      case 4:
        paramgy.aEL.a(paramgy.aEM, 0.5F, 0);
        break;
      default:
        K.error("Localisation d'aps non traitee " + paramgy.aEJ);
      }
    }

    if ((localSu != null) && (localSu.adF())) {
      paramgy.aEL.cS(localSu.aeR());
    }

    if (paramgy.aEO)
      paramgy.aEL.gW(false);
    else
      paramgy.aEO = true;
  }

  protected void b(cew paramcew, gy paramgy)
  {
    if ((!paramgy.aEI) && (!paramgy.aEK)) {
      this.lBK.addLast(paramgy);
    }
    if (!this.lBL.isRunning())
      this.lBL.cxq();
  }

  public void a(gy paramgy1, gy paramgy2, cew paramcew)
  {
    c(paramgy2);

    if (paramgy2 == this.lBK.peek()) {
      this.lBK.poll();
      e((gy)this.lBK.peek());
    } else {
      this.lBK.remove(paramgy2);
    }
    if (isEmpty())
      this.lBL.cxr();
  }

  private void c(gy paramgy)
  {
    if (paramgy == null) {
      return;
    }
    if (paramgy.aEL == null) {
      return;
    }

    paramgy.aEL.kill();
    paramgy.aEL = null;
  }

  public void dbM() {
    if ((this.lBK.isEmpty()) || (this.lBK.size() == 1)) {
      return;
    }
    gy localgy = (gy)this.lBK.poll();
    d(localgy);
    this.lBK.addLast(localgy);
    try {
      e((gy)this.lBK.peek());
    } catch (Exception localException) {
      K.error("Exception levee", localException);
      this.lBK.poll();
    }
  }

  private void d(gy paramgy) {
    if ((paramgy == null) || (paramgy.aEL == null) || (!paramgy.aEL.isAlive())) {
      return;
    }

    paramgy.aEL.ciX();
  }

  private void e(gy paramgy) {
    if (paramgy == null) {
      return;
    }
    if ((paramgy.aEL == null) || (!paramgy.aEL.isAlive())) {
      b(paramgy);
    } else {
      paramgy.aEL.reset();
      paramgy.aEL.start();
    }
  }

  public void eT(boolean paramBoolean) {
    this.lBM = paramBoolean;
    gy localgy = (gy)this.lBK.peek();
    if ((localgy == null) || (localgy.aEL == null)) {
      return;
    }

    cWS.cKD().B(localgy.aEL.getId(), paramBoolean);
  }

  public void f(gy paramgy) {
    if ((paramgy.aEI) || (paramgy.aEK))
      b(paramgy);
    else if (this.lBK.size() == 1)
      if (this.lBK.peek() == paramgy)
        b(paramgy);
      else
        K.warn("Si la liste est de taille 1, le premier element devrait etre celui la, ce n'est pas nomal d'en avoir un autre");
  }

  public void b(cew paramcew)
  {
    gy localgy = (gy)ayx();
    this.dmN.clear();
    a(localgy, localgy, paramcew);
  }

  public void b(cew paramcew, dpI paramdpI, int paramInt, bBr parambBr, cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2) {
    gy localgy1 = new gy(paramdpI, paramInt, paramcYk, paramBoolean1, paramBoolean2, parambBr, this);
    if (localgy1.aEK) {
      gy localgy2 = (gy)ayx();
      a(localgy2, null, paramcew);
    } else {
      a(paramcew, localgy1, false);
    }
  }
}