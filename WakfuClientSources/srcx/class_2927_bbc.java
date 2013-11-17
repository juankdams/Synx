import java.util.ArrayList;

public class bbc
{
  private final ArrayList dcd = new ArrayList();

  public boolean a(bH parambH) {
    return (!this.dcd.contains(parambH)) && (this.dcd.add(parambH));
  }

  public boolean J(dGy paramdGy) {
    for (int i = 0; i < this.dcd.size(); i++)
      if (!paramdGy.d(this.dcd.get(i)))
        return false;
    return true;
  }
}