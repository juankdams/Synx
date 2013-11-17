import java.io.IOException;
import org.apache.log4j.Logger;

public class axE
{
  protected static final Logger K = Logger.getLogger(axE.class);

  public void a(dSw paramdSw, crX paramcrX)
  {
    cgh localcgh = new cgh();
    afc localafc = new afc();

    cSJ localcSJ = paramcrX.wn(0);

    localcgh.hDK = ((byte)localcSJ.getBitDepth());
    localcgh.bdV = ((short)localcSJ.getHeight());
    localcgh.gKt = ((short)localcSJ.getWidth());

    localcgh.hDH = 0;
    localcgh.hDG = 0;
    localcgh.hDF = 0;
    localcgh.hDD = 0;

    localcgh.hDI = 0;
    localcgh.hDJ = 0;
    localcgh.hDE = 2;
    localcgh.hDL = 0;
    localcgh.hDC = 0;

    localafc.cXn = 0;
    localafc.cXm = 0;

    String str = "TRUEVISION-XFILE";
    byte[] arrayOfByte = str.getBytes();
    System.arraycopy(arrayOfByte, 0, localafc.cXo, 0, arrayOfByte.length);
    try
    {
      localcgh.d(paramdSw);
      paramdSw.writeBytes(localcSJ.getData());
      localafc.d(paramdSw);
    }
    catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
  }
}