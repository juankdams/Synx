import java.util.ArrayList;
import java.util.Arrays;

public class bap
{
  public static final bap fij = new bap();
  public static final int fik = 2147483646;
  private static final ArrayList fil = new ArrayList();
  private static final cSR fim = new cSR();

  private static byte oA(int paramInt)
  {
    int i = oU.bV(paramInt);
    int j = paramInt - i * 18;
    return (byte)j;
  }

  private static byte oB(int paramInt) {
    int i = oU.bW(paramInt);
    int j = paramInt - i * 18;
    return (byte)j;
  }

  public void initialize() {
    fim.s(new aOt(this));
  }

  public void a(cYL paramcYL)
  {
    cyB[] arrayOfcyB = paramcYL.aDg();
    ArrayList localArrayList = new ArrayList();
    if (arrayOfcyB != null) {
      localArrayList.addAll(Arrays.asList(arrayOfcyB));
    }

    int i = 0; for (int j = fil.size(); i < j; i++) {
      cfa localcfa = (cfa)fil.get(i);
      if (paramcYL.p(cfa.a(localcfa), cfa.b(localcfa))) {
        cyB localcyB = new cyB(oA(cfa.a(localcfa)), oB(cfa.b(localcfa)), (short)0, cfa.c(localcfa));
        localArrayList.add(localcyB);
      }
    }

    paramcYL.a((cyB[])localArrayList.toArray(new cyB[localArrayList.size()]));
  }

  static
  {
    fim.put(2147483646, new cgc(2147483646, 70500023L, 0.05F, true, true, (short)10, (short)25, 1.0F, 0, 0));

    fil.add(new cfa(2147483646, 0, -48, null));
  }
}