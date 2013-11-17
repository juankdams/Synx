import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

class dJq extends cCH
{
  dJq(cqt paramcqt)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.lUW.az);
    paramByteBuffer.putInt(this.lUW.hY);
    paramByteBuffer.putInt(this.lUW.hZ);
    paramByteBuffer.putShort(this.lUW.aOl);
    paramByteBuffer.putShort(this.lUW.iab);
    paramByteBuffer.put((byte)(this.lUW.iac ? 1 : 0));
    paramByteBuffer.put((byte)(this.lUW.iad ? 1 : 0));

    paramByteBuffer.put(this.lUW.boN);
    paramByteBuffer.putShort(this.lUW.fgF);
    paramByteBuffer.putShort((short)this.lUW.iaf.size());
    for (Object localObject = this.lUW.iaf.iterator(); ((Iterator)localObject).hasNext(); ) { cYk localcYk = (cYk)((Iterator)localObject).next();
      paramByteBuffer.putInt(localcYk.getX());
      paramByteBuffer.putInt(localcYk.getY());
      paramByteBuffer.putShort(localcYk.IB());
    }

    localObject = dzp.qC(this.lUW.fgH);
    if ((!bB) && (localObject.length >= 65535)) throw new AssertionError("chaine des parametres trop longue");
    paramByteBuffer.putShort((short)(localObject.length & 0xFFFF));
    paramByteBuffer.put((byte[])localObject);

    paramByteBuffer.put((byte)this.lUW.bdS.length);
    for (int i = 0; i < this.lUW.bdS.length; i++) {
      paramByteBuffer.put((byte)this.lUW.bdS[i]);
    }

    paramByteBuffer.putInt(this.lUW.bxi);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    throw new UnsupportedOperationException();
  }

  public int cc()
  {
    byte[] arrayOfByte = dzp.qC(this.lUW.fgH);
    return 23 + (2 + 10 * this.lUW.iaf.size()) + (2 + arrayOfByte.length) + (1 + this.lUW.bdS.length);
  }
}