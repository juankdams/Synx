import java.util.ArrayList;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;

public class ajQ
{
  private static final Logger K = Logger.getLogger(ajQ.class);

  private final aEU djw = new aEU();
  private final ArrayList djx = new ArrayList(3);

  private static final ajQ djy = new ajQ();

  public void c(GL paramGL)
  {
    if (this.djx.size() > 0) {
      a(paramGL, this.djw, (aEU)this.djx.get(this.djx.size() - 1));
      this.djx.clear();
    }
    paramGL.glDisable(2960);
    paramGL.glStencilMask(-1);
    paramGL.glClearStencil(0);
    paramGL.glClear(17408);
  }

  public static ajQ axf()
  {
    return djy;
  }

  public void a(GL paramGL, aEU paramaEU)
  {
    int i = this.djx.size();
    if (i == 0)
      a(paramGL, paramaEU, this.djw);
    else
      a(paramGL, paramaEU, (aEU)this.djx.get(i - 1));
    this.djx.add(paramaEU);
  }

  public void d(GL paramGL) {
    a(paramGL, 1);
  }

  public void a(GL paramGL, int paramInt) {
    if ((!bB) && (paramInt <= 0)) throw new AssertionError();
    int i = this.djx.size();
    if (i == 0)
      return;
    aEU localaEU1 = null;
    for (int j = 0; j < paramInt; j++) {
      localaEU1 = (aEU)this.djx.remove(--i);
    }

    if ((!bB) && (i != this.djx.size())) throw new AssertionError();
    if (i == 0) {
      a(paramGL, this.djw, localaEU1);
    } else {
      aEU localaEU2 = (aEU)this.djx.get(i - 1);
      a(paramGL, localaEU2, localaEU1);
    }
  }

  private void a(GL paramGL, aEU paramaEU1, aEU paramaEU2) {
    if (paramaEU1.eaA != paramaEU2.eaA) {
      paramGL.glStencilMask(paramaEU1.eaA);
    }
    if (paramaEU1.eaG != paramaEU2.eaG) {
      paramGL.glColorMask(paramaEU1.eaG, paramaEU1.eaG, paramaEU1.eaG, paramaEU1.eaG);
    }
    if (paramaEU1.eaB != paramaEU2.eaB) {
      if (paramaEU1.eaB)
        paramGL.glEnable(2960);
      else {
        paramGL.glDisable(2960);
      }
    }
    if (paramaEU1.eaC != paramaEU2.eaC) {
      paramGL.glStencilOp(paramaEU1.eaC, 7680, 7680);
    }
    if ((paramaEU1.eaD != paramaEU2.eaD) || (paramaEU1.eaE != paramaEU2.eaE) || (paramaEU1.eaF != paramaEU2.eaF))
    {
      paramGL.glStencilFunc(paramaEU1.eaD, paramaEU1.eaE, paramaEU1.eaF);
    }paramGL.glFlush();
  }
}