import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

public class bXf
{
  private static final Logger K = Logger.getLogger(bXf.class);
  private static final int hlJ = -1;
  private final int aw;
  private aBh hlK;
  private int hlL;
  private String hlM;
  private hQ[] dFP;
  private int hlN = 0;
  private final LuaState hlO;
  private boolean hlP = false;
  private ccu hlQ;
  private final ConcurrentLinkedQueue hlR = new ConcurrentLinkedQueue();
  private final ArrayList hlS = new ArrayList();

  private boolean hlT = false;
  private Integer hlU;
  private ArrayList hlV;

  bXf(int paramInt, LuaState paramLuaState, hQ[] paramArrayOfhQ)
  {
    if ((!bB) && (paramLuaState == null)) throw new AssertionError();

    this.aw = paramInt;
    this.hlO = paramLuaState;
    this.hlK = aBh.dUR;

    this.hlO.openBase();
    this.hlO.openMath();
    this.hlO.openTable();
    this.hlO.openOs();
    this.hlN = 0;
    this.dFP = paramArrayOfhQ;
  }

  void d(hQ[] paramArrayOfhQ)
  {
    if (paramArrayOfhQ != null)
      for (hQ localhQ : paramArrayOfhQ)
        try {
          localhQ.a(this.hlO);
        } catch (Exception localException) {
          K.error(localException);
        }
  }

  private void finish()
  {
    if (!this.hlO.isClosed()) {
      this.hlO.close();
    }
    this.hlK = aBh.dUW;

    for (int i = 0; i < this.hlS.size(); i++)
      ((cB)this.hlS.get(i)).b(this);
  }

  private void a(LuaState paramLuaState, baB parambaB)
  {
    String str = null;
    if ((!paramLuaState.isClosed()) && (paramLuaState.getTop() >= 1) && (paramLuaState.isString(-1))) {
      str = paramLuaState.toString(-1);
      paramLuaState.pop(1);
    }
    if (str == null) {
      str = "";
    }

    for (int i = 0; i < this.hlS.size(); i++) {
      ((cB)this.hlS.get(i)).a(this, parambaB, str);
    }

    interrupt();
  }

  public final void ccs()
  {
    if ((this.hlR.isEmpty()) && (this.hlQ == null))
      finish();
  }

  public final void cct()
  {
    if ((this.hlR.isEmpty()) && (this.hlQ == null))
      this.hlK = aBh.dUU;
  }

  final boolean ccu()
  {
    return this.hlT;
  }

  final void gJ(boolean paramBoolean) {
    this.hlT = paramBoolean;
  }

  public final int getId() {
    return this.aw;
  }

  public final int ccv() {
    return this.hlL;
  }

  public final void interrupt()
  {
    this.hlP = true;
  }

  public final cOx a(int paramInt1, int paramInt2, String paramString, bFB[] paramArrayOfbFB)
  {
    if (this.hlK == aBh.dUU) {
      this.hlK = aBh.dUT;
    }
    cOx localcOx = new cOx(this, paramInt1, paramInt2, paramString, paramArrayOfbFB);
    this.hlR.add(localcOx);
    return localcOx;
  }

  public final boolean a(String paramString, bFB[] paramArrayOfbFB)
  {
    if (this.hlQ != null) {
      return false;
    }
    if (this.hlK == aBh.dUU) {
      this.hlK = aBh.dUT;
    }
    ccu localccu = new ccu(this, paramString, paramArrayOfbFB);
    this.hlQ = localccu;
    return true;
  }

  public final boolean a(abf paramabf)
  {
    if ((paramabf instanceof ccu)) {
      if (this.hlQ != null) {
        this.hlQ = null;
        return true;
      }
      return false;
    }

    return ((paramabf instanceof cOx)) && (this.hlR.remove(paramabf));
  }

  public final boolean ul(int paramInt)
  {
    if ((this.hlQ != null) && (this.hlQ.getId() == paramInt)) {
      this.hlQ = null;
      return true;
    }
    Iterator localIterator = this.hlR.iterator();
    while (localIterator.hasNext()) {
      if (((cOx)localIterator.next()).getId() == paramInt) {
        localIterator.remove();
        return true;
      }
    }
    return false;
  }

  final aBh ccw()
  {
    return this.hlK;
  }

  final void kC(String paramString)
  {
    if ((paramString != null) && (this.hlO.LloadString(paramString) == 0))
      this.hlK = aBh.dUS;
    else
      a(this.hlO, baB.fiH);
  }

  public void b(String paramString, byte[] paramArrayOfByte)
  {
    this.hlM = paramString;
    if ((paramString != null) && (this.hlO.LloadBuffer(paramArrayOfByte, paramString) == 0))
      this.hlK = aBh.dUS;
    else
      a(this.hlO, baB.fiH);
  }

  final void F(String paramString, boolean paramBoolean)
  {
    this.hlM = paramString;
    if ((paramString != null) && (this.hlO.LloadFile(paramString) == 0))
      this.hlK = aBh.dUS;
    else
      a(this.hlO, baB.fiH);
  }

  final void m(Map paramMap)
  {
    if (this.hlK == aBh.dUS)
    {
      Iterator localIterator;
      if (paramMap != null) {
        for (localIterator = paramMap.entrySet().iterator(); localIterator.hasNext(); ) { localObject = (Map.Entry)localIterator.next();
          try {
            this.hlO.pushObjectValue(((Map.Entry)localObject).getValue());
            this.hlO.setGlobal((String)((Map.Entry)localObject).getKey());
          } catch (LuaException localLuaException) {
            K.error("Impossible de définir une variable de contexte pour un script", localLuaException);
          }
        }
      }

      int i = this.hlO.resume(0);

      this.hlK = aBh.dUV;

      for (Object localObject = this.hlS.iterator(); ((Iterator)localObject).hasNext(); ) { cB localcB = (cB)((Iterator)localObject).next();
        localcB.c(this);
      }

      if (i != 0)
        a(this.hlO, baB.fiI);
      else
        ccs();
    }
    else if (!this.hlP) {
      this.hlO.pushString("No file loaded");
      a(this.hlO, baB.fiJ);
    }
  }

  public void ccx() {
    if (this.hlQ == null) {
      return;
    }

    this.hlQ.execute();
    this.hlQ = null;
  }

  public void ccy() {
    this.hlQ = null;
  }

  final void update(int paramInt)
  {
    if (this.hlP) {
      switch (aLQ.eqM[this.hlK.ordinal()]) {
      case 1:
        break;
      case 2:
        this.hlK = aBh.dUU;
        break;
      default:
        ccB();
        break;
      }
    } else {
      this.hlL += paramInt;
      Iterator localIterator;
      switch (aLQ.eqM[this.hlK.ordinal()])
      {
      case 1:
      case 3:
      case 4:
        break;
      case 2:
        localIterator = this.hlR.iterator();
        while (localIterator.hasNext()) {
          if (((cOx)localIterator.next()).aBC()) {
            localIterator.remove();
          }
        }
        cct();
        break;
      case 5:
        localIterator = this.hlR.iterator();
        while (localIterator.hasNext()) {
          if (((cOx)localIterator.next()).aBC()) {
            localIterator.remove();
          }
        }
        ccs();
        break;
      }
    }
  }

  public String getSource()
  {
    return this.hlM;
  }

  public void setSource(String paramString) {
    this.hlM = paramString;
  }

  public LuaState getLuaState() {
    return this.hlO;
  }

  public bFB kD(String paramString)
  {
    if (this.hlO.isClosed()) {
      K.error("Tente de récupérer une variable (" + paramString + ") alors que le script est fermé");
      return null;
    }

    this.hlO.getGlobal(paramString);
    bFB localbFB = null;
    try {
      localbFB = bFB.b(this.hlO, -1);
    } catch (LuaException localLuaException) {
      K.error("Variable " + paramString + " inconnue?", localLuaException);
    }
    this.hlO.pop(1);
    return localbFB;
  }

  private boolean isFunction() {
    if ((!this.hlO.isFunction(-1)) && (!this.hlO.isJavaFunction(-1))) {
      this.hlO.Lwhere(1);
      this.hlO.pop(1);
      return false;
    }
    return true;
  }

  public final bFB[] a(String paramString, bFB[] paramArrayOfbFB, cIG[] paramArrayOfcIG)
  {
    if ((this.hlK == aBh.dUR) || (this.hlK == aBh.dUW)) {
      K.error("Le script devrait être chargé avant d'appeler une fonction. (loadFile) " + this.hlK);
      return null;
    }

    if (this.hlK == aBh.dUS) {
      this.hlO.resume(0);
      this.hlK = aBh.dUT;
    }

    if (paramArrayOfcIG != null)
    {
      for (int i = 0; i < paramArrayOfcIG.length; i++) {
        if (paramArrayOfcIG[i] != null) {
          paramArrayOfcIG[i].d(this.hlO);
        }
      }
    }

    if (paramString.contains(".")) {
      String[] arrayOfString = cOg.aR(paramString, "\\.");
      this.hlO.pushString(arrayOfString[0]);
      this.hlO.getTable(LuaState.LUA_GLOBALSINDEX.intValue());

      if (!this.hlO.isTable(-1)) {
        K.error(arrayOfString[0] + " n'est pas une librairie connue");
        this.hlO.remove(-1);

        switch (aLQ.eqM[this.hlK.ordinal()]) {
        case 5:
          ccs();
          break;
        case 2:
          cct();
        }

        return null;
      }
      this.hlO.pushString(arrayOfString[1]);
      this.hlO.getTable(-2);
      this.hlO.remove(-2);
    }
    else
    {
      this.hlO.getGlobal(paramString);
    }

    if (!isFunction()) {
      K.error("Fonction inconnue " + paramString + " dans le script " + this.hlM + " ligne " + ccz(), new Exception());
      return null;
    }

    int j = 0;
    if (paramArrayOfbFB != null) {
      j = paramArrayOfbFB.length;

      for (k = 0; k < j; k++) {
        if (paramArrayOfbFB[k] == null)
          this.hlO.pushNil();
        else {
          paramArrayOfbFB[k].d(this.hlO);
        }
      }
    }
    if (this.hlO.pcall(j, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
      a(this.hlO, baB.fiI);
    }

    int k = this.hlO.getTop();
    bFB[] arrayOfbFB = new bFB[k];

    for (int m = 0; m < k; m++) {
      try {
        arrayOfbFB[m] = bFB.b(this.hlO, -1);
      } catch (LuaException localLuaException) {
        K.error("Error retrieving a function(" + paramString + ") result : " + localLuaException);
      }
      this.hlO.pop(1);
    }

    return arrayOfbFB;
  }

  public String ccz()
  {
    this.hlO.Lwhere(1);
    String str = this.hlO.toString(-1);
    this.hlO.pop(1);
    if ((str != null) && (str.length() > 0)) {
      String[] arrayOfString = cOg.c(str, ':');
      if (arrayOfString.length > 1) {
        str = arrayOfString[1];
      }
    }
    return str;
  }

  public void kE(String paramString) {
    a(paramString, null, new cIG[0]);
  }

  public boolean b(cB paramcB) {
    return this.hlS.add(paramcB);
  }

  public final void ccA() {
    this.hlS.clear();
  }

  public final boolean c(cB paramcB) {
    return this.hlS.contains(paramcB);
  }

  public final boolean d(cB paramcB) {
    return this.hlS.remove(paramcB);
  }

  public final void ccB() {
    this.hlR.clear();
    this.hlQ = null;
    ccs();
  }

  public int a() {
    if (this.hlU == null) {
      this.hlU = Integer.valueOf(-1);
      LuaObject localLuaObject = this.hlO.getLuaObject("fightId");
      if (localLuaObject != null) {
        if (localLuaObject.isNumber())
          this.hlU = Integer.valueOf((int)localLuaObject.getNumber());
        else if (localLuaObject.isJavaObject()) {
          try {
            this.hlU = Integer.valueOf(Integer.parseInt(localLuaObject.toString()));
          } catch (NumberFormatException localNumberFormatException) {
            K.error("Impossible de recuperer un id de combat sur un objet non transformable en entier : " + localLuaObject);
          }
        }
      }
    }

    return this.hlU.intValue();
  }

  public hQ[] vM() {
    return this.dFP;
  }

  public void aS(Object paramObject)
  {
    if (this.hlV == null) {
      this.hlV = new ArrayList();
    }
    this.hlV.add(paramObject);
  }

  public void O(dGy paramdGy) {
    if (this.hlV == null) {
      return;
    }

    int i = 0; for (int j = this.hlV.size(); i < j; i++)
      if (!paramdGy.d(this.hlV.get(i)))
        return;
  }
}