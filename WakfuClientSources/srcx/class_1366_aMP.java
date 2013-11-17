import java.util.Comparator;

class aMP
  implements Comparator
{
  aMP(bPE parambPE)
  {
  }

  public int a(ase paramase1, ase paramase2)
  {
    if (paramase1.aEC() == null) {
      return -1;
    }
    if (paramase2.aEC() == null) {
      return 1;
    }
    if (paramase1.aEC().nc() < paramase2.aEC().nc()) {
      return -1;
    }
    if (paramase2.aEC().nc() < paramase1.aEC().nc()) {
      return -1;
    }
    return 0;
  }
}