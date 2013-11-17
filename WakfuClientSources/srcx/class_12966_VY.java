import com.ankamagames.wakfu.client.core.script.ItemActionFunctionsLibrary;

public class VY extends atX
{
  private final bKm aBR;
  private long cFl = -9223372036854775808L;
  private cB cFm;

  public VY(int paramInt, bKm parambKm, String paramString, long paramLong)
  {
    super(dqt.cXz(), 0, 0);

    this.aBR = parambKm;

    c(new hQ[] { new ItemActionFunctionsLibrary(this) });

    if (paramString != null) {
      akR localakR = new akR(1);
      localakR.put(paramString, Long.valueOf(paramLong));
      d(localakR);
    }

    ko(paramInt);
  }

  public void a(cB paramcB) {
    this.cFm = paramcB;
  }

  public bKm aiS() {
    return this.aBR;
  }

  public void ca(long paramLong) {
    this.cFl = paramLong;
  }

  public long aiT() {
    return this.cFl;
  }

  public void a(bXf parambXf, baB parambaB, String paramString)
  {
    if (this.cFm != null) {
      this.cFm.a(parambXf, parambaB, paramString);
    }
    super.a(parambXf, parambaB, paramString);
  }

  public void c(bXf parambXf)
  {
    if (this.cFm != null) {
      this.cFm.c(parambXf);
    }
    super.c(parambXf);
  }

  public void b(bXf parambXf)
  {
    if (this.cFm != null) {
      this.cFm.b(parambXf);
    }
    super.b(parambXf);
  }
}