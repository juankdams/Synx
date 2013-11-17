import java.util.SortedMap;
import java.util.TreeMap;

public class QC extends bkX
  implements bK
{
  private final SortedMap cpH;
  private int cpI;

  public QC(short[] paramArrayOfShort)
  {
    this.cpH = new TreeMap();
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      short s = paramArrayOfShort[i];
      c(s);
    }
    if (paramArrayOfShort.length > 0)
      bvC();
  }

  protected short[] acn()
  {
    short[] arrayOfShort = new short[this.cpI];
    int i = 0;
    for (Short localShort : this.cpH.keySet()) {
      for (int j = 0; j < ((Integer)this.cpH.get(localShort)).intValue(); j++) {
        arrayOfShort[(i++)] = localShort.shortValue();
      }
    }
    return arrayOfShort;
  }

  public void c(short paramShort) {
    if (!this.cpH.containsKey(Short.valueOf(paramShort)))
      this.cpH.put(Short.valueOf(paramShort), Integer.valueOf(1));
    else {
      this.cpH.put(Short.valueOf(paramShort), Integer.valueOf(((Integer)this.cpH.get(Short.valueOf(paramShort))).intValue() + 1));
    }
    this.cpI += 1;
    bvC();
  }

  public void d(short paramShort) {
    if (!this.cpH.containsKey(Short.valueOf(paramShort))) {
      return;
    }
    int i = ((Integer)this.cpH.get(Short.valueOf(paramShort))).intValue();
    if (i == 1)
      this.cpH.remove(Short.valueOf(paramShort));
    else {
      this.cpH.put(Short.valueOf(paramShort), Integer.valueOf(i - 1));
    }
    this.cpI -= 1;
    bvC();
  }

  protected double aco()
  {
    return ((Short)this.cpH.lastKey()).shortValue();
  }

  public int getSize() {
    return this.cpI;
  }

  public void reset() {
    this.cpI = 0;
    this.cpH.clear();
  }
}