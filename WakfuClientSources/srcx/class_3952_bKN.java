import java.util.ArrayList;

class bKN
  implements dGy
{
  bKN(cBQ paramcBQ)
  {
  }

  public boolean execute(String paramString)
  {
    if (cBQ.a(this.gND) != null) {
      cBQ.a(this.gND).hj(paramString);
    }
    for (bnm localbnm : cBQ.b(this.gND)) {
      localbnm.i(paramString);
    }
    if (cBQ.c(this.gND).size() > 0) {
      cBQ.b(this.gND).removeAll(cBQ.c(this.gND));
      cBQ.c(this.gND).clear();
    }
    return true;
  }
}