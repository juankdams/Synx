import java.io.IOException;

public class AI extends cGj
{
  public static final String bwt = "smiley";
  public static final String bwu = "animName";
  private aCl bwv;
  private int bww = -1;
  private bVf bwx;

  public AI(aCl paramaCl, int paramInt)
  {
    this.bwv = paramaCl;
    this.bww = paramInt;
  }

  protected String JG() {
    return "Smiley_" + this.bwv.uO() + this.bwv.xK();
  }

  public bVf JT()
  {
    if (this.bwx == null) {
      bVf localbVf = new bVf(dsE.cYX());
      localObject = JG();
      try {
        localbVf.b(String.format(ay.bd().getString("playerGfxPath"), new Object[] { localObject }), true);
      } catch (IOException localIOException) {
        return null;
      } catch (bdh localbdh) {
        return null;
      }
      localbVf.em((String)localObject);

      this.bwx = localbVf;
    }

    int i = this.bwv.aOD();
    Object localObject = aYU.ox(i);
    if (localObject == null)
      return null;
    this.bwx.eq(this.bww != -1 ? aYU.ox(this.bww).ata() : ((aYU)localObject).ata());
    this.bwx.av(0.0F);
    int j = this.bwv.uO();
    byte b = this.bwv.xK();
    agt localagt = agt.arQ();
    Cs localCs1 = localagt.i(j, b);
    Cs localCs2 = localagt.h(j, b);
    int k = localagt.j(j, b);
    aKG localaKG1 = localagt.b(j, ((Byte)localCs1.getFirst()).byteValue(), ((Byte)localCs1.Lp()).byteValue(), b);
    aKG localaKG2 = localagt.a(j, ((Byte)localCs2.getFirst()).byteValue(), ((Byte)localCs2.Lp()).byteValue(), b);
    aKG localaKG3 = localagt.a(j, k, b);
    dR localdR = this.bwx.aty();
    float[] arrayOfFloat;
    if (localaKG2 != null) {
      arrayOfFloat = localaKG2.bcl();
      localdR.a(1, arrayOfFloat);
    }
    if (localaKG1 != null) {
      arrayOfFloat = localaKG1.bcl();
      localdR.a(2, arrayOfFloat);
    }
    if (localaKG3 != null) {
      arrayOfFloat = localaKG3.bcl();
      localdR.a(8, arrayOfFloat);
    }
    localdR.ie();

    return this.bwx;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("smiley"))
      return JT();
    if (paramString.equals("animName")) {
      bVf localbVf = JT();
      return localbVf == null ? null : localbVf.ata();
    }
    return null;
  }

  public byte JU() {
    return this.bwv.aOD();
  }

  public int JV() {
    return this.bww;
  }
}