import java.util.HashMap;
import java.util.Map;

public final class aql
{
  private static final int dxM = 1;
  private final Map dxN = new HashMap(1);
  private Li dxO;
  private Li dxP;
  private boolean dxQ;

  public aql()
  {
  }

  public aql(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    a(eu.ayN, paramFloat1, paramFloat2);
    a(eu.ayO, paramFloat5, paramFloat6);
    a(eu.ayP, paramFloat3, paramFloat4);
  }

  public void a(eu parameu, float paramFloat1, float paramFloat2) {
    if ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F))
      return;
    this.dxN.put(parameu, new Li(paramFloat1, paramFloat2));
  }

  public float c(eu parameu) {
    Li localLi = (Li)this.dxN.get(parameu);
    if (localLi == null)
      return 0.0F;
    return localLi.VI();
  }

  public float d(eu parameu) {
    Li localLi = (Li)this.dxN.get(parameu);
    if (localLi == null)
      return 0.0F;
    return localLi.VJ();
  }

  public byte b(eu parameu, int paramInt) {
    Li localLi = (Li)this.dxN.get(parameu);
    return localLi == null ? 0 : localLi.fJ(paramInt);
  }

  public Map aCq() {
    return this.dxN;
  }

  public Li aCr() {
    return this.dxP;
  }

  public void A(float paramFloat1, float paramFloat2) {
    this.dxP = new Li(paramFloat1, paramFloat2);
  }

  public Li aCs() {
    return this.dxO;
  }

  public void B(float paramFloat1, float paramFloat2) {
    this.dxO = new Li(paramFloat1, paramFloat2);
  }

  public boolean aCt() {
    return this.dxQ;
  }

  public void cI(boolean paramBoolean) {
    this.dxQ = paramBoolean;
  }
}