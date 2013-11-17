class dAc
  implements sQ
{
  private boolean first = true;

  dAc(bKB parambKB, StringBuilder paramStringBuilder) {  } 
  public boolean a(Object paramObject, float paramFloat) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramObject);
    this.aBU.append("=");
    this.aBU.append(paramFloat);
    return true;
  }
}