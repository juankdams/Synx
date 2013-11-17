import java.io.IOException;
import org.apache.log4j.Logger;

public class ku extends aoI
{
  private static final Logger K = Logger.getLogger(ku.class);

  protected crX a(aYQ paramaYQ)
  {
    try
    {
      paramaYQ.os(4);

      int i = paramaYQ.readShort();
      int j = paramaYQ.readShort();
      int k = paramaYQ.readInt();
      int m = paramaYQ.readInt();

      int n = paramaYQ.readInt();
      cxR localcxR = new cxR();
      localcxR.i(paramaYQ);

      bIN localbIN = new bIN(localcxR.ilV.cKm);
      int i1;
      if (localbIN.getID() == bIN.jQ("DXT1")) {
        i1 = 8;
      } else if ((localbIN.getID() == bIN.jQ("DXT2")) || (localbIN.getID() == bIN.jQ("DXT3")) || (localbIN.getID() == bIN.jQ("DXT4")) || (localbIN.getID() == bIN.jQ("DXT5")))
      {
        i1 = 16;
      } else {
        K.error("Unsupported format " + localbIN.toString());
        return null;
      }

      if ((!bB) && (localcxR.ilT != 1)) throw new AssertionError("DDSM file can't have mipmaps");

      int i2 = localcxR.ia;
      int i3 = localcxR.ib;
      int i4 = (i2 + 3) / 4 * ((i3 + 3) / 4) * i1;

      byte[] arrayOfByte1 = new byte[i4];
      paramaYQ.W(arrayOfByte1);
      cSJ localcSJ = new cSJ(i, j, (short)32, null, arrayOfByte1);

      byte[] arrayOfByte2 = new byte[m];
      paramaYQ.W(arrayOfByte2);
      localcSJ.f(arrayOfByte2, (byte)1);

      crX localcrX = new crX(localbIN, localcSJ);
      localcSJ.axl();
      return localcrX;
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
    return null;
  }

  protected MD b(aYQ paramaYQ) {
    paramaYQ.os(4);
    return new MD(paramaYQ.readShort(), paramaYQ.readShort());
  }

  protected int aU() {
    return 8;
  }
}