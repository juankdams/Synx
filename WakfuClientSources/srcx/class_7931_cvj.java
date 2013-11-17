import java.util.Comparator;

class cvj
  implements Comparator
{
  cvj(aIV paramaIV)
  {
  }

  private int a(cfm paramcfm1, cfm paramcfm2)
  {
    String str1;
    String str2;
    if (aIV.a(this.ifV).equals(dGY.lRP)) {
      str1 = paramcfm2.getName();
      str2 = paramcfm1.getName();
    } else {
      str1 = paramcfm1.getName();
      str2 = paramcfm2.getName();
    }
    return dzp.bj(str1, str2);
  }

  public int b(cfm paramcfm1, cfm paramcfm2) {
    switch (cvi.ifU[aIV.b(this.ifV).ordinal()]) {
    case 1:
    case 2:
      if (paramcfm1.cig() == paramcfm2.cig()) {
        return a(paramcfm1, paramcfm2);
      }
      if (aIV.b(this.ifV).equals(dGY.lRP)) {
        return paramcfm1.cig() - paramcfm2.cig();
      }
      return paramcfm2.cig() - paramcfm1.cig();
    case 3:
      return a(paramcfm1, paramcfm2);
    }

    return 0;
  }
}