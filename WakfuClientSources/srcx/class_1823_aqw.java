import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aqw extends cqm
{
  protected static final Logger K = Logger.getLogger(aqw.class);
  private don dyb;
  public static final byte crg = 12;
  protected int crh;
  protected int cri;
  protected int crj;
  protected int aAr;
  protected int aAq;

  public aqw(byte paramByte, ByteBuffer paramByteBuffer)
  {
    this.dyb = don.c(Byte.valueOf(paramByte));
    ae(paramByteBuffer);
    if (this.dyb == null)
      throw new IllegalArgumentException("Erreur dans la désérialisation de la Charactéristique, Type inconnu : " + paramByte);
  }

  public aqw(don paramdon, int paramInt1, int paramInt2)
  {
    this.dyb = paramdon;
    an(paramInt1, paramInt2);
  }

  public don aCG()
  {
    return this.dyb;
  }

  public int value()
  {
    if (this.crh > this.cri)
      return max();
    if (this.crh < this.crj)
      return min();
    return this.crh;
  }

  public int acU()
  {
    return this.crh;
  }

  public int max()
  {
    return this.cri;
  }

  public int acX()
  {
    return this.cri;
  }

  public int min()
  {
    return this.crj;
  }

  public int gu(int paramInt)
  {
    return 0;
  }

  public void set(int paramInt)
  {
    set(paramInt, true);
  }

  private void set(int paramInt, boolean paramBoolean)
  {
    int i = this.cri < paramInt ? this.cri : paramInt;
    this.crh = (this.crj > i ? this.crj : i);
    if (paramBoolean)
      cpB();
  }

  public int gv(int paramInt)
  {
    set(this.crh + paramInt);
    cpB();
    return this.crh;
  }

  public int gw(int paramInt)
  {
    set(this.crh - paramInt);
    cpB();
    return this.crh;
  }

  public void setMax(int paramInt)
  {
    f(paramInt, true);
  }

  private void f(int paramInt, boolean paramBoolean)
  {
    int i = this.aAr < paramInt ? this.aAr : paramInt;
    this.cri = (this.aAq > i ? this.aAq : i);
    this.cri = (this.cri > this.crj ? this.cri : this.crj);

    if (this.crh > this.cri) {
      this.crh = this.cri;
    }
    if (paramBoolean)
      cpB();
  }

  public void setMin(int paramInt)
  {
    g(paramInt, true);
  }

  private void g(int paramInt, boolean paramBoolean)
  {
    int i = this.aAq > paramInt ? this.aAq : paramInt;
    this.crj = (this.aAr < i ? this.aAr : i);
    this.crj = (this.cri < this.crj ? this.cri : this.crj);

    if (this.crh < this.crj) {
      this.crh = this.crj;
    }
    if (paramBoolean)
      cpB();
  }

  public int gx(int paramInt)
  {
    if (this.cri == 2147483647)
      return this.cri;
    setMax(this.cri + paramInt);
    return this.cri;
  }

  public int gy(int paramInt)
  {
    if (this.crj == -2147483648)
      return this.crj;
    setMin(this.crj + paramInt);
    return this.crj;
  }

  private void an(int paramInt1, int paramInt2)
  {
    this.aAq = (paramInt1 < paramInt2 ? paramInt1 : paramInt2);
    this.aAr = (paramInt1 > paramInt2 ? paramInt1 : paramInt2);

    if (this.cri > this.aAr)
      setMax(this.aAr);
    if (this.crj < this.aAq)
      setMin(this.aAq);
  }

  public void ad(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.crh);
    paramByteBuffer.putInt(this.crj);
    paramByteBuffer.putInt(this.cri);
  }

  public void ae(ByteBuffer paramByteBuffer) {
    this.crh = paramByteBuffer.getInt();
    this.crj = paramByteBuffer.getInt();
    this.cri = paramByteBuffer.getInt();
  }

  public void acY()
  {
    g(this.dyb.lq(), false);
    f(this.dyb.lr(), false);
    set(this.dyb.getDefaultValue(), false);

    cpB();
  }
}