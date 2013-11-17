import java.util.Arrays;

public final class bey extends bnl
{
  bXD[] frA = null;

  public bey(bXD[] paramArrayOfbXD) {
    this.frA = paramArrayOfbXD;
  }

  public bey() {
  }

  private bey(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public CG I(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.frA == null)
      return null;
    for (int i = 0; i < this.frA.length; i++) {
      bXD localbXD = this.frA[i];
      if ((localbXD.hY == paramInt1) && (localbXD.hZ == paramInt2) && (localbXD.aOl == paramShort)) {
        return localbXD.ax;
      }
    }
    return null;
  }

  public boolean bsn() {
    return true;
  }

  public void clear() {
    this.frA = null;
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      this.frA = null;
    } else {
      this.frA = new bXD[i];
      for (int j = 0; j < i; j++)
        this.frA[j] = new bXD(paramaYQ);
    }
  }

  public void b(dSw paramdSw)
  {
    if (this.frA == null) {
      paramdSw.writeByte((byte)0);
    } else {
      paramdSw.writeByte((byte)this.frA.length);
      for (int i = 0; i < this.frA.length; i++)
        this.frA[i].b(paramdSw);
    }
  }

  protected final void a(bnl parambnl)
  {
    bey localbey = (bey)parambnl;
    clear();
    if (localbey.frA != null)
      this.frA = ((bXD[])localbey.frA.clone());
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bey)) {
      return false;
    }
    bey localbey = (bey)paramObject;

    if (!Arrays.equals(this.frA, localbey.frA)) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return this.frA != null ? Arrays.hashCode(this.frA) : 0;
  }
}