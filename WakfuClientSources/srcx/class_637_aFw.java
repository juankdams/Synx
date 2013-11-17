import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aFw
{
  private static Logger K = Logger.getLogger(aFw.class);

  public static boolean a(Method paramMethod, Object paramObject) {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    if (arrayOfClass.length != 1) {
      return false;
    }

    Class localClass1 = arrayOfClass[0];
    if (paramObject == null) {
      return !localClass1.isPrimitive();
    }

    Class localClass2 = paramObject.getClass();
    return ((!localClass1.isArray()) || (localClass2.isArray())) && ((localClass1.isArray()) || (!localClass2.isArray()));
  }

  public static boolean a(Method paramMethod, Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    if (paramArrayOfObject.length != arrayOfClass.length) {
      return false;
    }

    for (int i = 0; i < arrayOfClass.length; i++) {
      if (paramArrayOfObject[i] == null) {
        if (arrayOfClass[i].isPrimitive())
          return false;
      }
      else if (!arrayOfClass[i].isAssignableFrom(paramArrayOfObject[i].getClass())) {
        return false;
      }
    }

    return true;
  }

  public static void a(Method paramMethod, Object paramObject, Object[] paramArrayOfObject) {
    if ((paramMethod == null) || (paramArrayOfObject == null)) {
      return;
    }
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    if (arrayOfClass.length != paramArrayOfObject.length) {
      throw new Exception("nombre de paramètres attendus : " + arrayOfClass.length + ". Trouvés : " + paramArrayOfObject.length);
    }

    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    for (int i = 0; i < arrayOfClass.length; i++) {
      localObject1 = arrayOfClass[i];
      Object localObject2 = paramArrayOfObject[i];

      if (((localObject2 == null) && (!((Class)localObject1).isPrimitive())) || ((localObject2 != null) && (((Class)localObject1).isAssignableFrom(localObject2.getClass()))))
        localArrayList.add(localObject2);
      else if (localObject1.equals(String.class))
        localArrayList.add(bUD.getString(localObject2));
      else if ((localObject1.equals(Boolean.TYPE)) || (localObject1.equals(Boolean.class)))
        localArrayList.add(Boolean.valueOf(bUD.getBoolean(localObject2)));
      else if ((localObject1.equals(Integer.TYPE)) || (localObject1.equals(Integer.class)))
        localArrayList.add(Integer.valueOf(bUD.aR(localObject2)));
      else if ((localObject1.equals(Float.TYPE)) || (localObject1.equals(Float.class)))
        localArrayList.add(Float.valueOf(bUD.getFloat(localObject2)));
      else if ((localObject1.equals(Double.TYPE)) || (localObject1.equals(Double.class)))
        localArrayList.add(Double.valueOf(bUD.getDouble(localObject2)));
      else if ((localObject1.equals(Long.TYPE)) || (localObject1.equals(Long.class)))
        localArrayList.add(Long.valueOf(bUD.getLong(localObject2)));
      else if (localObject2.getClass().equals(String.class))
        localArrayList.add(aKN.bcs().b((Class)localObject1, (String)localObject2));
      else {
        throw new Exception("Impossible de convertir la valeur donnée");
      }
    }
    try
    {
      paramMethod.invoke(paramObject, localArrayList.toArray());
    } catch (IllegalArgumentException localIllegalArgumentException) {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("IllegalArgumentException : method=").append(paramMethod).append(", parametres=");
      for (int j = 0; j < localArrayList.size(); j++) {
        ((StringBuilder)localObject1).append(localArrayList.get(j));
        if (j == localArrayList.size() - 1) {
          break;
        }
        ((StringBuilder)localObject1).append(", ");
      }
      K.error(localObject1);
    }
  }

  public static void a(String paramString1, aNL paramaNL, cZd paramcZd, int paramInt, String paramString2, fu paramfu) {
    Object localObject1 = null;

    Object localObject2 = null;
    if (((localObject2 == null) || (paramfu != null)) && (paramcZd != null)) {
      if (paramString2 != null)
        localObject1 = paramcZd.getFieldValue(paramString2);
      else {
        localObject1 = paramcZd.getValue();
      }
    }

    ArrayList localArrayList = new ArrayList();

    if (paramfu != null) {
      localObject2 = paramfu.getResult(localObject1);
    }

    Object localObject3 = localObject2 != null ? localObject2 : localObject1;
    if (((localObject3 instanceof String)) && (duS.fyW != paramInt))
    {
      if (!paramaNL.setXMLAttribute(paramInt, (String)localObject3, aKN.bcs()));
    }
    else if (paramaNL.setPropertyAttribute(paramInt, localObject3)) {
      return;
    }

    dUo localdUo = IZ.Sq().l(paramaNL.getClass());
    Method localMethod;
    if (localObject2 != null)
      localMethod = localdUo.k(paramString1, localObject2.getClass());
    else if (localObject1 != null)
      localMethod = localdUo.k(paramString1, localObject1.getClass());
    else {
      localMethod = localdUo.rc(paramString1);
    }

    if (localMethod == null) {
      return;
    }
    Class[] arrayOfClass = localMethod.getParameterTypes();
    if (arrayOfClass.length != 1) {
      throw new Exception("La méthode prend " + arrayOfClass.length + " paramètres");
    }

    Class localClass = arrayOfClass[0];
    if (localClass.isPrimitive()) {
      localClass = crp.Y(localClass);
    }

    if ((localObject2 != null) && (localClass.isAssignableFrom(localObject2.getClass()))) {
      localArrayList.add(localObject2);
    }
    else if ((localObject1 == null) || ((localObject1 != null) && (localClass.isAssignableFrom(localObject1.getClass()))))
      localArrayList.add(localObject1);
    else if (localClass.equals(String.class))
      localArrayList.add(bUD.getString(localObject1));
    else if ((localClass.equals(Boolean.class)) || (localClass.equals(Boolean.TYPE)))
      localArrayList.add(Boolean.valueOf(bUD.getBoolean(localObject1)));
    else if ((localClass.equals(Integer.class)) || (localClass.equals(Integer.TYPE)))
      localArrayList.add(Integer.valueOf(bUD.aR(localObject1)));
    else if ((localClass.equals(Float.class)) || (localClass.equals(Float.TYPE)))
      localArrayList.add(Float.valueOf(bUD.getFloat(localObject1)));
    else if ((localClass.equals(Double.class)) || (localClass.equals(Double.TYPE)))
      localArrayList.add(Double.valueOf(bUD.getDouble(localObject1)));
    else if ((localClass.equals(Long.class)) || (localClass.equals(Long.TYPE)))
      localArrayList.add(Long.valueOf(bUD.getLong(localObject1)));
    else if (localObject1.getClass().equals(String.class))
      localArrayList.add(aKN.bcs().b(localClass, (String)localObject1));
    else {
      throw new Exception("Impossible de convertir la valeur donnée (attendu = " + localClass + ", eu = " + localObject1.getClass() + ")");
    }

    try
    {
      localMethod.invoke(paramaNL, localArrayList.toArray());
    } catch (IllegalArgumentException localIllegalArgumentException) {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("IllegalArgumentException : method=").append(localMethod).append(", parametres=");
      for (int i = 0; i < localArrayList.size(); i++) {
        localStringBuilder.append(localArrayList.get(i));
        if (i == localArrayList.size() - 1) {
          break;
        }
        localStringBuilder.append(", ");
      }
      K.error(localStringBuilder);
    }
  }
}