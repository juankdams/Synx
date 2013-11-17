import com.sun.opengl.util.BufferUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import org.apache.log4j.Logger;

public final class cgE
{
  private cCE[] hED;
  private final Yr dGz;
  private final int m_size;
  private final ayA bee;
  private static final Logger K = Logger.getLogger(cgE.class);
  private static final boolean DEBUG = false;
  private final Object dGD = new Object();

  public cgE(tw paramtw)
  {
    this.m_size = paramtw.getBufferSize();
    this.bee = paramtw.BG();
    int i = paramtw.BF();

    Buffer localBuffer1 = a(this.m_size * i, this.bee);

    this.hED = new cCE[i];

    for (int j = 0; j < this.hED.length; j++) {
      Buffer localBuffer2 = a(localBuffer1, j * this.m_size, this.m_size, this.bee);
      this.hED[j] = a(localBuffer2, j, this.bee);
    }

    this.dGz = new Yr(paramtw.BF());
  }

  public final cCE ciF()
  {
    synchronized (this.dGD) {
      int i = this.dGz.ajZ();
      if (i == -1) {
        int j = this.hED.length;
        int k;
        if (j < 4096)
          k = j;
        else {
          k = 4096;
        }
        j += k;
        cCE[] arrayOfcCE = new cCE[j];
        System.arraycopy(this.hED, 0, arrayOfcCE, 0, this.hED.length);

        Buffer localBuffer1 = a(this.m_size * k, this.bee);

        for (int m = this.hED.length; m < arrayOfcCE.length; m++) {
          int n = m - this.hED.length;
          Buffer localBuffer2 = a(localBuffer1, n * this.m_size, this.m_size, this.bee);
          arrayOfcCE[m] = a(localBuffer2, m, this.bee);
        }
        if ((!bB) && (this.dGz.getSize() != this.hED.length)) throw new AssertionError();
        this.dGz.resize(j);
        this.hED = arrayOfcCE;
        if ((!bB) && (this.dGz.getSize() != this.hED.length)) throw new AssertionError();
        i = this.dGz.ajZ();
      }

      return this.hED[i];
    }
  }

  public final void a(cCE paramcCE) {
    synchronized (this.dGD) {
      this.dGz.hq(paramcCE.getId());
    }
  }

  public final void ciG() {
    synchronized (this.dGD) {
      this.dGz.aka();
    }
  }

  public final int getSize() {
    return this.m_size;
  }

  public final int ciH() {
    synchronized (this.dGD) {
      return this.hED.length * this.m_size;
    }
  }

  public final int ciI() {
    synchronized (this.dGD) {
      return this.dGz.akb() * this.m_size;
    }
  }

  public final int ciJ() {
    synchronized (this.dGD) {
      return this.dGz.akc() * this.m_size;
    }
  }

  private cCE a(Buffer paramBuffer, int paramInt, ayA paramayA)
  {
    switch (czn.iog[paramayA.ordinal()]) {
    case 1:
      return new oC(paramBuffer, this.m_size, paramInt, this);
    case 2:
      return new ayd(paramBuffer, this.m_size, paramInt, this);
    case 3:
      return new Jh(paramBuffer, this.m_size, paramInt, this);
    }
    if (!bB) throw new AssertionError("Buffer type not supported");

    return null;
  }

  private static Buffer a(Buffer paramBuffer, int paramInt1, int paramInt2, ayA paramayA) {
    switch (czn.iog[paramayA.ordinal()]) {
    case 1:
      paramBuffer.position(paramInt1);
      paramBuffer.limit(paramInt1 + paramInt2);
      ByteBuffer localByteBuffer = (ByteBuffer)paramBuffer;
      return localByteBuffer.slice();
    case 2:
      paramBuffer.position(paramInt1 >> 1);
      paramBuffer.limit(paramInt1 + paramInt2 >> 1);
      ShortBuffer localShortBuffer = (ShortBuffer)paramBuffer;
      return localShortBuffer.slice();
    case 3:
      paramBuffer.position(paramInt1 >> 2);
      paramBuffer.limit(paramInt1 + paramInt2 >> 2);
      FloatBuffer localFloatBuffer = (FloatBuffer)paramBuffer;
      return localFloatBuffer.slice();
    }
    if (!bB) throw new AssertionError("Buffer type not supported in slice");

    return null;
  }

  private static Buffer a(int paramInt, ayA paramayA) {
    switch (czn.iog[paramayA.ordinal()]) {
    case 1:
      return BufferUtil.newByteBuffer(paramInt);
    case 2:
      return BufferUtil.newShortBuffer(paramInt / 2);
    case 3:
      return BufferUtil.newFloatBuffer(paramInt / 4);
    }
    if (!bB) throw new AssertionError("Buffer type not supported in createPage");

    return null;
  }

  public void ciK() {
    synchronized (this.dGD) {
      K.warn(this.bee.name() + " size=" + this.m_size + " : " + this.dGz.akc() + "/" + this.dGz.getSize());
    }
  }
}