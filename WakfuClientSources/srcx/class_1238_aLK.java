import java.util.ArrayList;
import java.util.List;

final class aLK
  implements cEG
{
  private final List aEZ = new ArrayList();
  private final anX eqD;
  private short aFe;

  aLK(anX paramanX)
  {
    this.eqD = paramanX;
    this.aFe = 1;
  }

  public int tc() {
    return this.eqD.getId();
  }

  public short nP() {
    return this.aFe;
  }

  public short nR() {
    return this.eqD.nR();
  }

  void l(short paramShort) {
    int i = paramShort - this.aFe;
    this.aFe = paramShort;
    na(i);
  }

  private void na(int paramInt)
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((bmN)this.aEZ.get(i)).b(this, paramInt);
  }

  public boolean a(bmN parambmN) {
    return (!this.aEZ.contains(parambmN)) && (this.aEZ.add(parambmN));
  }

  public boolean b(bmN parambmN) {
    return this.aEZ.remove(parambmN);
  }

  public String toString()
  {
    return "QuestItem{m_refId=" + this.eqD + ", m_quantity=" + this.aFe + '}';
  }
}