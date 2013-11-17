import java.util.Arrays;
import org.apache.log4j.Logger;

public class bfG extends aLA
{
  private static final Logger K = Logger.getLogger(bfG.class);
  private String[] ftb;
  private String[] ftc;
  private String ftd;

  public final boolean a(bjC parambjC)
  {
    String str = parambjC.atd();

    for (int i = 0; i < this.ftb.length; i++) {
      if (str.endsWith(this.ftb[i])) {
        return parambjC.eq(this.ftc[i]);
      }
    }

    return parambjC.eq(this.ftd);
  }

  public final void a(byte paramByte, aYQ paramaYQ)
  {
    int i = (paramByte - 1) / 2;

    this.ftb = new String[i];
    this.ftc = new String[i];

    for (int j = 0; j < i; j++) {
      this.ftb[j] = paramaYQ.readString();
      this.ftc[j] = paramaYQ.readString();
    }

    if (paramByte % 2 == 1)
      this.ftd = paramaYQ.readString();
  }

  public void a(dSw paramdSw)
  {
    super.a(paramdSw);
    int i = this.ftb.length + this.ftc.length;
    if (this.ftd != null)
      i++;
    paramdSw.writeByte((byte)i);
    for (int j = 0; j < this.ftb.length; j++) {
      paramdSw.writeString(this.ftb[j]);
      paramdSw.writeString(this.ftc[j]);
    }
    if (this.ftd != null)
      paramdSw.writeString(this.ftd);
  }

  public final cuh en()
  {
    return cuh.iev;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bfG)) {
      return false;
    }
    bfG localbfG = (bfG)paramObject;

    if (this.ftd != null ? !this.ftd.equals(localbfG.ftd) : localbfG.ftd != null)
      return false;
    if (!Arrays.equals(this.ftc, localbfG.ftc))
      return false;
    if (!Arrays.equals(this.ftb, localbfG.ftb)) {
      return false;
    }
    return true;
  }

  public final int hashCode()
  {
    int i = en().bJ();
    i = 31 * i + (this.ftb != null ? Arrays.hashCode(this.ftb) : 0);
    i = 31 * i + (this.ftc != null ? Arrays.hashCode(this.ftc) : 0);
    i = 31 * i + (this.ftd != null ? this.ftd.hashCode() : 0);
    return i;
  }
}