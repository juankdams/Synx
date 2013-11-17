import com.sun.jna.Native;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Adler32;

public abstract class bik
{
  static final boolean fyh = ("ppc".equals(str)) || ("powerpc".equals(str));
  static final boolean fyi = "sparc".equals(str);
  static final boolean fyj = str.startsWith("arm");
  public static final int fyk = 0;
  public static final int fyl = 1;
  public static final int fym = 2;
  public static final int fyn = 3;
  static final int fyo = (fyi) || (((!fyh) && (!fyj)) || ((bIG.bPV()) || (bIG.bPU()) || (bIG.bPW()))) ? 8 : Native.LONG_SIZE;
  protected static final int fyp = -1;
  static final Map fyq = new WeakHashMap();
  static final Map fyr = new WeakHashMap();
  private axA fys;
  private int size = -1;
  private int fyt;
  private int fyu;
  private int fyv;
  private Map fyw;
  private final Map fyx = new HashMap();
  private bXj fyy;
  private long fyz;
  private boolean fyA = true;
  private boolean fyB = true;
  private bik[] fyC;
  private boolean fyD;
  private static final ThreadLocal fyE = new aDj();

  private static final ThreadLocal fyF = new aDi();

  private static final axA fyG = new aDg(0L);
  static Class bRq;
  static Class cvB;
  static Class cvT;
  static Class bZT;
  static Class bZS;
  static Class bRr;
  static Class bRs;
  static Class cvF;
  static Class cvL;
  static Class cvK;
  static Class cvI;
  static Class cvJ;
  static Class cvH;
  static Class cvG;
  static Class cvM;
  static Class cvN;
  static Class fyH;
  static Class cvP;
  static Class fyI;

  protected bik()
  {
    this(0);
  }

  protected bik(bXj parambXj) {
    this(null, 0, parambXj);
  }

  protected bik(int paramInt) {
    this(null, paramInt);
  }

  protected bik(int paramInt, bXj parambXj) {
    this(null, paramInt, parambXj);
  }

  protected bik(axA paramaxA)
  {
    this(paramaxA, 0);
  }

  protected bik(axA paramaxA, int paramInt) {
    this(paramaxA, paramInt, null);
  }

  protected bik(axA paramaxA, int paramInt, bXj parambXj) {
    pO(paramInt);
    a(parambXj);
    bum();
    if (paramaxA != null) {
      c(paramaxA);
    }
    else {
      pQ(-1);
    }
    bun();
  }

  Map buc()
  {
    return this.fyw;
  }

  bXj bud()
  {
    return this.fyy;
  }

  private void a(bXj parambXj)
  {
    if (parambXj == null) {
      Class localClass = getClass().getDeclaringClass();
      if (localClass != null) {
        parambXj = Native.q(localClass);
      }
    }
    this.fyy = parambXj;
    bue();
  }

  private void bue()
  {
    if (this.size != -1) {
      this.size = -1;
      if ((this.fys instanceof fD)) {
        this.fys = null;
      }

      buf();
    }
  }

  protected void pO(int paramInt)
  {
    this.fyt = paramInt;
    if (paramInt == 0) {
      Class localClass = getClass().getDeclaringClass();
      if (localClass != null)
        paramInt = Native.r(localClass);
      if (paramInt == 0) {
        if (bIG.bPY())
          paramInt = 3;
        else
          paramInt = 2;
      }
    }
    this.fyu = paramInt;
    bue();
  }

  protected dcj pP(int paramInt) {
    return new fD(paramInt);
  }

  protected void c(axA paramaxA)
  {
    a(paramaxA, 0);
  }

  protected void a(axA paramaxA, int paramInt)
  {
    try
    {
      this.fyx.clear();

      this.fys = paramaxA.dp(paramInt);
      if (this.size == -1) {
        this.size = eM(false);
      }
      if (this.size != -1) {
        this.fys = paramaxA.p(paramInt, this.size);
      }
      this.fyC = null;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {
      throw new IllegalArgumentException("Structure exceeds provided memory bounds");
    }
  }

  protected void buf()
  {
    eJ(false);
  }

  private void eJ(boolean paramBoolean)
  {
    if (this.fys == null) {
      eK(paramBoolean);
    }
    else if (this.size == -1) {
      this.size = g(true, paramBoolean);
      if (!(this.fys instanceof fD))
        try
        {
          this.fys = this.fys.p(0L, this.size);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {
          throw new IllegalArgumentException("Structure exceeds provided memory bounds");
        }
    }
  }

  protected void bug()
  {
    eK(false);
  }

  private void eK(boolean paramBoolean) {
    pQ(g(true, paramBoolean));
  }

  protected void pQ(int paramInt)
  {
    if (paramInt == -1)
    {
      paramInt = eM(false);
    }
    else if (paramInt <= 0) {
      throw new IllegalArgumentException("Structure size must be greater than zero: " + paramInt);
    }

    if (paramInt != -1) {
      if ((this.fys == null) || ((this.fys instanceof fD)))
      {
        this.fys = pP(paramInt);
      }
      this.size = paramInt;
    }
  }

  public int size()
  {
    buf();
    return this.size;
  }

  public void clear()
  {
    buf();
    this.fys.dq(size());
  }

  public axA sF()
  {
    buf();
    return this.fys;
  }

  static Set buh()
  {
    return (Set)fyF.get();
  }
  static Map bui() {
    return (Map)fyE.get();
  }

  void buj()
  {
    if (!this.fyD)
      bus();
  }

  public void hb()
  {
    this.fyD = true;

    if (this.fys == fyG) {
      return;
    }

    buf();

    if (buh().contains(this)) {
      return;
    }
    buh().add(this);
    if ((this instanceof ckM))
      bui().put(sF(), this);
    try
    {
      for (Iterator localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
        b((bJW)localIterator.next());
      }

      buh().remove(this);
      if (bui().get(sF()) == this)
        bui().remove(sF());
    }
    finally
    {
      buh().remove(this);
      if (bui().get(sF()) == this)
        bui().remove(sF());
    }
  }

  protected int ip(String paramString)
  {
    buf();
    bJW localbJW = (bJW)buc().get(paramString);
    if (localbJW == null)
      throw new IllegalArgumentException("No such field: " + paramString);
    return localbJW.offset;
  }

  public Object cb(String paramString)
  {
    buf();
    bJW localbJW = (bJW)buc().get(paramString);
    if (localbJW == null)
      throw new IllegalArgumentException("No such field: " + paramString);
    return b(localbJW);
  }

  Object a(Field paramField)
  {
    try
    {
      return paramField.get(this);
    }
    catch (Exception localException) {
      throw new Error("Exception reading field '" + paramField.getName() + "' in " + getClass() + ": " + localException);
    }
  }

  void a(Field paramField, Object paramObject)
  {
    a(paramField, paramObject, false);
  }

  private void a(Field paramField, Object paramObject, boolean paramBoolean)
  {
    try {
      paramField.set(this, paramObject);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      int i = paramField.getModifiers();
      if (Modifier.isFinal(i)) {
        if (paramBoolean)
        {
          throw new UnsupportedOperationException("This VM does not support Structures with final fields (field '" + paramField.getName() + "' within " + getClass() + ")");
        }
        throw new UnsupportedOperationException("Attempt to write to read-only field '" + paramField.getName() + "' within " + getClass());
      }
      throw new Error("Unexpectedly unable to write to field '" + paramField.getName() + "' within " + getClass() + ": " + localIllegalAccessException);
    }
  }

  static bik a(Class paramClass, bik parambik, axA paramaxA)
  {
    if (paramaxA == null) {
      parambik = null;
    }
    else {
      if ((parambik == null) || (!paramaxA.equals(parambik.sF()))) {
        bik localbik = (bik)bui().get(paramaxA);
        if ((localbik != null) && (paramClass.equals(localbik.getClass()))) {
          parambik = localbik;
        }
        else {
          parambik = a(paramClass, paramaxA);
        }
      }
      parambik.bus();
    }
    return parambik;
  }

  Object b(bJW parambJW)
  {
    int i = parambJW.offset;

    Class localClass = parambJW.type;
    bYH localbYH = parambJW.gLO;
    if (localbYH != null) {
      localClass = localbYH.WJ();
    }

    if (!(bRq == null ? (bik.bRq = cd("bik")) : bRq).isAssignableFrom(localClass)) if (!(cvB == null ? (bik.cvB = cd("dBN")) : cvB).isAssignableFrom(localClass)) if (bIG.gIh) { if ((cvT == null ? (bik.cvT = cd("java.nio.Buffer")) : cvT).isAssignableFrom(localClass)); } else if ((bZT == null ? (bik.bZT = cd("axA")) : bZT).isAssignableFrom(localClass)); 
    Object localObject1 = ((bZS == null ? (bik.bZS = cd("arr")) : bZS).isAssignableFrom(localClass)) || (localClass.isArray()) ? a(parambJW.field) : null;

    Object localObject2 = this.fys.a(i, localClass, localObject1);
    if (localbYH != null) {
      localObject2 = localbYH.a(localObject2, parambJW.gLQ);
      if ((localObject1 != null) && (localObject1.equals(localObject2))) {
        localObject2 = localObject1;
      }
    }

    if (!localClass.equals(bRr == null ? (bik.bRr = cd("java.lang.String")) : bRr)) { if (!localClass.equals(bRs == null ? (bik.bRs = cd("cFg")) : bRs));
    } else {
      this.fyx.put(parambJW.name + ".ptr", this.fys.bX(i));
      this.fyx.put(parambJW.name + ".val", localObject2);
    }

    a(parambJW.field, localObject2, true);
    return localObject2;
  }

  public void write()
  {
    if (this.fys == fyG) {
      return;
    }

    buf();

    if ((this instanceof qR)) {
      RT();
    }

    if (buh().contains(this)) {
      return;
    }
    buh().add(this);
    try
    {
      for (localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
        bJW localbJW = (bJW)localIterator.next();
        if (!localbJW.gLN)
          a(localbJW);
      }
    }
    finally
    {
      Iterator localIterator;
      buh().remove(this);
    }
  }

  public void cc(String paramString)
  {
    buf();
    bJW localbJW = (bJW)buc().get(paramString);
    if (localbJW == null)
      throw new IllegalArgumentException("No such field: " + paramString);
    a(localbJW);
  }

  public void h(String paramString, Object paramObject)
  {
    buf();
    bJW localbJW = (bJW)buc().get(paramString);
    if (localbJW == null)
      throw new IllegalArgumentException("No such field: " + paramString);
    a(localbJW.field, paramObject);
    a(localbJW);
  }

  void a(bJW parambJW)
  {
    if (parambJW.isReadOnly) {
      return;
    }

    int i = parambJW.offset;

    Object localObject1 = a(parambJW.field);

    Class localClass = parambJW.type;
    aEQ localaEQ = parambJW.gLP;
    if (localaEQ != null) {
      localObject1 = localaEQ.a(localObject1, new dRb(this, parambJW.field));
      localClass = localaEQ.WJ();
    }
    Object localObject2;
    if ((bRr == null ? (bik.bRr = cd("java.lang.String")) : bRr) != localClass) { if ((bRs == null ? (bik.bRs = cd("cFg")) : bRs) != localClass);
    } else
    {
      boolean bool = localClass == (bRs == null ? (bik.bRs = cd("cFg")) : bRs);
      if (localObject1 != null)
      {
        if ((this.fyx.containsKey(parambJW.name + ".ptr")) && (localObject1.equals(this.fyx.get(parambJW.name + ".val"))))
        {
          return;
        }
        localObject2 = new cpn(localObject1.toString(), bool);

        this.fyx.put(parambJW.name, localObject2);
        localObject1 = ((cpn)localObject2).sF();
      }
      else {
        this.fyx.remove(parambJW.name);
      }
      this.fyx.remove(parambJW.name + ".ptr");
      this.fyx.remove(parambJW.name + ".val");
    }
    try
    {
      this.fys.b(i, localObject1, localClass);
    }
    catch (IllegalArgumentException localIllegalArgumentException) {
      localObject2 = "Structure field \"" + parambJW.name + "\" was declared as " + parambJW.type + (parambJW.type == localClass ? "" : new StringBuffer().append(" (native type ").append(localClass).append(")").toString()) + ", which is not supported within a Structure";

      throw new IllegalArgumentException((String)localObject2);
    }
  }

  protected abstract List aR();

  protected final void o(String[] paramArrayOfString)
  {
    throw new Error("This method is obsolete, use getFieldOrder() instead");
  }

  protected void b(List paramList1, List paramList2)
  {
    for (int i = 0; i < paramList2.size(); i++) {
      String str = (String)paramList2.get(i);
      for (int j = 0; j < paramList1.size(); j++) {
        Field localField = (Field)paramList1.get(j);
        if (str.equals(localField.getName())) {
          Collections.swap(paramList1, i, j);
          break;
        }
      }
    }
  }

  protected List buk()
  {
    ArrayList localArrayList1 = new ArrayList();
    for (Class localClass = getClass(); 
      !localClass.equals(bRq == null ? (bik.bRq = cd("bik")) : bRq); 
      localClass = localClass.getSuperclass()) {
      ArrayList localArrayList2 = new ArrayList();
      Field[] arrayOfField = localClass.getDeclaredFields();
      for (int i = 0; i < arrayOfField.length; i++) {
        int j = arrayOfField[i].getModifiers();
        if ((!Modifier.isStatic(j)) && (Modifier.isPublic(j)))
        {
          localArrayList2.add(arrayOfField[i]);
        }
      }
      localArrayList1.addAll(0, localArrayList2);
    }
    return localArrayList1;
  }

  private List bul()
  {
    synchronized (fyr) {
      List localList = (List)fyr.get(getClass());
      if (localList == null) {
        localList = aR();
        fyr.put(getClass(), localList);
      }
      return localList;
    }
  }

  private List o(Collection paramCollection) {
    ArrayList localArrayList = new ArrayList(paramCollection);
    Collections.sort(localArrayList);
    return localArrayList;
  }

  protected List eL(boolean paramBoolean)
  {
    List localList = buk();
    HashSet localHashSet1 = new HashSet();
    for (Object localObject = localList.iterator(); ((Iterator)localObject).hasNext(); ) {
      localHashSet1.add(((Field)((Iterator)localObject).next()).getName());
    }
    localObject = bul();
    if ((((List)localObject).size() != localList.size()) && (localList.size() > 1)) {
      if (paramBoolean) {
        throw new Error("Structure.getFieldOrder() on " + getClass() + " does not provide enough names (" + o((Collection)localObject) + ") to match declared fields (" + o(localHashSet1) + ")");
      }

      return null;
    }

    HashSet localHashSet2 = new HashSet((Collection)localObject);
    if (!localHashSet2.equals(localHashSet1)) {
      throw new Error("Structure.getFieldOrder() on " + getClass() + " returns names (" + o((Collection)localObject) + ") which do not match declared field names (" + o(localHashSet1) + ")");
    }

    b(localList, (List)localObject);

    return localList;
  }

  private int eM(boolean paramBoolean)
  {
    return g(paramBoolean, false);
  }

  public static int N(Class paramClass)
  {
    return a(paramClass, null);
  }

  public static int a(Class paramClass, bik parambik)
  {
    blk localblk;
    synchronized (fyq) {
      localblk = (blk)fyq.get(paramClass);
    }
    int i = (localblk != null) && (!blk.a(localblk)) ? blk.b(localblk) : -1;
    if (i == -1) {
      if (parambik == null) {
        parambik = a(paramClass, fyG);
      }
      i = parambik.size();
    }
    return i;
  }

  int g(boolean paramBoolean1, boolean paramBoolean2) {
    int i = -1;
    blk localblk;
    synchronized (fyq) {
      localblk = (blk)fyq.get(getClass());
    }
    if ((localblk == null) || (this.fyt != blk.c(localblk)) || (this.fyy != blk.d(localblk)))
    {
      localblk = n(paramBoolean1, paramBoolean2);
    }
    if (localblk != null) {
      this.fyv = blk.e(localblk);
      this.fyw = blk.f(localblk);

      if (!blk.a(localblk)) {
        synchronized (fyq)
        {
          if ((!fyq.containsKey(getClass())) || (this.fyt != 0) || (this.fyy != null))
          {
            fyq.put(getClass(), localblk);
          }
        }
      }
      i = blk.b(localblk);
    }
    return i;
  }

  private void h(String paramString, Class paramClass)
  {
    if (this.fyy != null) {
      aEQ localaEQ = this.fyy.X(paramClass);
      if (localaEQ != null) {
        h(paramString, localaEQ.WJ());
        return;
      }
    }
    if (paramClass.isArray())
      h(paramString, paramClass.getComponentType());
    else
      try
      {
        s(paramClass);
      }
      catch (IllegalArgumentException localIllegalArgumentException) {
        String str = "Invalid Structure field in " + getClass() + ", field name '" + paramString + "' (" + paramClass + "): " + localIllegalArgumentException.getMessage();
        throw new IllegalArgumentException(str);
      }
  }

  private void bum()
  {
    List localList = buk();
    for (Iterator localIterator = localList.iterator(); localIterator.hasNext(); ) {
      Field localField = (Field)localIterator.next();
      h(localField.getName(), localField.getType());
    }
  }

  private blk n(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    List localList = eL(paramBoolean1);
    if (localList == null) {
      return null;
    }

    blk localblk = new blk(null);
    blk.a(localblk, this.fyt);
    blk.a(localblk, this.fyy);

    boolean bool = true;
    for (Iterator localIterator = localList.iterator(); localIterator.hasNext(); bool = false) {
      Field localField = (Field)localIterator.next();
      int k = localField.getModifiers();

      Class localClass1 = localField.getType();
      if (localClass1.isArray()) {
        blk.a(localblk, true);
      }
      bJW localbJW = new bJW();
      localbJW.gLN = Modifier.isVolatile(k);
      localbJW.isReadOnly = Modifier.isFinal(k);
      if (localbJW.isReadOnly) {
        if (!bIG.gIg) {
          throw new IllegalArgumentException("This VM does not support read-only fields (field '" + localField.getName() + "' within " + getClass() + ")");
        }

        localField.setAccessible(true);
      }
      localbJW.field = localField;
      localbJW.name = localField.getName();
      localbJW.type = localClass1;

      if (((cvB == null ? (bik.cvB = cd("dBN")) : cvB).isAssignableFrom(localClass1)) && (!localClass1.isInterface())) {
        throw new IllegalArgumentException("Structure Callback field '" + localField.getName() + "' must be an interface");
      }

      if (localClass1.isArray()) if ((bRq == null ? (bik.bRq = cd("bik")) : bRq).equals(localClass1.getComponentType()))
        {
          String str1 = "Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined";

          throw new IllegalArgumentException(str1);
        }

      int m = 1;
      if (Modifier.isPublic(localField.getModifiers()))
      {
        Object localObject1 = a(localbJW.field);
        if ((localObject1 == null) && (localClass1.isArray())) {
          if (paramBoolean1) {
            throw new IllegalStateException("Array fields must be initialized");
          }

          return null;
        }
        Class localClass2 = localClass1;
        Object localObject2;
        Object localObject3;
        if ((bZS == null ? (bik.bZS = cd("arr")) : bZS).isAssignableFrom(localClass1)) {
          localObject2 = MK.k(localClass1);
          localClass2 = ((MK)localObject2).WJ();
          localbJW.gLP = ((aEQ)localObject2);
          localbJW.gLO = ((bYH)localObject2);
          localbJW.gLQ = new HE(this, localField);
        }
        else if (this.fyy != null) {
          localObject2 = this.fyy.X(localClass1);
          localObject3 = this.fyy.W(localClass1);
          if ((localObject2 != null) && (localObject3 != null)) {
            localObject1 = ((aEQ)localObject2).a(localObject1, new dRb(this, localbJW.field));

            localClass2 = bZT == null ? (bik.bZT = cd("axA")) : localObject1 != null ? localObject1.getClass() : bZT;
            localbJW.gLP = ((aEQ)localObject2);
            localbJW.gLO = ((bYH)localObject3);
            localbJW.gLQ = new HE(this, localField);
          }
          else if ((localObject2 != null) || (localObject3 != null)) {
            String str2 = "Structures require bidirectional type conversion for " + localClass1;
            throw new IllegalArgumentException(str2);
          }
        }

        if (localObject1 == null) {
          localObject1 = a(localbJW.field, localClass1);
        }
        try
        {
          localbJW.size = a(localClass2, localObject1);
          m = a(localClass2, localObject1, bool);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          if ((!paramBoolean1) && (this.fyy == null)) {
            return null;
          }
          localObject3 = "Invalid Structure field in " + getClass() + ", field name '" + localbJW.name + "' (" + localbJW.type + "): " + localIllegalArgumentException.getMessage();
          throw new IllegalArgumentException((String)localObject3);
        }

        blk.b(localblk, Math.max(blk.e(localblk), m));
        if (i % m != 0) {
          i += m - i % m;
        }
        localbJW.offset = i;
        i += localbJW.size;

        blk.f(localblk).put(localbJW.name, localbJW);
      }
    }
    if (i > 0) {
      int j = co(i, blk.e(localblk));

      if (((this instanceof qR)) && (!paramBoolean2)) {
        RT();
      }
      blk.c(localblk, j);
      return localblk;
    }

    throw new IllegalArgumentException("Structure " + getClass() + " has unknown or zero size (ensure " + "all fields are public)");
  }

  private void bun()
  {
    List localList = buk();
    for (Iterator localIterator = localList.iterator(); localIterator.hasNext(); ) {
      Field localField = (Field)localIterator.next();
      try {
        Object localObject = localField.get(this);
        if (localObject == null)
          a(localField, localField.getType());
      }
      catch (Exception localException)
      {
        throw new Error("Exception reading field '" + localField.getName() + "' in " + getClass() + ": " + localException);
      }
    }
  }

  private Object a(Field paramField, Class paramClass)
  {
    Object localObject = null;
    if ((bRq == null ? (bik.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) if (!(cvF == null ? (bik.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
        try
        {
          localObject = a(paramClass, fyG);
          a(paramField, localObject);
        }
        catch (IllegalArgumentException localIllegalArgumentException) {
          String str = "Can't determine size of nested structure: " + localIllegalArgumentException.getMessage();

          throw new IllegalArgumentException(str);
        }
      }
    if ((bZS == null ? (bik.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      MK localMK = MK.k(paramClass);
      localObject = localMK.WI();
      a(paramField, localObject);
    }
    return localObject;
  }

  int pR(int paramInt) {
    return co(paramInt, this.fyv);
  }

  private int co(int paramInt1, int paramInt2)
  {
    if ((this.fyu != 1) && 
      (paramInt1 % paramInt2 != 0)) {
      paramInt1 += paramInt2 - paramInt1 % paramInt2;
    }

    return paramInt1;
  }

  protected int buo() {
    if (this.size == -1)
    {
      eM(true);
    }
    return this.fyv;
  }

  protected int a(Class paramClass, Object paramObject, boolean paramBoolean)
  {
    int i = 1;
    if ((bZS == null ? (bik.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      MK localMK = MK.k(paramClass);
      paramClass = localMK.WJ();
      paramObject = localMK.a(paramObject, new qd());
    }
    int j = Native.a(paramClass, paramObject);
    if (!paramClass.isPrimitive()) if ((cvL == null ? (bik.cvL = cd("java.lang.Long")) : cvL) != paramClass) if ((cvK == null ? (bik.cvK = cd("java.lang.Integer")) : cvK) != paramClass) if ((cvI == null ? (bik.cvI = cd("java.lang.Short")) : cvI) != paramClass) if ((cvJ == null ? (bik.cvJ = cd("java.lang.Character")) : cvJ) != paramClass) if ((cvH == null ? (bik.cvH = cd("java.lang.Byte")) : cvH) != paramClass) if ((cvG == null ? (bik.cvG = cd("java.lang.Boolean")) : cvG) != paramClass) if ((cvM == null ? (bik.cvM = cd("java.lang.Float")) : cvM) != paramClass) if ((cvN == null ? (bik.cvN = cd("java.lang.Double")) : cvN) != paramClass)
                    {
                      break label278;
                    }
    i = j; break label601;

    label278: if ((bZT == null ? (bik.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) { if (!(fyH == null ? (bik.fyH = cd("cvp")) : fyH).isAssignableFrom(paramClass)); } else if (bIG.gIh) { if ((cvT == null ? (bik.cvT = cd("java.nio.Buffer")) : cvT).isAssignableFrom(paramClass)); } else if (!(cvB == null ? (bik.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) if ((bRs == null ? (bik.bRs = cd("cFg")) : bRs) != paramClass) if ((bRr == null ? (bik.bRr = cd("java.lang.String")) : bRr) != paramClass)
        {
          break label454;
        }

    i = axA.SIZE; break label601;

    label454: if ((bRq == null ? (bik.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
      if ((cvF == null ? (bik.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass)) {
        i = axA.SIZE;
      }
      else {
        if (paramObject == null)
          paramObject = a(paramClass, fyG);
        i = ((bik)paramObject).buo();
      }
    }
    else if (paramClass.isArray()) {
      i = a(paramClass.getComponentType(), null, paramBoolean);
    }
    else {
      throw new IllegalArgumentException("Type " + paramClass + " has unknown " + "native alignment");
    }

    label601: if (this.fyu == 1) {
      i = 1;
    }
    else if (this.fyu == 3) {
      i = Math.min(8, i);
    }
    else if (this.fyu == 2)
    {
      if ((!paramBoolean) || (!bIG.bPT()) || (!fyh)) {
        i = Math.min(fyo, i);
      }
      if ((!paramBoolean) && (bIG.bPW()) && (paramClass.getName().equals("double"))) {
        i = 4;
      }
    }
    return i;
  }

  public String toString() {
    return toString(Boolean.getBoolean("jna.dump_memory"));
  }

  public String toString(boolean paramBoolean) {
    return b(0, true, true);
  }

  private String O(Class paramClass) {
    String str = paramClass.getName();
    int i = str.lastIndexOf(".");
    return str.substring(i + 1);
  }

  private String b(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    buf();
    String str1 = System.getProperty("line.separator");
    String str2 = O(getClass()) + "(" + sF() + ")";
    if (!(sF() instanceof dcj)) {
      str2 = str2 + " (" + size() + " bytes)";
    }
    String str3 = "";
    for (int i = 0; i < paramInt; i++) {
      str3 = str3 + "  ";
    }
    String str4 = str1;
    Iterator localIterator;
    if (!paramBoolean1)
      str4 = "...}";
    else
      for (localIterator = buc().values().iterator(); localIterator.hasNext(); ) {
        localObject1 = (bJW)localIterator.next();
        Object localObject2 = a(((bJW)localObject1).field);
        String str5 = O(((bJW)localObject1).type);
        String str6 = "";
        str4 = str4 + str3;
        if ((((bJW)localObject1).type.isArray()) && (localObject2 != null)) {
          str5 = O(((bJW)localObject1).type.getComponentType());
          str6 = "[" + Array.getLength(localObject2) + "]";
        }
        str4 = str4 + "  " + str5 + " " + ((bJW)localObject1).name + str6 + "@" + Integer.toHexString(((bJW)localObject1).offset);

        if ((localObject2 instanceof bik)) {
          localObject2 = ((bik)localObject2).b(paramInt + 1, !(localObject2 instanceof ckM), paramBoolean2);
        }
        str4 = str4 + "=";
        if ((localObject2 instanceof Long)) {
          str4 = str4 + Long.toHexString(((Long)localObject2).longValue());
        }
        else if ((localObject2 instanceof Integer)) {
          str4 = str4 + Integer.toHexString(((Integer)localObject2).intValue());
        }
        else if ((localObject2 instanceof Short)) {
          str4 = str4 + Integer.toHexString(((Short)localObject2).shortValue());
        }
        else if ((localObject2 instanceof Byte)) {
          str4 = str4 + Integer.toHexString(((Byte)localObject2).byteValue());
        }
        else {
          str4 = str4 + String.valueOf(localObject2).trim();
        }
        str4 = str4 + str1;
        if (!localIterator.hasNext())
          str4 = str4 + str3 + "}";
      }
    Object localObject1;
    if ((paramInt == 0) && (paramBoolean2)) {
      int j = 4;
      str4 = str4 + str1 + "memory dump" + str1;
      localObject1 = sF().i(0L, size());
      for (int k = 0; k < localObject1.length; k++) {
        if (k % 4 == 0) str4 = str4 + "[";
        if ((localObject1[k] >= 0) && (localObject1[k] < 16))
          str4 = str4 + "0";
        str4 = str4 + Integer.toHexString(localObject1[k] & 0xFF);
        if ((k % 4 == 3) && (k < localObject1.length - 1))
          str4 = str4 + "]" + str1;
      }
      str4 = str4 + "]";
    }
    return str2 + " {" + str4;
  }

  public bik[] a(bik[] paramArrayOfbik)
  {
    buf();
    if ((this.fys instanceof fD))
    {
      dcj localdcj = (dcj)this.fys;
      j = paramArrayOfbik.length * size();
      if (localdcj.size() < j) {
        c(pP(j));
      }
    }

    paramArrayOfbik[0] = this;
    int i = size();
    for (int j = 1; j < paramArrayOfbik.length; j++) {
      paramArrayOfbik[j] = a(getClass(), this.fys.p(j * i, i));
      paramArrayOfbik[j].buj();
    }

    if (!(this instanceof qR))
    {
      this.fyC = paramArrayOfbik;
    }

    return paramArrayOfbik;
  }

  public bik[] pS(int paramInt)
  {
    return a((bik[])Array.newInstance(getClass(), paramInt));
  }

  private Class bup() {
    if (((this instanceof ckM)) || ((this instanceof qR))) if ((bRq == null ? (bik.bRq = cd("bik")) : bRq).isAssignableFrom(getClass().getSuperclass()))
      {
        return getClass().getSuperclass();
      }
    return getClass();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof bik)) {
      return false;
    }
    if ((paramObject.getClass() != getClass()) && (((bik)paramObject).bup() != bup()))
    {
      return false;
    }
    bik localbik = (bik)paramObject;
    if (localbik.sF().equals(sF())) {
      return true;
    }
    if (localbik.size() == size()) {
      clear(); write();
      byte[] arrayOfByte1 = sF().i(0L, size());
      localbik.clear(); localbik.write();
      byte[] arrayOfByte2 = localbik.sF().i(0L, localbik.size());
      return Arrays.equals(arrayOfByte1, arrayOfByte2);
    }
    return false;
  }

  public int hashCode()
  {
    clear(); write();
    Adler32 localAdler32 = new Adler32();
    localAdler32.update(sF().i(0L, size()));
    return (int)localAdler32.getValue();
  }

  protected void d(axA paramaxA)
  {
    this.fyz = paramaxA.dMH;
  }

  axA c(bJW parambJW)
  {
    Class localClass = parambJW.type;
    Object localObject = a(parambJW.field);
    if (this.fyy != null) {
      aEQ localaEQ = this.fyy.X(localClass);
      if (localaEQ != null) {
        localClass = localaEQ.WJ();
        localObject = localaEQ.a(localObject, new qd());
      }
    }
    return deP.d(localObject, localClass);
  }

  public axA RT()
  {
    axA localaxA = aE(this);
    d(localaxA);
    return localaxA;
  }

  public void eN(boolean paramBoolean)
  {
    eO(paramBoolean);
    eP(paramBoolean);
  }

  public void eO(boolean paramBoolean)
  {
    this.fyA = paramBoolean;
  }

  public boolean buq()
  {
    return this.fyA;
  }

  public void eP(boolean paramBoolean)
  {
    this.fyB = paramBoolean;
  }

  public boolean bur()
  {
    return this.fyB;
  }

  static axA aE(Object paramObject)
  {
    return deP.bi(paramObject);
  }

  public static bik a(Class paramClass, axA paramaxA)
  {
    try
    {
      Constructor localConstructor = paramClass.getConstructor(new Class[] { bZT == null ? (bik.bZT = cd("axA")) : bZT });
      return (bik)localConstructor.newInstance(new Object[] { paramaxA });
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    catch (SecurityException localSecurityException)
    {
    }
    catch (InstantiationException localInstantiationException) {
      str = "Can't instantiate " + paramClass + " (" + localInstantiationException + ")";
      throw new IllegalArgumentException(str);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      str = "Instantiation of " + paramClass + "(Pointer) not allowed, is it public? (" + localIllegalAccessException + ")";

      throw new IllegalArgumentException(str);
    }
    catch (InvocationTargetException localInvocationTargetException) {
      String str = "Exception thrown while instantiating an instance of " + paramClass + " (" + localInvocationTargetException + ")";
      localInvocationTargetException.printStackTrace();
      throw new IllegalArgumentException(str);
    }
    bik localbik = P(paramClass);
    localbik.c(paramaxA);
    return localbik;
  }

  public static bik P(Class paramClass)
  {
    String str;
    try
    {
      bik localbik = (bik)paramClass.newInstance();
      if ((localbik instanceof qR)) {
        localbik.bug();
      }
      return localbik;
    }
    catch (InstantiationException localInstantiationException) {
      str = "Can't instantiate " + paramClass + " (" + localInstantiationException + ")";
      throw new IllegalArgumentException(str);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      str = "Instantiation of " + paramClass + " not allowed, is it public? (" + localIllegalAccessException + ")";
    }
    throw new IllegalArgumentException(str);
  }

  private static void b(bik[] paramArrayOfbik)
  {
    if ((fyI == null ? (bik.fyI = cd("[LckM;")) : fyI).isAssignableFrom(paramArrayOfbik.getClass())) {
      return;
    }
    axA localaxA = paramArrayOfbik[0].sF();
    int i = paramArrayOfbik[0].size();
    for (int j = 1; j < paramArrayOfbik.length; j++)
      if (paramArrayOfbik[j].sF().dMH != localaxA.dMH + i * j) {
        String str = "Structure array elements must use contiguous memory (bad backing address at Structure array index " + j + ")";

        throw new IllegalArgumentException(str);
      }
  }

  public static void c(bik[] paramArrayOfbik)
  {
    b(paramArrayOfbik);
    if (paramArrayOfbik[0].fyC == paramArrayOfbik) {
      paramArrayOfbik[0].bus();
    }
    else
      for (int i = 0; i < paramArrayOfbik.length; i++)
        if (paramArrayOfbik[i] != null)
          paramArrayOfbik[i].bus();
  }

  public void bus()
  {
    if (buq()) {
      hb();
      if (this.fyC != null)
        for (int i = 1; i < this.fyC.length; i++)
          this.fyC[i].bus();
    }
  }

  public static void d(bik[] paramArrayOfbik)
  {
    b(paramArrayOfbik);
    if (paramArrayOfbik[0].fyC == paramArrayOfbik) {
      paramArrayOfbik[0].but();
    }
    else
      for (int i = 0; i < paramArrayOfbik.length; i++)
        if (paramArrayOfbik[i] != null)
          paramArrayOfbik[i].but();
  }

  public void but()
  {
    if (bur()) {
      write();
      if (this.fyC != null)
        for (int i = 1; i < this.fyC.length; i++)
          this.fyC[i].but();
    }
  }

  protected int s(Class paramClass)
  {
    return a(paramClass, null);
  }

  protected int a(Class paramClass, Object paramObject)
  {
    return Native.a(paramClass, paramObject);
  }

  static void Q(Class paramClass)
  {
    a(paramClass, fyG);
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }

  static void a(bik parambik, boolean paramBoolean)
  {
    parambik.eJ(paramBoolean); } 
  static axA buu() { return fyG; }


  static
  {
    String str = System.getProperty("os.arch").toLowerCase();
  }
}