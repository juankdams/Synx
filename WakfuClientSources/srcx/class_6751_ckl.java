import java.util.Comparator;

class ckl
  implements Comparator
{
  private static ckl hLo = new ckl();

  public int b(bNa parambNa1, bNa parambNa2)
  {
    int i;
    int k;
    if ((parambNa1.QC() >= parambNa1.QE()) && (parambNa1.QC() >= parambNa1.QD())) {
      i = 0;
      k = parambNa1.bUQ() - parambNa1.bUR();
    } else if (parambNa1.QD() >= parambNa1.QE()) {
      i = 1;
      k = parambNa1.bUR() - parambNa1.bUP();
    } else {
      i = 2;
      k = parambNa1.bUP() - parambNa1.bUR();
    }
    int j;
    int m;
    if ((parambNa2.QC() >= parambNa2.QE()) && (parambNa2.QC() >= parambNa2.QD())) {
      j = 0;
      m = parambNa2.bUQ() - parambNa2.bUR();
    } else if (parambNa2.QD() >= parambNa2.QE()) {
      j = 1;
      m = parambNa2.bUR() - parambNa2.bUP();
    } else {
      j = 2;
      m = parambNa2.bUP() - parambNa2.bUR();
    }

    if (i != j) {
      return i - j;
    }
    return k - m;
  }
}