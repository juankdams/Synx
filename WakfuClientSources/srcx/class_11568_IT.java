import java.util.ArrayList;

public abstract class IT extends daU
{
  public int k(float paramFloat1, float paramFloat2)
  {
    int i = 0;
    ArrayList localArrayList = this.kSP;
    int j = 0; for (int k = localArrayList.size(); j < k; j++) {
      dCb localdCb = (dCb)localArrayList.get(j);
      if (localdCb.w(paramFloat1, paramFloat2)) {
        localdCb.setSelected(true);
        i++;
      } else {
        localdCb.setSelected(false);
      }
    }
    return i;
  }

  protected void a(dCb paramdCb, cXf paramcXf) {
    if (!paramdCb.atE()) {
      return;
    }
    cYm localcYm = up.b(paramcXf, paramdCb);
    int i = bCO.bC(localcYm.aOR);
    int j = bCO.bC(localcYm.aOS);

    int k = up.a(paramcXf, paramdCb.ats());

    if ((i != paramdCb.getScreenX()) || (j != paramdCb.getScreenY()) || (k != paramdCb.eY())) {
      paramdCb.setScreenX(i);
      paramdCb.setScreenY(j);
      paramdCb.T(k);
      paramdCb.atF();
    }
  }
}