 enum dGY
{
  public dGY dhQ()
  {
    dGY[] arrayOfdGY = values();
    if (equals(arrayOfdGY[(arrayOfdGY.length - 1)])) {
      return arrayOfdGY[0];
    }
    for (int i = 0; i < arrayOfdGY.length; i++) {
      if (arrayOfdGY[i].equals(this)) {
        return arrayOfdGY[(i + 1)];
      }
    }
    return null;
  }
}