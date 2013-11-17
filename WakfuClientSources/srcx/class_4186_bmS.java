import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;

public abstract class bmS extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Glyphe standard", new dou[0]), new axp("Glyphe paramétrée", new dou[] { new dou("le casteur doit rester sur sa position de cast (1=oui)") }), new axp("Owner is caster", new dou[] { new dou("le casteur doit rester sur sa position de cast (1=oui)"), new dou("le casteur doit etre le caster de la glyphe") }) });

  private final cYk aGF = new cYk();
  private boolean fFM = false;
  protected boolean fFN = false;

  private long[] aGI = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  protected bmS()
  {
  }

  public bmS(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public bmS l(agg paramagg) {
    bmS localbmS = (bmS)super.a(paramagg);
    if (paramagg != null) {
      if (paramagg.axG() != null) {
        dle localdle = paramagg.axG();
        localbmS.f(localdle.fa(), localdle.fb(), localdle.fc());
      }
      localbmS.c(paramagg.E());
    }

    return localbmS;
  }

  public void initialize() {
    if (this.baW == null) {
      this.fFM = false;
      this.fFN = false;
      return;
    }

    this.fFM = ((this.baW.length > 0) && (vy(0) == 1.0F));
    this.fFN = ((this.baW.length > 1) && (vy(1) == 1.0F));
  }

  public void f(int paramInt1, int paramInt2, short paramShort) {
    this.aGF.setX(paramInt1);
    this.aGF.setY(paramInt2);
    this.aGF.dG(paramShort);
  }

  public boolean bxu() {
    if (!this.fFM) {
      return true;
    }
    if (this.fuA != null) {
      if (!this.aGF.Z(this.fuA.fa(), this.fuA.fb(), this.fuA.fc())) {
        return false;
      }
      return true;
    }

    return false;
  }

  public int getType() {
    return xj.bpj.xj();
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aGI;
    }
    return null;
  }

  public ArrayList b(alr paramalr) {
    if (paramalr == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramalr);
    return localArrayList;
  }

  public boolean c(alr paramalr)
  {
    return true;
  }

  public ByteBuffer pr() {
    ByteBuffer localByteBuffer = super.pr();
    if (this.fFM) {
      localByteBuffer.put((byte)1);
      localByteBuffer.putInt(this.aGF.getX());
      localByteBuffer.putInt(this.aGF.getY());
      localByteBuffer.putShort(this.aGF.IB());
    } else {
      localByteBuffer.put((byte)0);
    }
    return localByteBuffer;
  }

  public void u(ByteBuffer paramByteBuffer) {
    super.u(paramByteBuffer);
    this.fFM = (paramByteBuffer.get() == 1);
    if (this.fFM)
      f(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
  }

  public int cc()
  {
    return super.cc() + 1 + (this.fFM ? 10 : 0);
  }
}