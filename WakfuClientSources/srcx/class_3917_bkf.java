import java.io.IOException;
import org.apache.log4j.Logger;

public class bkf extends aoI
{
  private static final Logger K = Logger.getLogger(bkf.class);

  protected crX a(aYQ paramaYQ)
  {
    try {
      paramaYQ.os(4);

      cxR localcxR = new cxR();
      localcxR.i(paramaYQ);

      bIN localbIN = new bIN(localcxR.ilV.cKm);
      int i;
      if (localbIN.getID() == bIN.jQ("DXT1")) {
        i = 8;
      } else if ((localbIN.getID() == bIN.jQ("DXT2")) || (localbIN.getID() == bIN.jQ("DXT3")) || (localbIN.getID() == bIN.jQ("DXT4")) || (localbIN.getID() == bIN.jQ("DXT5")))
      {
        i = 16;
      } else {
        K.error("Unsupported format " + localbIN.toString());
        return null;
      }

      cSJ[] arrayOfcSJ1 = new cSJ[localcxR.ilT];

      int j = localcxR.ia;
      int k = localcxR.ib;
      for (int m = 0; m < localcxR.ilT; m++) {
        int n = (j + 3) / 4 * ((k + 3) / 4) * i;
        byte[] arrayOfByte = new byte[n];

        paramaYQ.W(arrayOfByte);
        arrayOfcSJ1[m] = new cSJ(j, k, 32, null, arrayOfByte);

        j /= 2;
        k /= 2;
        if (j == 0)
          j = 1;
        if (k == 0)
          k = 1;
      }
      crX localcrX = new crX(localbIN, arrayOfcSJ1);
      for (cSJ localcSJ : arrayOfcSJ1)
        localcSJ.axl();
      return localcrX;
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
    return null;
  }

  protected MD b(aYQ paramaYQ)
  {
    paramaYQ.os(4);
    cxR localcxR = new cxR();
    localcxR.i(paramaYQ);

    return new MD(localcxR.ia, localcxR.ib);
  }

  protected int aU()
  {
    return 128;
  }
}