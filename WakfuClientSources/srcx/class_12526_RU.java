import java.util.Comparator;

class RU
  implements Comparator
{
  RU(bTX parambTX)
  {
  }

  public int a(aoB paramaoB1, aoB paramaoB2)
  {
    String str1 = paramaoB1.aAU();
    String str2 = paramaoB2.aAU();
    if ((str1 == null) || (str2 == null))
      return 0;
    return str1.compareTo(str2);
  }
}