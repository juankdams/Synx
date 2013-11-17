import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aCP extends cqm
{
  protected static final Logger K = Logger.getLogger(aCP.class);
  private avB dXy;
  public static final byte crg = 12;
  protected int crh;
  protected int cri;
  protected int crj;
  protected int aAr;
  protected int aAq;

  public aCP(byte paramByte, ByteBuffer paramByteBuffer)
  {
    this.dXy = avB.b(Byte.valueOf(paramByte));
    ae(paramByteBuffer);
    if (this.dXy == null)
      throw new IllegalArgumentException("Erreur dans la désérialisation de la Charactéristique, Type inconnu : " + paramByte);
  }

  public aCP(avB paramavB, int paramInt1, int paramInt2)
  {
    this.dXy = paramavB;
    an(paramInt1, paramInt2);
    if (paramavB != null)
      this.crh = paramavB.getDefaultValue();
  }

  public avB aOW()
  {
    return this.dXy;
  }

  public int acU()
  {
    return this.crh;
  }

  public int value()
  {
    if (this.crh > this.cri)
      return max();
    if (this.crh < this.crj)
      return min();
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

  private void set(int paramInt, boolean paramBoolean) {
    this.crh = Math.max(this.crj, Math.min(this.cri, paramInt));
    if (paramBoolean)
      cpB();
  }

  public int gv(int paramInt)
  {
    set(this.crh + paramInt);
    return this.crh;
  }

  public int gw(int paramInt)
  {
    set(this.crh - paramInt);
    return this.crh;
  }

  public void setMax(int paramInt)
  {
    f(paramInt, true);
  }

  private void f(int paramInt, boolean paramBoolean)
  {
    this.cri = Math.max(this.aAq, Math.min(this.aAr, paramInt));
    this.cri = Math.max(this.cri, this.crj);

    if (this.crh > this.cri)
      this.crh = this.cri;
    if (paramBoolean)
      cpB();
  }

  public void setMin(int paramInt)
  {
    g(paramInt, true);
  }

  private void g(int paramInt, boolean paramBoolean)
  {
    this.crj = Math.min(this.aAr, Math.max(this.aAq, paramInt));
    this.crj = Math.min(this.cri, this.crj);

    if (this.crh < this.crj)
      this.crh = this.crj;
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
    this.aAq = Math.min(paramInt1, paramInt2);
    this.aAr = Math.max(paramInt1, paramInt2);

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
    g(this.dXy.lq(), false);
    f(this.dXy.lr(), false);
    set(this.dXy.getDefaultValue(), false);
    cpB();
  }
}