import org.apache.log4j.Logger;

public abstract class bnl
{
  private static final Logger K = Logger.getLogger(bnl.class);
  public static final byte fFY = 0;
  public static final byte fFZ = 1;
  public static final byte fGa = 2;

  public static bnl o(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte();
    switch (i) {
    case 2:
      return new cbx(paramaYQ, null);
    case 1:
      return new bey(paramaYQ, null);
    }
    return null;
  }

  public static void a(dSw paramdSw, bnl parambnl) {
    if (parambnl == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    paramdSw.writeByte((byte)(parambnl.bsn() ? 1 : 2));
    parambnl.b(paramdSw);
  }

  public static bnl b(bnl parambnl) {
    if (parambnl == null)
      return null;
    Object localObject = null;
    if (parambnl.bsn())
      localObject = new bey();
    else {
      localObject = new cbx(null);
    }
    ((bnl)localObject).a(parambnl);
    return localObject;
  }

  public static boolean c(bnl parambnl) {
    return (parambnl != null) && (parambnl.bsn());
  }

  public abstract boolean bsn();

  public abstract void clear();

  public abstract void d(aYQ paramaYQ);

  public abstract void b(dSw paramdSw);

  protected abstract void a(bnl parambnl);
}