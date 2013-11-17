import java.nio.ByteBuffer;

public class agr extends cCH
{
  protected aof cQb;

  protected agr(apM paramapM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    this.cQb.g(paramByteBuffer);

    if (this.cZX.aBJ().Op()) {
      cXr localcXr = new cXr();
      byte b = 0;
      dCi localdCi = ((bIS)this.cZX.dwn).auK();
      for (bfE localbfE : localdCi) {
        if (localbfE.aBV() != 0)
        {
          b = (byte)(b + 1);
          localcXr.putInt(localbfE.ok());
          localcXr.putInt(localbfE.aBV());
        }
      }
      paramByteBuffer.put(b);
      paramByteBuffer.put(localcXr.toArray());
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.cQb = new aof();
    this.cQb.h(paramByteBuffer);
    this.cZX.aBE();
    this.cZX.dwn.b(this.cQb);

    if (this.cZX.aBJ().Op()) {
      int i = paramByteBuffer.get();
      dCi localdCi = ((bIS)this.cZX.dwn).auK();
      for (int j = 0; j < i; j++) {
        int k = paramByteBuffer.getInt();
        int m = paramByteBuffer.getInt();
        if (localdCi != null)
        {
          bfE localbfE = (bfE)localdCi.hh(k);
          if (localbfE != null)
            localbfE.jv(m);
        }
      }
    }
  }

  public int cc()
  {
    this.cQb = new aof();

    this.cZX.dwn.a(this.cQb);

    if (this.cZX.aBJ().Op())
    {
      int i = 0;
      dCi localdCi = ((bIS)this.cZX.dwn).auK();
      for (bfE localbfE : localdCi)
        if (localbfE.aBV() != 0)
        {
          i = (byte)(i + 1);
        }
      return this.cQb.O() + 1 + i * 8;
    }

    return this.cQb.O();
  }
}