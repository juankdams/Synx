public class buU
  implements aqg
{
  public static final buU geA = new buU();

  private int geB = -1;

  public void xo() {
    this.geB = -1;
  }

  public void a(aQm paramaQm, aKS paramaKS) {
    if ((paramaQm == aQm.eMX) && 
      (paramaKS.isSynchronized())) {
      int i = paramaKS.VN().getHours();
      if (i != this.geB) {
        if (this.geB != -1) {
          aWc.blo().b(new cpj(i));
        }
        this.geB = i;
      }
    }
  }
}