import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class cOx
  implements abf
{
  public final int huc;
  private final int kxd;
  private int kxe;
  private int dls;
  private final String boZ;
  private final bFB[] hud;
  private ArrayList hue;

  cOx(bXf parambXf, int paramInt1, int paramInt2, String paramString, bFB[] paramArrayOfbFB)
  {
    this.kxd = paramInt1;
    this.kxe = (bXf.k(parambXf) + paramInt1);
    this.dls = paramInt2;
    this.boZ = paramString;
    this.hud = paramArrayOfbFB;
    this.huc = bXf.e(parambXf);
  }

  public int getId() {
    return this.huc;
  }

  public void execute()
  {
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
    else
    {
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

  boolean aBC()
  {
    if (bXf.k(this.huf) >= this.kxe) {
      execute();

      if (this.dls == -1) {
        this.kxe += this.kxd;
      } else {
        this.dls -= 1;
        if (this.dls > 0)
          this.kxe += this.kxd;
        else {
          return true;
        }
      }
    }
    return false;
  }
}