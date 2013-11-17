import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public enum dBY
{
  public static final Map lKq;
  public final int aw;
  public final short lKr;
  private dIC lKs;
  private dgx lKt;

  private dBY(int arg3, int arg4)
  {
    int i;
    this.aw = i;
    int j;
    this.lKr = bCO.go(j);
  }

  public static dBY Cr(int paramInt) {
    for (dBY localdBY : values()) {
      if (paramInt == localdBY.aw) {
        return localdBY;
      }
    }
    return null;
  }

  void a(dIC paramdIC) {
    this.lKs = paramdIC;
  }

  void a(dgx paramdgx) {
    this.lKt = paramdgx;
  }

  public dIC deT() {
    return this.lKs;
  }

  public dgx ddb() {
    return this.lKt;
  }

  static
  {
    EnumMap localEnumMap = new EnumMap(dBY.class);
    localEnumMap.put(lJJ, lJK);
    localEnumMap.put(lJK, lJL);
    localEnumMap.put(lJM, lJN);
    localEnumMap.put(lJN, lJO);
    localEnumMap.put(lJP, lJQ);
    localEnumMap.put(lJQ, lJR);
    localEnumMap.put(lJS, lJT);
    localEnumMap.put(lJT, lJU);
    localEnumMap.put(lJV, lJW);
    localEnumMap.put(lJW, lJX);
    localEnumMap.put(lJY, lJZ);
    localEnumMap.put(lJZ, lKa);
    localEnumMap.put(lKb, lKc);
    localEnumMap.put(lKc, lKd);
    localEnumMap.put(lKe, lKf);
    localEnumMap.put(lKf, lKg);

    localEnumMap.put(lKh, lKi);
    localEnumMap.put(lKj, lKk);
    localEnumMap.put(lKl, lKm);
    localEnumMap.put(lKn, lKo);

    lKq = Collections.unmodifiableMap(localEnumMap);

    dgx.init();
    dIC.init();
  }
}