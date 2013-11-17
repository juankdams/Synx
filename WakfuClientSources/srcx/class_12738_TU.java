public class TU extends cih
{
  private final cSR aRb = new cSR();
  private final cSi cxk = new cSi();

  public TU(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3) {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
  }

  public void b(cLD paramcLD) {
    this.aRb.put(paramcLD.getId(), paramcLD);
    this.cxk.add(paramcLD.getId());
  }

  public dmn ahp() {
    return this.aRb.yF();
  }

  public int size() {
    return this.aRb.size();
  }

  public cLD gM(int paramInt) {
    return (cLD)this.aRb.get(paramInt);
  }

  public cLD gN(int paramInt) {
    return (cLD)this.aRb.get(this.cxk.get(paramInt));
  }

  public int ahq() {
    return this.aRb.size();
  }
}