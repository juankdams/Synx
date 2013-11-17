import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class aNK
  implements dpI
{
  private aVc etJ;

  public aNK(aVc paramaVc)
  {
    this.etJ = paramaVc;
  }

  public byte ben() {
    return ((dpI)this.etJ.bkc()).ben();
  }

  public float[] beo() {
    return ((dpI)this.etJ.bkc()).beo();
  }

  public int bep() {
    return ((dpI)this.etJ.bkc()).bep();
  }

  public int a(int paramInt, short paramShort, dNF paramdNF) {
    if (((this.etJ instanceof kM)) && (paramInt == 0)) {
      int i = ((dpI)this.etJ.bkc()).a(0, paramShort, dNF.meh);
      if ((i == -1) || (i == -2))
        return this.etJ.getValue();
    } else if (((this.etJ instanceof dqZ)) && (bep() == 4) && (paramInt == 0)) {
      return this.etJ.getValue();
    }

    return ((dpI)this.etJ.bkc()).a(paramInt, paramShort, paramdNF);
  }

  public float o(int paramInt, short paramShort) {
    if (((this.etJ instanceof kM)) && (paramInt == 0)) {
      float f = ((dpI)this.etJ.bkc()).o(0, paramShort);
      if ((f == -1.0F) || (f == -2.0F))
        return this.etJ.getValue();
    } else if (((this.etJ instanceof dqZ)) && (bep() == 4) && (paramInt == 0)) {
      return this.etJ.getValue();
    }

    return ((dpI)this.etJ.bkc()).o(paramInt, paramShort);
  }

  public float nl(int paramInt) {
    if (((this.etJ instanceof kM)) && (paramInt == 0)) {
      float f = ((dpI)this.etJ.bkc()).nl(0);
      if ((f == -1.0F) || (f == -2.0F))
        return this.etJ.getValue();
    } else if (((this.etJ instanceof dqZ)) && (bep() == 4) && (paramInt == 0)) {
      return this.etJ.getValue();
    }

    return ((dpI)this.etJ.bkc()).nl(paramInt);
  }

  public boolean beq() {
    return ((dpI)this.etJ.bkc()).beq();
  }

  public boolean ber() {
    return ((dpI)this.etJ.bkc()).ber();
  }

  public boolean bes() {
    return ((dpI)this.etJ.bkc()).bes();
  }

  public boolean bet() {
    return ((dpI)this.etJ.bkc()).bet();
  }

  public dpI beu() {
    return ((dpI)this.etJ.bkc()).beu();
  }

  public boolean bev() {
    return ((dpI)this.etJ.bkc()).bev();
  }

  public boolean om() {
    return ((dpI)this.etJ.bkc()).om();
  }

  public boolean on() {
    return ((dpI)this.etJ.bkc()).on();
  }

  public int zB() {
    return ((dpI)this.etJ.bkc()).zB();
  }

  public int zC() {
    return ((dpI)this.etJ.bkc()).zC();
  }

  public bZA bew() {
    return ((dpI)this.etJ.bkc()).bew();
  }

  public float bm(short paramShort) {
    return ((dpI)this.etJ.bkc()).bm(paramShort);
  }

  public float bex() {
    return ((dpI)this.etJ.bkc()).bex();
  }

  public void a(cHP paramcHP) {
  }

  public void b(cHP paramcHP) {
  }

  public void c(cHP paramcHP) {
  }

  public void d(cHP paramcHP) {
  }

  public void e(cHP paramcHP) {
  }

  public Iterator bey() {
    return null;
  }

  public Iterator bez() {
    return null;
  }

  public bbH beA() {
    return null;
  }

  public float zx() {
    return 0.0F;
  }

  public int zM() {
    return 0;
  }

  public void ko(int paramInt) {
  }

  public void dH(boolean paramBoolean) {
  }

  public List beB() {
    return null;
  }

  public boolean f(cHP paramcHP) {
    return false;
  }

  public boolean g(cHP paramcHP) {
    return false;
  }

  public boolean h(cHP paramcHP) {
    return false;
  }

  public boolean i(cHP paramcHP) {
    return false;
  }

  public boolean j(cHP paramcHP) {
    return false;
  }

  public void a(aGX paramaGX) {
  }

  public void a(aVe paramaVe) {
  }

  public void a(cSp paramcSp) {
  }

  public void dI(boolean paramBoolean) {
  }

  public boolean zP() {
    return ((dpI)this.etJ.bkc()).zP();
  }

  public boolean zQ() {
    return ((dpI)this.etJ.bkc()).zQ();
  }

  public void dJ(boolean paramBoolean) {
  }

  public boolean yL() {
    return ((dpI)this.etJ.bkc()).yL();
  }

  public boolean atS() {
    return ((dpI)this.etJ.bkc()).atS();
  }

  public boolean atT() {
    return false;
  }

  public boolean atU() {
    return false;
  }

  public boolean atX() {
    return false;
  }

  public boolean aiz() {
    return false;
  }

  public boolean atY() {
    return false;
  }

  public byte aMG() {
    return ((dpI)this.etJ.bkc()).aMG();
  }

  public int yR() {
    return ((dpI)this.etJ.bkc()).yR();
  }

  public int eo() {
    return ((dpI)this.etJ.bkc()).eo();
  }

  public boolean cL(long paramLong) {
    return ((dpI)this.etJ.bkc()).cL(paramLong);
  }

  public dRh atZ() {
    return ((dpI)this.etJ.bkc()).atZ();
  }

  public BitSet aua() {
    return null;
  }

  public BitSet aub() {
    return null;
  }

  public BitSet auc() {
    return null;
  }

  public BitSet aud() {
    return null;
  }

  public BitSet aue() {
    return null;
  }

  public BitSet auf() {
    return null;
  }

  public boolean aug() {
    return false;
  }

  public BitSet auh() {
    return null;
  }

  public bbq a(Ce paramCe, dle paramdle1, cOE paramcOE, avY paramavY, int paramInt1, int paramInt2, short paramShort, dle paramdle2, ZS paramZS) {
    return null;
  }

  public bbH aui() {
    return ((dpI)this.etJ.bkc()).aui();
  }

  public boolean zi() {
    return false;
  }

  public long getFlags() {
    return ((dpI)this.etJ.bkc()).getFlags();
  }

  public short auj() {
    return ((dpI)this.etJ.bkc()).auj();
  }

  public void ay(short paramShort) {
  }

  public boolean zN() {
    return ((dpI)this.etJ.bkc()).zN();
  }

  public boolean aul() {
    return ((dpI)this.etJ.bkc()).aul();
  }

  public aVe atV() {
    return ((dpI)this.etJ.bkc()).atV();
  }

  public cSp atW() {
    return ((dpI)this.etJ.bkc()).atW();
  }

  public boolean beC() {
    return ((dpI)this.etJ.bkc()).beC();
  }

  public boolean beD() {
    return ((dpI)this.etJ.bkc()).beD();
  }

  public boolean beE() {
    return ((dpI)this.etJ.bkc()).beE();
  }

  public boolean beF() {
    return ((dpI)this.etJ.bkc()).beF();
  }

  public boolean a(PY paramPY) {
    return false;
  }
}