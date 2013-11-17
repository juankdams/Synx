import java.io.PrintStream;

public class dEN
  implements aqG
{
  private static final dEN lNK = new dEN();
  public static final int lNL = -1;
  public static final int lNM = 0;
  private static final cSR lNN;
  private static final aku lNO = new aku(new aiR(), new bHw(34349, 34348));

  private static void a(Ka paramKa, Z paramZ, aiR paramaiR)
  {
    lNN.put(paramKa.UJ(), new aku(paramaiR, paramZ));
  }

  public aku dgz()
  {
    return lNO;
  }

  public aku CD(int paramInt) {
    return (aku)lNN.get(paramInt);
  }

  public aku dgA() {
    return (aku)lNN.getValues()[0];
  }

  public adz aCP()
  {
    adz localadz = new adz();

    lNN.s(new rj(this, localadz));

    lNO.a(localadz);

    return localadz;
  }

  public static dEN dgB() {
    return lNK;
  }

  public static void main(String[] paramArrayOfString) {
    adz localadz = dgB().aCP();
    kr localkr = localadz.apz();
    while (localkr.hasNext())
      System.out.print(" " + localkr.next());
  }

  static
  {
    aiR localaiR1 = new aiR(new int[] { 34360 }, new int[] { 34359 }, 34362, 34358, 34361, 34383);

    aiR localaiR2 = new aiR(new int[] { 34470 }, new int[] { 34469 }, 34472, 34468, 34471, 34473);

    lNN = new cSR();
    a(Ka.bWg, new adp(new int[] { 34350, 34351 }), localaiR1);

    a(Ka.bWh, new adp(new int[] { 34352, 34353 }), localaiR1);

    a(Ka.bWn, new adp(new int[] { 20562, 20563 }), localaiR1);

    a(Ka.bWi, new adp(new int[] { 34356, 34357 }), localaiR1);

    a(Ka.bWk, new adp(new int[] { 34354, 34355 }), localaiR2);

    a(Ka.bWl, new adp(new int[] { 34354, 34355 }), localaiR2);

    a(Ka.bWm, new adp(new int[] { 10128 }), localaiR1);
  }
}