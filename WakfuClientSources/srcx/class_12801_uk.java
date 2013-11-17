import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

public class uk
{
  private static Logger K = Logger.getLogger(uk.class);
  private static final boolean DEBUG = false;
  private boolean bgH = false;
  private HashMap bgI = null;
  public static final String bgJ = "id";
  public static final String bgK = "includeId";
  public static final String bgL = "path";
  public static final String bgM = "size";
  public static final String bgN = "form";
  public static final String bgO = "include";
  public static final String bgP = "templateId";
  public static final String bgQ = "templateRef";
  public static final String bgR = "template";
  public static final String bgS = "templateElement";
  public static final String bgT = "templateElementIgnore";
  public static final String bgU = "atlas";
  public static final String bgV = "ref";
  public static final String bgW = "init";
  public static final String bgX = "themeElement";
  public static final String bgY = "texture";
  public static final String bgZ = "pixmap";
  public static final String bha = "initAtOnce";
  public static final String bhb = "texture";
  public static final String bhc = "color";
  public static final String bhd = "color";
  public static final String bhe = "cursor";
  public static final String bhf = "animatedCursor";
  public static final String bhg = "cursorFrame";
  public static final String bhh = "tooltip";
  public static final String bhi = "textColor";
  public static final String bhj = "borderColor";
  public static final String bhk = "borderWidth";
  public static final String bhl = "backgroundColor";
  public static final String bhm = "x";
  public static final String bhn = "y";
  public static final String bho = "width";
  public static final String bhp = "height";
  public static final String bhq = "type";
  public static final String bhr = "delay";
  public static final String bhs = "font";
  public static final String ATTR_NAME = "name";
  public static final String bht = "font";
  public static final String bhu = "bordered";
  public static final String bhv = "permanent";
  public static final String bhw = "fontDefinition";
  public static final String Vu = "desc";
  public static final String aEv = "lang";
  public static final String bhx = "definition";
  private cpa bhy = null;
  private PrintWriter bhz;
  private ceK bhA = null;

  private yo bhB = null;
  private cDt bhC = null;

  private boolean bhD = false;
  private HashMap bhE;
  private HashMap bhF = new HashMap();

  private cTp bhG = null;
  private static final boolean bhH = false;
  private URL bhI = null;
  private URL bhJ;
  private String bhK;
  private final ArrayList bhL = new ArrayList();
  private final HashMap bhM = new HashMap();
  private final HashMap bhN = new HashMap();
  private final HashMap bhO = new HashMap();
  private final HashMap bhP = new HashMap();
  private final HashMap bhQ = new HashMap();
  private boolean bhR = false;

  private dOc bhS = null;

  public cTp CM()
  {
    return this.bhG;
  }

  public void a(cTp paramcTp) {
    this.bhG = paramcTp;
  }

  public cDt CN() {
    return this.bhC;
  }

  public void a(cDt paramcDt) {
    this.bhC = paramcDt;
  }

  public void aa(boolean paramBoolean) {
    this.bgH = paramBoolean;
    if (this.bgH)
      this.bgI = new HashMap();
    else
      this.bgI = null;
  }

  public aNL a(bwZ parambwZ, URL paramURL1, cDA paramcDA, cpa paramcpa, boolean paramBoolean, URL paramURL2, String paramString1, String paramString2)
  {
    a(parambwZ, paramURL1);
    Object localObject;
    if (paramBoolean) {
      this.bhy = null;
      localObject = null;
      try
      {
        localObject = bAy.c(paramURL2, paramString1 + ".java");
      } catch (MalformedURLException localMalformedURLException) {
        K.error("Exception", localMalformedURLException);
      }
      if (localObject != null) {
        try {
          this.bhz = new PrintWriter(new FileOutputStream(new File(((URL)localObject).getFile())));
        } catch (FileNotFoundException localFileNotFoundException) {
          K.error("Exception", localFileNotFoundException);
        }

        this.bhA = new ceK(this.bhz, paramString1, paramString2, parambwZ.bEx());
      }

    }

    Stack localStack = new Stack();
    localStack.push(paramcpa);

    if (paramBoolean) {
      localObject = (aNL)a(this.bhA.chJ(), this.bhA.chI(), paramcDA, localStack);
      this.bhA.Hh();

      this.bhA = null;
    }
    else
    {
      localObject = (aNL)a(parambwZ.bEx(), null, paramcDA, localStack);
    }

    return localObject;
  }

  private static bdj a(K paramK, aNL paramaNL, cDA paramcDA, Stack paramStack) {
    dUo localdUo = IZ.Sq().dc(paramK.getName());
    if (localdUo == null) {
      K.error("Tag Inconnu : " + paramK.getName());
      return null;
    }

    aNL localaNL;
    try
    {
      localaNL = (aNL)localdUo.newInstance();
    } catch (Exception localException) {
      K.error("Erreur lors de l'instanciation du tag " + paramK.getName() + ".");
      return null;
    }

    localaNL.a(paramK, paramaNL, paramStack, paramcDA);
    localaNL.w(paramK);
    localaNL.b(paramK, paramaNL, paramStack, paramcDA);
    localaNL.e(paramK, paramaNL, paramStack, paramcDA);

    return localaNL;
  }

  private aNL b(K paramK, aNL paramaNL, cDA paramcDA, Stack paramStack)
  {
    int i = 0;

    K localK1 = paramK;

    paramK = f(paramK);

    if (paramK == localK1) {
      localK1 = null;
    }

    String str1 = null;
    if (paramK.getName().equalsIgnoreCase("themeElement")) {
      localObject1 = paramK.e("name");
      if (localObject1 != null) {
        str1 = ((K)localObject1).getStringValue();
      }
      i = 1;
    }

    if ((str1 != null) && (paramaNL != null))
    {
      if ((paramaNL instanceof dOc))
        localObject1 = (dOc)paramaNL;
      else {
        localObject1 = (dOc)paramaNL.getParentOfType(dOc.class);
      }
      if (localObject1 != null) {
        localObject1 = ((dOc)localObject1).getWidgetByThemeElementName(str1, false);
        if (localObject1 != null)
          paramaNL = (aNL)localObject1;
        else if (!(paramaNL instanceof dOc)) {
          return null;
        }
      }
    }

    Object localObject1 = paramK.getChildren();
    if (i != 0) {
      localObject2 = localObject1;
      for (int j = 0; j < localObject2.size(); j++) {
        K localK2 = (K)localObject2.get(j);
        if ((!localK2.getName().equals("#text")) && (!localK2.getName().equals("#comment"))) {
          b(localK2, paramaNL, paramcDA, paramStack);
        }
      }
      if (localK1 != null) {
        localObject3 = localK1.getChildren();
        for (int k = 0; k < ((ArrayList)localObject3).size(); k++) {
          localObject4 = (K)((ArrayList)localObject3).get(k);
          if ((!((K)localObject4).getName().equals("#text")) && (!((K)localObject4).getName().equals("#comment"))) {
            b((K)localObject4, paramaNL, paramcDA, paramStack);
          }
        }
      }
      return null;
    }

    Object localObject2 = (paramK.e("id") != null) && (!this.bhD) ? paramK.e("id").getStringValue().trim() : null;

    Object localObject3 = paramStack != null ? (cpa)paramStack.peek() : null;

    if ((localObject3 == null) && (paramaNL != null))
      localObject3 = paramaNL.getElementMap();
    String str2;
    if (localObject3 == null)
      str2 = "";
    else {
      str2 = ((cpa)localObject3).getId();
    }

    Object localObject4 = IZ.Sq().dc(paramK.getName());
    if (localObject4 == null) {
      K.error("Tag Inconnu : " + paramK.getName());
      return null;
    }

    Object localObject5;
    try
    {
      localObject5 = (aNL)((dUo)localObject4).newInstance();
    } catch (Exception localException) {
      K.error("Erreur lors de l'instanciation du tag " + paramK.getName() + ".");
      return null;
    }

    if ((localObject5 instanceof bJA)) {
      localObject6 = paramK.e("ref");
      if (localObject6 != null) {
        ((bJA)localObject5).setRenderer((P)this.bhO.get(((K)localObject6).getStringValue()));
      }
    }

    if (((localObject5 instanceof Jg)) && (paramaNL != null))
    {
      if ((paramaNL instanceof dOc))
        localObject6 = (dOc)paramaNL;
      else {
        localObject6 = (dOc)paramaNL.getParentOfType(dOc.class);
      }

      if ((localObject6 != null) && (((dOc)localObject6).getAppearance() != null)) {
        ((aNL)localObject5).beH();
        localObject5 = ((dOc)localObject6).getAppearance();
      }
    }

    ((aNL)localObject5).setElementMap((cpa)localObject3);

    if ((localObject3 != null) && (localObject2 != null)) {
      ((cpa)localObject3).a(localObject2, (aNL)localObject5);
    }

    if (paramK.getName().equalsIgnoreCase("form")) {
      localObject6 = null;
      K localK3 = paramK.e("id");
      if (localK3 != null)
        localObject6 = localK3.getStringValue();
      else {
        K.warn("Attention : l'id du formulaire est nulle.");
      }
      paramcDA.a(str2 + '.' + (String)localObject6, (dso)localObject5);
    }

    Object localObject6 = null;

    a((bdj)localObject5, null, null, (dUo)localObject4, paramK.aj(), false, paramcDA);

    if (paramaNL != null) {
      if (paramaNL.isValidAdd((bdj)localObject5)) {
        paramaNL.b((aNL)localObject5);
      } else if (((aNL)localObject5).getParent() == null)
      {
        ((aNL)localObject5).beH();
        return null;
      }

    }

    ((aNL)localObject5).brn();

    int m = 0; for (int n = ((ArrayList)localObject1).size(); m < n; m++) {
      K localK4 = (K)((ArrayList)localObject1).get(m);
      if ((!localK4.getName().equals("#text")) && (!localK4.getName().equals("#comment"))) {
        if (localK4.e("include") != null)
        {
          String str3 = localK4.e("includeId").getStringValue();
          if (str3 == null) {
            K.error("Pas d'id pour le tag Include, impossible de l'ajouter");
          }
          else {
            cpa localcpa = paramcDA.nd(str2 + '.' + str3);
            localcpa.d((cpa)localObject3);
            paramStack.push(localcpa);

            b(localK4, (aNL)localObject5, paramcDA, paramStack);
            paramStack.pop();
          }
        }
        else
        {
          b(localK4, (aNL)localObject5, paramcDA, paramStack);
        }
      }
    }

    ((aNL)localObject5).rV();

    if (paramK.getName().equals("form")) {
      paramcDA.nh(str2 + '.' + paramK.e("id").getStringValue());
    }

    return localObject5;
  }

  private bdj a(String paramString1, String paramString2, cDA paramcDA, Stack paramStack)
  {
    K localK1 = (K)this.bhA.oW(paramString1);
    Object localObject1 = (bdj)this.bhA.oW(paramString2);
    String str1 = paramString2;

    boolean bool = this.bhA.cOW();
    if (bool) {
      this.bhA.a(localK1, (bdj)localObject1, paramString2);
    }

    this.bhA.al(String.class);
    this.bhA.al(cDA.class);
    this.bhA.al(cpa.class);
    this.bhA.al(IZ.class);
    this.bhA.al(dOc.class);
    this.bhA.al(dUo.class);
    this.bhA.al(cBQ.class);
    this.bhA.al(bJA.class);

    int i = 0;

    K localK2 = localK1;

    localK1 = f(localK1);

    if (localK1 == localK2) {
      localK2 = null;
    }

    String str2 = null;
    if (localK1.getName().equalsIgnoreCase("themeElement")) {
      K localK3 = localK1.e("name");
      if (localK3 != null) {
        str2 = localK3.getStringValue();
      }
      i = 1;
    }

    int j = 0;

    if ((str2 != null) && (localObject1 != null))
    {
      this.bhA.mark();
      localObject3 = this.bhA.can();
      if ((localObject1 instanceof dOc)) {
        localObject2 = (dOc)localObject1;
        this.bhA.a(new cHH(dOc.class, (String)localObject3, paramString2));
      } else {
        localObject2 = (dOc)((bdj)localObject1).getParentOfType(dOc.class);
        this.bhA.a(new cHH(dOc.class, (String)localObject3, paramString2 + ".getParentOfType(Widget.class)"));
      }
      if (localObject2 != null) {
        localObject2 = ((dOc)localObject2).getWidgetByThemeElementName(str2, true);
        if (localObject2 != null) {
          j = 1;
          localObject1 = localObject2;
          paramString2 = this.bhA.can();
          this.bhA.u(paramString2, localObject2);
          this.bhA.a(new cHH(aNL.class, paramString2, (String)localObject3 + ".getWidgetByThemeElementName(\"" + str2 + "\", false)"));

          this.bhA.a(new dLF("if (" + paramString2 + " != null) {"));
        } else if (!(localObject1 instanceof dOc)) {
          this.bhA.cOX();
          this.bhA.resetMark();
          if (bool) {
            this.bhA.Hg();
          }
          return null;
        }
      }

      this.bhA.resetMark();
    }

    if (i != 0) {
      for (localObject2 = localK1.getChildren().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (K)((Iterator)localObject2).next();
        if ((!((K)localObject3).getName().equals("#text")) && (!((K)localObject3).getName().equals("#comment"))) {
          localObject4 = this.bhA.can();
          this.bhA.u((String)localObject4, localObject3);
          a((String)localObject4, paramString2, paramcDA, paramStack);
        }
      }
      if (localK2 != null) {
        for (localObject2 = localK2.getChildren().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (K)((Iterator)localObject2).next();
          if ((!((K)localObject3).getName().equals("#text")) && (!((K)localObject3).getName().equals("#comment"))) {
            localObject4 = this.bhA.can();
            this.bhA.u((String)localObject4, localObject3);
            a((String)localObject4, paramString2, paramcDA, paramStack);
          }
        }
      }
      if (j != 0) {
        this.bhA.a(new dLF("}"));
      }

      if (bool) {
        this.bhA.Hg();
      }
      return null;
    }

    Object localObject2 = localK1.e("id") != null ? localK1.e("id").getStringValue().trim() : null;
    Object localObject3 = null;

    Object localObject4 = paramStack != null ? (cpa)paramStack.peek() : null;

    if ((localObject4 == null) && (localObject1 != null))
      localObject4 = ((aNL)((bdj)localObject1).getParentOfType(aNL.class)).getElementMap();
    String str3;
    if (localObject4 == null)
      str3 = "";
    else {
      str3 = ((cpa)localObject4).getId();
    }

    if (localObject2 != null) {
      localObject3 = this.bhA.can();
      this.bhA.a(new cHH(String.class, (String)localObject3, "\"" + (String)localObject2 + "\""));
    }

    dUo localdUo = IZ.Sq().dc(localK1.getName());
    if (localdUo == null) {
      K.error("Tag Inconnu : " + localK1.getName());
      if (bool) {
        this.bhA.Hg();
      }
      return null;
    }

    String str4 = this.bhA.can();
    Object localObject5;
    try
    {
      this.bhA.mark();
      localObject5 = (bdj)localdUo.b(this.bhA, str4);
    } catch (Exception localException) {
      K.error("Erreur lors de l'instanciation du tag " + localK1.getName() + ".", localException);
      this.bhA.resetMark();
      if (bool) {
        this.bhA.Hg();
      }
      return null;
    }
    String str5;
    Object localObject8;
    Object localObject7;
    if (((localObject5 instanceof Jg)) && (localObject1 != null)) {
      localObject6 = (Jg)localObject5;

      str5 = this.bhA.can();
      localObject8 = null;
      if ((localObject1 instanceof dOc)) {
        localObject7 = (dOc)localObject1;
        localObject8 = new cHH(dOc.class, str5, paramString2);
      } else {
        localObject7 = (dOc)((bdj)localObject1).getParentOfType(dOc.class);
        localObject8 = new cHH(dOc.class, str5, paramString2 + ".getParentOfType(Widget.class)");
      }

      if ((localObject7 != null) && (((dOc)localObject7).getAppearance() != null)) {
        ((Jg)localObject6).beH();
        localObject5 = ((dOc)localObject7).getAppearance();
        this.bhA.cOX();
        this.bhA.resetMark();

        if (localObject8 != null) {
          this.bhA.a((dpf)localObject8);
          this.bhA.a(new cHH(Jg.class, str4, str5 + ".getAppearance()"));
        }
      }
    }

    this.bhA.resetMark();

    if ((localObject5 instanceof bJA)) {
      localObject6 = localK1.e("ref");
      if (localObject6 != null) {
        this.bhA.a(new dLF("((FontElement)" + str4 + ").setRenderer(Xulor.getInstance().getDocumentParser().getFont(\"" + ((K)localObject6).getStringValue() + "\"));"));

        ((bJA)localObject5).setRenderer(cBQ.cxL().bSM().aI(((K)localObject6).getStringValue()));
      }
    }

    if (((bdj)localObject5).getElementType() == bTe.heE) {
      localObject6 = (aNL)localObject5;
      this.bhA.a(new bol(null, "setElementMap", str4, new String[] { "elementMap" }));
      ((aNL)localObject6).setElementMap((cpa)localObject4);

      if ((localObject4 != null) && (localObject2 != null)) {
        ((cpa)localObject4).a((String)localObject2, (aNL)localObject6);
      }
      if (localObject2 != null) {
        this.bhA.a(new dLF("if (elementMap != null && " + (String)localObject3 + " != null)"));
        this.bhA.a(new bol(null, "add", "elementMap", new String[] { localObject3, str4 }));
      }
    }

    if (localK1.getName().equalsIgnoreCase("form")) {
      localObject6 = null;
      localObject7 = localK1.e("id");
      if (localObject7 != null)
        localObject6 = ((K)localObject7).getStringValue();
      else {
        K.warn("Attention : l'id du formulaire est nulle.");
      }
      str5 = str3 + '.' + (String)localObject6;
      this.bhA.a(new dLF("env.openForm((elementMap != null ? elementMap.getId() : \"\") + \"." + (String)localObject6 + "\", (Form) " + str4 + ");"));

      paramcDA.a(str5, (dso)localObject5);
    }

    a((bdj)localObject5, str4, localK1.getName(), localdUo, localK1.aj(), true, paramcDA);

    if (localObject1 != null) {
      if ((!(localObject1 instanceof aNL)) || (((aNL)localObject1).isValidAdd((bdj)localObject5))) {
        this.bhA.a(new bol(null, "addBasicElement", paramString2, new String[] { str4 }));
        ((bdj)localObject1).bb((bdj)localObject5);
      } else if (((bdj)localObject5).getBasicParent() == null)
      {
        this.bhA.a(new bol(null, "release", str4));
        ((bdj)localObject5).release();
        if (bool) {
          this.bhA.Hg();
        }
        return null;
      }

    }

    ((bdj)localObject5).brn();
    this.bhA.a(new bol(null, "onAttributesInitialized", str4));

    this.bhA.u(str4, localObject5);

    for (Object localObject6 = localK1.getChildren().iterator(); ((Iterator)localObject6).hasNext(); ) { localObject7 = (K)((Iterator)localObject6).next();
      if ((!((K)localObject7).getName().equals("#text")) && (!((K)localObject7).getName().equals("#comment"))) {
        str5 = this.bhA.bc(localObject7);

        if (((K)localObject7).e("include") != null)
        {
          localObject8 = ((K)localObject7).e("includeId").getStringValue();
          if (localObject8 == null) {
            K.error("Pas d'id pour le tag Include, impossible de l'ajouter");
          }
          else {
            String str6 = this.bhA.can();
            this.bhA.a(new cHH(cpa.class, str6, "elementMap"));

            cpa localcpa = paramcDA.nd(str3 + '.' + (String)localObject8);

            this.bhA.a(new cHH(cpa.class, "elementMap", "env.createElementMap((elementMap != null ? elementMap.getId() : \"\") + \"." + (String)localObject8 + "\")"));

            localcpa.d((cpa)localObject4);
            this.bhA.a(new bol(null, "setParentElementMap", "elementMap", new String[] { str6 }));

            paramStack.push(localcpa);
            this.bhA.a(new bol(null, "push", "elementMaps", new String[] { "elementMap" }));

            a(str5, str4, paramcDA, paramStack);

            paramStack.pop();
            this.bhA.a(new bol(null, "pop", "elementMaps"));
            this.bhA.a(new cHH(cpa.class, "elementMap", "elementMaps.peek()"));
          }
        }
        else {
          a(str5, str4, paramcDA, paramStack);
        }
      }
    }

    ((bdj)localObject5).rV();
    this.bhA.a(new bol(null, "onChildrenAdded", str4));

    if (localK1.getName().equals("form")) {
      localObject6 = str3 + '.' + localK1.e("id").getStringValue();
      this.bhA.a(new dLF("env.closeForm((elementMap != null ? elementMap.getId() : \"\") + \"." + localK1.e("id").getStringValue() + "\");"));

      paramcDA.nh((String)localObject6);
    }

    if (bool) {
      this.bhA.Hg();
    }

    return localObject5;
  }

  public static void a(bdj parambdj, dUo paramdUo, String paramString1, String paramString2) {
    Method localMethod = paramdUo.rc(paramString1);
    if (localMethod != null)
    {
      Class localClass = localMethod.getParameterTypes()[0];
      Object localObject = null;
      try {
        localObject = aKN.bcs().b(localClass, paramString2);
        localMethod.invoke(parambdj, new Object[] { localObject });
      } catch (Exception localException) {
        K.error("Problème à l'invoke :" + localMethod.getName() + ":" + localObject, localException);
      }
    }
  }

  private void a(bdj parambdj, String paramString1, String paramString2, dUo paramdUo, List paramList, boolean paramBoolean, cDA paramcDA)
  {
    if (paramBoolean) {
      this.bhA.al(Class.class);
      this.bhA.al(Method.class);
      this.bhA.al(Vj.class);
      this.bhA.al(aKN.class);
    }

    boolean bool1 = parambdj instanceof aAR;
    String str1 = null;

    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      K localK = (K)paramList.get(j);

      String str2 = localK.getName();
      if ((!"id".equals(str2)) && (!"ref".equals(str2)) && (!"templateId".equals(str2)) && (!"templateRef".equals(str2)))
      {
        if ((bool1) && ("texture".equalsIgnoreCase(str2))) {
          str1 = localK.getStringValue();
        }

        boolean bool2 = parambdj.setXMLAttribute(str2, localK.getStringValue());
        if ((!bool2) || (paramBoolean))
        {
          Method localMethod = paramdUo.rc(str2);
          String str3 = null;

          if (localMethod != null)
          {
            Class localClass = localMethod.getParameterTypes()[0];
            String str4 = null;
            Vj localVj = aKN.bcs().I(localClass);
            String str5 = null;

            if (localVj != null)
            {
              if ((paramBoolean) && (!localVj.WZ())) {
                String str6 = this.bhA.can();
                this.bhA.a(new cHH(dUo.class, str6, "XulorTagLibrary.getInstance().getFactory(\"" + paramString2 + "\")"));

                str3 = this.bhA.can();
                this.bhA.a(new cHH(Method.class, str3, str6 + ".guessSetter(\"" + str2 + "\")"));
                str5 = this.bhA.can();
                str4 = this.bhA.can();
                this.bhA.a(new cHH(Class.class, str4, str3 + ".getParameterTypes()[0]"));
                this.bhA.a(new cHH(Vj.class, str5, "ConverterLibrary.getInstance().getConverter(" + str4 + ")"));
              }

              Object localObject = null;
              try {
                if (paramBoolean) {
                  String str7 = null;
                  if (localVj.WZ()) {
                    str7 = localVj.a(this.bhA, this, localClass, localK.getStringValue(), paramcDA);
                  } else {
                    localObject = localVj.b(localClass, localK.getStringValue());
                    str7 = this.bhA.can();
                    this.bhA.a(new cHH(localClass, str7, str5 + ".convert(" + str4 + ", \"" + localK.getStringValue() + "\")"));
                  }

                  this.bhA.a(new bol(localMethod.getDeclaringClass(), localMethod.getName(), paramString1, new String[] { str7 }));
                }
                localObject = localVj.b(localClass, localK.getStringValue());
                localMethod.invoke(parambdj, new Object[] { localObject });
              } catch (Exception localException) {
                K.error("Problème à l'invoke :" + localMethod.getName() + ":" + localObject, localException);
              }

            }

          }
          else if ((paramBoolean) && (!str2.equals("atlas")) && (!str2.equals("includeId")) && (!str2.equals("include"))) {
            throw new IllegalArgumentException("Impossible de trouver l'attribut " + str2);
          }
        }
      }
    }
  }

  public static void a(bwZ parambwZ, URL paramURL)
  {
    CC localCC = parambwZ.bEx();
    Stack localStack = new Stack();
    localStack.push(paramURL);
    K localK = a(localCC, localStack);
    if (localK != null)
      parambwZ.b((CC)localK);
  }

  public static K a(K paramK, Stack paramStack)
  {
    if (paramK == null) {
      return null;
    }

    Object localObject1 = paramK;

    int i = paramStack.size();
    Object localObject3;
    K localK1;
    if ("template".equalsIgnoreCase(paramK.getName())) {
      localObject2 = paramK.e("path");
      if (localObject2 != null) {
        localObject3 = paramK.c("templateElement");
        localK1 = a(((K)localObject2).getStringValue(), paramStack, false);
        a(localK1, paramK, (ArrayList)localObject3);
        localObject1 = localK1;
      }
    } else if ("include".equalsIgnoreCase(paramK.getName())) {
      localObject2 = paramK.e("path");
      if (localObject2 != null) {
        localObject3 = a(((K)localObject2).getStringValue(), paramStack, true);
        localK1 = paramK.e("id");
        localObject1 = localObject3;
        ((K)localObject1).c(new dvw("include", ""));
        if (localK1 != null) {
          ((K)localObject1).c(new dvw("includeId", localK1.getStringValue()));
        }
      }

    }

    Object localObject2 = new ArrayList();
    for (int j = ((K)localObject1).getChildren().size() - 1; j >= 0; j--) {
      localK1 = (K)((K)localObject1).getChildren().get(j);
      ((ArrayList)localObject2).add(localK1);
    }

    for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--) {
      ((K)localObject1).b((K)((ArrayList)localObject2).get(j));
    }

    for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--) {
      localK1 = (K)((ArrayList)localObject2).get(j);
      if ((!localK1.getName().equals("#text")) && (!localK1.getName().equals("#comment"))) {
        K localK2 = a(localK1, paramStack);
        if (localK2 != null)
          ((K)localObject1).a(localK2);
        else {
          ((K)localObject1).a(localK1);
        }
      }
    }

    while (paramStack.size() > i) {
      paramStack.pop();
    }

    if (localObject1 == paramK) {
      return null;
    }

    return localObject1;
  }

  public static void a(K paramK1, K paramK2, ArrayList paramArrayList)
  {
    if ((paramK1 == null) || (paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }

    K localK1 = paramK1.e("templateId");
    K localK2;
    if (localK1 != null)
    {
      localObject1 = null;
      i = paramArrayList.size();
      Object localObject2;
      for (int j = 0; j < i; j++) {
        localObject1 = (K)paramArrayList.get(j);
        localObject2 = ((K)localObject1).e("templateRef");
        if (localK1.getStringValue().equalsIgnoreCase(((K)localObject2).getStringValue()))
        {
          break;
        }
        localObject1 = null;
      }

      if (localObject1 != null) {
        paramArrayList.remove(localObject1);
        localK2 = ((K)localObject1).e("templateElementIgnore");

        if ((localK2 != null) && (localK2.getBooleanValue())) {
          paramK2.b(paramK1);
          return;
        }

        localObject2 = ((K)localObject1).getChildren();
        int k = ((ArrayList)localObject2).size();
        for (int m = 0; m < k; m++) {
          paramK1.a((K)((ArrayList)localObject2).get(m));
        }

        localObject2 = ((K)localObject1).aj();
        k = ((ArrayList)localObject2).size();
        for (m = 0; m < k; m++) {
          K localK3 = (K)((ArrayList)localObject2).get(m);
          String str = localK3.getName();
          if ((!str.equals("#text")) && (!str.equals("#comment")) && (!"templateRef".equalsIgnoreCase(str))) {
            K localK4 = paramK1.e(str);
            if (localK4 != null) {
              paramK1.d(localK4);
            }
            paramK1.c(localK3);
          }
        }
      }

      paramK1.d(localK1);
    }

    Object localObject1 = paramK1.getChildren();

    for (int i = ((ArrayList)localObject1).size() - 1; i >= 0; i--) {
      localK2 = (K)((ArrayList)localObject1).get(i);
      if ((!localK2.getName().equals("#text")) && (!localK2.getName().equals("#comment")))
        a(localK2, paramK1, paramArrayList);
    }
  }

  public static K a(String paramString, Stack paramStack, boolean paramBoolean)
  {
    URL localURL = null;
    bwZ localbwZ = null;
    try
    {
      localURL = bAy.c((URL)paramStack.peek(), paramString);

      if (paramBoolean) {
        paramStack.push(localURL);
      }

      localbwZ = cBQ.h(localURL);
    } catch (Exception localException) {
      K.error("Impossible de charger le template d'url : " + paramStack.peek() + paramString);
    }

    if (localbwZ != null) {
      return localbwZ.bEx();
    }

    return null;
  }

  public String CO()
  {
    return this.bhK;
  }

  public K f(K paramK)
  {
    if (paramK == null) {
      return null;
    }

    K localK1 = paramK.e("ref");
    K localK2 = null;

    if (localK1 != null) {
      localK2 = (K)this.bhM.get(localK1.getStringValue().toUpperCase());
    }

    if (localK2 == null) {
      return paramK;
    }
    return localK2;
  }

  public K a(K paramK, String paramString)
  {
    if (paramK == null) {
      K.error("Problème lors de la recherche de ThemeElement : entry est null");
      return null;
    }
    if (paramString == null) {
      K.error("Problème lors de la recherche de ThemeElement : name est null");
      return null;
    }

    paramK = f(paramK);

    ArrayList localArrayList = c(paramK, "themeElement");
    if (localArrayList != null) {
      for (K localK1 : localArrayList) {
        localK1 = f(localK1);
        K localK2 = localK1.e("name");
        if ((localK2 != null) && (paramString.equalsIgnoreCase(localK2.getStringValue()))) {
          return localK1;
        }
      }
    }

    return null;
  }

  private ArrayList b(K paramK, String paramString)
  {
    ArrayList localArrayList = new ArrayList();

    a(paramK, localArrayList, paramString);

    return localArrayList;
  }

  private void a(K paramK, ArrayList paramArrayList, String paramString) {
    if (paramK == null) {
      K.error("Problème lors de la recherche de ThemeElement : entry est null");
      return;
    }

    paramK = f(paramK);

    K localK1 = paramK.e("type");
    if (localK1 == null) {
      K.warn("type inconnu pour " + paramString);
      return;
    }

    dUo localdUo = IZ.Sq().dc(localK1.getStringValue());
    bdj localbdj = null;
    try {
      localbdj = (bdj)localdUo.newInstance();
    } catch (Exception localException) {
      K.warn("Problème à la génération de " + localK1.getStringValue());
      return;
    }

    paramArrayList.add(new cvX(localbdj, paramString, paramK, null));

    ArrayList localArrayList = c(paramK, "themeElement");
    if (localArrayList != null)
      for (K localK2 : localArrayList) {
        K localK3 = f(localK2);
        if (localK3 != paramK)
        {
          K localK4 = localK3.e("name");
          if (localK4 != null) {
            String str = localK4.getStringValue();
            a(localK3, paramArrayList, paramString + "$" + str.substring(0, 1).toUpperCase() + str.substring(1, str.length()));
          }
        }
      }
  }

  public static ArrayList c(K paramK, String paramString)
  {
    ArrayList localArrayList1 = new ArrayList();

    if (paramK.getName().equalsIgnoreCase(paramString)) {
      localArrayList1.add(paramK);
    }

    for (K localK : paramK.getChildren()) {
      ArrayList localArrayList2 = localK.c(paramString);
      if (localArrayList2 != null) {
        localArrayList1.addAll(localArrayList2);
      }
    }

    if (localArrayList1.isEmpty()) {
      localArrayList1 = null;
    }

    return localArrayList1;
  }

  public void CP() {
    CQ();
    CR();
  }

  public void CQ() {
    this.bhL.clear();
    this.bhM.clear();
    this.bhN.clear();
    this.bhO.clear();
    this.bhQ.clear();
  }

  private void CR() {
    if ((this.bhC == null) || (this.bhG == null)) {
      bpA localbpA = new bpA();
      bwZ localbwZ = new bwZ();
      try {
        localbpA.i(new BufferedInputStream(this.bhJ.openStream()));
        localbpA.a(localbwZ, new cdJ[0]);
        localbpA.close();
      } catch (Exception localException) {
        K.error("Problème lors du chargement du theme " + localException.getMessage());
        throw new IllegalArgumentException("Problème lors du chargement du theme ", localException);
      }

      h(localbwZ.bEx());
    } else {
      CU();
    }
  }

  public void a(cTp paramcTp, cDt paramcDt, String paramString)
  {
    this.bhG = paramcTp;
    this.bhC = paramcDt;
    this.bhK = paramString;
    this.bhL.clear();

    CR();
  }

  public void a(URL paramURL, String paramString, YA paramYA) {
    this.bhJ = paramURL;
    this.bhK = paramString;
    this.bhL.clear();

    bwZ localbwZ = null;
    try {
      localbwZ = cBQ.h(this.bhJ);
    } catch (Exception localException) {
      K.error("Problème lors du chargement du theme " + localException.getMessage());
    }

    CC localCC = localbwZ.bEx();

    h(localCC);
    a(localCC, paramYA);
  }

  public void a(URL paramURL, String paramString)
  {
    this.bhJ = paramURL;
    this.bhK = paramString;
    this.bhL.clear();

    CR();
  }

  public dOc CS()
  {
    return this.bhS;
  }

  public String CT() {
    if (this.bgH) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Styles non utilisés : \n");
      ArrayList localArrayList = new ArrayList();
      for (Map.Entry localEntry : this.bgI.entrySet()) {
        if (((Integer)localEntry.getValue()).intValue() == 0) {
          localArrayList.add(localEntry.getKey());
        }
      }

      Collections.sort(localArrayList);
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        localStringBuilder.append((String)localArrayList.get(i)).append("\n");
      }

      return localStringBuilder.toString();
    }
    return null;
  }

  public void b(dOc paramdOc, String paramString)
  {
    if (this.bhG != null)
      d(paramdOc, paramString);
    else
      c(paramdOc, paramString);
  }

  private void c(dOc paramdOc, String paramString)
  {
    String[] arrayOfString = dzp.aR(paramString, "\\$");

    if (arrayOfString.length == 1) {
      arrayOfString[0] = (paramdOc.getTag() + arrayOfString[0]);
    }

    K localK2 = (K)this.bhN.get(arrayOfString[0].toUpperCase());

    if (localK2 == null) {
      localK2 = (K)this.bhN.get(paramdOc.getTag().toUpperCase());
    } else if (this.bgH) {
      String str = arrayOfString[0].toUpperCase();
      Integer localInteger = (Integer)this.bgI.get(str);
      this.bgI.put(str, Integer.valueOf(localInteger.intValue() + 1));
    }

    if ((this.bhA != null) || (localK2 == null)) {
      return;
    }

    K localK1 = localK2.b("themeElement");

    for (int i = 1; i < arrayOfString.length; i++) {
      localK1 = a(localK1, arrayOfString[i]);
    }

    if (localK1 != null) {
      Stack localStack = new Stack();
      localStack.push(paramdOc.getElementMap());
      this.bhD = true;
      b(localK1, paramdOc, paramdOc.getElementMap().coO(), localStack);
      this.bhD = false;
    }
  }

  private void d(dOc paramdOc, String paramString) {
    if ((!bB) && (this.bhG == null)) throw new AssertionError("m_styleProvider est null !");
    paramString = paramdOc.getTag().toUpperCase() + paramString.toUpperCase();
    aTK localaTK = this.bhG.fS(paramString);

    if (localaTK == null) {
      paramString = paramdOc.getTag().toUpperCase();
      localaTK = this.bhG.fS(paramString);
      if (localaTK == null) {
        return;
      }
    }

    localaTK.a(paramdOc.getElementMap(), this, paramdOc);
  }

  public void g(K paramK)
  {
    if ((this.bhC == null) || (this.bhG == null))
      h(paramK);
    else
      CU();
  }

  private void CU()
  {
    if ((!bB) && ((this.bhC == null) || (this.bhG == null))) throw new AssertionError("loadInitDirect : variable mal initialisée !");
    this.bhC.c(this);
  }

  private void h(K paramK) {
    for (K localK1 : paramK.getChildren()) {
      String str1 = localK1.getName();
      if ((!str1.equals("#text")) && (!str1.equals("#comment")))
      {
        Object localObject1;
        if (str1.equalsIgnoreCase("init")) {
          for (localObject1 = localK1.getChildren().iterator(); ((Iterator)localObject1).hasNext(); ) { K localK2 = (K)((Iterator)localObject1).next();
            String str2 = localK2.getName();
            if ((!str2.equals("#text")) && (!str2.equals("#comment")))
            {
              if (str2.equalsIgnoreCase("fontDefinition")) {
                j(localK2);
              } else if (str2.equalsIgnoreCase("font")) {
                k(localK2);
              } else if (str2.equalsIgnoreCase("texture")) {
                this.bhL.add(localK2);
                o(localK2);
              } else if (str2.equalsIgnoreCase("cursor")) {
                m(localK2);
              } else if (str2.equalsIgnoreCase("animatedCursor")) {
                n(localK2);
              } else if (str2.equalsIgnoreCase("tooltip")) {
                i(localK2);
              } else {
                K localK3 = localK2.e("id");
                Object localObject2 = localK3 != null ? localK3.getStringValue() : null;
                if (localObject2 != null)
                  this.bhM.put(localObject2.toUpperCase(), localK2);
              }
            } }
        }
        else
        {
          localObject1 = str1.toUpperCase();
          this.bhN.put(localObject1, localK1);
          if (this.bgH)
            this.bgI.put(localObject1, Integer.valueOf(0));
        }
      }
    }
  }

  private void a(K paramK, YA paramYA) {
    File localFile1 = new File(paramYA.akg() + "\\" + paramYA.ake() + ".java");
    if (!localFile1.exists()) {
      try {
        localFile1.createNewFile();
      } catch (IOException localIOException1) {
        K.error("Exception", localIOException1);
      }
    }
    PrintWriter localPrintWriter;
    try
    {
      localPrintWriter = new PrintWriter(localFile1);
    } catch (FileNotFoundException localFileNotFoundException1) {
      return;
    }

    bKD localbKD = new bKD(localPrintWriter, paramYA.ake(), paramYA.akd(), this);

    File localFile2 = new File(paramYA.akg() + "\\" + paramYA.akf() + ".java");
    if (!localFile2.exists()) {
      try {
        localFile2.createNewFile();
      } catch (IOException localIOException2) {
        K.error("Exception", localIOException2);
      }
    }
    try
    {
      localPrintWriter = new PrintWriter(localFile2);
    } catch (FileNotFoundException localFileNotFoundException2) {
      return;
    }

    this.bhB = new yo(localPrintWriter, paramYA.akf(), paramYA.akd());

    for (K localK1 : paramK.getChildren()) {
      if ((!localK1.getName().equals("#text")) && (!localK1.getName().equals("#comment"))) {
        if (localK1.getName().equalsIgnoreCase("init")) {
          for (K localK2 : localK1.getChildren()) {
            if ((!localK2.getName().equals("#text")) && (!localK2.getName().equals("#comment"))) {
              if (localK2.getName().equalsIgnoreCase("fontDefinition"))
                new bhs(localK2).a(localbKD);
              else if (localK2.getName().equalsIgnoreCase("font"))
                new cPx(localK2).a(localbKD);
              else if (localK2.getName().equalsIgnoreCase("texture"))
                new WC(localK2).a(localbKD);
              else if (localK2.getName().equalsIgnoreCase("cursor"))
                new bzx(localK2).a(localbKD);
              else if (localK2.getName().equalsIgnoreCase("animatedCursor"))
                new chu(localK2).a(localbKD);
              else if (localK2.getName().equalsIgnoreCase("tooltip")) {
                new fQ(localK2, this).a(localbKD);
              }
            }
          }
        }
        else
        {
          b(localK1, paramYA);
        }
      }
    }

    localbKD.Hh();
    this.bhB.Hh();
  }

  private void b(K paramK, YA paramYA) {
    URL localURL1 = null;
    try {
      localURL1 = new URL("file:" + paramYA.akg());
    } catch (MalformedURLException localMalformedURLException1) {
    }
    String str = paramK.getName().substring(0, 1).toUpperCase() + paramK.getName().substring(1);
    this.bhy = null;
    URL localURL2 = null;

    bqR localbqR = (bqR)aKN.bcs().I(uz.class);
    localbqR.fd(true);

    K localK = paramK.b("themeElement");
    ArrayList localArrayList = b(localK, str);

    for (cvX localcvX : localArrayList) {
      str = localcvX.ctG();
      try {
        localURL2 = bAy.c(localURL1, str + ".java");
      } catch (MalformedURLException localMalformedURLException2) {
        K.error("Exception", localMalformedURLException2);
      }
      if (localURL2 != null) {
        try {
          this.bhz = new PrintWriter(new FileOutputStream(new File(localURL2.getFile())));
        } catch (FileNotFoundException localFileNotFoundException) {
          K.error("Exception", localFileNotFoundException);
        }

        this.bhA = new dxF(this.bhz, str, paramYA.akd(), localcvX.ctH(), localcvX.ctF(), this);

        Stack localStack = new Stack();
        cpa localcpa = new cpa("", new cDA());
        localStack.push(localcpa);
        a(this.bhA.chJ(), this.bhA.chI(), localcpa.coO(), localStack);
        this.bhA.Hh();

        this.bhB.a(new dLF("m_setters.put(\"" + str.toUpperCase() + "\", new " + str + "());"));
      }
    }

    localbqR.fd(false);
  }

  private static bdj aG(String paramString) {
    int i = 0; for (int j = paramString.length(); i < j; i++) {
      dUo localdUo = IZ.Sq().dc(paramString.substring(0, i + 1));
      if (localdUo != null) {
        try {
          return (bdj)localdUo.newInstance();
        } catch (Exception localException) {
          return null;
        }
      }
    }

    return null;
  }

  public void a(float paramFloat, bNa parambNa1, bNa parambNa2, bNa parambNa3, String paramString)
  {
    cJN.iId = paramFloat;
    cJN.iIa = parambNa1;
    cJN.iHZ = parambNa2;
    cJN.iIb = parambNa3;

    P localP = (P)this.bhO.get(paramString);
    if (localP != null) {
      cJN.iIc = localP.getFont();
    }

    if (cJN.iIc == null)
      cJN.iIc = adF.eb(paramString);
  }

  private void i(K paramK)
  {
    if (!paramK.getName().equalsIgnoreCase("tooltip")) {
      return;
    }

    float f = cJN.iId;

    K localK = paramK.e("borderWidth");
    if (localK != null) {
      f = localK.ai();
    }

    Object localObject1 = cJN.iIa;

    axn localaxn = (axn)aKN.bcs().I(bNa.class);
    localK = paramK.e("backgroundColor");
    if (localK != null) {
      localObject2 = localObject1;

      localObject1 = aJ(localK.getStringValue());

      if (localObject1 == null) {
        localObject1 = localaxn.d(bNa.class, localK.getStringValue());
      }

      if (localObject1 == null) {
        localObject1 = localObject2;
      }
    }

    Object localObject2 = cJN.iHZ;

    localK = paramK.e("textColor");
    if (localK != null) {
      localObject3 = localObject2;

      localObject2 = aJ(localK.getStringValue());

      if (localObject2 == null) {
        localObject2 = localaxn.d(bNa.class, localK.getStringValue());
      }

      if (localObject2 == null) {
        localObject2 = localObject3;
      }
    }

    Object localObject3 = cJN.iIb;

    localK = paramK.e("borderColor");
    if (localK != null) {
      localObject4 = localObject3;

      localObject3 = aJ(localK.getStringValue());

      if (localObject3 == null) {
        localObject3 = localaxn.d(bNa.class, localK.getStringValue());
      }

      if (localObject3 == null) {
        localObject3 = localObject4;
      }
    }

    Object localObject4 = null;

    localK = paramK.e("font");
    if (localK != null) {
      localObject4 = localK.getStringValue();
    }

    a(f, (bNa)localObject1, (bNa)localObject2, (bNa)localObject3, (String)localObject4);
  }

  public void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    Kl localKl = (Kl)this.bhP.get(paramString2);
    String str1 = localKl.getPath();
    String str2 = "default";
    str1 = str1.toLowerCase();
    int i = str1.indexOf('/');
    if (i >= 0) {
      i++;
    }
    int j = str1.lastIndexOf(".ttf");
    if (j < 0) {
      j = str1.length();
    }
    str2 = str1.substring(i, j) + paramString3;
    adF.ea(this.bhK + str1.substring(0, i));

    String str3 = adF.getType(str2);
    int k = adF.ec(str2);
    int m = adF.ed(str2);
    if (paramBoolean) {
      k |= 4;
    }
    m += localKl.UQ();

    hf localhf = adF.c(str3, k, m);
    this.bhO.put(paramString1, bsB.b(localhf));
  }

  private void j(K paramK)
  {
    if ((!paramK.getName().equalsIgnoreCase("fontDefinition")) || (paramK.e("name") == null))
    {
      return;
    }

    K localK1 = paramK.e("name");

    String str = localK1.getStringValue();
    ArrayList localArrayList1 = new ArrayList();

    ArrayList localArrayList2 = paramK.c("desc");
    int i = 0; for (int j = localArrayList2.size(); i < j; i++) {
      K localK2 = (K)localArrayList2.get(i);
      K localK3 = localK2.e("path");
      K localK4 = localK2.e("lang");
      K localK5 = localK2.e("size");
      if ((localK3 != null) && (localK4 != null) && (localK5 != null))
      {
        localArrayList1.add(localK3.getStringValue());
        localArrayList1.add(localK4.getStringValue());
        localArrayList1.add(localK5.getStringValue());
      }
    }
    a(str, (String[])localArrayList1.toArray(new String[localArrayList1.size()]));
  }

  public void a(String paramString, String[] paramArrayOfString) {
    Kl localKl = new Kl(paramString);
    int i = 0; for (int j = paramArrayOfString.length; i < j; i += 3) {
      String str1 = paramArrayOfString[i];
      String str2 = paramArrayOfString[(i + 1)];
      String str3 = paramArrayOfString[(i + 2)];
      localKl.a(str2, str1, bUD.f(str3, 0));
    }
    if (!localKl.isEmpty())
      this.bhP.put(paramString, localKl);
  }

  private void k(K paramK)
  {
    if ((!paramK.getName().equalsIgnoreCase("font")) || (paramK.e("font") == null) || (paramK.e("id") == null))
    {
      return;
    }

    boolean bool = false;
    if (paramK.e("bordered") != null) {
      bool = paramK.e("bordered").getBooleanValue();
    }

    K localK = paramK.e("definition");
    String str1 = paramK.e("font").getStringValue();
    String str2 = paramK.e("id").getStringValue();

    a(str2, localK != null ? localK.getStringValue() : null, str1, bool);
  }

  public void a(String paramString, bNa parambNa) {
    this.bhF.put(paramString, parambNa);
  }

  public void l(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("color")) || (paramK.e("color") == null) || (paramK.e("id") == null))
    {
      return;
    }

    K localK = paramK.e("color");
    a(paramK.e("id").getStringValue(), aKN.bcs().gJ(localK.getStringValue()));
  }

  public void a(String paramString, duv paramduv, int paramInt1, int paramInt2)
  {
    try
    {
      BufferedImage localBufferedImage = ImageIO.read(new URL(this.bhK + paramString));
      dGx.dhr().a(paramduv, paramInt1, paramInt2, localBufferedImage);
    } catch (Exception localException) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Impossible de créer le curseur");
      if (paramString != null) {
        localStringBuilder.append(" : ").append(paramString);
      }
      K.error(localStringBuilder.toString(), localException);
    }
  }

  private void m(K paramK)
  {
    if ((!paramK.getName().equalsIgnoreCase("cursor")) || (paramK.e("path") == null) || (paramK.e("id") == null)) {
      return;
    }
    K localK1 = paramK.e("path");
    if (localK1 != null) {
      K localK2 = paramK.e("x");
      K localK3 = paramK.e("y");
      K localK4 = paramK.e("type");
      int i = localK2 == null ? 0 : localK2.getIntValue();
      int j = localK3 == null ? 0 : localK3.getIntValue();
      duv localduv = localK4 == null ? duv.lyl : duv.valueOf(localK4.getStringValue().toUpperCase());

      a(localK1.getStringValue(), localduv, i, j);
    }
  }

  public void a(duv paramduv, int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    try {
      ArrayList localArrayList = new ArrayList(paramArrayList.size());
      int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
        String str = (String)paramArrayList.get(i);
        localArrayList.add(ImageIO.read(new URL(this.bhK + str)));
      }

      dGx.dhr().b(paramduv, paramInt1, paramInt2, paramInt3, localArrayList);
    } catch (Exception localException) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Impossible de créer le curseur");
      K.error(localStringBuilder.toString(), localException);
    }
  }

  private void n(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("animatedCursor")) || (paramK.e("id") == null)) {
      return;
    }
    try
    {
      K localK1 = paramK.e("x");
      localObject = paramK.e("y");
      K localK2 = paramK.e("delay");
      K localK3 = paramK.e("type");
      int i = localK1 == null ? 0 : localK1.getIntValue();
      int j = localObject == null ? 0 : ((K)localObject).getIntValue();
      int k = localK2 == null ? 500 : localK2.getIntValue();
      duv localduv = localK3 == null ? duv.lyl : duv.valueOf(localK3.getStringValue().toUpperCase());

      ArrayList localArrayList1 = paramK.c("cursorFrame");
      ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
      int m = 0; for (int n = localArrayList1.size(); m < n; m++) {
        K localK4 = (K)localArrayList1.get(m);
        K localK5 = localK4.e("path");
        localArrayList2.add(localK5.getStringValue());
      }

      a(localduv, i, j, k, localArrayList2);
    } catch (Exception localException) {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Impossible de créer le curseur");
      K.error(((StringBuilder)localObject).toString(), localException);
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean) {
    bqR localbqR = (bqR)aKN.bcs().I(uz.class);
    try {
      String str = this.bhK + paramString2;

      if (paramBoolean) {
        uz localuz = localbqR.f(uz.class, str);
        localuz.gQ();
      }

      this.bhQ.put(paramString1, str);
    }
    catch (Exception localException) {
      K.error("Impossible de créer l'instance de texture", localException);
    }
  }

  private void o(K paramK)
  {
    if ((!paramK.getName().equalsIgnoreCase("texture")) || (paramK.e("path") == null) || (paramK.e("id") == null))
    {
      return;
    }
    bqR localbqR = (bqR)aKN.bcs().I(uz.class);
    try {
      if (paramK.e("path") != null) {
        String str = this.bhK + paramK.e("path").getStringValue();

        K localK = paramK.e("permanent");
        if ((localK != null) && (localK.getBooleanValue())) {
          uz localuz = localbqR.f(uz.class, str);
          localuz.gQ();
        }

        this.bhQ.put(paramK.e("id").getStringValue(), str);
      }
    }
    catch (Exception localException) {
      K.error("Impossible de créer l'instance de texture", localException);
    }
  }

  public void CV()
  {
    for (K localK : this.bhL) {
      o(localK);
    }
    this.bhR = false;
  }

  public boolean CW()
  {
    return this.bhR;
  }

  public void ab(boolean paramBoolean)
  {
    CV();
  }

  public uz aH(String paramString)
  {
    String str = (String)this.bhQ.get(paramString);
    if (str == null) {
      return null;
    }
    uz localuz = tq.Bg().aw(byn.jp(str));
    if (localuz == null) {
      bqR localbqR = (bqR)aKN.bcs().I(uz.class);
      localuz = localbqR.f(uz.class, str);
    }
    return localuz;
  }

  public P aI(String paramString) {
    return (P)this.bhO.get(paramString);
  }

  public bNa aJ(String paramString) {
    K localK = (K)this.bhM.get(paramString.toUpperCase());
    if ((localK == null) || (!localK.getName().equalsIgnoreCase("color"))) {
      return null;
    }

    localK = localK.e("color");
    if (localK == null) {
      return null;
    }

    Vj localVj = aKN.bcs().I(bNa.class);
    return (bNa)localVj.b(bNa.class, localK.getStringValue());
  }

  public void CX()
  {
  }

  public void CY()
  {
  }
}