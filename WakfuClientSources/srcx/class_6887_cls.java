import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cls
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cls.class);

  public static cls hNo = new cls();

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 15950:
      Zr localZr = (Zr)paramcWG;
      a(localZr);

      return false;
    }

    return true;
  }

  private void a(Zr paramZr)
  {
    short s = paramZr.Lk();
    byte[] arrayOfByte = paramZr.akA();

    Ch localCh = cvG.ihh.jdMethod_do(s);
    aBU localaBU = new aBU(localCh);
    localaBU.aH(ByteBuffer.wrap(arrayOfByte));
    aHf.eeF.a(localaBU);

    K.info("Reception des infos de ladder d'un donjon : " + localaBU);
    dJn.diF().a(localaBU);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}