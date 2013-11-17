import java.util.BitSet;
import java.util.Iterator;

public abstract class aLM
  implements bqk
{
  public static short aET = 0;
  public static short aEU = 0;
  public static short aEV = 0;
  protected int eqK;
  protected short cZu;
  protected cjT eqL = new cjT();

  public static short nb(int paramInt)
  {
    return (short)(paramInt & 0xFF);
  }

  public short nU() {
    return this.cZu;
  }

  protected aLM() {
  }

  public aLM(int paramInt) {
    this.eqK = paramInt;
  }

  public abstract aLM bi(short paramShort);

  public int aTO()
  {
    return 0;
  }

  public int bdm() {
    return 0;
  }

  public int bdn() {
    return this.eqK;
  }

  public void a(dpI paramdpI)
  {
    this.eqL.add(paramdpI);
  }

  public Iterator iterator() {
    return this.eqL.iterator();
  }

  public int bdo() {
    return this.eqL.size();
  }

  public dpI nc(int paramInt) {
    return (dpI)this.eqL.get(paramInt);
  }

  public int nS() {
    return 4;
  }

  public long nT() {
    return this.eqK;
  }

  public short nY()
  {
    return aET;
  }

  public short nZ() {
    return aEU;
  }

  public short oa() {
    return aEV;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }
}