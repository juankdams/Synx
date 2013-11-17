import com.ankamagames.framework.script.DefaultFunctionsLibrary;
import com.ankamagames.framework.script.JavaFunctionLoader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

public class dlD extends dPs
  implements cB, Runnable
{
  private static final Logger K = Logger.getLogger(dlD.class);
  private static final Logger flN = Logger.getLogger("LUA");
  public static final String ljb = "script";
  public static final String ljc = ".lua";
  public static final FilenameFilter gyd = new aDa();
  private static final int ljd = 30;
  private static final dlD lje = new dlD();

  private final ArrayList aBf = new ArrayList();

  private long ljf = 0L;

  private final cSR RB = new cSR();

  private static final dGy ljg = new aDb();
  private hQ[] bEv;

  private dlD()
  {
    super(0L, false);
    this.bEv = new hQ[] { DefaultFunctionsLibrary.brE() };
    dka.cSF().a(this, 30L);
  }

  public void cTs() {
    kP(2097152L);
  }

  public static dlD cTt() {
    return lje;
  }

  protected final bLb ai(byte[] paramArrayOfByte)
  {
    return new dkj(this, paramArrayOfByte, null);
  }

  public final String getExtension()
  {
    return ".lua";
  }

  public final FilenameFilter getFilenameFilter()
  {
    return gyd;
  }

  public final void e(cB paramcB) {
    if (!this.aBf.contains(paramcB))
      this.aBf.add(paramcB);
  }

  public final void f(cB paramcB)
  {
    this.aBf.remove(paramcB);
  }

  public final void f(hQ[] paramArrayOfhQ)
  {
    if ((!bB) && (this.bEv == null)) throw new AssertionError();
    if ((paramArrayOfhQ != null) && (paramArrayOfhQ.length != 0)) {
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(Arrays.asList(this.bEv));
      localHashSet.addAll(Arrays.asList(paramArrayOfhQ));

      this.bEv = ((hQ[])localHashSet.toArray(new hQ[localHashSet.size()]));
    }
  }

  public final bXf AE(int paramInt) {
    synchronized (this.RB) {
      return (bXf)this.RB.get(paramInt);
    }
  }

  String AF(int paramInt) {
    if ((!bB) && (getPath() == null)) throw new AssertionError();
    return String.format("%d%s", new Object[] { Integer.valueOf(paramInt), getExtension() });
  }

  public final bXf a(int paramInt, hQ[] paramArrayOfhQ, boolean paramBoolean)
  {
    if ((!bB) && (getPath() == null)) throw new AssertionError();
    return a(AF(paramInt), paramArrayOfhQ, paramBoolean);
  }

  public bXf a(String paramString, hQ[] paramArrayOfhQ, boolean paramBoolean)
  {
    String str = getPath() + paramString;
    QX.log("script", str);
    bXf localbXf = g(paramArrayOfhQ);
    if (!dqC()) {
      JavaFunctionLoader.bEu.o(paramString, str);
    }
    localbXf.d(JavaFunctionLoader.bEu.bp(paramString));
    localbXf.d(paramArrayOfhQ);
    try {
      localbXf.b(paramString, (byte[])getData(paramString));

      localbXf.setSource(paramString);
      localbXf.gJ(paramBoolean);
    } catch (Exception localException) {
      K.error("Impossible de charger le fichier " + paramString, localException);
      return null;
    }

    if (localbXf.ccw() != aBh.dUS) {
      return null;
    }

    int i = localbXf.getId();

    synchronized (this.RB) {
      this.RB.put(i, localbXf);
    }
    return localbXf;
  }

  public final bXf a(String paramString, hQ[] paramArrayOfhQ, Map paramMap, boolean paramBoolean) {
    bXf localbXf = b(paramString, paramArrayOfhQ, paramBoolean);
    if (localbXf != null) {
      localbXf.setSource("Command : " + paramString);
      localbXf.m(paramMap);
    } else {
      K.error("Le Script de commande [" + paramString + "] n'existe pas");
    }
    return localbXf;
  }

  private bXf b(String paramString, hQ[] paramArrayOfhQ, boolean paramBoolean) {
    bXf localbXf = g(paramArrayOfhQ);
    localbXf.d(JavaFunctionLoader.bEu.bq(paramString));
    localbXf.kC(paramString);
    localbXf.gJ(paramBoolean);

    if (localbXf.ccw() != aBh.dUS) {
      return null;
    }

    int i = localbXf.getId();

    synchronized (this.RB) {
      this.RB.put(i, localbXf);
    }
    return localbXf;
  }

  public final bXf a(String paramString, cB paramcB)
  {
    return a(paramString, null, null, paramcB, false);
  }

  public final bXf ps(String paramString) {
    return a(paramString, null, null);
  }

  public final bXf a(String paramString, cB paramcB, boolean paramBoolean)
  {
    return a(paramString, null, null, paramcB, paramBoolean);
  }

  public final bXf Q(String paramString, boolean paramBoolean) {
    return a(paramString, null, paramBoolean);
  }

  public final bXf a(int paramInt, cB paramcB)
  {
    return a(paramInt, null, null, paramcB, false);
  }

  public final bXf AG(int paramInt) {
    return a(paramInt, null, null);
  }

  public final bXf a(int paramInt, cB paramcB, boolean paramBoolean)
  {
    return a(paramInt, null, null, paramcB, paramBoolean);
  }

  public final bXf E(int paramInt, boolean paramBoolean) {
    return a(paramInt, null, paramBoolean);
  }

  public final bXf a(int paramInt, hQ[] paramArrayOfhQ, cB paramcB)
  {
    return a(paramInt, paramArrayOfhQ, null, paramcB, false);
  }

  public final bXf a(int paramInt, hQ[] paramArrayOfhQ, Map paramMap, cB paramcB, boolean paramBoolean)
  {
    if ((!bB) && (getPath() == null)) throw new AssertionError();
    return a(AF(paramInt), paramArrayOfhQ, paramMap, paramcB, paramBoolean);
  }

  public final bXf a(int paramInt, hQ[] paramArrayOfhQ, Map paramMap, boolean paramBoolean) {
    return a(paramInt, paramArrayOfhQ, paramMap, null, paramBoolean);
  }

  public final bXf a(String paramString, hQ[] paramArrayOfhQ, cB paramcB)
  {
    return a(paramString, paramArrayOfhQ, null, paramcB, false);
  }

  public final bXf a(String paramString, hQ[] paramArrayOfhQ) {
    return a(paramString, paramArrayOfhQ, null);
  }

  public final bXf a(String paramString, hQ[] paramArrayOfhQ, Map paramMap, cB paramcB, boolean paramBoolean)
  {
    bXf localbXf = a(paramString, paramArrayOfhQ, paramBoolean);
    if (localbXf != null) {
      if (paramcB != null) {
        localbXf.b(paramcB);
      }
      localbXf.m(paramMap);
    } else {
      K.error("Le Script de [" + paramString + "] n'existe pas");
    }
    return localbXf;
  }

  public final void AH(int paramInt)
  {
    bXf localbXf = AE(paramInt);
    if (localbXf != null)
      localbXf.interrupt();
  }

  public final int cjh()
  {
    int i = 1;
    synchronized (this.RB) {
      while (this.RB.containsKey(i)) {
        i++;
      }
    }
    return i;
  }

  public void update(int paramInt)
  {
    synchronized (this.RB) {
      this.RB.a(new aCY(this, paramInt));
    }
  }

  private bXf g(hQ[] paramArrayOfhQ)
  {
    LuaState localLuaState = LuaStateFactory.newLuaState();

    int i = cjh();
    bXf localbXf = new bXf(i, localLuaState, paramArrayOfhQ);
    localbXf.d(paramArrayOfhQ);

    localbXf.b(this);

    localLuaState.pushJavaObject(localbXf);
    localLuaState.setGlobal("script");

    return localbXf;
  }

  public final void interrupt() {
    dka.cSF().j(this);
  }

  public final void run() {
    long l = System.currentTimeMillis();
    int i = (int)(l - this.ljf);
    update(i);
    this.ljf = l;
  }

  public void a(bXf parambXf, baB parambaB, String paramString)
  {
    for (int i = 0; i < this.aBf.size(); i++) {
      if ((!bB) && (this.aBf.get(i) == null)) throw new AssertionError();
      ((Runnable)this.aBf.get(i)).a(parambXf, parambaB, paramString);
    }

    if (!parambXf.ccu()) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[LUA] ").append(parambaB).append(" Fichier ").append(parambXf.getSource()).append(' ').append(paramString);

      flN.error(localStringBuilder.toString());
    }
    K.error("Erreur dans un script (" + parambXf.getSource() + " ) : erreur " + parambaB + ' ' + paramString, new Exception("callStack"));
  }

  public void b(bXf parambXf)
  {
    for (int i = 0; i < this.aBf.size(); i++)
      ((Runnable)this.aBf.get(i)).b(parambXf);
  }

  public void c(bXf parambXf)
  {
  }

  public void cTu()
  {
    synchronized (this.RB) {
      this.RB.s(ljg);
      this.RB.clear();
    }
  }
}