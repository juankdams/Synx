import java.io.Writer;

public class Ir extends dUT
{
  private final int bRa;
  private final int bRb;
  private final boolean bRc;

  public Ir()
  {
    this(0, 2147483647, true);
  }

  private Ir(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.bRa = paramInt1;
    this.bRb = paramInt2;
    this.bRc = paramBoolean;
  }

  public static Ir fg(int paramInt)
  {
    return aa(paramInt, 2147483647);
  }

  public static Ir fh(int paramInt)
  {
    return aa(0, paramInt);
  }

  public static Ir aa(int paramInt1, int paramInt2)
  {
    return new Ir(paramInt1, paramInt2, false);
  }

  public static Ir ab(int paramInt1, int paramInt2)
  {
    return new Ir(paramInt1, paramInt2, true);
  }

  public boolean a(int paramInt, Writer paramWriter)
  {
    if (this.bRc) {
      if ((paramInt < this.bRa) || (paramInt > this.bRb)) {
        return false;
      }
    }
    else if ((paramInt >= this.bRa) && (paramInt <= this.bRb)) {
      return false;
    }

    if (paramInt > 65535)
    {
      paramWriter.write("\\u" + zg(paramInt));
    } else if (paramInt > 4095)
      paramWriter.write("\\u" + zg(paramInt));
    else if (paramInt > 255)
      paramWriter.write("\\u0" + zg(paramInt));
    else if (paramInt > 15)
      paramWriter.write("\\u00" + zg(paramInt));
    else {
      paramWriter.write("\\u000" + zg(paramInt));
    }
    return true;
  }
}