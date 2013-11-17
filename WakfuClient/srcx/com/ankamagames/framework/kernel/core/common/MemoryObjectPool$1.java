package com.ankamagames.framework.kernel.core.common;

import akE;
import aum;
import bJv;
import org.apache.log4j.Logger;

public final class MemoryObjectPool$1 extends bJv
{
  public MemoryObjectPool$1(Class paramClass1, Class paramClass2)
  {
    super(paramClass1);
  }
  public akE ZX() {
    try { return (akE)this.ceA.newInstance();
    } catch (InstantiationException localInstantiationException) {
      aum.ch().error("", localInstantiationException);
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new IllegalArgumentException(this.ceA.toString(), localIllegalAccessException);
    } catch (ClassCastException localClassCastException) {
      throw new IllegalArgumentException(this.ceA + " n'est pas de type MemoryObject");
    }
    return null;
  }
}