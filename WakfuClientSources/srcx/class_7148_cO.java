import java.util.ArrayList;

class cO
  implements dGy
{
  cO(NC paramNC)
  {
  }

  public boolean a(aiA paramaiA)
  {
    if (NC.b(this.Sa).cOR().b(paramaiA)) {
      NC.c(this.Sa).add(paramaiA);
    } else if (NC.d(this.Sa) == paramaiA.getId()) {
      NC.a(this.Sa, -1);
      dLE.doY().a(this.Sa, new String[] { "currentDungeon" });
    }
    return true;
  }
}