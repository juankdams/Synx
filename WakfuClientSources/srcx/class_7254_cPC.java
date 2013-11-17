import java.util.EnumSet;
import java.util.Iterator;

public enum cPC
{
  public final int mask;

  private cPC(int arg3)
  {
    int j;
    this.mask = (1 << j);
  }

  public static EnumSet yM(int paramInt) {
    EnumSet localEnumSet = EnumSet.noneOf(cPC.class);
    cPC[] arrayOfcPC = values();
    for (int i = 0; i < arrayOfcPC.length; i++) {
      cPC localcPC = arrayOfcPC[i];
      if ((paramInt & localcPC.mask) == localcPC.mask)
        localEnumSet.add(localcPC);
    }
    return localEnumSet;
  }

  public static int b(cPC[] paramArrayOfcPC) {
    int i = 0;
    for (int j = 0; j < paramArrayOfcPC.length; j++)
      i |= paramArrayOfcPC[j].mask;
    return i;
  }

  public static int b(EnumSet paramEnumSet) {
    int i = 0;
    for (Iterator localIterator = paramEnumSet.iterator(); localIterator.hasNext(); )
      i |= ((cPC)localIterator.next()).mask;
    return i;
  }
}