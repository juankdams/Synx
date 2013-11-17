import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class bhu extends dNl
{
  private float ehg;
  private float ehh;

  public float aUx()
  {
    return this.ehh;
  }

  public void be(float paramFloat) {
    this.ehh = paramFloat;
  }

  public float aUw() {
    return this.ehg;
  }

  public void bf(float paramFloat) {
    this.ehg = paramFloat;
  }

  public ArrayList eI(boolean paramBoolean) {
    ArrayList localArrayList = new ArrayList(paramBoolean ? dda() : Ke());
    ad(new boj(this, paramBoolean, localArrayList));

    return localArrayList;
  }

  public dag a(asj paramasj) {
    ccq localccq = paramasj.dBZ >= 0 ? ccq.values()[(paramasj.dBZ & 0xFF)] : null;
    dag localdag = new dag(paramasj.cxL, localccq, paramasj.dCa, paramasj.dCb);
    if (localdag.b(paramasj)) {
      e(localdag);
    } else {
      K.error("Erreur durant la désérialisation du DimensionalBagFlea");
      return null;
    }
    return localdag;
  }

  public void btP() {
    ArrayList localArrayList = eI(false);
    for (int i = 0; i < localArrayList.size(); i++)
      ((BG)localArrayList.get(i)).release();
  }

  public void pD(int paramInt)
  {
  }
}