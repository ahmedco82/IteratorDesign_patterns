package com.ahmedco.iterator.test2;

public class AlertIterator implements Iterator

{
    Alert[] alertList;
    int position = 0;

    public  AlertIterator(Alert[] alertList)
    {
        this.alertList = alertList;
    }

    public Object next()
    {
        Alert alert =  alertList[position];
        position += 1;
        return alert;
    }

    public boolean hasNext()
    {
        if (position >= alertList.length ||
                alertList[position] == null)
            return false;
        else
            return true;
    }
}