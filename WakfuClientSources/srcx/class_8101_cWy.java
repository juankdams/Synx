import java.util.BitSet;

abstract class cWy extends aAn
  implements aTa, agl
{
  private KM kJp = new KM(this);

  cWy() {
  }

  cWy(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public boolean Vi() {
    return this.kJp.Vi();
  }

  public boolean a(cYl paramcYl) {
    return this.kJp.a(paramcYl);
  }

  public boolean Vj() {
    return this.kJp.Vj();
  }

  public void b(cYl paramcYl) {
    this.kJp.b(paramcYl);
  }

  public void Vk() {
    this.kJp.Vk();
  }

  public cYl Vl() {
    return this.kJp.Vl();
  }

  public short arG() {
    return 1;
  }

  public cOE aIq() {
    return this.ejP;
  }

  public void q(int paramInt1, int paramInt2, short paramShort) {
    d(paramInt1, paramInt2, paramShort);
    atl();
  }

  public void atl() {
    if ((atL()) || (cly())) {
      return;
    }
    mk();
    UG localUG = aIq().LB();
    if ((localUG != null) && (atP()) && (!Vj()))
      localUG.a(this, fa(), fb());
  }
}