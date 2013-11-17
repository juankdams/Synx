import java.util.ArrayList;

public class NW
{
  private static String ceR;
  private int ceS;
  private int aQF;
  private String Tl;
  private String hh;
  private String aGq;
  private long ceT;
  private int aGs;
  private ArrayList ceU;

  public static void cQ(String paramString)
  {
    ceR = paramString;
  }

  public NW(int paramInt1, int paramInt2, String paramString) {
    this(paramInt1, paramInt2, paramString, 2L);
  }

  public NW(int paramInt1, int paramInt2, String paramString, long paramLong) {
    this(paramInt1, paramInt2, paramString, " ", null, paramLong);
  }

  public NW(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, long paramLong) {
    this(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramLong, null, 0);
  }

  public NW(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, long paramLong, ArrayList paramArrayList, int paramInt3) {
    this.ceS = paramInt1;
    this.aQF = paramInt2;
    this.Tl = paramString1;
    this.hh = paramString2;
    this.ceT = paramLong;
    this.aGq = (paramString3 != null ? paramString3 : ceR);
    this.ceU = paramArrayList;
    this.aGs = paramInt3;
  }

  public int aan() {
    return this.ceS;
  }

  public NW gb(int paramInt) {
    this.ceS = paramInt;
    return this;
  }

  public int getLevel() {
    return this.aQF;
  }

  public NW gc(int paramInt) {
    this.aQF = paramInt;
    return this;
  }

  public String getMessage() {
    return this.Tl;
  }

  public NW cR(String paramString) {
    this.Tl = paramString;
    return this;
  }

  public long getOptions() {
    return this.ceT;
  }

  public NW gd(int paramInt) {
    this.ceT = paramInt;
    return this;
  }

  public ArrayList aao() {
    return this.ceU;
  }

  public NW o(ArrayList paramArrayList) {
    this.ceU = paramArrayList;
    return this;
  }

  public String getTitle() {
    return this.hh;
  }

  public NW cS(String paramString) {
    this.hh = paramString;
    return this;
  }

  public NW cT(String paramString) {
    this.aGq = (paramString != null ? paramString : ceR);
    return this;
  }

  public String fJ() {
    return this.aGq;
  }

  public int getType() {
    return this.aGs;
  }

  public NW ge(int paramInt) {
    this.aGs = paramInt;
    return this;
  }

  public boolean aap()
  {
    if ((this.ceT & 0x4000) == 16384L) {
      return false;
    }

    int i = 0;
    if ((this.ceT & 0x2) == 2L) {
      i++;
    }
    if ((this.ceT & 0x4) == 4L) {
      i++;
    }
    if ((this.ceT & 0x8) == 8L) {
      i++;
    }
    if ((this.ceT & 0x10) == 16L) {
      i++;
    }

    if ((this.ceT & 0x20) == 32L) {
      i++;
    }

    if ((this.ceT & 0x40) == 64L) {
      i++;
    }

    if ((this.ceT & 0x80) == 128L) {
      i++;
    }

    if ((this.ceT & 0x100) == 256L) {
      i++;
    }

    return i < 2;
  }

  public int aaq() {
    if ((this.ceT & 0x2) == 2L) {
      return 2;
    }
    if ((this.ceT & 0x4) == 4L) {
      return 4;
    }
    if ((this.ceT & 0x8) == 8L) {
      return 8;
    }
    if ((this.ceT & 0x10) == 16L) {
      return 16;
    }

    return 0;
  }
}