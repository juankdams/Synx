package com.ankamagames.framework.script;

import dsg;
import hQ;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class JavaFunctionLoader$CustomJavaFunctionLib extends hQ
{
  private final String m_name;
  private final Constructor[] iCs;
  private final Constructor[] iCt;

  public JavaFunctionLoader$CustomJavaFunctionLib(String paramString, Constructor[] paramArrayOfConstructor1, Constructor[] paramArrayOfConstructor2)
  {
    this.m_name = paramString;
    this.iCs = paramArrayOfConstructor1;
    this.iCt = paramArrayOfConstructor2;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return a(this.iCs, paramLuaState);
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return a(this.iCt, paramLuaState);
  }

  private static dsg[] a(Constructor[] paramArrayOfConstructor, LuaState paramLuaState) {
    if ((paramArrayOfConstructor == null) || (paramArrayOfConstructor.length == 0)) {
      return null;
    }
    dsg[] arrayOfdsg = new dsg[paramArrayOfConstructor.length];
    for (int i = 0; i < paramArrayOfConstructor.length; i++) {
      try {
        arrayOfdsg[i] = ((dsg)paramArrayOfConstructor[i].newInstance(new Object[] { paramLuaState }));
      } catch (InstantiationException localInstantiationException) {
        K.error("", localInstantiationException);
      } catch (IllegalAccessException localIllegalAccessException) {
        K.error("", localIllegalAccessException);
      } catch (InvocationTargetException localInvocationTargetException) {
        K.error("", localInvocationTargetException);
      }
    }
    return arrayOfdsg;
  }

  public final String getName()
  {
    return this.m_name;
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}