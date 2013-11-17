import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.apache.log4j.Logger;

public abstract class dmP
  implements bWU
{
  protected static final Logger K = Logger.getLogger(dmP.class);

  public static final aee llq = new bOO(new dep());

  public static final aee llr = new bOO(new deo());

  protected final dpj lls = new dpj();
  protected final cNu llt = new cNu();
  private aee aOr;

  public abstract DataOutputStream c(OutputStream paramOutputStream);

  public abstract DataInputStream a(FileInputStream paramFileInputStream);

  public static synchronized dmP b(aee paramaee)
  {
    dmP localdmP = null;
    try {
      localdmP = (dmP)paramaee.Mm();
      localdmP.a(paramaee);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    return localdmP;
  }

  public void a(aee paramaee) {
    this.aOr = paramaee;
  }

  public void release() {
    try {
      this.aOr.y(this);
      this.aOr = null;
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }
}