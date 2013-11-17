import java.util.Arrays;

class cfh extends bHa
{
  private short[] hAe;

  cfh(int paramInt)
  {
    super(paramInt);
  }

  public static void a(cfh paramcfh1, cfh paramcfh2, bPu parambPu) {
    for (int i = 0; i < paramcfh1.size(); i++) {
      short[] arrayOfShort1 = (short[])paramcfh1.hc(i);
      if (Arrays.binarySearch(arrayOfShort1, (short)0) >= 0) {
        short s = paramcfh1.Cq(i);
        cLM localcLM = new cLM((short[])parambPu.cx(s));
        localcLM.q(paramcfh2.cic());

        short[] arrayOfShort2 = localcLM.cEM();
        Arrays.sort(arrayOfShort2);
        parambPu.c(s, arrayOfShort2);
      }
    }
  }

  private short[] cic()
  {
    if (this.hAe == null) {
      int i = size();
      bHu localbHu = new bHu(i);
      for (int j = 0; j < i; j++) {
        short s = Cq(j);
        if (s <= 0) {
          localbHu.add(s);
        }
      }
      this.hAe = localbHu.bOU();
    }
    return this.hAe;
  }
}