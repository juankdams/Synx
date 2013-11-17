import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aHR extends cGF
  implements bWU
{
  protected static Logger K = Logger.getLogger(aHR.class);
  vL aIX;
  private static cJL egc;
  private boolean aHd = false;

  private static final aee aER = new bOO(new aXf());

  public cCH egd = new aXh(this);

  public cCH ege = new aXj(this);

  public final cCH egf = new aXk(this);

  public final cCH egg = new aXl(this);

  public final cCH egh = new aXm(this);

  public final cCH egi = new aXn(this);

  public final cCH egj = new aXo(this);

  public static void a(cJL paramcJL)
  {
    egc = paramcJL;
  }

  public static aHR aTT()
  {
    aHR localaHR;
    try
    {
      localaHR = (aHR)aER.Mm();
      localaHR.aHd = true;
    } catch (Exception localException) {
      localaHR = new aHR();
      K.error("Erreur lors d'un checkOut sur un message de type WakfuCalendarEventSerializable : " + localException.getMessage());
    }
    return localaHR;
  }

  public void aJ() {
    this.aIX = null;
  }

  public void bc() {
    this.aIX = null;
  }

  public void release() {
    if (this.aHd)
      try {
        aER.y(this);
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    else
      bc();
  }

  public void o(vL paramvL)
  {
    this.aIX = paramvL;
  }

  public void aTU() {
    this.aIX = egc.bhQ();
  }

  public void aTV()
  {
    egc.p(this.aIX);
  }

  public vL qI() {
    return this.aIX;
  }

  public cCH[] tn()
  {
    return new cCH[] { this.ege, this.egd, this.egj, this.egf, this.egg, this.egi, this.egh };
  }

  public void b(ByteBuffer paramByteBuffer) {
    cCH[] arrayOfcCH = tn();
    for (int i = 0; i < arrayOfcCH.length; i++) {
      cCH localcCH = arrayOfcCH[i];
      localcCH.b(paramByteBuffer);
    }
  }

  public void U(ByteBuffer paramByteBuffer) {
    cCH[] arrayOfcCH = tn();
    for (int i = 0; i < arrayOfcCH.length; i++) {
      cCH localcCH = arrayOfcCH[i];
      localcCH.a(paramByteBuffer, aUk.eVd);
    }
  }

  public void ak(ByteBuffer paramByteBuffer) {
    this.egj.b(paramByteBuffer);
  }

  public void al(ByteBuffer paramByteBuffer) {
    this.egj.a(paramByteBuffer, aUk.eVd);
  }

  public void am(ByteBuffer paramByteBuffer) {
    this.ege.b(paramByteBuffer);
    this.egd.b(paramByteBuffer);
  }

  public void an(ByteBuffer paramByteBuffer) {
    this.ege.a(paramByteBuffer, aUk.eVd);
    this.egd.a(paramByteBuffer, aUk.eVd);
  }

  public int cc() {
    cCH[] arrayOfcCH = tn();
    int i = 0;
    for (int j = 0; j < arrayOfcCH.length; j++) {
      cCH localcCH = arrayOfcCH[j];
      i += localcCH.cc();
    }
    return i;
  }
}