import java.util.Comparator;

class czp
  implements Comparator
{
  czp(cPH paramcPH)
  {
  }

  public int a(cPH paramcPH1, cPH paramcPH2)
  {
    if (paramcPH1.getId() == this.iom.getId())
      return -1;
    if (paramcPH2.getId() == this.iom.getId()) {
      return 1;
    }
    return paramcPH1.getName().compareTo(paramcPH2.getName());
  }
}