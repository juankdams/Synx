import java.util.Comparator;

public class dmV
  implements Comparable
{
  public static Comparator bEa = new cdB();
  private final byte llx;
  private final float bOZ;
  private final float bPa;
  private final float bPb;

  public dmV(byte paramByte, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.llx = paramByte;
    this.bOZ = paramFloat1;
    this.bPa = paramFloat2;
    this.bPb = paramFloat3;
  }

  public int compareTo(Object paramObject) {
    dmV localdmV = (dmV)paramObject;
    return this.llx - localdmV.llx;
  }

  public float QC() {
    return this.bOZ;
  }

  public float QD() {
    return this.bPa;
  }

  public float QE() {
    return this.bPb;
  }

  public byte cUq() {
    return this.llx;
  }

  public String toString()
  {
    return "DayLightDefinition{" + this.llx + "%Day" + " Color = {" + this.bOZ + ", " + this.bPa + ", " + this.bPb + '}';
  }
}