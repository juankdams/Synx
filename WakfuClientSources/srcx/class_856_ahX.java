import java.util.ArrayList;
import org.apache.log4j.Logger;

class ahX
{
  protected static final Logger K = Logger.getLogger(ahX.class);

  private final azF ddV = new azF();
  private final ArrayList ddW = new ArrayList();
  private final cSi ddX = new cSi();
  private final ArrayList ddY = new ArrayList();

  void update(int paramInt)
  {
    this.ddY.clear();

    this.ddX.rH();
    int i = 0; for (int j = this.ddW.size(); i < j; i++) {
      awC localawC = (awC)this.ddW.get(i);
      localawC.update(paramInt);
      localawC.x(this.ddY);
      if (localawC.xP() == 0.0F) {
        this.ddX.add(i);
      }
    }

    for (i = this.ddX.size() - 1; i >= 0; i--) {
      this.ddW.remove(this.ddX.wm(i));
    }

    ArrayList localArrayList = this.ddV.A(this.ddY);
    j = 0; for (int k = localArrayList.size(); j < k; j++)
      ((bGg)localArrayList.get(j)).aMH();
  }

  void a(aDR paramaDR)
  {
    awC localawC = iu(paramaDR.getId());
    if (localawC == null) {
      localawC = new awC(paramaDR, null);
      this.ddW.add(localawC);
    }
    localawC.aH(1.0F);
  }

  void b(aDR paramaDR) {
    awC localawC = iu(paramaDR.getId());
    if (localawC != null)
      localawC.aH(0.0F);
  }

  private awC iu(int paramInt) {
    for (int i = this.ddW.size() - 1; i >= 0; i--) {
      awC localawC = (awC)this.ddW.get(i);
      if (awC.a(localawC).getId() == paramInt) {
        return localawC;
      }
    }
    return null;
  }

  void a(ckq paramckq, cXf paramcXf) {
    this.ddV.a(paramckq, paramcXf);
  }

  void clear() {
    this.ddY.clear();
    this.ddW.clear();
    this.ddV.clear();
  }

  public void reset() {
    this.ddV.reset();
  }
}