import java.util.List;

public class vw
{
  public static byte a(String paramString, List paramList1, List paramList2)
  {
    if (paramList2 == null)
      return -1;
    int j;
    for (int i = 0; i < paramList1.size(); j = (byte)(i + 1)) {
      Pq[] arrayOfPq = (Pq[])paramList1.get(i);
      int k = 1;
      int m = 0;
      int n = 0;
      int i1 = arrayOfPq.length - 1;
      for (int i2 = 0; i2 < paramList2.size(); i2 = (byte)(i2 + 1)) {
        if (n > i1) {
          m = 1;
          break;
        }
        Pq localPq = ((dKY)paramList2.get(i2)).aNE();
        int i3;
        if ((arrayOfPq[n] == Pq.chx) && 
          (localPq != Pq.chx)) {
          k = 0;
          i3 = 1;
          for (; i2 < paramList2.size(); i2 = (byte)(i2 + 1))
            if (localPq != Pq.chv) {
              i3 = 0;
              break;
            }
          if (i3 != 0) {
            if (n != i1) {
              m = 1;
              break;
            }
            return i;
          }
          i2 = (byte)(i2 - 1);
          n = (byte)(n + 1);
        }
        else if (arrayOfPq[n] == Pq.chy) {
          k = 0;
          i3 = 1;
          for (; i2 < paramList2.size(); i2 = (byte)(i2 + 1))
            if (localPq != Pq.chu) {
              i3 = 0;
              break;
            }
          if (i3 != 0) {
            if (n != i1) {
              m = 1;
              break;
            }
            return i;
          }
          i2 = (byte)(i2 - 1);
          n = (byte)(n + 1);
        }
        else
        {
          if (localPq != arrayOfPq[n]) {
            m = 1;
            break;
          }

          n = (byte)(n + 1);
        }
      }
      if ((m == 0) && ((k == 0) || (paramList2.size() == arrayOfPq.length)))
      {
        return i;
      }
    }
    String str = "La fonction " + paramString + " n'est pas utilisée avec le bon nombre (ou type) d'arguments. \n";
    str = str + "Les arguments possibles sont :";
    str = str + a(paramList1);
    throw new ddQ(str);
  }

  private static String a(Iterable paramIterable) {
    StringBuilder localStringBuilder = new StringBuilder();
    for (Pq[] arrayOfPq : paramIterable) {
      localStringBuilder.append("\n (");
      a(localStringBuilder, arrayOfPq);
      localStringBuilder.append(')');
    }
    return localStringBuilder.toString();
  }

  private static void a(StringBuilder paramStringBuilder, Pq[] paramArrayOfPq) {
    int i = paramArrayOfPq.length;
    if (i == 0) {
      return;
    }
    paramStringBuilder.append(paramArrayOfPq[0].name());
    for (int j = 1; j < i; j = (byte)(j + 1))
      paramStringBuilder.append(", ").append(paramArrayOfPq[j].name());
  }
}