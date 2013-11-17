import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ccu
  implements abf
{
  public final int huc;
  private final String boZ;
  private final bFB[] hud;
  private ArrayList hue;

  ccu(bXf parambXf, String paramString, bFB[] paramArrayOfbFB)
  {
    this.boZ = paramString;
    this.hud = paramArrayOfbFB;
    this.huc = bXf.e(parambXf);
  }

  public int getId() {
    return this.huc;
  }

  public void execute()
  {
    if (bXf.f(this.huf).isClosed()) {
      bXf.Re().error("Tentative d'execution d'une WaitingTask sur un script fermé id=" + bXf.g(this.huf));
      return;
    }

    if (this.boZ.contains(".")) {
      String[] arrayOfString = cOg.c(this.boZ, '.');
      bXf.f(this.huf).pushString(arrayOfString[0]);
      bXf.f(this.huf).getTable(LuaState.LUA_GLOBALSINDEX.intValue());
      if (!bXf.f(this.huf).isTable(-1)) {
        bXf.Re().error(arrayOfString[0] + " n'est pas une librairie connue");
        bXf.f(this.huf).remove(-1);

        switch (aLQ.eqM[bXf.h(this.huf).ordinal()]) {
        case 5:
          this.huf.ccs();
          break;
        case 2:
          this.huf.cct();
        }

        return;
      }
      bXf.f(this.huf).pushString(arrayOfString[1]);
      bXf.f(this.huf).getTable(-2);
      bXf.f(this.huf).remove(-2);
    }
    else {
      bXf.f(this.huf).pushString(this.boZ);
      bXf.f(this.huf).getTable(LuaState.LUA_GLOBALSINDEX.intValue());
    }

    if (bXf.i(this.huf))
    {
      int i = this.hud == null ? 0 : this.hud.length;
      for (int j = 0; j < i; j++) {
        this.hud[j].d(bXf.f(this.huf));
      }

      if (bXf.f(this.huf).pcall(i, LuaState.LUA_MULTRET.intValue(), 0) != 0)
        bXf.a(this.huf, bXf.f(this.huf), baB.fiI);
    }
    else {
      bXf.Re().error("Fonction inconnue " + this.boZ + " dans le script " + bXf.j(this.huf));
    }

    bXf.f(this.huf).pop(bXf.f(this.huf).getTop());
    switch (aLQ.eqM[bXf.h(this.huf).ordinal()]) {
    case 5:
      this.huf.ccs();
      break;
    case 2:
      this.huf.cct();
    }
  }
}