import org.apache.log4j.Logger;

public class aPa extends aLA
{
  private static final Logger K = Logger.getLogger(aPa.class);
  private long ewm;

  public final long bfR()
  {
    return this.ewm;
  }

  public final boolean a(bjC parambjC)
  {
    if (this.ewm == -1L) {
      return false;
    }
    aGb.aSn().a(parambjC, this.ewm);

    return false;
  }

  public final void a(byte paramByte, aYQ paramaYQ)
  {
    String str = paramaYQ.readString();
    try {
      this.ewm = Long.parseLong(str);
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'interpréter le parametre pour runScript param=" + str);
      this.ewm = -1L;
    }
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);
    paramdSw.writeByte((byte)1);
    paramdSw.writeString(Long.toString(this.ewm));
  }

  public final cuh en()
  {
    return cuh.ieq;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof aPa)) {
      return false;
    }
    aPa localaPa = (aPa)paramObject;

    if (this.ewm != localaPa.ewm) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = 31 * en().bJ();
    i = 31 * i + (int)this.ewm;
    return i;
  }
}