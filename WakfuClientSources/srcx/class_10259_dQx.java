import java.nio.ByteBuffer;

public class dQx
{
  public static final int mkP = 16;
  public int hqu;
  public int hqv;
  public int hqw;
  public int hqx;

  public dQx(dQx paramdQx)
  {
    e(paramdQx);
  }

  public dQx(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    set(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public dQx() {
    this.hqu = -2147483648;
    this.hqv = 2147483647;
    this.hqw = -2147483648;
    this.hqx = 2147483647;
  }

  public final ByteBuffer aW(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.hqu);
    paramByteBuffer.putInt(this.hqw);
    paramByteBuffer.putInt(this.hqv);
    paramByteBuffer.putInt(this.hqx);
    return paramByteBuffer;
  }

  public final ByteBuffer aX(ByteBuffer paramByteBuffer) {
    this.hqu = paramByteBuffer.getInt();
    this.hqw = paramByteBuffer.getInt();
    this.hqv = paramByteBuffer.getInt();
    this.hqx = paramByteBuffer.getInt();
    return paramByteBuffer;
  }

  public final void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.hqu = paramInt1;
    this.hqv = paramInt2;
    this.hqw = paramInt3;
    this.hqx = paramInt4;
  }

  public final void e(dQx paramdQx) {
    this.hqu = paramdQx.hqu;
    this.hqv = paramdQx.hqv;
    this.hqw = paramdQx.hqw;
    this.hqx = paramdQx.hqx;
  }

  public final void translate(int paramInt1, int paramInt2) {
    this.hqu += paramInt1;
    this.hqv += paramInt1;
    this.hqw += paramInt2;
    this.hqx += paramInt2;
  }

  public final int drw() {
    return this.hqu;
  }

  public final void DC(int paramInt) {
    this.hqu = paramInt;
  }

  public final int drx() {
    return this.hqv;
  }

  public final void DD(int paramInt) {
    this.hqv = paramInt;
  }

  public final int dry() {
    return this.hqw;
  }

  public final void DE(int paramInt) {
    this.hqw = paramInt;
  }

  public final int drz() {
    return this.hqx;
  }

  public final void DF(int paramInt) {
    this.hqx = paramInt;
  }

  public final int width() {
    return this.hqv - this.hqu + 1;
  }

  public final int height() {
    return this.hqx - this.hqw + 1;
  }

  public final boolean contains(int paramInt1, int paramInt2) {
    return (paramInt1 >= this.hqu) && (paramInt1 <= this.hqv) && (paramInt2 >= this.hqw) && (paramInt2 <= this.hqx);
  }

  public final boolean f(dQx paramdQx)
  {
    return O(paramdQx.hqu, paramdQx.hqv, paramdQx.hqw, paramdQx.hqx);
  }

  public final boolean O(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 > this.hqv) {
      return false;
    }
    if (paramInt2 < this.hqu) {
      return false;
    }
    if (paramInt3 > this.hqx) {
      return false;
    }

    if (paramInt4 < this.hqw) {
      return false;
    }
    return true;
  }

  public final void fr(int paramInt1, int paramInt2) {
    this.hqu = Math.min(paramInt1, this.hqu);
    this.hqv = Math.max(paramInt1, this.hqv);
    this.hqw = Math.min(paramInt2, this.hqw);
    this.hqx = Math.max(paramInt2, this.hqx);
  }

  public final void g(dQx paramdQx) {
    this.hqu = Math.min(paramdQx.hqu, this.hqu);
    this.hqv = Math.max(paramdQx.hqv, this.hqv);
    this.hqw = Math.min(paramdQx.hqw, this.hqw);
    this.hqx = Math.max(paramdQx.hqx, this.hqx);
  }

  public String toString()
  {
    return "(" + this.hqu + ", " + this.hqw + ") - (" + this.hqv + ", " + this.hqx + ")";
  }

  public double getCenterX() {
    return (this.hqu + this.hqv) * 0.5D;
  }

  public double getCenterY() {
    return (this.hqw + this.hqx) * 0.5D;
  }
}