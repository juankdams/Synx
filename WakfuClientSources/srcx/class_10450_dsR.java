import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.Arrays;

class dsR
{
  final float[] dMd;
  final byte bkM;

  dsR(ScreenElement paramScreenElement)
  {
    this.dMd = paramScreenElement.dMd;
    this.bkM = paramScreenElement.bkM;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof dsR)) {
      return false;
    }

    dsR localdsR = (dsR)paramObject;

    if (this.bkM != localdsR.bkM) {
      return false;
    }
    if (!Arrays.equals(this.dMd, localdsR.dMd)) {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    int i = Arrays.hashCode(this.dMd);
    i = 31 * i + this.bkM;
    return i;
  }

  public void a(dSw paramdSw) {
    paramdSw.writeByte(this.bkM);
    for (int i = 0; i < this.dMd.length; i++)
      paramdSw.writeByte((byte)(int)this.dMd[i]);
  }
}