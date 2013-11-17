package com.ankamagames.framework.script;

import aYQ;
import akR;
import an;
import bcm;
import dgU;
import dtb;
import dzH;
import hQ;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class JavaFunctionLoader
{
  private static final Logger K = Logger.getLogger(JavaFunctionLoader.class);

  public static final JavaFunctionLoader bEu = new JavaFunctionLoader();
  private hQ[] bEv;
  private final akR bEw = new akR();
  private dgU bEx;

  public void a(hQ[] paramArrayOfhQ)
  {
    this.bEv = paramArrayOfhQ;
  }

  public void b(hQ[] paramArrayOfhQ) {
    if (this.bEx != null) {
      this.bEx.e(paramArrayOfhQ);
    }
    hQ[] arrayOfhQ = this.bEv;
    this.bEv = new hQ[arrayOfhQ.length + paramArrayOfhQ.length];
    System.arraycopy(arrayOfhQ, 0, this.bEv, 0, arrayOfhQ.length);
    System.arraycopy(paramArrayOfhQ, 0, this.bEv, arrayOfhQ.length, paramArrayOfhQ.length);
  }

  public void load(String paramString) {
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
      int i = localaYQ.readInt();
      JavaFunctionLoader.CustomJavaFunctionLib[][] arrayOfCustomJavaFunctionLib; = new JavaFunctionLoader.CustomJavaFunctionLib[i][];
      for (int j = 0; j < i; j++) {
        k = localaYQ.readByte();
        arrayOfCustomJavaFunctionLib;[j] = new JavaFunctionLoader.CustomJavaFunctionLib[k];
        for (int m = 0; m < k; m++) {
          String str2 = localaYQ.readString();
          Constructor[] arrayOfConstructor = f(localaYQ);
          if (str2.length() == 0)
            arrayOfCustomJavaFunctionLib;[j][m] = new JavaFunctionLoader.CustomJavaFunctionLib(str2, null, arrayOfConstructor);
          else {
            arrayOfCustomJavaFunctionLib;[j][m] = new JavaFunctionLoader.CustomJavaFunctionLib(str2, arrayOfConstructor, null);
          }
        }
      }

      j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        String str1 = localaYQ.readString();
        int n = localaYQ.readInt();
        this.bEw.put(str1, arrayOfCustomJavaFunctionLib;[n]);
      }
    } catch (IOException localIOException) {
      K.error("", localIOException);
    }
  }

  private static Constructor[] f(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++) {
      arrayOfString[j] = paramaYQ.readString();
    }
    return d(arrayOfString);
  }

  private static Constructor[] d(String[] paramArrayOfString)
  {
    Constructor[] arrayOfConstructor = new Constructor[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++) {
      try {
        Class localClass = Class.forName(paramArrayOfString[i]);
        arrayOfConstructor[i] = localClass.getDeclaredConstructor(new Class[] { LuaState.class });
        arrayOfConstructor[i].setAccessible(true);
      } catch (NoSuchMethodException localNoSuchMethodException) {
        K.error("", localNoSuchMethodException);
      } catch (ClassNotFoundException localClassNotFoundException) {
        K.error("", localClassNotFoundException);
      }
    }
    return arrayOfConstructor;
  }

  public JavaFunctionLoader.CustomJavaFunctionLib[] bp(String paramString) {
    return (JavaFunctionLoader.CustomJavaFunctionLib[])this.bEw.get(paramString);
  }

  public boolean o(String paramString1, String paramString2)
  {
    try
    {
      InputStream localInputStream = dtb.pT(paramString2);
      JavaFunctionLoader.CustomJavaFunctionLib[] arrayOfCustomJavaFunctionLib = f(new InputStreamReader(localInputStream));
      if (arrayOfCustomJavaFunctionLib == null) {
        return false;
      }

      this.bEw.put(paramString1, arrayOfCustomJavaFunctionLib);
      return true;
    } catch (IOException localIOException) {
      K.error("", localIOException);
    }
    return false;
  }

  public JavaFunctionLoader.CustomJavaFunctionLib[] bq(String paramString) {
    return f(new StringReader(paramString));
  }

  public JavaFunctionLoader.CustomJavaFunctionLib[] f(Reader paramReader) {
    if (this.bEx == null) {
      this.bEx = new dgU();
      this.bEx.e(this.bEv);
    }
    bcm localbcm = this.bEx.i(paramReader);
    if (localbcm == null) {
      return null;
    }
    akR localakR = a(localbcm);

    JavaFunctionLoader.CustomJavaFunctionLib[] arrayOfCustomJavaFunctionLib = new JavaFunctionLoader.CustomJavaFunctionLib[localakR.size()];
    localakR.b(new dzH(this, arrayOfCustomJavaFunctionLib));

    return arrayOfCustomJavaFunctionLib;
  }

  public static akR a(Collection paramCollection) {
    akR localakR = new akR();
    for (an localan : paramCollection) {
      String str = localan.getPackageName();
      ArrayList localArrayList = (ArrayList)localakR.get(str);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
        localakR.put(str, localArrayList);
      }
      localArrayList.add(localan.bS);
    }
    return localakR;
  }
}