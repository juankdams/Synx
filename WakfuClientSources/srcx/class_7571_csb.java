import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

class csb
{
  final int bMK;
  final short fiz;
  final int aVh;

  csb(ScreenElement paramScreenElement)
  {
    this.bMK = paramScreenElement.bMK;
    this.fiz = paramScreenElement.fiz;
    this.aVh = paramScreenElement.aVh;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof csb)) {
      return false;
    }

    csb localcsb = (csb)paramObject;

    if (this.aVh != localcsb.aVh) {
      return false;
    }
    if (this.bMK != localcsb.bMK) {
      return false;
    }
    if (this.fiz != localcsb.fiz) {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    int i = this.bMK;
    i = 31 * i + this.fiz;
    i = 31 * i + this.aVh;
    return i;
  }

  public void a(dSw paramdSw) {
    paramdSw.writeInt(this.bMK);
    paramdSw.writeByte((byte)this.fiz);
    paramdSw.writeInt(this.aVh);
  }
}