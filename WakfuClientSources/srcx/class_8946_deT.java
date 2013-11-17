import java.util.ArrayList;
import java.util.Iterator;

public class deT
{
  private final int aw;
  private final int kZc;
  private final float frL;
  private final boolean bYt;
  private final boolean kNu;
  private final boolean kNv;
  private final cSR kZd = new cSR();
  private cSR kZe = null;

  public deT(int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.aw = paramInt1;
    this.kZc = paramInt2;
    this.frL = paramFloat;
    this.bYt = paramBoolean1;
    this.kNu = paramBoolean2;
    this.kNv = paramBoolean3;
  }

  public int getId()
  {
    return this.aw;
  }

  public int cPh() {
    return this.kZc;
  }

  public float bAz() {
    return this.frL;
  }

  public boolean Wk() {
    return (this.bYt) || (cMu());
  }

  public boolean cMu() {
    return this.kNu;
  }

  public cGx zP(int paramInt) {
    return (cGx)this.kZd.get(paramInt);
  }

  public dmn cPi() {
    return this.kZd.yF();
  }

  public Iterator zQ(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.kZe.get(paramInt);
    return localArrayList != null ? localArrayList.iterator() : null;
  }

  public boolean zR(int paramInt) {
    return this.kZe.get(paramInt) != null;
  }

  public int cPj() {
    return this.kZd.size();
  }

  public boolean cMv() {
    return this.kNv;
  }

  public void g(cSR paramcSR)
  {
    this.kZe = paramcSR;
  }

  public void a(int paramInt, cGx paramcGx) {
    this.kZd.put(paramInt, paramcGx);
  }
}